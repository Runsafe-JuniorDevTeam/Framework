package no.runsafe.framework.internal;

import org.bukkit.Material;

import javax.annotation.Nullable;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public enum LegacyMaterial
{
	AIR(0, Material.AIR),
	STONE(1, Material.STONE),
	GRASS(2, Material.GRASS),
	DIRT(3, Material.DIRT),
	COBBLESTONE(4, Material.COBBLESTONE),
	WOOD(5, Material.WOOD),
	SAPLING(6, Material.SAPLING),
	BEDROCK(7, Material.BEDROCK),
	WATER(8, Material.WATER),
	STATIONARY_WATER(9, Material.STATIONARY_WATER),
	LAVA(10, Material.LAVA),
	STATIONARY_LAVA(11, Material.STATIONARY_LAVA),
	SAND(12, Material.SAND),
	GRAVEL(13, Material.GRAVEL),
	GOLD_ORE(14, Material.GOLD_ORE),
	IRON_ORE(15, Material.IRON_ORE),
	COAL_ORE(16, Material.COAL_ORE),
	LOG(17, Material.LOG),
	LEAVES(18, Material.LEAVES),
	SPONGE(19, Material.SPONGE),
	GLASS(20, Material.GLASS),
	LAPIS_ORE(21, Material.LAPIS_ORE),
	LAPIS_BLOCK(22, Material.LAPIS_BLOCK),
	DISPENSER(23, Material.DISPENSER),
	SANDSTONE(24, Material.SANDSTONE),
	NOTE_BLOCK(25, Material.NOTE_BLOCK),
	BED_BLOCK(26, Material.BED_BLOCK),
	POWERED_RAIL(27, Material.POWERED_RAIL),
	DETECTOR_RAIL(28, Material.DETECTOR_RAIL),
	PISTON_STICKY_BASE(29, Material.PISTON_STICKY_BASE),
	WEB(30, Material.WEB),
	LONG_GRASS(31, Material.LONG_GRASS),
	DEAD_BUSH(32, Material.DEAD_BUSH),
	PISTON_BASE(33, Material.PISTON_BASE),
	PISTON_EXTENSION(34, Material.PISTON_EXTENSION),
	WOOL(35, Material.WOOL),
	PISTON_MOVING_PIECE(36, Material.PISTON_MOVING_PIECE),
	YELLOW_FLOWER(37, Material.YELLOW_FLOWER),
	RED_ROSE(38, Material.RED_ROSE),
	BROWN_MUSHROOM(39, Material.BROWN_MUSHROOM),
	RED_MUSHROOM(40, Material.RED_MUSHROOM),
	GOLD_BLOCK(41, Material.GOLD_BLOCK),
	IRON_BLOCK(42, Material.IRON_BLOCK),
	DOUBLE_STEP(43, Material.DOUBLE_STEP),
	STEP(44, Material.STEP),
	BRICK(45, Material.BRICK),
	TNT(46, Material.TNT),
	BOOKSHELF(47, Material.BOOKSHELF),
	MOSSY_COBBLESTONE(48, Material.MOSSY_COBBLESTONE),
	OBSIDIAN(49, Material.OBSIDIAN),
	TORCH(50, Material.TORCH),
	FIRE(51, Material.FIRE),
	MOB_SPAWNER(52, Material.MOB_SPAWNER),
	WOOD_STAIRS(53, Material.WOOD_STAIRS),
	CHEST(54, Material.CHEST),
	REDSTONE_WIRE(55, Material.REDSTONE_WIRE),
	DIAMOND_ORE(56, Material.DIAMOND_ORE),
	DIAMOND_BLOCK(57, Material.DIAMOND_BLOCK),
	WORKBENCH(58, Material.WORKBENCH),
	CROPS(59, Material.CROPS),
	SOIL(60, Material.SOIL),
	FURNACE(61, Material.FURNACE),
	BURNING_FURNACE(62, Material.BURNING_FURNACE),
	SIGN_POST(63, Material.SIGN_POST),
	WOODEN_DOOR(64, Material.WOODEN_DOOR),
	LADDER(65, Material.LADDER),
	RAILS(66, Material.RAILS),
	COBBLESTONE_STAIRS(67, Material.COBBLESTONE_STAIRS),
	WALL_SIGN(68, Material.WALL_SIGN),
	LEVER(69, Material.LEVER),
	STONE_PLATE(70, Material.STONE_PLATE),
	IRON_DOOR_BLOCK(71, Material.IRON_DOOR_BLOCK),
	WOOD_PLATE(72, Material.WOOD_PLATE),
	REDSTONE_ORE(73, Material.REDSTONE_ORE),
	GLOWING_REDSTONE_ORE(74, Material.GLOWING_REDSTONE_ORE),
	REDSTONE_TORCH_OFF(75, Material.REDSTONE_TORCH_OFF),
	REDSTONE_TORCH_ON(76, Material.REDSTONE_TORCH_ON),
	STONE_BUTTON(77, Material.STONE_BUTTON),
	SNOW(78, Material.SNOW),
	ICE(79, Material.ICE),
	SNOW_BLOCK(80, Material.SNOW_BLOCK),
	CACTUS(81, Material.CACTUS),
	CLAY(82, Material.CLAY),
	SUGAR_CANE_BLOCK(83, Material.SUGAR_CANE_BLOCK),
	JUKEBOX(84, Material.JUKEBOX),
	FENCE(85, Material.FENCE),
	PUMPKIN(86, Material.PUMPKIN),
	NETHERRACK(87, Material.NETHERRACK),
	SOUL_SAND(88, Material.SOUL_SAND),
	GLOWSTONE(89, Material.GLOWSTONE),
	PORTAL(90, Material.PORTAL),
	JACK_O_LANTERN(91, Material.JACK_O_LANTERN),
	CAKE_BLOCK(92, Material.CAKE_BLOCK),
	DIODE_BLOCK_OFF(93, Material.DIODE_BLOCK_OFF),
	DIODE_BLOCK_ON(94, Material.DIODE_BLOCK_ON),
	LOCKED_CHEST(95, Material.LOCKED_CHEST),
	TRAP_DOOR(96, Material.TRAP_DOOR),
	MONSTER_EGGS(97, Material.MONSTER_EGGS),
	SMOOTH_BRICK(98, Material.SMOOTH_BRICK),
	HUGE_MUSHROOM_1(99, Material.HUGE_MUSHROOM_1),
	HUGE_MUSHROOM_2(100, Material.HUGE_MUSHROOM_2),
	IRON_FENCE(101, Material.IRON_FENCE),
	THIN_GLASS(102, Material.THIN_GLASS),
	MELON_BLOCK(103, Material.MELON_BLOCK),
	PUMPKIN_STEM(104, Material.PUMPKIN_STEM),
	MELON_STEM(105, Material.MELON_STEM),
	VINE(106, Material.VINE),
	FENCE_GATE(107, Material.FENCE_GATE),
	BRICK_STAIRS(108, Material.BRICK_STAIRS),
	SMOOTH_STAIRS(109, Material.SMOOTH_STAIRS),
	MYCEL(110, Material.MYCEL),
	WATER_LILY(111, Material.WATER_LILY),
	NETHER_BRICK(112, Material.NETHER_BRICK),
	NETHER_FENCE(113, Material.NETHER_FENCE),
	NETHER_BRICK_STAIRS(114, Material.NETHER_BRICK_STAIRS),
	NETHER_WARTS(115, Material.NETHER_WARTS),
	ENCHANTMENT_TABLE(116, Material.ENCHANTMENT_TABLE),
	BREWING_STAND(117, Material.BREWING_STAND),
	CAULDRON(118, Material.CAULDRON),
	ENDER_PORTAL(119, Material.ENDER_PORTAL),
	ENDER_PORTAL_FRAME(120, Material.ENDER_PORTAL_FRAME),
	ENDER_STONE(121, Material.ENDER_STONE),
	DRAGON_EGG(122, Material.DRAGON_EGG),
	REDSTONE_LAMP_OFF(123, Material.REDSTONE_LAMP_OFF),
	REDSTONE_LAMP_ON(124, Material.REDSTONE_LAMP_ON),
	WOOD_DOUBLE_STEP(125, Material.WOOD_DOUBLE_STEP),
	WOOD_STEP(126, Material.WOOD_STEP),
	COCOA(127, Material.COCOA),
	SANDSTONE_STAIRS(128, Material.SANDSTONE_STAIRS),
	EMERALD_ORE(129, Material.EMERALD_ORE),
	ENDER_CHEST(130, Material.ENDER_CHEST),
	TRIPWIRE_HOOK(131, Material.TRIPWIRE_HOOK),
	TRIPWIRE(132, Material.TRIPWIRE),
	EMERALD_BLOCK(133, Material.EMERALD_BLOCK),
	SPRUCE_WOOD_STAIRS(134, Material.SPRUCE_WOOD_STAIRS),
	BIRCH_WOOD_STAIRS(135, Material.BIRCH_WOOD_STAIRS),
	JUNGLE_WOOD_STAIRS(136, Material.JUNGLE_WOOD_STAIRS),
	COMMAND(137, Material.COMMAND),
	BEACON(138, Material.BEACON),
	COBBLE_WALL(139, Material.COBBLE_WALL),
	FLOWER_POT(140, Material.FLOWER_POT),
	CARROT(141, Material.CARROT),
	POTATO(142, Material.POTATO),
	WOOD_BUTTON(143, Material.WOOD_BUTTON),
	SKULL(144, Material.SKULL),
	ANVIL(145, Material.ANVIL),
	TRAPPED_CHEST(146, Material.TRAPPED_CHEST),
	GOLD_PLATE(147, Material.GOLD_PLATE),
	IRON_PLATE(148, Material.IRON_PLATE),
	REDSTONE_COMPARATOR_OFF(149, Material.REDSTONE_COMPARATOR_OFF),
	REDSTONE_COMPARATOR_ON(150, Material.REDSTONE_COMPARATOR_ON),
	DAYLIGHT_DETECTOR(151, Material.DAYLIGHT_DETECTOR),
	REDSTONE_BLOCK(152, Material.REDSTONE_BLOCK),
	QUARTZ_ORE(153, Material.QUARTZ_ORE),
	HOPPER(154, Material.HOPPER),
	QUARTZ_BLOCK(155, Material.QUARTZ_BLOCK),
	QUARTZ_STAIRS(156, Material.QUARTZ_STAIRS),
	ACTIVATOR_RAIL(157, Material.ACTIVATOR_RAIL),
	DROPPER(158, Material.DROPPER),
	STAINED_CLAY(159, Material.STAINED_CLAY),
	HAY_BLOCK(170, Material.HAY_BLOCK),
	CARPET(171, Material.CARPET),
	HARD_CLAY(172, Material.HARD_CLAY),
	COAL_BLOCK(173, Material.COAL_BLOCK),
	IRON_SPADE(256, Material.IRON_SPADE),
	IRON_PICKAXE(257, Material.IRON_PICKAXE),
	IRON_AXE(258, Material.IRON_AXE),
	FLINT_AND_STEEL(259, Material.FLINT_AND_STEEL),
	APPLE(260, Material.APPLE),
	BOW(261, Material.BOW),
	ARROW(262, Material.ARROW),
	COAL(263, Material.COAL),
	DIAMOND(264, Material.DIAMOND),
	IRON_INGOT(265, Material.IRON_INGOT),
	GOLD_INGOT(266, Material.GOLD_INGOT),
	IRON_SWORD(267, Material.IRON_SWORD),
	WOOD_SWORD(268, Material.WOOD_SWORD),
	WOOD_SPADE(269, Material.WOOD_SPADE),
	WOOD_PICKAXE(270, Material.WOOD_PICKAXE),
	WOOD_AXE(271, Material.WOOD_AXE),
	STONE_SWORD(272, Material.STONE_SWORD),
	STONE_SPADE(273, Material.STONE_SPADE),
	STONE_PICKAXE(274, Material.STONE_PICKAXE),
	STONE_AXE(275, Material.STONE_AXE),
	DIAMOND_SWORD(276, Material.DIAMOND_SWORD),
	DIAMOND_SPADE(277, Material.DIAMOND_SPADE),
	DIAMOND_PICKAXE(278, Material.DIAMOND_PICKAXE),
	DIAMOND_AXE(279, Material.DIAMOND_AXE),
	STICK(280, Material.STICK),
	BOWL(281, Material.BOWL),
	MUSHROOM_SOUP(282, Material.MUSHROOM_SOUP),
	GOLD_SWORD(283, Material.GOLD_SWORD),
	GOLD_SPADE(284, Material.GOLD_SPADE),
	GOLD_PICKAXE(285, Material.GOLD_PICKAXE),
	GOLD_AXE(286, Material.GOLD_AXE),
	STRING(287, Material.STRING),
	FEATHER(288, Material.FEATHER),
	SULPHUR(289, Material.SULPHUR),
	WOOD_HOE(290, Material.WOOD_HOE),
	STONE_HOE(291, Material.STONE_HOE),
	IRON_HOE(292, Material.IRON_HOE),
	DIAMOND_HOE(293, Material.DIAMOND_HOE),
	GOLD_HOE(294, Material.GOLD_HOE),
	SEEDS(295, Material.SEEDS),
	WHEAT(296, Material.WHEAT),
	BREAD(297, Material.BREAD),
	LEATHER_HELMET(298, Material.LEATHER_HELMET),
	LEATHER_CHESTPLATE(299, Material.LEATHER_CHESTPLATE),
	LEATHER_LEGGINGS(300, Material.LEATHER_LEGGINGS),
	LEATHER_BOOTS(301, Material.LEATHER_BOOTS),
	CHAINMAIL_HELMET(302, Material.CHAINMAIL_HELMET),
	CHAINMAIL_CHESTPLATE(303, Material.CHAINMAIL_CHESTPLATE),
	CHAINMAIL_LEGGINGS(304, Material.CHAINMAIL_LEGGINGS),
	CHAINMAIL_BOOTS(305, Material.CHAINMAIL_BOOTS),
	IRON_HELMET(306, Material.IRON_HELMET),
	IRON_CHESTPLATE(307, Material.IRON_CHESTPLATE),
	IRON_LEGGINGS(308, Material.IRON_LEGGINGS),
	IRON_BOOTS(309, Material.IRON_BOOTS),
	DIAMOND_HELMET(310, Material.DIAMOND_HELMET),
	DIAMOND_CHESTPLATE(311, Material.DIAMOND_CHESTPLATE),
	DIAMOND_LEGGINGS(312, Material.DIAMOND_LEGGINGS),
	DIAMOND_BOOTS(313, Material.DIAMOND_BOOTS),
	GOLD_HELMET(314, Material.GOLD_HELMET),
	GOLD_CHESTPLATE(315, Material.GOLD_CHESTPLATE),
	GOLD_LEGGINGS(316, Material.GOLD_LEGGINGS),
	GOLD_BOOTS(317, Material.GOLD_BOOTS),
	FLINT(318, Material.FLINT),
	PORK(319, Material.PORK),
	GRILLED_PORK(320, Material.GRILLED_PORK),
	PAINTING(321, Material.PAINTING),
	GOLDEN_APPLE(322, Material.GOLDEN_APPLE),
	SIGN(323, Material.SIGN),
	WOOD_DOOR(324, Material.WOOD_DOOR),
	BUCKET(325, Material.BUCKET),
	WATER_BUCKET(326, Material.WATER_BUCKET),
	LAVA_BUCKET(327, Material.LAVA_BUCKET),
	MINECART(328, Material.MINECART),
	SADDLE(329, Material.SADDLE),
	IRON_DOOR(330, Material.IRON_DOOR),
	REDSTONE(331, Material.REDSTONE),
	SNOW_BALL(332, Material.SNOW_BALL),
	BOAT(333, Material.BOAT),
	LEATHER(334, Material.LEATHER),
	MILK_BUCKET(335, Material.MILK_BUCKET),
	CLAY_BRICK(336, Material.CLAY_BRICK),
	CLAY_BALL(337, Material.CLAY_BALL),
	SUGAR_CANE(338, Material.SUGAR_CANE),
	PAPER(339, Material.PAPER),
	BOOK(340, Material.BOOK),
	SLIME_BALL(341, Material.SLIME_BALL),
	STORAGE_MINECART(342, Material.STORAGE_MINECART),
	POWERED_MINECART(343, Material.POWERED_MINECART),
	EGG(344, Material.EGG),
	COMPASS(345, Material.COMPASS),
	FISHING_ROD(346, Material.FISHING_ROD),
	WATCH(347, Material.WATCH),
	GLOWSTONE_DUST(348, Material.GLOWSTONE_DUST),
	RAW_FISH(349, Material.RAW_FISH),
	COOKED_FISH(350, Material.COOKED_FISH),
	INK_SACK(351, Material.INK_SACK),
	BONE(352, Material.BONE),
	SUGAR(353, Material.SUGAR),
	CAKE(354, Material.CAKE),
	BED(355, Material.BED),
	DIODE(356, Material.DIODE),
	COOKIE(357, Material.COOKIE),
	MAP(358, Material.MAP),
	SHEARS(359, Material.SHEARS),
	MELON(360, Material.MELON),
	PUMPKIN_SEEDS(361, Material.PUMPKIN_SEEDS),
	MELON_SEEDS(362, Material.MELON_SEEDS),
	RAW_BEEF(363, Material.RAW_BEEF),
	COOKED_BEEF(364, Material.COOKED_BEEF),
	RAW_CHICKEN(365, Material.RAW_CHICKEN),
	COOKED_CHICKEN(366, Material.COOKED_CHICKEN),
	ROTTEN_FLESH(367, Material.ROTTEN_FLESH),
	ENDER_PEARL(368, Material.ENDER_PEARL),
	BLAZE_ROD(369, Material.BLAZE_ROD),
	GHAST_TEAR(370, Material.GHAST_TEAR),
	GOLD_NUGGET(371, Material.GOLD_NUGGET),
	NETHER_STALK(372, Material.NETHER_STALK),
	POTION(373, Material.POTION),
	GLASS_BOTTLE(374, Material.GLASS_BOTTLE),
	SPIDER_EYE(375, Material.SPIDER_EYE),
	FERMENTED_SPIDER_EYE(376, Material.FERMENTED_SPIDER_EYE),
	BLAZE_POWDER(377, Material.BLAZE_POWDER),
	MAGMA_CREAM(378, Material.MAGMA_CREAM),
	BREWING_STAND_ITEM(379, Material.BREWING_STAND_ITEM),
	CAULDRON_ITEM(380, Material.CAULDRON_ITEM),
	EYE_OF_ENDER(381, Material.EYE_OF_ENDER),
	SPECKLED_MELON(382, Material.SPECKLED_MELON),
	MONSTER_EGG(383, Material.MONSTER_EGG),
	EXP_BOTTLE(384, Material.EXP_BOTTLE),
	FIREBALL(385, Material.FIREBALL),
	BOOK_AND_QUILL(386, Material.BOOK_AND_QUILL),
	WRITTEN_BOOK(387, Material.WRITTEN_BOOK),
	EMERALD(388, Material.EMERALD),
	ITEM_FRAME(389, Material.ITEM_FRAME),
	FLOWER_POT_ITEM(390, Material.FLOWER_POT_ITEM),
	CARROT_ITEM(391, Material.CARROT_ITEM),
	POTATO_ITEM(392, Material.POTATO_ITEM),
	BAKED_POTATO(393, Material.BAKED_POTATO),
	POISONOUS_POTATO(394, Material.POISONOUS_POTATO),
	EMPTY_MAP(395, Material.EMPTY_MAP),
	GOLDEN_CARROT(396, Material.GOLDEN_CARROT),
	SKULL_ITEM(397, Material.SKULL_ITEM),
	CARROT_STICK(398, Material.CARROT_STICK),
	NETHER_STAR(399, Material.NETHER_STAR),
	PUMPKIN_PIE(400, Material.PUMPKIN_PIE),
	FIREWORK(401, Material.FIREWORK),
	FIREWORK_CHARGE(402, Material.FIREWORK_CHARGE),
	ENCHANTED_BOOK(403, Material.ENCHANTED_BOOK),
	REDSTONE_COMPARATOR(404, Material.REDSTONE_COMPARATOR),
	NETHER_BRICK_ITEM(405, Material.NETHER_BRICK_ITEM),
	QUARTZ(406, Material.QUARTZ),
	EXPLOSIVE_MINECART(407, Material.EXPLOSIVE_MINECART),
	HOPPER_MINECART(408, Material.HOPPER_MINECART),
	IRON_BARDING(417, Material.IRON_BARDING),
	GOLD_BARDING(418, Material.GOLD_BARDING),
	DIAMOND_BARDING(419, Material.DIAMOND_BARDING),
	LEASH(420, Material.LEASH),
	NAME_TAG(421, Material.NAME_TAG),
	GOLD_RECORD(2256, Material.GOLD_RECORD),
	GREEN_RECORD(2257, Material.GREEN_RECORD),
	RECORD_3(2258, Material.RECORD_3),
	RECORD_4(2259, Material.RECORD_4),
	RECORD_5(2260, Material.RECORD_5),
	RECORD_6(2261, Material.RECORD_6),
	RECORD_7(2262, Material.RECORD_7),
	RECORD_8(2263, Material.RECORD_8),
	RECORD_9(2264, Material.RECORD_9),
	RECORD_10(2265, Material.RECORD_10),
	RECORD_11(2266, Material.RECORD_11),
	RECORD_12(2267, Material.RECORD_12);

	LegacyMaterial(Integer id, Material material)
	{
		add(id, material);
	}

	@Nullable
	public static Material getById(int id)
	{
		if (legacyIdMap.containsKey(id))
			return legacyIdMap.get(id);

		return null;
	}

	public static Integer getIdOf(Material material)
	{
		if (legacyMaterialMap.containsKey(material))
			return legacyMaterialMap.get(material);

		return -1;
	}

	private static void add(Integer id, Material material)
	{
		legacyIdMap.put(id, material);
		legacyMaterialMap.put(material, id);
	}

	private static final Map<Integer, Material> legacyIdMap = new HashMap<Integer, Material>(0);
	private static final Map<Material, Integer> legacyMaterialMap = new EnumMap<Material, Integer>(Material.class);
}
