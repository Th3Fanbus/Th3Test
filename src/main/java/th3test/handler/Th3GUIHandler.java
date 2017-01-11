package th3test.handler;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import th3test.gui.Th3ContainerTE;
import th3test.gui.Th3GUITE;
import th3test.tileentity.Th3TE;

public class Th3GUIHandler implements IGuiHandler {

    public static final int MOD_TILE_ENTITY_GUI = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == MOD_TILE_ENTITY_GUI)
            return new Th3ContainerTE(player.inventory, (Th3TE) world.getTileEntity(x, y, z));

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == MOD_TILE_ENTITY_GUI)
            return new Th3GUITE(player.inventory, (Th3TE) world.getTileEntity(x, y, z));

        return null;
    }
    
    
}
