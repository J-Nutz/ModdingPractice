package com.jnutz.randomstuff.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler {

    //Remove Print

    public static void init(File configFile){

        //Creates The Configuration Based On Mod Name
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try{

            //Load The Configuration
            configuration.load();

            //Read The Properties
            //Gets the config, in general category, adds in config value with default true, Adds in comment for what the config is for, then gets the value
            //Can change "Configuration.CATEGORY_GENERAL to and String such as "Blocks", "Items", "Power", etc.
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
            String blockName = configuration.get(Configuration.CATEGORY_GENERAL, "blockName", "Couch", "Sets the name of this block").getString();

        } catch (Exception e){

            //Log Exceptions

        }finally {

            //Save The Configuration
            configuration.save();

        }

    }

}
