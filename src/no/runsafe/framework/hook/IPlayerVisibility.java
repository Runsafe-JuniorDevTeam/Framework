package no.runsafe.framework.hook;

import no.runsafe.framework.server.player.RunsafePlayer;

public interface IPlayerVisibility extends FrameworkHook
{
	boolean canPlayerASeeB(RunsafePlayer a, RunsafePlayer b);

	boolean isPlayerVanished(RunsafePlayer player);
}
