package nl.spiderbiggen.spiderculture.client.renderer.model;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import nl.spiderbiggen.spiderculture.reference.Reference;

/**
 * Created by Spiderbiggen on 24-8-2014.
 */
@SideOnly(Side.CLIENT)
public class ModelSpiderEgg {

    private IModelCustom modelSpiderEgg;

    public ModelSpiderEgg() {
        modelSpiderEgg = AdvancedModelLoader.loadModel(Reference.SPIDEREGG);
    }

    public void render() {
        modelSpiderEgg.renderAll();
    }
}
