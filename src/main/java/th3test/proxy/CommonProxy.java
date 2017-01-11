package th3test.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import th3test.Th3Main;
import th3test.handler.Th3Blocks;
import th3test.handler.Th3GUIHandler;
import th3test.handler.Th3Items;
import th3test.handler.Th3Recipes;
import th3test.handler.Th3TEs;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
        Th3Items.init();
        Th3Blocks.init();
        Th3TEs.init();
	}

	public void init(FMLInitializationEvent event) {
        Th3Recipes.init();
        NetworkRegistry.INSTANCE.registerGuiHandler(Th3Main.instance, new Th3GUIHandler());
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	
	
    public void registerRenderers(){
        //Nothing here as the server doesn't render graphics or entities!
    }
    public void registerProxies(){
        //Nothing here as the server doesn't render graphics or entities!
    }
}
