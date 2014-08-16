package nl.spiderbiggen.spiderculture.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Spiderbiggen on 16-8-2014.
 */
public class ConfigurationHandler {
    public static void init(File configFile) {
        Configuration config = new Configuration(configFile);

        try {
            //load config file
            config.load();
            //read config options from file
        } catch (Exception e) {
            //TODO Log the exception
        } finally {
            config.save();
        }
    }
}
