package nl.spiderbiggen.spiderculture.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import nl.spiderbiggen.spiderculture.SpiderCulture;

/**
 * Created by Spiderbiggen on 24-8-2014.
 */
public class DebugTool extends Item {

    public DebugTool() {
        this.setUnlocalizedName("debugTool");
        this.setMaxStackSize(1);
        this.setCreativeTab(SpiderCulture.creativeTabSpiderCulture);
    }

    //@Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int bx, int by, int bz, int side, float px, float py, float pz) {

        int meta = getMetaData(world, bx, by, bz);

        if (world.getBlock(bx, by, bz) == SpiderCulture.spiderEggBlock) {
            if (entityPlayer.isSneaking()) world.setBlockMetadataWithNotify(bx, by, bz, ++meta, 2);

            if (world.isRemote) sendChatMessage(entityPlayer, metaDebug(meta));

            return true;
        }

        return false;
    }

    private void sendChatMessage(EntityPlayer player, IChatComponent iChatComponent) {
        player.addChatMessage(iChatComponent);
    }

    private ChatComponentText metaDebug(int meta) {
        String metaDataText = EnumChatFormatting.DARK_RED + "SC Debug: " + EnumChatFormatting.RED + "metadata " + EnumChatFormatting.WHITE + meta;

        return new ChatComponentText(metaDataText);
    }

    private int getMetaData(World world, int x, int y, int z) {
        return world.getBlockMetadata(x, y, z);
    }
}
