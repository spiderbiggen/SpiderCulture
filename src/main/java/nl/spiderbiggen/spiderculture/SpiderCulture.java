package nl.spiderbiggen.spiderculture;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nl.spiderbiggen.spiderculture.blocks.SpiderEggBlock;
import nl.spiderbiggen.spiderculture.items.SpiderEggItem;
import nl.spiderbiggen.spiderculture.items.SpiderScoop;

/**
 * Created by Spiderbiggen on 15-8-2014.
 */

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class SpiderCulture {

    /*
     * Blocks
     */
    public Block spiderEggBlock;

    /*
     * Items
     */
    public Item spiderEggItem;
    public Item spiderScoop;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        spiderEggBlock = new SpiderEggBlock(Material.rock).setBlockName("spiderEggBlock").setCreativeTab(CreativeTabs.tabDecorations);

        spiderEggItem = new SpiderEggItem().setUnlocalizedName("spiderEggItem").setCreativeTab(CreativeTabs.tabDecorations);
        spiderScoop = new SpiderScoop().setUnlocalizedName("spiderScoop").setCreativeTab(CreativeTabs.tabDecorations);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    private void registry() {
        GameRegistry.registerBlock(this.spiderEggBlock, this.spiderEggBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(this.spiderScoop, this.spiderScoop.getUnlocalizedName().substring(5), Reference.MODID);
        GameRegistry.registerItem(this.spiderEggItem, this.spiderEggItem.getUnlocalizedName().substring(5), Reference.MODID);

    }

}
