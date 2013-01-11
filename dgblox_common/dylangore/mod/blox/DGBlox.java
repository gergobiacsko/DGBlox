package dylangore.mod.blox;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dylangore.mod.blox.Misc.DGTab;
import dylangore.mod.blox.ModBlocks.DGStoneBlock;
import dylangore.mod.blox.ModBlocks.DGStoneBlock_Item;
import dylangore.mod.blox.ModBlocks.DGCobbleBlock;
import dylangore.mod.blox.ModBlocks.DGCobbleBlock_Item;

//Mod Info
@Mod(modid = "DGBlox", name = "DylanGore's Blox Mod", version = "1.2.2")
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


	@Mod.Init
	public void load(FMLInitializationEvent event) {
	//Game Registry
		regBlocks();
		//Recipes
		dylangore.mod.blox.crafting.ColoredStoneRecipes.addColoredStoneRecipes();
		dylangore.mod.blox.crafting.ColoredCobbleRecipes.addColoredCobbleRecipes();
		dylangore.mod.blox.crafting.VanillaStoneRecipes.addVanillaStoneRecipes();


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
		
	}

	@Mod.PreInit
	public void config(FMLPreInitializationEvent event) {
		// Config File
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		int DGStoneBlockID = config.get("Colored Blox","Colored Stone" , 502 ).getInt();
		int DGCobbleBlockID = config.get("Colored Blox","Colored Cobblestone" , 503 ).getInt();
		config.save();

		//Console Print
		System.out.println("DylanGore's Blox Mod has been loaded");
	}
}