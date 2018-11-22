package gregtechmod.common.gui;

import gregtechmod.api.GregTech_API;
import gregtechmod.api.gui.GT_GUIContainerMetaTile_Machine;
import gregtechmod.api.interfaces.IGregTechTileEntity;
import gregtechmod.common.containers.GT_Container_Sawmill;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

public class GT_GUIContainer_Sawmill extends GT_GUIContainerMetaTile_Machine {
	
    public GT_GUIContainer_Sawmill(InventoryPlayer aInventoryPlayer, IGregTechTileEntity aTileEntity, int aID) {
        super(new GT_Container_Sawmill(aInventoryPlayer, aTileEntity, aID), aTileEntity, aID, GregTech_API.GUI_PATH + "Sawmill.png");
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2) {
        fontRendererObj.drawString("Industrial Sawmill", 8,  4, 4210752);
        if (!((GT_Container_Sawmill)mContainer).mMachine)
        	fontRendererObj.drawString("Incomplete Machine Casing!", 8, ySize - 104, 4210752);
        if (((mContainer).mDisplayErrorCode & 1) != 0)
        	fontRendererObj.drawString("Insufficient Energy Line!", 8, ySize - 94, 4210752);
        else
            fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 94, 4210752);
        	
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
    	super.drawGuiContainerBackgroundLayer(par1, par2, par3);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
        
        if (mContainer != null) {
        	int tScale = ((GT_Container_Sawmill)mContainer).mProgressScale;
        	if (mContainer.mProgressTime > 0) drawTexturedModalRect(x + 58, y + 28, 176, 0, tScale, 11);

        	tScale = ((GT_Container_Sawmill)mContainer).mWaterAmount/550;
        	if (tScale > 0)
        		drawTexturedModalRect(x + 33, y + 33 + 18 - tScale, 176, 33 + 18 - tScale, 18, tScale);
        }
    }
}
