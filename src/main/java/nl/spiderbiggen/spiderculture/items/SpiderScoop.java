package nl.spiderbiggen.spiderculture.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nl.spiderbiggen.spiderculture.blocks.materials.Materials;

/**
 * Created by Spiderbiggen on 15-8-2014.
 */
public class SpiderScoop extends ItemSC {
    //private static final Set effectiveBlocks = Sets.newHashSet(new Block[]{SpiderCulture.spiderEggBlock});
    private Item.ToolMaterial toolMaterial;

    public SpiderScoop(Item.ToolMaterial toolMaterial) {
        this.setHarvestLevel("scoop", toolMaterial.getHarvestLevel());
        this.toolMaterial = toolMaterial;
        this.setMaxStackSize(1);
        this.setMaxDamage(10);
        this.setUnlocalizedName("spiderScoop");
    }

    @Override
    public boolean func_150897_b(Block block) {
        if (block.getMaterial() == Materials.materialMobEgg && this.toolMaterial.getHarvestLevel() >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public float func_150893_a(ItemStack itemstack, Block block) {
        float efficiencyOnProperMaterial = 8.0f;
        return block.getMaterial() != Material.iron && block.getMaterial() != Material.anvil && block.getMaterial() != Material.rock ? super.func_150893_a(itemstack, block) : efficiencyOnProperMaterial;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack itemStack, World world, Block block, int x, int y, int z, EntityLivingBase entityLivingBase) {
        itemStack.damageItem(1, entityLivingBase);


        return super.onBlockDestroyed(itemStack, world, block, x, y, z, entityLivingBase);
    }
}
