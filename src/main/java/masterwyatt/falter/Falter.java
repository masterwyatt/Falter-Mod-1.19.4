package masterwyatt.falter;

import masterwyatt.falter.item.ModItemGroup;
import masterwyatt.falter.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Falter implements ModInitializer {
	public static final String MOD_ID = "falter";
	public static final Logger LOGGER = LoggerFactory.getLogger("falter");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}