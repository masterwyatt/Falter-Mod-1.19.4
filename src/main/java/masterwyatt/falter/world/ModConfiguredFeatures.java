package masterwyatt.falter.world;

import masterwyatt.falter.Falter;
import masterwyatt.falter.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> KROHNKITE_KEY = registerKey("krohnkite_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUTILE_ORE_KEY = registerKey("rutile_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, KROHNKITE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.KROHNKITE_LOG),
                new StraightTrunkPlacer(5,6,3),
                BlockStateProvider.of(ModBlocks.KROHNKITE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());



        RuleTest netherrackReplaceables = new BlockMatchRuleTest(Blocks.NETHERRACK);

        List<OreFeatureConfig.Target> netherRutileOres =
               List.of(OreFeatureConfig.createTarget(netherrackReplaceables, ModBlocks.RUTILE_ORE.getDefaultState()));

        register(context, RUTILE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRutileOres, 4));
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Falter.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
