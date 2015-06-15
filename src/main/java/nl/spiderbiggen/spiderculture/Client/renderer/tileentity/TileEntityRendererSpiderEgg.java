package nl.spiderbiggen.spiderculture.client.renderer.tileentity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import nl.spiderbiggen.spiderculture.client.renderer.model.ModelSpiderEgg;
import nl.spiderbiggen.spiderculture.reference.Reference;
import nl.spiderbiggen.spiderculture.tileentity.TileEntitySpiderEgg;
import org.lwjgl.opengl.GL11;

/**
 * Created by Spiderbiggen on 24-8-2014.
 */
@SideOnly(Side.CLIENT)
public class TileEntityRendererSpiderEgg extends TileEntitySpecialRenderer {

    private final ModelSpiderEgg modelSpiderEgg;

    public TileEntityRendererSpiderEgg() {
        this.modelSpiderEgg = new ModelSpiderEgg();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if (tileEntity instanceof TileEntitySpiderEgg) {
            GL11.glPushMatrix();
            GL11.glTranslated(x, y, z + 1);
            // Bind texture
            this.bindTexture(Reference.TEXTURE_SPIDEREGG);
            // Render
            modelSpiderEgg.render();
            GL11.glPopMatrix();
        }
    }
}
