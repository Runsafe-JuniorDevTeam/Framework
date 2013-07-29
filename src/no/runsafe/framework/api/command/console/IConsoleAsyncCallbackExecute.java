package no.runsafe.framework.api.command.console;

import java.util.Map;

public interface IConsoleAsyncCallbackExecute<T> extends IConsoleExecute
{
	/**
	 * If you use optional arguments, you still need to override this but you can leave it empty.
	 *
	 * @param parameters The arguments you defined in the constructor and their values as supplied by the user
	 * @return A value to return to the post-processing method
	 */
	T OnAsyncExecute(Map<String, String> parameters);
}