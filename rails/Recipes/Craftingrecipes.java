package rails.Recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rails.Rails;

public class Craftingrecipes {
	
	public static void registerRecipe () {
	
		GameRegistry.addRecipe(new ItemStack(Rails.railblock),
			    "FFF",
			    "FFF",
			    "FFF",
			    'F',Blocks.field_150448_aq);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.field_150448_aq,9),
				new ItemStack(Rails.railblock));
		
		GameRegistry.addRecipe(new ItemStack(Rails.railcamo,8),
			    "FFF",
			    "FXF",
			    "FFF",
			    'F',Blocks.field_150448_aq,
			    'X',Blocks.field_150341_Y);
		GameRegistry.addShapelessRecipe(new ItemStack(Rails.clearrail),
				new ItemStack(Blocks.field_150448_aq),new ItemStack(Blocks.field_150359_w));
		GameRegistry.addShapelessRecipe(new ItemStack(Rails.clearrailpowered),
				new ItemStack(Blocks.field_150448_aq),new ItemStack(Blocks.field_150410_aZ));
		GameRegistry.addRecipe(new ItemStack(Rails.railstop),
			    "FFF",
			    "FXF",
			    "FFF",
			    'F',Items.field_151055_y,
			    'X',Blocks.field_150448_aq);
		GameRegistry.addShapelessRecipe(new ItemStack(Rails.lantern),
				new ItemStack(Blocks.field_150478_aa),new ItemStack(Blocks.field_150359_w));
		GameRegistry.addRecipe(new ItemStack(Rails.onerail,6),
			    "F F",
			    "F F",
			    "F F",
			    'F',Items.field_151042_j);
	}

}
