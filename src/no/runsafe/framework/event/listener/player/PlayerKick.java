package no.runsafe.framework.event.listener.player;

import no.runsafe.framework.event.listener.EventRouter;
import no.runsafe.framework.event.player.IPlayerKickEvent;
import no.runsafe.framework.output.IOutput;
import no.runsafe.framework.server.event.player.RunsafePlayerKickEvent;
import no.runsafe.framework.timer.IScheduler;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerKickEvent;

public class PlayerKick extends EventRouter<IPlayerKickEvent, PlayerKickEvent>
{
	public PlayerKick(IOutput output, IScheduler scheduler, IPlayerKickEvent handler)
	{
		super(output, scheduler, handler);
	}

	@EventHandler
	@Override
	public void AcceptEvent(PlayerKickEvent event)
	{
		super.AcceptEvent(event);
	}

	@Override
	public boolean OnEvent(PlayerKickEvent event)
	{
		handler.OnPlayerKick(new RunsafePlayerKickEvent(event));
		return true;
	}
}