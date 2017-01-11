package th3test.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import th3test.item.Th3Item;

public final class Th3CreativeTab {
    
    public static final CreativeTabs Th3Tab = new CreativeTabs("Th3Tab") {
        @Override public Item getTabIconItem() {
            return Th3Items.Th3Item;
        }
    };

}