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
import nl.spiderbiggen.spiderculture.items.DebugTool;
import nl.spiderbiggen.spiderculture.items.SpiderEggItem;
import nl.spiderbiggen.spiderculture.items.SpiderScoop;
import nl.spiderbiggen.spiderculture.proxy.IProxy;
import nl.spiderbiggen.spiderculture.reference.Reference;

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
    public static CreativeTabs creativeTabSpiderCulture = new CreativeTabs("SpiderCulture") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(spiderEggBlock);
        }
    };
    /*
     * Items
     */
    public static Item spiderEggItem;
    public static Item spiderScoop;


    public static Item debugTool;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        spiderEggBlock = new SpiderEggBlock();
        spiderEggItem = new SpiderEggItem();
        spiderScoop = new SpiderScoop(Item.ToolMaterial.WOOD);
        debugTool = new DebugTool();

        GameRegistry();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {
        // Initialize mod tile entities
        proxy.registerTileEntities();
        proxy.registerEntities();
// Initialize custom rendering and pre-load textures (Client only)
        proxy.initRenderingAndTextures();
        //TODO Render Item for spideregg
    }

    private void GameRegistry() {
        GameRegistry.registerBlock(this.spiderEggBlock, "spiderEggBlock");
        GameRegistry.registerItem(this.spiderScoop, "spiderScoop", Reference.MOD_ID);
        GameRegistry.registerItem(this.spiderEggItem, "spiderEggItem", Reference.MOD_ID);


        GameRegistry.registerItem(this.debugTool, "debugTool", Reference.MOD_ID);

    }

}
