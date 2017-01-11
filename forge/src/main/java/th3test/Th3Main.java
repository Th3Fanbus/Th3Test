package th3test;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import th3test.proxy.CommonProxy;

@Mod(
		modid = Th3Main.modid,
		version = Th3Main.version,
		name = Th3Main.name,
		dependencies = "required-after:Forge;")

public class Th3Main {

    public static final String modid = "th3test";
    public static final String version = "th3test";
    public static final String name = "Th3 Test";
    
    @Instance
    public static Th3Main instance = new Th3Main();
    
    @SidedProxy(clientSide = "th3test.proxy.ClientProxy", serverSide = "th3test.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event){
    	System.out.println("Called method: preInit");
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event){
    	System.out.println("Called method: init");
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event){
    	System.out.println("Called method: postInit");
        proxy.postInit(event);
    }
}
