package nl.spiderbiggen.spiderculture.proxy;

import cpw.mods.fml.common.registry.GameRegistry;
import nl.spiderbiggen.spiderculture.tileentity.TileEntitySpiderEgg;

/**
 * Created by Spiderbiggen on 16-8-2014.
 */
public abstract class CommonProxy implements IProxy {
    public void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntitySpiderEgg.class, "spiderEggBlock");
    }
}
