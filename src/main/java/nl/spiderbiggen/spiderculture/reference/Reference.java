package nl.spiderbiggen.spiderculture.reference;

import net.minecraft.util.ResourceLocation;
import nl.spiderbiggen.spiderculture.util.ResourceLocationHelper;

/**
 * Created by Spiderbiggen on 15-8-2014.
 */
public class Reference {
    public static final String MOD_ID = "spiderculture";
    public static final ResourceLocation SPIDEREGG = new ResourceLocation(MOD_ID, "models/spiderEgg.obj");//ResourceLocationHelper.getResourceLocation("models/spiderEgg.obj");
    public static final String MOD_NAME = "Spider Culture";
    public static final String VERSION = "Dev 0.0.1";
    public static final String RESOURCE_PREFIX = "spiderculture:";
    public static final String SERVER_PROXY = "nl.spiderbiggen.spiderculture.proxy.ServerProxy";
    public static final String CLIENT_PROXY = "nl.spiderbiggen.spiderculture.proxy.ClientProxy";
    public static final ResourceLocation TEXTURE_SPIDEREGG = ResourceLocationHelper.getResourceLocation("textures/blocks/spiderEggBlock.png");
    public static final ResourceLocation TEXTURE_SPIDER = ResourceLocationHelper.getResourceLocation("textures/entity/culturedSpider.png");

}
