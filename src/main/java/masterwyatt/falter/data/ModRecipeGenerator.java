package masterwyatt.falter.data;

import masterwyatt.falter.block.ModBlocks;
import masterwyatt.falter.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.KROHNKITE, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.KROHNKITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RUTILE, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.RUTILE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ANNABERGITE, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.ANNABERGITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_KROHNKITE, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.RAW_KROHNKITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_RUTILE, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.RAW_RUTILE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_ANNABERGITE, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.RAW_ANNABERGITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.KROHNKITE)
                .pattern("EEE")
                .pattern("ERR")
                .pattern("RRE")
                .input('E', Items.LAPIS_LAZULI)
                .input('R', ModItems.RAW_KROHNKITE)
                .criterion(FabricRecipeProvider.hasItem(Items.LAPIS_LAZULI),
                        FabricRecipeProvider.conditionsFromItem(Items.LAPIS_LAZULI))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RAW_KROHNKITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RAW_KROHNKITE))
                .offerTo(exporter, new Identifier("krohnkite_from_raw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUTILE)
                .pattern("EEE")
                .pattern("ERR")
                .pattern("RRE")
                .input('E', Items.DIAMOND)
                .input('R', ModItems.RAW_RUTILE)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RAW_RUTILE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RAW_RUTILE))
                .offerTo(exporter, new Identifier("rutile_from_raw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ANNABERGITE)
                .pattern("EEE")
                .pattern("ERR")
                .pattern("RRE")
                .input('E', Items.EMERALD)
                .input('R', ModItems.RAW_ANNABERGITE)
                .criterion(FabricRecipeProvider.hasItem(Items.EMERALD),
                        FabricRecipeProvider.conditionsFromItem(Items.EMERALD))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RAW_ANNABERGITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RAW_ANNABERGITE))
                .offerTo(exporter, new Identifier("annabergite_from_raw"));
    }
}

