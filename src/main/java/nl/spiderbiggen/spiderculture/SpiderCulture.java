package nl.spiderbiggen.spiderculture;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nl.spiderbiggen.spiderculture.blocks.SpiderEggBlock;
import nl.spiderbiggen.spiderculture.configuration.ConfigurationHandler;
import nl.spiderbiggen.spiderculture.items.SpiderEggItem;
import nl.spiderbiggen.spiderculture.items.SpiderScoop;
import nl.spiderbiggen.spiderculture.proxy.IProxy;

/**
 * Created by Spiderbiggen on 15-8-2014.
 */

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class SpiderCulture {

    @Mod.Instance(Reference.MOD_ID)
    public static SpiderCulture instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;


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
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

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
        GameRegistry.registerItem(this.spiderScoop, "spiderScoop", Reference.MOD_ID);
        GameRegistry.registerItem(this.spiderEggItem, "spiderEggItem", Reference.MOD_ID);

    }

}
