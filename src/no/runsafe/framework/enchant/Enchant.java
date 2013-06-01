package no.runsafe.framework.enchant;

import no.runsafe.framework.server.enchantment.RunsafeEnchantment;
import no.runsafe.framework.server.enchantment.RunsafeEnchantmentType;
import no.runsafe.framework.server.item.RunsafeItemStack;

import java.util.ArrayList;
import java.util.List;

public class Enchant implements IEnchant
{
	public static IEnchant EnvironmentalProtection = new Enchant(RunsafeEnchantmentType.PROTECTION_ENVIRONMENTAL, true);
	public static IEnchant FireProtection = new Enchant(RunsafeEnchantmentType.PROTECTION_FIRE, true);
	public static IEnchant FallProtection = new Enchant(RunsafeEnchantmentType.PROTECTION_FALL, true);
	public static IEnchant ExplosionProtection = new Enchant(RunsafeEnchantmentType.PROTECTION_EXPLOSIONS, true);
	public static IEnchant ProjectileProtection = new Enchant(RunsafeEnchantmentType.PROTECTION_PROJECTILE, true);
	public static IEnchant WaterBreathing = new Enchant(RunsafeEnchantmentType.OXYGEN, true);
	public static IEnchant WaterWorker = new Enchant(RunsafeEnchantmentType.WATER_WORKER, true);
	public static IEnchant Thorns = new Enchant(RunsafeEnchantmentType.THORNS, true);
	public static IEnchant Damage = new Enchant(RunsafeEnchantmentType.DAMAGE_ALL, true);
	public static IEnchant DamageUndead = new Enchant(RunsafeEnchantmentType.DAMAGE_UNDEAD, true);
	public static IEnchant DamageArthropods = new Enchant(RunsafeEnchantmentType.DAMAGE_ARTHROPODS, true);
	public static IEnchant Knockback = new Enchant(RunsafeEnchantmentType.KNOCKBACK, true);
	public static IEnchant Fire = new Enchant(RunsafeEnchantmentType.FIRE_ASPECT, true);
	public static IEnchant MobLoot = new Enchant(RunsafeEnchantmentType.LOOT_BONUS_MOBS, true);
	public static IEnchant DigSpeed = new Enchant(RunsafeEnchantmentType.DIG_SPEED, true);
	public static IEnchant SilkTouch = new Enchant(RunsafeEnchantmentType.SILK_TOUCH, true);
	public static IEnchant Durability = new Enchant(RunsafeEnchantmentType.DURABILITY, true);
	public static IEnchant BlockLoot = new Enchant(RunsafeEnchantmentType.LOOT_BONUS_BLOCKS, true);
	public static IEnchant ArrowDamage = new Enchant(RunsafeEnchantmentType.ARROW_DAMAGE, true);
	public static IEnchant KnockbackArrow = new Enchant(RunsafeEnchantmentType.ARROW_KNOCKBACK, true);
	public static IEnchant FlameArrow = new Enchant(RunsafeEnchantmentType.ARROW_FIRE, true);
	public static IEnchant InfiniteArrows = new Enchant(RunsafeEnchantmentType.ARROW_INFINITE, true);
	public static List<IEnchant> All = new ArrayList<IEnchant>();

	public static IEnchant getByName(String name)
	{
		for (RunsafeEnchantmentType enchantType : RunsafeEnchantmentType.values())
			if (enchantType.name().equalsIgnoreCase(name))
				return new Enchant(enchantType, false);
		return null;
	}

	public static List<IEnchant> getByTarget(IEnchantable target)
	{
		ArrayList<IEnchant> enchants = new ArrayList<IEnchant>();
		for (IEnchant enchant : All)
			if (enchant.canEnchant(target))
				enchants.add(enchant);
		return enchants;
	}

	@Override
	public RunsafeEnchantmentType getType()
	{
		return type;
	}

	@Override
	public IEnchant power(int power)
	{
		if (root)
			return copy().power(power);
		this.power = power;
		return this;
	}

	@Override
	public IEnchant max()
	{
		if (root)
			return copy().max();
		this.power = getMaxLevel();
		return this;
	}

	@Override
	public int getId()
	{
		return type.getEnchantId();
	}

	@Override
	public String getName()
	{
		return type.name();
	}

	@Override
	public int getMaxLevel()
	{
		return enchant.getMaxLevel();
	}

	@Override
	public int getStartLevel()
	{
		return enchant.getStartLevel();
	}

	@Override
	public boolean canCoexist(IEnchant enchantment)
	{
		return !enchant.conflictsWith(enchantment);
	}

	@Override
	public boolean canEnchant(IEnchantable target)
	{
		return target instanceof RunsafeItemStack && enchant.canEnchantItem((RunsafeItemStack) target);
	}

	@Override
	public IEnchant applyTo(IEnchantable target)
	{
		target.enchant(this);
		return this;
	}

	@Override
	public int power()
	{
		return Math.max(getStartLevel(), Math.min(getMaxLevel(), power));
	}

	@Override
	public RunsafeEnchantment getEnchant()
	{
		return enchant;
	}

	private Enchant(RunsafeEnchantmentType type, boolean root)
	{
		this.enchant = new RunsafeEnchantment(type);
		this.type = type;
		this.root = root;
		this.power = getMaxLevel();
		if (root)
			All.add(this);
	}

	private IEnchant copy()
	{
		return new Enchant(type, false);
	}

	private final RunsafeEnchantmentType type;
	private final RunsafeEnchantment enchant;
	private final boolean root;
	private int power;
}
