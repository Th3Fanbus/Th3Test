package th3test.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import th3test.Th3Main;
import th3test.handler.Th3CreativeTab;
import th3test.handler.Th3GUIHandler;
import th3test.tileentity.Th3TE;

public class Th3BlockTE extends BlockContainer implements ITileEntityProvider {
	
	public Th3BlockTE() {
        super(Material.rock);
        setBlockName("Th3BlockTE");
        setBlockTextureName("th3test:Th3BlockTE");
        setCreativeTab(Th3CreativeTab.Th3Tab);
        setStepSound(soundTypeStone);
        setHardness(3F);
        setResistance(5F);
        setLightLevel(0F);
    }
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
	    if (!world.isRemote) {
	        player.openGui(Th3Main.instance, Th3GUIHandler.MOD_TILE_ENTITY_GUI, world, x, y, z);
	    }
	    return true;
	}
	
	@Override
    public void breakBlock(World world, int x, int y, int z, Block block, int p_149749_6_) {
	    Th3TE te = (Th3TE) world.getTileEntity(x, y, z);
		for(int i=0; i<te.getSizeInventory(); i++)
        {
            if(te.getStackInSlot(i) != null)
                dropBlockAsItem(world, x, y, z, te.getStackInSlot(i));
        }
		
        if (hasTileEntity(p_149749_6_) && !(this instanceof BlockContainer))
        {
            world.removeTileEntity(x, y, z);
        }
    }
	
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new Th3TE();
    }
}
