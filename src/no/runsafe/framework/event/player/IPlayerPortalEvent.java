package no.runsafe.framework.event.player;

import no.runsafe.framework.event.IRunsafeEvent;
import no.runsafe.framework.server.event.player.RunsafePlayerPortalEvent;

public interface IPlayerPortalEvent extends IRunsafeEvent
{
	public void OnPlayerPortalEvent(RunsafePlayerPortalEvent event);
}