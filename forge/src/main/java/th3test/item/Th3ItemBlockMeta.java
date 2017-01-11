package th3test.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class Th3ItemBlockMeta extends ItemBlockWithMetadata {

    public Th3ItemBlockMeta(Block block) {
            super(block, block);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }
    
    
}
