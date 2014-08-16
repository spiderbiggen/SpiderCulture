package nl.spiderbiggen.spiderculture.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import nl.spiderbiggen.spiderculture.materials.Materials;
import nl.spiderbiggen.spiderculture.reference.RenderIds;
import nl.spiderbiggen.spiderculture.tileentity.TileEntitySpiderEgg;

/**
 * Created by Spiderbiggen on 15-8-2014.
 */
public class SpiderEggBlock extends BlockSC implements ITileEntityProvider {
    public SpiderEggBlock() {
        super(Materials.materialMobEgg);
        this.setHardness(2.0f);
        this.setBlockName("spiderEggBlock");
        this.setHarvestLevel("spiderScoop", 0);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metaData) {
        return new TileEntitySpiderEgg();
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public int getRenderType() {
        return RenderIds.spiderEggBlock;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }
}
