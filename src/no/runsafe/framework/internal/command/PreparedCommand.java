package no.runsafe.framework.internal.command;

import com.google.common.collect.Lists;
import no.runsafe.framework.api.command.ICommandExecutor;
import no.runsafe.framework.api.command.ICommandHandler;
import no.runsafe.framework.api.command.IContextPermissionProvider;
import no.runsafe.framework.api.command.IPreparedCommand;
import no.runsafe.framework.api.command.argument.IArgument;
import no.runsafe.framework.api.command.argument.ITabComplete;
import no.runsafe.framework.minecraft.player.RunsafePlayer;
import org.apache.commons.lang.StringUtils;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.*;
import java.util.regex.Pattern;

public abstract class PreparedCommand implements IPreparedCommand
{
	protected PreparedCommand(
		ICommandExecutor executor, Stack<ICommandHandler> definingCommand, String[] args, Map<String, String> parameters)
	{
		this.executor = executor;
		command = definingCommand;
		arguments = args;
		this.parameters = parameters;
		ICommandHandler execute = command.peek();
		String permission = null;
		if (execute instanceof IContextPermissionProvider)
			permission = ((IContextPermissionProvider) execute).getPermission(executor, parameters, args);
		if (permission == null)
			permission = command.peek().getPermission();
		if (permission != null)
			for (Map.Entry<String, String> parameter : parameters.entrySet())
				if (parameter.getValue() != null)
					permission = permission.replace('<' + parameter.getKey() + '>', parameter.getValue());
		requiredPermission = permission;
	}

	@Override
	@Nullable
	public String getRequiredPermission()
	{
		if (requiredPermission == null || paramPermission.matcher(requiredPermission).matches())
			return null;
		return requiredPermission;
	}

	@Override
	@Nullable
	public Iterable<String> tabComplete(String... args)
	{
		int i = countSuperParams();
		List<IArgument> params = command.peek().getParameters();
		List<String> subcommands = command.peek().getSubCommands(executor);
		boolean takeParams = !params.isEmpty();
		boolean takeSub = !subcommands.isEmpty();

		if (!takeParams && !takeSub)
			return Lists.newArrayList();

		if (args.length > i + params.size() + 1)
			return null;

		if (takeParams && args.length - i > 0 && args.length - i <= params.size())
			return getSuggestions(params.get(args.length - i - 1), args);

		if (takeSub)
			return filterList(command.peek().getSubCommands(executor), args[args.length - 1]);

		// If capturing tail - allow tab completion of names in final parameter
		return command.peek().isCapturingTail() ? null : Lists.<String>newArrayList();
	}

	@Nullable
	private Iterable<String> getSuggestions(@Nonnull IArgument param, @Nonnull String... args)
	{
		List<String> matches;
		if (param instanceof ITabComplete)
			matches = ((ITabComplete) param).getAlternatives((RunsafePlayer) executor, args[args.length - 1]);

		else
		{
			matches = command.peek().getParameterOptionsPartial(param.toString(), args[args.length - 1]);
			if (matches != null)
			{
				if (matches.isEmpty())
					return null;
				return matches;
			}
			matches = command.peek().getParameterOptions(param.toString());
			if (matches == null)
				return Lists.newArrayList();
		}
		return args[args.length - 1].isEmpty() ? matches : filterList(matches, args[args.length - 1]);
	}

	private int countSuperParams()
	{
		int i = 0;
		for (ICommandHandler cmd : command)
		{
			if (cmd.equals(command.peek()))
				break;
			i += cmd.getParameters().size(); // Args taken by command
			i++; // Arg taken by selecting the next subcommand
		}
		return i;
	}

	private static List<String> filterList(Iterable<String> values, String filter)
	{
		if (filter == null || filter.isEmpty())
			return Lists.newArrayList(values);
		List<String> matches = new ArrayList<String>(1);
		for (String value : values)
			if (value.toLowerCase().startsWith(filter.toLowerCase()))
				matches.add(value);
		return matches;
	}

	protected String usage(ICommandHandler target)
	{
		Collection<String> params = new ArrayList<String>(command.size());
		for (ICommandHandler tier : command)
			params.add(tier.getUsageCommandParams());

		//noinspection HardcodedFileSeparator
		return String.format("Usage: /%1$s %2$s", StringUtils.join(params, " "), target.getUsage(executor));
	}

	protected final ICommandExecutor executor;
	protected final Stack<ICommandHandler> command;
	protected final String[] arguments;
	protected final Map<String, String> parameters;
	private final String requiredPermission;
	private static final Pattern paramPermission = Pattern.compile(".*<.*>.*");
}