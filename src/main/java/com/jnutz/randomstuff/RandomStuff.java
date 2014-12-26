package com.jnutz.randomstuff;

import com.jnutz.randomstuff.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "randomstuff", name = "Random Stuff", version = "1.7.10-1.0" )
public class RandomStuff {

    @SidedProxy(clientSide = "com.jnutz.randomstuff.proxy.ClientProxy", serverSide = "com.jnutz.randomstuff.proxy.ServerProxy")
    public static IProxy proxy;


    @Mod.Instance("RandomStuff")
    public static RandomStuff instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){



    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){



    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){



    }

}
