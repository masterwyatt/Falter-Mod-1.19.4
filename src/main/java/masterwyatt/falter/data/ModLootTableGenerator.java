package masterwyatt.falter.data;

import masterwyatt.falter.block.ModBlocks;
import masterwyatt.falter.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ANNABERGITE_BLOCK);
        addDrop(ModBlocks.KROHNKITE_BLOCK);
        addDrop(ModBlocks.RAW_ANNABERGITE_BLOCK);
        addDrop(ModBlocks.RAW_KROHNKITE_BLOCK);
        addDrop(ModBlocks.RAW_RUTILE_BLOCK);
        addDrop(ModBlocks.RUTILE_BLOCK);

        addDrop(ModBlocks.ANNABERGITE_ORE, oreDrops(ModBlocks.ANNABERGITE_ORE, ModItems.RAW_ANNABERGITE));
        addDrop(ModBlocks.RUTILE_ORE, oreDrops(ModBlocks.RUTILE_ORE, ModItems.RAW_RUTILE));


    }

}
