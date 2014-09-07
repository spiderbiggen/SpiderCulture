package nl.spiderbiggen.spiderculture.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import nl.spiderbiggen.spiderculture.SpiderCulture;
import nl.spiderbiggen.spiderculture.client.renderer.entity.RenderCulturedSpider;
import nl.spiderbiggen.spiderculture.client.renderer.item.ItemRendererSpiderEgg;
import nl.spiderbiggen.spiderculture.client.renderer.tileentity.TileEntityRendererSpiderEgg;
import nl.spiderbiggen.spiderculture.entity.EntityCulturedSpider;
import nl.spiderbiggen.spiderculture.reference.RenderIds;
import nl.spiderbiggen.spiderculture.tileentity.TileEntitySpiderEgg;

/**
 * Created by Spiderbiggen on 16-8-2014.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderingAndTextures() {
        RenderIds.spiderEggBlock = RenderingRegistry.getNextAvailableRenderId();
        MinecraftForgeClient.registerItemRenderer(SpiderCulture.spiderEggItem, new ItemRendererSpiderEgg());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(SpiderCulture.spiderEggBlock), new ItemRendererSpiderEgg());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpiderEgg.class, new TileEntityRendererSpiderEgg());
        RenderingRegistry.registerEntityRenderingHandler(EntityCulturedSpider.class, new RenderCulturedSpider(new ModelSpider(), 0.5f));
    }

}

