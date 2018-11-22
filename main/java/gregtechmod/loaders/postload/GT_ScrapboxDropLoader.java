package gregtechmod.loaders.postload;

import gregtechmod.api.util.GT_Log;
import gregtechmod.api.util.GT_ModHandler;
import gregtechmod.api.util.GT_OreDictUnificator;
import gregtechmod.common.items.GT_MetaItem_Cell;
import gregtechmod.common.items.GT_MetaItem_Component;
import gregtechmod.common.items.GT_MetaItem_Dust;
import gregtechmod.common.items.GT_MetaItem_Material;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GT_ScrapboxDropLoader implements Runnable {
	@Override
	public void run() {
        GT_Log.out.println("GT_Mod: (re-)adding Scrapbox Drops.");
        
        GT_ModHandler.addScrapboxDrop(9.50F, new ItemStack(Items.hoeWood));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Items.axeWood));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Items.swordWood));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Items.shovelWood));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Items.pickaxeWood));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Items.sign));
        GT_ModHandler.addScrapboxDrop(9.50F, new ItemStack(Items.stick));
        GT_ModHandler.addScrapboxDrop(5.00F, new ItemStack(Block.dirt));
        GT_ModHandler.addScrapboxDrop(3.00F, new ItemStack(Block.grass));
        GT_ModHandler.addScrapboxDrop(3.00F, new ItemStack(Block.gravel));
        GT_ModHandler.addScrapboxDrop(0.50F, new ItemStack(Block.pumpkin));
        GT_ModHandler.addScrapboxDrop(1.00F, new ItemStack(Block.slowSand));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Block.netherrack));
        GT_ModHandler.addScrapboxDrop(1.00F, new ItemStack(Items.bone));
        GT_ModHandler.addScrapboxDrop(9.00F, new ItemStack(Items.rottenFlesh));
        GT_ModHandler.addScrapboxDrop(0.40F, new ItemStack(Items.porkCooked));
        GT_ModHandler.addScrapboxDrop(0.40F, new ItemStack(Items.beefCooked));
        GT_ModHandler.addScrapboxDrop(0.40F, new ItemStack(Items.chickenCooked));
        GT_ModHandler.addScrapboxDrop(0.50F, new ItemStack(Items.appleRed));
        GT_ModHandler.addScrapboxDrop(0.50F, new ItemStack(Items.bread));
        GT_ModHandler.addScrapboxDrop(0.10F, new ItemStack(Items.cake));
        GT_ModHandler.addScrapboxDrop(1.00F, GT_ModHandler.getIC2Item("filledTinCan", 1, 0));
        GT_ModHandler.addScrapboxDrop(2.00F, GT_ModHandler.getIC2Item("filledTinCan", 1, 1));
		GT_ModHandler.addScrapboxDrop(0.20F, GT_MetaItem_Cell.instance.getStack(7, 1));
		GT_ModHandler.addScrapboxDrop(1.00F, GT_ModHandler.getWaterCell(1));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_ModHandler.getEmptyCell(1));
        GT_ModHandler.addScrapboxDrop(5.00F, new ItemStack(Items.paper));
        GT_ModHandler.addScrapboxDrop(1.00F, new ItemStack(Items.leather));
        GT_ModHandler.addScrapboxDrop(1.00F, new ItemStack(Items.feather));
        GT_ModHandler.addScrapboxDrop(0.70F, GT_ModHandler.getIC2Item("plantBall", 1));
        GT_ModHandler.addScrapboxDrop(3.80F, GT_OreDictUnificator.get("dustWood", 1));
        GT_ModHandler.addScrapboxDrop(0.60F, new ItemStack(Items.slimeBall));
        GT_ModHandler.addScrapboxDrop(0.80F, GT_OreDictUnificator.get("itemRubber", 1));
        GT_ModHandler.addScrapboxDrop(2.70F, GT_ModHandler.getIC2Item("suBattery", 1));
		GT_ModHandler.addScrapboxDrop(0.80F, GT_MetaItem_Component.instance.getStack(22,1));
		GT_ModHandler.addScrapboxDrop(1.20F, GT_MetaItem_Component.instance.getStack(24,1));
		GT_ModHandler.addScrapboxDrop(1.80F, GT_MetaItem_Component.instance.getStack(48,1));
		GT_ModHandler.addScrapboxDrop(0.40F, GT_MetaItem_Component.instance.getStack(49,1));
		GT_ModHandler.addScrapboxDrop(0.20F, GT_MetaItem_Component.instance.getStack(50,1));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_ModHandler.getIC2Item("insulatedCopperCableItem", 1));
		GT_ModHandler.addScrapboxDrop(0.40F, GT_ModHandler.getIC2Item("doubleInsulatedGoldCableItem", 1));
        GT_ModHandler.addScrapboxDrop(0.90F, new ItemStack(Items.redstone));
        GT_ModHandler.addScrapboxDrop(0.80F, new ItemStack(Items.glowstone));
        GT_ModHandler.addScrapboxDrop(0.80F, GT_OreDictUnificator.get("dustCoal"		, 1));
		GT_ModHandler.addScrapboxDrop(2.50F, GT_OreDictUnificator.get("dustCharcoal"	, 1));
        GT_ModHandler.addScrapboxDrop(1.00F, GT_OreDictUnificator.get("dustIron"		, 1));
        GT_ModHandler.addScrapboxDrop(1.00F, GT_OreDictUnificator.get("dustGold"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustSilver"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustElectrum"	, 1));
        GT_ModHandler.addScrapboxDrop(1.20F, GT_OreDictUnificator.get("dustTin"			, 1));
        GT_ModHandler.addScrapboxDrop(1.20F, GT_OreDictUnificator.get("dustCopper"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustBauxite"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustAluminium"	, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustLead"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustNickel"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustZinc"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustBrass"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustSteel"		, 1));
		GT_ModHandler.addScrapboxDrop(1.50F, GT_OreDictUnificator.get("dustObsidian"	, 1));
		GT_ModHandler.addScrapboxDrop(1.50F, GT_OreDictUnificator.get("dustSulfur"		, 1));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_OreDictUnificator.get("dustSaltpeter"	, 1));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_MetaItem_Dust.instance.getStack( 2, 1));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_MetaItem_Dust.instance.getStack( 3, 1));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_MetaItem_Dust.instance.getStack( 4, 1));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_MetaItem_Dust.instance.getStack( 5, 1));
		GT_ModHandler.addScrapboxDrop(4.00F, GT_MetaItem_Dust.instance.getStack( 6, 1));
		GT_ModHandler.addScrapboxDrop(4.00F, GT_MetaItem_Dust.instance.getStack( 7, 1));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_MetaItem_Dust.instance.getStack(27, 1));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_MetaItem_Dust.instance.getStack(22, 1));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_MetaItem_Dust.instance.getStack(20, 1));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_MetaItem_Dust.instance.getStack(19, 1));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_MetaItem_Dust.instance.getStack(13, 1));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_MetaItem_Dust.instance.getStack(10, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_MetaItem_Material.instance.getStack(54, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_MetaItem_Material.instance.getStack(55, 1));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemOlivine"		, 1));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemRuby"			, 1));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemSapphire"		, 1));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemGreenSapphire", 1));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemEmerald"		, 1));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemDiamond"		, 1));
	}
}