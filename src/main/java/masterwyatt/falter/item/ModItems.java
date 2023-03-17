package masterwyatt.falter.item;

import masterwyatt.falter.Falter;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_KROHNKITE = registerItem("raw_krohnkite",
            new Item(new FabricItemSettings()));
    public static final Item KROHNKITE = registerItem("krohnkite",
            new Item(new FabricItemSettings()));
    public static final Item RAW_RUTILE = registerItem("raw_rutile",
            new Item(new FabricItemSettings()));
    public static final Item RUTILE = registerItem("rutile",
            new Item(new FabricItemSettings()));
    public static final Item RAW_ANNABERGITE = registerItem("raw_annabergite",
            new Item(new FabricItemSettings()));
    public static final Item ANNABERGITE = registerItem("annabergite",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Falter.MOD_ID, name), item);
    }

    public static void addItemstoItemGroup() {
        addToItemGroup(ModItemGroup.FALTER, RAW_KROHNKITE);
        addToItemGroup(ModItemGroup.FALTER, KROHNKITE);
        addToItemGroup(ModItemGroup.FALTER, RAW_RUTILE);
        addToItemGroup(ModItemGroup.FALTER, RUTILE);
        addToItemGroup(ModItemGroup.FALTER, RAW_ANNABERGITE);
        addToItemGroup(ModItemGroup.FALTER, ANNABERGITE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        Falter.LOGGER.info("Registering Mod Items for " + Falter.MOD_ID);

        addItemstoItemGroup();
    }
}
