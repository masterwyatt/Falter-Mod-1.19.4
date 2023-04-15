package masterwyatt.falter;

import masterwyatt.falter.block.ModBlocks;
import masterwyatt.falter.block.ModFlammableBlockRegistry;
import masterwyatt.falter.item.ModItemGroup;
import masterwyatt.falter.item.ModItems;
import masterwyatt.falter.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Falter implements ModInitializer {
	public static final String MOD_ID = "falter";
	public static final Logger LOGGER = LoggerFactory.getLogger("falter");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		ModFlammableBlockRegistry.registerFlammableBlocks();
		StrippableBlockRegistry.register(ModBlocks.KROHNKITE_LOG, ModBlocks.STRIPPED_KROHNKITE_LOG);
		StrippableBlockRegistry.register(ModBlocks.KROHNKITE_WOOD, ModBlocks.STRIPPED_KROHNKITE_WOOD);
	}
}