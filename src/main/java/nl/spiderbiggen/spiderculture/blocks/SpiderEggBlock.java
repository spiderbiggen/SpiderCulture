package nl.spiderbiggen.spiderculture.blocks;

import net.minecraft.creativetab.CreativeTabs;
import nl.spiderbiggen.spiderculture.materials.Materials;

/**
 * Created by Spiderbiggen on 15-8-2014.
 */
public class SpiderEggBlock extends BlockSC {
    public SpiderEggBlock() {
        super(Materials.materialMobEgg);
        this.setHardness(2.0f);
        this.setBlockName("spiderEggBlock");
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setHarvestLevel("spiderScoop", 0);
    }

}
