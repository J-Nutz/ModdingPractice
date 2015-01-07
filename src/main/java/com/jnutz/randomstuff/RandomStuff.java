package com.jnutz.randomstuff;

import com.jnutz.randomstuff.generation.ModGen;
import com.jnutz.randomstuff.handler.ConfigurationHandler;
import com.jnutz.randomstuff.init.*;
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

    /** Register Blocks and items and such **/
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        /** Initializes the config **/
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        /** Initializes the items **/
        ModItems.preInit();

        /** Initializes the item crafting recipes **/
        ModCraftingItems.preInit();

        /** Initializes the blocks **/
        ModBlocks.preInit();

        /** Initializes the block crafting recipes **/
        ModCraftingBlocks.preInit();

        /** Adds Smelting Recipes **/
        ModSmelting.preInit();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        ModGen.init();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){



    }
}
