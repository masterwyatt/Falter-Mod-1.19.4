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
    public static final Item DRAGON_PAGE = registerItem("dragon_page",
            new Item(new FabricItemSettings()));
    public static final Item WITHER_PAGE = registerItem("wither_page",
            new Item(new FabricItemSettings()));
    public static final Item GUARDIAN_PAGE = registerItem("guardian_page",
            new Item(new FabricItemSettings()));
    public static final Item WARDEN_PAGE = registerItem("warden_page",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Falter.MOD_ID, name), item);
    }

    public static void addItemstoItemGroup() {
        addToItemGroup(ModItemGroup.FALTER, DRAGON_PAGE);
        addToItemGroup(ModItemGroup.FALTER, WITHER_PAGE);
        addToItemGroup(ModItemGroup.FALTER, GUARDIAN_PAGE);
        addToItemGroup(ModItemGroup.FALTER, WARDEN_PAGE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        Falter.LOGGER.info("Registering Mod Items for " + Falter.MOD_ID);

        addItemstoItemGroup();
    }
}
