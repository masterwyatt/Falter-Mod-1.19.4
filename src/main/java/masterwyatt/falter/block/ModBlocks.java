package masterwyatt.falter.block;

import masterwyatt.falter.Falter;
import masterwyatt.falter.item.ModItemGroup;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
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
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).requiresTool()), ModItemGroup.FALTER);

    public static final Block RUTILE_BLOCK = registerBlock("rutile_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).requiresTool()), ModItemGroup.FALTER);

    public static final Block RUTILE_ORE = registerBlock("rutile_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).requiresTool(),
                    UniformIntProvider.create(10, 20)), ModItemGroup.FALTER);

    public static final Block ANNABERGITE = registerBlock("annabergite",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).requiresTool(),
                    UniformIntProvider.create(10, 20)), ModItemGroup.FALTER);

    public static final Block ANNABERGITE_BLOCK = registerBlock("annabergite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).requiresTool()), ModItemGroup.FALTER);
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
