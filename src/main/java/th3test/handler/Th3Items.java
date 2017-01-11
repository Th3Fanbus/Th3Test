package th3test.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import th3test.item.Th3Item;

public final class Th3Items {

    public static Item Th3Item;
	
    public static final void init() {
        GameRegistry.registerItem(Th3Item = new Th3Item(), "Th3Item");

    }

}