package com.jnutz.randomstuff;

import com.jnutz.randomstuff.handler.ConfigurationHandler;
import com.jnutz.randomstuff.proxy.IProxy;
import com.jnutz.randomstuff.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class RandomStuff {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.Instance(Reference.MOD_ID)
    public static RandomStuff instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());


    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){



    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){



    }

}
