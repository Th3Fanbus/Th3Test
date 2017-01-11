package th3test.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;
import th3test.tileentity.Th3TE;

public final class Th3TEs {

    public static TileEntity Th3TE;
	
    public static final void init() {
        GameRegistry.registerTileEntity(Th3TE.class, "Th3TE");
    }

}