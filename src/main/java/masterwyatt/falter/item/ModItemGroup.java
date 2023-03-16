package masterwyatt.falter.item;

import masterwyatt.falter.Falter;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup FALTER;

    public static void registerItemGroups() {
        FALTER = FabricItemGroup.builder(new Identifier(Falter.MOD_ID, "krohnkite"))
                .displayName(Text.translatable("itemgroup.falter"))
                .icon(() -> new ItemStack(ModItems.KROHNKITE)).build();
    }


}
