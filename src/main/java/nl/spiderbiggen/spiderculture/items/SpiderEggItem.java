package nl.spiderbiggen.spiderculture.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nl.spiderbiggen.spiderculture.SpiderCulture;
import nl.spiderbiggen.spiderculture.reference.Settings;

import java.util.List;

/**
 * Created by Spiderbiggen on 15-8-2014.
 */
public class SpiderEggItem extends ItemSC {

    private int maxSpawnedSpidersPerItem;
    private int spawnedSpiders;
    private Block blockPlaced = SpiderCulture.spiderEggBlock;

    public SpiderEggItem() {
        this.maxSpawnedSpidersPerItem = Settings.maxSpawnedFriendlies;
        this.setUnlocalizedName("spiderEggItem");
        this.setMaxStackSize(1);
        this.setMaxDamage(this.maxSpawnedSpidersPerItem);
    }

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int bx, int by, int bz, int side, float px, float py, float pz) {
        //return super.onItemUse(p_77648_1_, p_77648_2_, p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_);
        if (!world.isRemote) {
            if (player.isSneaking()) {
                Block block = world.getBlock(bx, by, bz);

                if (block == Blocks.snow_layer && (world.getBlockMetadata(bx, by, bz) & 7) < 1) {
                    side = 1;
                } else if (block != Blocks.vine && block != Blocks.tallgrass && block != Blocks.deadbush) {
                    switch (side) {
                        case 0:
                            --by;
                            break;
                        case 1:
                            ++by;
                            break;
                        case 2:
                            --bz;
                            break;
                        case 3:
                            ++bz;
                            break;
                        case 4:
                            --bx;
                            break;
                        case 5:
                            ++bx;
                            break;
                    }

                }

                if (!player.canPlayerEdit(bx, by, bz, side, itemStack)) {
                    return false;
                } else if (itemStack.stackSize == 0) {
                    return false;
                } else {
                    if (world.canPlaceEntityOnSide(this.blockPlaced, bx, by, bz, false, side, (Entity) null, itemStack)) {
                        int i1 = this.blockPlaced.onBlockPlaced(world, bx, by, bz, side, px, py, pz, 0);

                        if (world.setBlock(bx, by, bz, this.blockPlaced, i1, 3)) {
                            if (world.getBlock(bx, by, bz) == this.blockPlaced) {
                                this.blockPlaced.onBlockPlacedBy(world, bx, by, bz, player, itemStack);
                                this.blockPlaced.onPostBlockPlaced(world, bx, by, bz, i1);
                            }

                            --itemStack.stackSize;
                        }
                    }

                    return true;
                }
            } else if (itemStack.getItemDamage() != maxSpawnedSpidersPerItem) {
                itemStack.damageItem(1, player);
                return true;
            }
        }
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation) {
        if (spawnedSpiders == maxSpawnedSpidersPerItem) {
            info.add("This item has spawned it's maximum amount of spiders");
        } else {
            info.add("this item has been used " + itemstack.getItemDamage() + "/" + itemstack.getMaxDamage() + " times");
        }
    }
}
