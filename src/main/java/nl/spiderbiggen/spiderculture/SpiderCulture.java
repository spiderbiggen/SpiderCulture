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
    public static Block spiderEggBlock;

    /*
     * Items
     */
    public static Item spiderEggItem;
    public static Item spiderScoop;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        spiderEggBlock = new SpiderEggBlock();
        spiderEggItem = new SpiderEggItem().setUnlocalizedName("spiderEggItem").setCreativeTab(CreativeTabs.tabDecorations);
        spiderScoop = new SpiderScoop(Item.ToolMaterial.WOOD).setUnlocalizedName("spiderScoop").setCreativeTab(CreativeTabs.tabDecorations);

        GameRegistry();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {

    }

    private void GameRegistry() {
        GameRegistry.registerBlock(this.spiderEggBlock, "spiderEggBlock");
        GameRegistry.registerItem(this.spiderScoop, "spiderScoop", Reference.MODID);
        GameRegistry.registerItem(this.spiderEggItem, "spiderEggItem", Reference.MODID);

    }

}
