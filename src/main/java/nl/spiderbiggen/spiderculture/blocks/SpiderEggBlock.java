package nl.spiderbiggen.spiderculture.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import nl.spiderbiggen.spiderculture.Reference;
import nl.spiderbiggen.spiderculture.items.SpiderScoop;
import nl.spiderbiggen.spiderculture.materials.MaterialMobEgg;
import nl.spiderbiggen.spiderculture.materials.Materials;

import java.util.ArrayList;

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
