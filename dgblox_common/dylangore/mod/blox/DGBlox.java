package dylangore.mod.blox;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dylangore.mod.blox.Misc.DGTab;
import dylangore.mod.blox.ModBlocks.DGCobbleBlock;
import dylangore.mod.blox.ModBlocks.DGCobbleBlock_Item;
import dylangore.mod.blox.ModBlocks.DGCrackedStoneBrickBlock;
import dylangore.mod.blox.ModBlocks.DGCrackedStoneBrickBlock_Item;
import dylangore.mod.blox.ModBlocks.DGStoneBlock;
import dylangore.mod.blox.ModBlocks.DGStoneBlock_Item;
import dylangore.mod.blox.ModBlocks.DGStoneBrickBlock;
import dylangore.mod.blox.ModBlocks.DGStoneBrickBlock_Item;
import dylangore.mod.blox.crafting.ColoredCobbleRecipes;
import dylangore.mod.blox.crafting.ColoredCrackedStoneBrickRecipes;
import dylangore.mod.blox.crafting.ColoredStoneBrick;
import dylangore.mod.blox.crafting.ColoredStoneRecipes;

//Mod Info
@Mod(modid = "DGBlox", name = "DylanGore's Blox Mod", version = "1.3.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DGBlox {

	
	//Creative Tab
	public static CreativeTabs DGTab = new DGTab("BloxTab");
	
	//Colored Stone Block
	public static int DGStoneBlockId = 2100;
	public static Block blockStone = new DGStoneBlock(DGStoneBlockId).setHardness(1.5F).setResistance(10.0F);
	public static final String[] DGStoneBlockNames = { "White Stone",
		"Orange Stone", "Magenta Stone", "Light Blue Stone",
		"Yellow Stone", "Lime", "Pink Stone",
		"Dark Gray Stone", "Light Gray Stone", "Cyan Stone",
		"Purple Stone", "Blue Stone", "Brown Stone", "Green Stone",
		"Red Stone", "Black Stone" };
	
	//Colored Cobble Block
	public static int DGCobbleBlockId = 2101;
	public static Block blockCobble = new DGCobbleBlock(DGCobbleBlockId).setHardness(1.5F).setResistance(10.0F);
	public static final String[] DGCobbleBlockNames = { "White Cobblestone",
		"Orange Cobblestone", "Magenta Cobblestone", "Light Blue Cobblestone",
		"Yellow Cobblestone", "Lime Cobblestone", "Pink Cobblestone",
		"Dark Gray Cobblestone", "Light Gray Cobblestone", "Cyan Cobblestone",
		"Purple Cobblestone", "Blue Cobblestone", "Brown Cobblestone", "Green Cobblestone",
		"Red Cobblestone", "Black Cobblestone" };
	
	//Colored Stone Bricks Block
	public static int DGStoneBrickBlockId = 2102;
	public static Block blockStoneBrick = new DGStoneBrickBlock(DGStoneBrickBlockId).setHardness(1.5F).setResistance(10.0F);
	public static final String[] DGStoneBrickBlockNames = { "White Stone Bricks ",
		"Orange Stone Bricks", "Magenta Stone Bricks", "Light Blue Stone Bricks",
		"Yellow Stone Bricks", "Lime Stone Bricks", "Pink Stone Bricks",
		"Dark Gray Stone Bricks", "Light Gray Stone Bricks", "Cyan Stone Bricks",
		"Purple Stone Bricks", "Blue Stone Bricks", "Brown Stone Bricks", "Green Stone Bricks",
		"Red Stone Bricks", "Black Stone Bricks"};


	@Mod.PreInit
	public void config(FMLPreInitializationEvent event) {
		// Config File
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
			int DGStoneID = config.getBlock("Colored Stone", 2100).getInt();
			int DGCobbeID = config.getBlock("Colored Cobblestone", 2101).getInt();
			int DGStoneBrickID = config.getBlock("Colored Stone Bricks", 2102).getInt();
		config.save();

		//Console Print
		System.out.println("DylanGore's Colored Blox Mod has been loaded");
	}
	
	@Mod.Init
	public void load(FMLInitializationEvent event) {
	//Game Registry
		regBlocks();
		//Recipes
		ColoredStoneRecipes.addColoredStoneRecipes();
		ColoredCobbleRecipes.addColoredCobbleRecipes();
		ColoredStoneBrick.addColoredStoneBrickRecipes();

	// Language Registry
		 languageRegistry();
	// Ore Dictionary
		  oreDict();
	}

	private void languageRegistry() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.BloxTab",
				"en_US", "DG Colored Blox");
	}

	private void oreDict() {
		//TODO finish this section
		  OreDictionary.registerOre("blockStone", new ItemStack(blockStone));
		  OreDictionary.registerOre("blockCobble", new ItemStack(blockCobble));
	}

	private void regBlocks() {
		//Colored Stone
		GameRegistry.registerBlock(blockStone, DGStoneBlock_Item.class,
				"DG_Stone");
		//Colored Cobble
		GameRegistry.registerBlock(blockCobble, DGCobbleBlock_Item.class,
				"DG_Cobble");
		//Colored Stone Bricks
		GameRegistry.registerBlock(blockStoneBrick, DGStoneBrickBlock_Item.class,
				"DG_StoneBrick");
	}
}