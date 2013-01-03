package dylangore.mod.blox;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.Configuration;
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
@Mod(modid = "DGBlox", name = "DylanGore's Blox Mod", version = "1.1.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DGBlox {
	// * Defining Blocks, Items and Creative Tabs using a "public static"
	//Creative Tab
	public static CreativeTabs DGTab = new DGTab("BloxTab");
	//Stone Block
	public static int DGStoneBlockId = 502;
	public static Block DGStoneBlock = new DGStoneBlock(DGStoneBlockId).setHardness(1.5F).setResistance(10.0F);
	private static final String[] DGStoneBlockNames = { "White Stone",
		"Orange Stone", "Magenta Stone", "Light Blue Stone",
		"Yellow Stone", "Light Green Stone", "Pink Stone",
		"Dark Gray Stone", "Light Gray Stone", "Cyan Stone",
		"Purple Stone", "Blue Stone", "Brown Stone", "Green Stone",
		"Red Stone", "Black Stone" };
	//Cobble Block
	public static int DGCobbleBlockId = 503;
	public static Block DGCobbleBlock = new DGCobbleBlock(DGCobbleBlockId).setHardness(1.5F).setResistance(10.0F);
	private static final String[] DGCobbleBlockNames = { "White Cobblestone",
		"Orange Cobblestone", "Magenta Cobblestone", "Light Blue Cobblestone",
		"Yellow Cobblestone", "Light Green Cobblestone", "Pink Cobblestone",
		"Dark Gray Cobblestone", "Light Gray Cobblestone", "Cyan Cobblestone",
		"Purple Cobblestone", "Blue Cobblestone", "Brown Cobblestone", "Green Cobblestone",
		"Red Cobblestone", "Black Cobblestone" };

	@Mod.Init
	public void load(FMLInitializationEvent event) {

		// Colored Stone
		GameRegistry.registerBlock(DGStoneBlock, DGStoneBlock_Item.class,
				"DG_Stone");

		for (int ix = 0; ix < 16; ix++) {
			// Misc.
			ItemStack VanStone = new ItemStack(Block.stone);
			// Dyes (Change Ids)
			ItemStack DyeWhite = new ItemStack(Item.dyePowder, 1, 15);
			ItemStack DyeOrange = new ItemStack(Item.dyePowder, 1, 14);
			ItemStack DyeMagenta = new ItemStack(Item.dyePowder, 1, 13);
			ItemStack DyeLightBlue = new ItemStack(Item.dyePowder, 1, 12);
			ItemStack DyeYellow = new ItemStack(Item.dyePowder, 1, 11);
			ItemStack DyeLightGreen = new ItemStack(Item.dyePowder, 1, 2);
			ItemStack DyePink = new ItemStack(Item.dyePowder, 1, 9);
			ItemStack DyeDarkGrey = new ItemStack(Item.dyePowder, 1, 8);
			ItemStack DyeLightGrey = new ItemStack(Item.dyePowder, 1, 7);
			ItemStack DyeCyan = new ItemStack(Item.dyePowder, 1, 6);
			ItemStack DyePurple = new ItemStack(Item.dyePowder, 1, 5);
			ItemStack DyeBlue = new ItemStack(Item.dyePowder, 1, 11);
			ItemStack DyeBrown = new ItemStack(Item.dyePowder, 1, 3);
			ItemStack DyeGreen = new ItemStack(Item.dyePowder, 1, 4);
			ItemStack DyeRed = new ItemStack(Item.dyePowder, 1, 1);
			ItemStack DyeBlack = new ItemStack(Item.dyePowder, 1, ix);
			// Colored Stone
			ItemStack DGStoneStack = new ItemStack(DGStoneBlock, 1, ix);
		

			LanguageRegistry.addName(DGStoneStack,DGStoneBlockNames[DGStoneStack.getItemDamage()]);
			// * White Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 0),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone,DyeWhite);

			// * Orange Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 1),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeOrange);

			// * Magenta Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 2),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeMagenta);

			// * Light Blue Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 3),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeLightBlue);

			// * Yellow Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 4),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeYellow);

			// * Light Green Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 5),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeLightGreen);

			// * Pink Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 6),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyePink);

			// * Dark Grey Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 7),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeDarkGrey);

			// * Light Grey Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 8),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeLightGrey);

			// * Cyan Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 9),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeCyan);

			// * Purple Stone
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 10),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyePurple);

			// * Blue Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 11),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					
					Block.stone,Block.stone, DyeBlue);

			// * Brown Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 12),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeBrown);

			// * Green (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 13),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeGreen);

			// * Red Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 14),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeRed);

			// * Black Stone (Shapeless)
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 1, 15),
					Block.stone,Block.stone,Block.stone,
					Block.stone, Block.stone,Block.stone,
					Block.stone,Block.stone, DyeDarkGrey);
		}

		// Colored Cobblestone
		GameRegistry.registerBlock(DGCobbleBlock, DGCobbleBlock_Item.class,
				"DG_Cobble");

		for (int ix = 0; ix < 16; ix++) {
			// Dyes (Change Ids)
			ItemStack DyeWhite = new ItemStack(Item.dyePowder, 1, 15);
			ItemStack DyeOrange = new ItemStack(Item.dyePowder, 1, 14);
			ItemStack DyeMagenta = new ItemStack(Item.dyePowder, 1, 13);
			ItemStack DyeLightBlue = new ItemStack(Item.dyePowder, 1, 12);
			ItemStack DyeYellow = new ItemStack(Item.dyePowder, 1, 11);
			ItemStack DyeLightGreen = new ItemStack(Item.dyePowder, 1, 2);
			ItemStack DyePink = new ItemStack(Item.dyePowder, 1, 9);
			ItemStack DyeDarkGrey = new ItemStack(Item.dyePowder, 1, 8);
			ItemStack DyeLightGrey = new ItemStack(Item.dyePowder, 1, 7);
			ItemStack DyeCyan = new ItemStack(Item.dyePowder, 1, 6);
			ItemStack DyePurple = new ItemStack(Item.dyePowder, 1, 5);
			ItemStack DyeBlue = new ItemStack(Item.dyePowder, 1, 11);
			ItemStack DyeBrown = new ItemStack(Item.dyePowder, 1, 3);
			ItemStack DyeGreen = new ItemStack(Item.dyePowder, 1, 4);
			ItemStack DyeRed = new ItemStack(Item.dyePowder, 1, 1);
			ItemStack DyeBlack = new ItemStack(Item.dyePowder, 1, ix);
			// Colored Cobble
			ItemStack DGCobbleStack = new ItemStack(DGCobbleBlock, 1, ix);
			// * White
			LanguageRegistry.addName(DGCobbleStack,
					DGCobbleBlockNames[DGCobbleStack.getItemDamage()]);
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 0),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,DyeWhite);
			// * Orange
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 1),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeOrange);
			// * Magenta
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 2),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeMagenta);
			// * LightBlue
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 3),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeLightBlue);
			// * Yellow
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 4),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeYellow);
			// * LightGrey
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 5),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeLightGreen);
			// * Pink
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 6),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyePink);
			// * Dark
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 7),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeDarkGrey);
			// * Light
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 8),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeLightGrey);
			// * Cyan
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 9),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeCyan);
			// * Purple
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 10),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyePurple);
			// * Blue
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 11),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeBlue);
			// * Brown
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 12),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeBrown);
			// * Green
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 13),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeGreen);
			// * Red 
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 14),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeRed);
			// * Black 
			GameRegistry.addShapelessRecipe(new ItemStack(DGCobbleBlock, 1, 15),
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone,Block.cobblestone,
					Block.cobblestone,Block.cobblestone, DyeDarkGrey);
		}
		// * Language Registry (Registering Names, tooltips, etc.
		LanguageRegistry.instance().addStringLocalization("itemGroup.BloxTab",
				"en_US", "DG Colored Blox");
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
		System.out.println("DylanGore's Blox Mod has been identified and will be loaded");
	}
}