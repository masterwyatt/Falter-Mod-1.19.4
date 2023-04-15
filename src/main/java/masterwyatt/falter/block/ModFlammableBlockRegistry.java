package masterwyatt.falter.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.KROHNKITE_LOG, 3, 120);
        registry.add(ModBlocks.KROHNKITE_WOOD, 3, 120);
        registry.add(ModBlocks.STRIPPED_KROHNKITE_LOG, 3, 120);
        registry.add(ModBlocks.STRIPPED_KROHNKITE_WOOD, 3, 120);

        registry.add(ModBlocks.KROHNKITE_LEAVES, 20, 120);
        registry.add(ModBlocks.KROHNKITE_PLANKS, 3, 120);
    }
}
