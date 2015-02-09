package com.asdaa.testmod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile){
        // Create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try{
            // Load the configuration file
            configuration.load();

            // Read in properties from configuration file
            configValue = configuration.get("THE HOLY MAGIC EXTREME CATEGORY OF VALUES THAT HOLDS A ONE SINGLE VALUE", "configValue",
                                            true, "This is an example config value").getBoolean(true);
        }catch (Exception e){
            // Log the exception
        }finally{
            // Save the configuration file
            configuration.save();
        }

        System.out.println("Configuration Test: " + configValue);
    }
}
