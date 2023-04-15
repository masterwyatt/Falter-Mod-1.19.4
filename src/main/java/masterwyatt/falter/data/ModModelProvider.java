package masterwyatt.falter.data;

import masterwyatt.falter.block.ModBlocks;
import masterwyatt.falter.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANNABERGITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANNABERGITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.KROHNKITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_ANNABERGITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_KROHNKITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_RUTILE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUTILE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUTILE_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.KROHNKITE_LOG).log(ModBlocks.KROHNKITE_LOG).wood(ModBlocks.KROHNKITE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_KROHNKITE_LOG).log(ModBlocks.STRIPPED_KROHNKITE_LOG).wood(ModBlocks.STRIPPED_KROHNKITE_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.KROHNKITE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.KROHNKITE_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.KROHNKITE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_KROHNKITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KROHNKITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUTILE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUTILE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ANNABERGITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANNABERGITE, Models.GENERATED);
    }
}
