package no.runsafe.framework.minecraft.block;

import no.runsafe.framework.api.block.ICreatureSpawner;
import no.runsafe.framework.api.minecraft.RunsafeEntityType;
import no.runsafe.framework.internal.wrapper.ObjectWrapper;
import no.runsafe.framework.internal.wrapper.block.BukkitCreatureSpawner;
import no.runsafe.framework.minecraft.entity.LivingEntity;
import org.bukkit.block.CreatureSpawner;

public class RunsafeCreatureSpawner extends BukkitCreatureSpawner implements ICreatureSpawner
{
	public RunsafeCreatureSpawner(CreatureSpawner toWrap)
	{
		super(toWrap);
		spawner = toWrap;
	}

	@Override
	public void setCreature(LivingEntity type)
	{
		spawner.setSpawnedType(type.getRaw());
	}

	@Override
	public RunsafeEntityType getCreature()
	{
		return ObjectWrapper.convert(spawner.getSpawnedType());
	}

	private CreatureSpawner spawner;
}
