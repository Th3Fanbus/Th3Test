package th3test.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import th3test.handler.Th3CreativeTab;

public class Th3SidedBlock extends Block {
    public Th3SidedBlock() {
        super(Material.rock);
        setBlockName("Th3SidedBlock");
        setBlockTextureName("th3test:Th3SidedBlock");
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
        return this.icons[side];
    }
    
}
