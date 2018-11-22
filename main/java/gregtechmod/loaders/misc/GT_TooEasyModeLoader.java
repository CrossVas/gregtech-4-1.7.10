package gregtechmod.loaders.misc;

import gregtechmod.api.enums.Materials;
import gregtechmod.api.enums.OrePrefixes;
import gregtechmod.api.util.GT_ModHandler;
import gregtechmod.api.util.GT_OreDictUnificator;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GT_TooEasyModeLoader implements Runnable {
	@Override
	public void run() {
		GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getIC2Item("matter", 1), new Object[] {new ItemStack(Blocks.dirt)});
		GT_ModHandler.addCraftingRecipe(new ItemStack(Items.bucket, 111), new Object[] {"T T", " T ", 'T', "ingotTin"});
		GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Bronze, 111), new Object[] {"ingotCopper", "ingotCopper", "ingotCopper", "ingotTin"});
	}
}