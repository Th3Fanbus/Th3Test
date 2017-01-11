package th3test.item;

import net.minecraft.item.Item;
import th3test.handler.Th3CreativeTab;

public class Th3Item extends Item {
    public Th3Item() {
    	setUnlocalizedName("Th3Item");
    	setTextureName("th3test:Th3Item");
        setMaxStackSize(256);
        setCreativeTab(Th3CreativeTab.Th3Tab);
    }
}
