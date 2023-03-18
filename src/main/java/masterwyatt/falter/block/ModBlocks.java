package masterwyatt.falter.block;

import masterwyatt.falter.Falter;
import masterwyatt.falter.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block KROHNKITE_BLOCK = registerBlock("krohnkite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(30.0f,1200.0f).requiresTool()), ModItemGroup.FALTER);

    public static final Block RUTILE_BLOCK = registerBlock("rutile_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(40.0f,1500.0f).requiresTool()), ModItemGroup.FALTER);

    public static final Block RUTILE_ORE = registerBlock("rutile_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(40.0f,1500.0f).requiresTool(),
                    UniformIntProvider.create(10, 20)), ModItemGroup.FALTER);

    public static final Block ANNABERGITE_ORE = registerBlock("annabergite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(35.0f, 1300.0f).requiresTool(),
                    UniformIntProvider.create(10, 20)), ModItemGroup.FALTER);

    public static final Block ANNABERGITE_BLOCK = registerBlock("annabergite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(35.0f,1300.0f).requiresTool()), ModItemGroup.FALTER);

    public static final Block RAW_KROHNKITE_BLOCK = registerBlock("raw_krohnkite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(30.0f,1200.0f).requiresTool()), ModItemGroup.FALTER);

    public static final Block RAW_RUTILE_BLOCK = registerBlock("raw_rutile_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(30.0f,1200.0f).requiresTool()), ModItemGroup.FALTER);

    public static final Block RAW_ANNABERGITE_BLOCK = registerBlock("raw_annabergite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(30.0f,1200.0f).requiresTool()), ModItemGroup.FALTER);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return  Registry.register(Registries.BLOCK, new Identifier(Falter.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Falter.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        Falter.LOGGER.info("Registering ModBlocks for " + Falter.MOD_ID);
    }
}
