package no.runsafe.framework.command;

import no.runsafe.framework.server.ICommandExecutor;
import no.runsafe.framework.timer.IScheduler;

import java.util.HashMap;

public abstract class AsyncCallbackCommand<T> extends ExecutableCommand
{
	public AsyncCallbackCommand(String name, String description, String permission, IScheduler scheduler, String... args)
	{
		super(name, description, permission, args);
		this.scheduler = scheduler;
	}

	@Override
	public String OnExecute(ICommandExecutor executor, HashMap<String, String> parameters, String[] arguments)
	{
		return null;
	}

	public abstract T OnAsyncExecute(ICommandExecutor executor, HashMap<String, String> parameters, String[] arguments);

	public abstract void SyncPostExecute(T result);

	public void Schedule(PreparedCommand target)
	{
		target.ScheduleCallback(scheduler);
	}

	private final IScheduler scheduler;
}