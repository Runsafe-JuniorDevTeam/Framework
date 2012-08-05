package no.runsafe.framework.server.block;

import no.runsafe.framework.server.ObjectWrapper;
import no.runsafe.framework.server.RunsafeLocation;
import no.runsafe.framework.server.RunsafeWorld;
import no.runsafe.framework.server.chunk.RunsafeChunk;
import no.runsafe.framework.server.material.RunsafeMaterial;
import no.runsafe.framework.server.material.RunsafeMaterialData;
import no.runsafe.framework.server.metadata.RunsafeMetadata;
import org.bukkit.block.BlockState;

public class RunsafeBlockState extends RunsafeMetadata
{
	public RunsafeBlockState(BlockState toWrap)
	{
		super(toWrap);
		blockState = toWrap;
	}

	public RunsafeChunk getChunk()
	{
		return ObjectWrapper.convert(blockState.getChunk());
	}

	public RunsafeMaterialData getMaterialData()
	{
		return ObjectWrapper.convert(blockState.getData());
	}

	public byte getLightLevel()
	{
		return blockState.getLightLevel();
	}

	public RunsafeLocation getLocation()
	{
		return ObjectWrapper.convert(blockState.getLocation());
	}

	public RunsafeMaterial getMaterial()
	{
		return ObjectWrapper.convert(blockState.getType());
	}

	public int getMaterialID()
	{
		return blockState.getTypeId();
	}

	public RunsafeWorld getWorld()
	{
		return ObjectWrapper.convert(blockState.getWorld());
	}

	public int getX()
	{
		return blockState.getX();
	}

	public int getY()
	{
		return blockState.getY();
	}

	public int getZ()
	{
		return blockState.getZ();
	}

	public void setMaterialData(RunsafeMaterialData materialData)
	{
		blockState.setData(materialData.getRaw());
	}

	public void setMaterial(RunsafeMaterial material)
	{
		blockState.setType(material.getRaw());
	}

	public void setMaterialId(int materialId)
	{
		blockState.setTypeId(materialId);
	}

	public void update(boolean forceUpdate)
	{
		blockState.update(forceUpdate);
	}

	public void update()
	{
		blockState.update();
	}

	public BlockState getRaw()
	{
		return blockState;
	}

	private final BlockState blockState;
}