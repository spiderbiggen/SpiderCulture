package nl.spiderbiggen.spiderculture.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import nl.spiderbiggen.spiderculture.client.renderer.tileentity.TileEntityRendererSpiderEgg;
import nl.spiderbiggen.spiderculture.reference.RenderIds;
import nl.spiderbiggen.spiderculture.tileentity.TileEntitySpiderEgg;

/**
 * Created by Spiderbiggen on 16-8-2014.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderingAndTextures() {
        RenderIds.spiderEggBlock = RenderingRegistry.getNextAvailableRenderId();

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpiderEgg.class, new TileEntityRendererSpiderEgg());
    }
}

