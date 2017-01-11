package th3test.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import th3test.block.Th3Block;
import th3test.block.Th3BlockTE;
import th3test.block.Th3MetaBlock;
import th3test.block.Th3SidedBlock;
import th3test.item.Th3ItemBlockMeta;

public final class Th3Blocks {

    public static Block Th3Block;
    public static Block Th3BlockTE;
    public static Block Th3MetaBlock;
    public static Block Th3SidedBlock;
	
    public static final void init() {
        GameRegistry.registerBlock(Th3Block = new Th3Block(), "Th3Block");
        GameRegistry.registerBlock(Th3BlockTE = new Th3BlockTE(), "Th3BlockTE");
        GameRegistry.registerBlock(Th3MetaBlock = new Th3MetaBlock(), Th3ItemBlockMeta.class, "Th3MetaBlock");
        GameRegistry.registerBlock(Th3SidedBlock = new Th3SidedBlock(), "Th3SidedBlock");

    }

}