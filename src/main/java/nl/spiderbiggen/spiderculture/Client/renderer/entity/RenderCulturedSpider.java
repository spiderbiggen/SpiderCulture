package nl.spiderbiggen.spiderculture.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import nl.spiderbiggen.spiderculture.reference.Reference;

/**
 * Created by Spiderbiggen on 5-9-2014.
 */
public class RenderCulturedSpider extends RenderLiving {
    public RenderCulturedSpider(ModelBase modelBase, float scaling) {
        super(modelBase, scaling);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return Reference.TEXTURE_SPIDER;
    }
}
