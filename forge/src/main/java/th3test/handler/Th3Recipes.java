package th3test.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class Th3Recipes {

    public static final void init() {
    	Th3Recipes.initCraft();
    	Th3Recipes.initSmelt();
    }
	
    public static final void initCraft() {
        GameRegistry.addShapelessRecipe(new ItemStack(Th3Items.Th3Item, 8),
        		new ItemStack(Th3Blocks.Th3Block)		
        );
        
        GameRegistry.addShapedRecipe(new ItemStack(Th3Blocks.Th3Block),
        		"XXX",
        		"X X",
        		"XXX",
        		'X', Th3Items.Th3Item		
        );
        GameRegistry.addShapedRecipe(new ItemStack(Items.apple, 4),
            	"BA",
            	"AB",
            	'A', Blocks.cobblestone,
            	'B', Blocks.stone
        );
        GameRegistry.addShapedRecipe(new ItemStack(Th3Blocks.Th3Block, 4),
            	"BA",
            	"AB",
            	'A', Blocks.stone,
            	'B', Blocks.redstone_block
        );
    }
    
    public static final void initSmelt() {
        GameRegistry.addSmelting(new ItemStack(Th3Items.Th3Item, 1),
        		new ItemStack(Blocks.brick_block), 0);
    }

}