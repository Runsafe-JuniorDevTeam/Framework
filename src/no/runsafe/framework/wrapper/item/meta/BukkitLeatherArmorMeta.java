package no.runsafe.framework.wrapper.item.meta;

import no.runsafe.framework.server.item.meta.RunsafeItemMeta;
import org.bukkit.Color;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

@Deprecated
public abstract class BukkitLeatherArmorMeta extends RunsafeItemMeta
{
	public BukkitLeatherArmorMeta(LeatherArmorMeta toWrap)
	{
		super(toWrap);
		leatherArmor = toWrap;
	}

	public int getColor()
	{
		return leatherArmor.getColor().asRGB();
	}

	public void setColor(int color)
	{
		leatherArmor.setColor(Color.fromRGB(color));
	}

	public void setColor(int r, int g, int b)
	{
		leatherArmor.setColor(Color.fromRGB(r, g, b));
	}

	@Override
	public LeatherArmorMeta getRaw()
	{
		return leatherArmor;
	}

	protected final LeatherArmorMeta leatherArmor;
}
