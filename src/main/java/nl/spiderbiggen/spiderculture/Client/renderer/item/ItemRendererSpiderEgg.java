package nl.spiderbiggen.spiderculture.client.renderer.item;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import nl.spiderbiggen.spiderculture.client.renderer.model.ModelSpiderEgg;
import nl.spiderbiggen.spiderculture.reference.Reference;
import org.lwjgl.opengl.GL11;

/**
 * Created by Spiderbiggen on 24-8-2014.
 */
public class ItemRendererSpiderEgg implements IItemRenderer {

    private final ModelSpiderEgg modelSpiderEgg;

    public ItemRendererSpiderEgg() {
        this.modelSpiderEgg = new ModelSpiderEgg();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

        switch (type) {
            case ENTITY: {
                renderSpiderEgg(-0.5F, 0.0F, 0.5F);
                return;
            }
            case EQUIPPED: {
                renderSpiderEgg(0.0F, 0.0F, 1.0F);
                return;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderSpiderEgg(0.0F, 0.0F, 1.0F);
                return;
            }
            case INVENTORY: {
                renderSpiderEgg(0.0F, -0.1F, 1.0F);
                return;
            }
            default: {
            }
        }
    }

    private void renderSpiderEgg(float x, float y, float z) {
        GL11.glPushMatrix();
// Scale, Translate, Rotate
        GL11.glScalef(1.25F, 1.25F, 1.25F);
        GL11.glTranslatef(x, y, z);
        GL11.glRotatef(0, 1F, 0, 0);
// Bind texture
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(Reference.TEXTURE_SPIDEREGG);
// Render
        modelSpiderEgg.render();
        GL11.glPopMatrix();
    }
}
