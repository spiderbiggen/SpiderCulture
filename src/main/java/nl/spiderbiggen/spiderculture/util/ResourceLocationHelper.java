package nl.spiderbiggen.spiderculture.util;

import net.minecraft.util.ResourceLocation;
import nl.spiderbiggen.spiderculture.reference.Reference;

/**
 * Created by Spiderbiggen on 24-8-2014.
 */
public class ResourceLocationHelper {
    public static ResourceLocation getResourceLocation(String modId, String path) {
        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path) {
        return getResourceLocation(Reference.MOD_ID.toLowerCase(), path);
    }
}
