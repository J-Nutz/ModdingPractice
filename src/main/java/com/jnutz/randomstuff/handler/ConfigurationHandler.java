package com.jnutz.randomstuff.handler;

import com.jnutz.randomstuff.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile){

        //Creates The Configuration Based On Mod Name
        if(configuration == null) {

            Configuration configuration = new Configuration(configFile);
            loadConfiguration();

        }
        //Move somewhere
        //Gets the config, in general category, adds in config value with default true, Adds in comment for what the config is for, then gets the value
        //Can change "Configuration.CATEGORY_GENERAL to and String such as "Blocks", "Items", "Power", etc.

    }


    @SubscribeEvent
    public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event){

        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){

            loadConfiguration();

        }

    }

    private static void loadConfiguration(){

        testValue = configuration.getBoolean("configValue", configuration.CATEGORY_GENERAL, false, "Example Config Line");

        if(configuration.hasChanged()){

            configuration.save();

        }

    }

}
