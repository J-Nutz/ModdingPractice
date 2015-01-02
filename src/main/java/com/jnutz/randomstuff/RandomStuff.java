package com.jnutz.randomstuff;

import com.jnutz.randomstuff.generation.ModGen;
import com.jnutz.randomstuff.handler.ConfigurationHandler;
import com.jnutz.randomstuff.init.ModBlocks;
import com.jnutz.randomstuff.init.ModItems;
import com.jnutz.randomstuff.proxy.IProxy;
import com.jnutz.randomstuff.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.ItemStack;

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

        /** Initializes the blocks **/
        ModBlocks.preInit();

        /** Initializes the block crafting recipes **/
        ModBlocks.craftingPreInit();

        /** Adds Smelting Recipes
         *  Make Own Class
         * **/
        GameRegistry.addSmelting(new ItemStack(ModBlocks.purpleOre, 1, 1), new ItemStack(ModItems.purpleIngot, 1, 11), 0.4F);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        ModGen.init();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){



    }
}
