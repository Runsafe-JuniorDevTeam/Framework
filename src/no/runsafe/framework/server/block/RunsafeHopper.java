package no.runsafe.framework.server.block;

import no.runsafe.framework.server.ObjectWrapper;
import no.runsafe.framework.server.inventory.IInventoryHolder;
import no.runsafe.framework.server.inventory.RunsafeInventory;
import org.bukkit.block.Hopper;

public class RunsafeHopper extends RunsafeBlockState implements IInventoryHolder
{
	public RunsafeHopper(Hopper toWrap)
	{
		super(toWrap);
		this.hopper = toWrap;
	}

	public Hopper getRaw()
	{
		return this.hopper;
	}

	@Override
	public RunsafeInventory getInventory()
	{
		return ObjectWrapper.convert(this.hopper.getInventory());
	}

	private Hopper hopper;
}