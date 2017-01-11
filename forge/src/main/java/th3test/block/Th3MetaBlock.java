package th3test.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import th3test.handler.Th3CreativeTab;

public class Th3MetaBlock extends Block {
    public Th3MetaBlock() {
        super(Material.rock);
        setBlockName("Th3MetaBlock");
        setBlockTextureName("th3test:Th3MetaBlock");
        setCreativeTab(Th3CreativeTab.Th3Tab);
        setStepSound(soundTypeStone);
        setHardness(3.0F);
        setResistance(5.0F);
        setLightLevel(0F);
    }
    public IIcon[] icons = new IIcon[6];
    
    @Override
    public void registerBlockIcons(IIconRegister reg) {
        for (int i = 0; i < 6; i ++) {
            this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
        }
    }
    
    @Override
    public IIcon getIcon(int side, int meta) {
    	if (meta > 5) {
    		meta = 0;
    	}
        return this.icons[meta];
    }
    
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < 6; i ++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
    
}