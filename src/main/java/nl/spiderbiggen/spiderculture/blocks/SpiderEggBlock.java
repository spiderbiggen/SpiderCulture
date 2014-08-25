package nl.spiderbiggen.spiderculture.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import nl.spiderbiggen.spiderculture.SpiderCulture;
import nl.spiderbiggen.spiderculture.blocks.materials.Materials;
import nl.spiderbiggen.spiderculture.reference.RenderIds;
import nl.spiderbiggen.spiderculture.reference.Settings;
import nl.spiderbiggen.spiderculture.tileentity.TileEntitySpiderEgg;

import java.util.Random;

/**
 * Created by Spiderbiggen on 15-8-2014.
 */
public class SpiderEggBlock extends BlockSC implements ITileEntityProvider {
    public int stages = Settings.growthStages;

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

    @Override
    public Item getItemDropped(int metadata, Random rand, int int2) {
        return metadata >= stages ? SpiderCulture.spiderEggItem : Item.getItemFromBlock(SpiderCulture.spiderEggBlock);
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
        int l = world.getBlockMetadata(x, y, z);

        if (l <= stages && rand.nextInt(10) == 0) {
            ++l;
            world.setBlockMetadataWithNotify(x, y, z, l, 2);
        }

        super.updateTick(world, x, y, z, rand);
    }
}
