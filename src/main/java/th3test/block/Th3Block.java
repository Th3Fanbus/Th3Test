package th3test.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import th3test.handler.Th3CreativeTab;

public class Th3Block extends Block {
    public Th3Block() {
        super(Material.rock);
        setBlockName("Th3Block");
        setBlockTextureName("th3test:Th3Block");
        setCreativeTab(Th3CreativeTab.Th3Tab);
        setStepSound(soundTypeStone);
        setHardness(3.0F);
        setResistance(5.0F);
        setLightLevel(0F);
    }
}
