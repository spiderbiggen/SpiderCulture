package nl.spiderbiggen.spiderculture.proxy;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import nl.spiderbiggen.spiderculture.SpiderCulture;
import nl.spiderbiggen.spiderculture.entity.EntityCulturedSpider;
import nl.spiderbiggen.spiderculture.reference.EntityIds;
import nl.spiderbiggen.spiderculture.tileentity.TileEntitySpiderEgg;

/**
 * Created by Spiderbiggen on 16-8-2014.
 */
public abstract class CommonProxy implements IProxy {
    public void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntitySpiderEgg.class, "spiderEggBlock");
    }

    public void registerEntities() {
        EntityRegistry.registerModEntity(EntityCulturedSpider.class, "culturedSpider", EntityIds.culturedSpider, SpiderCulture.instance, 80, 1, true);
    }
}
