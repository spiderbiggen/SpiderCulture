package nl.spiderbiggen.spiderculture.configuration;


import net.minecraftforge.common.config.Configuration;
import nl.spiderbiggen.spiderculture.reference.Settings;

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
            Settings.maxSpawnedFriendlies = config.getInt("SpawnsPerEgg", "Misc", 1, 1, 10, "Max Spawns per egg");
            Settings.growthStages = config.getInt("growth steps", "Misc", 10, 0, 15, "The amount of time (like wheat) it takes for the egg to be ready to be harvested. Integer from 0 to 15 ");
        } catch (Exception e) {
            //TODO Log the exception
        } finally {
            config.save();
        }
    }
}
