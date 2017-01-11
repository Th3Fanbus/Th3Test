package th3test.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import th3test.tileentity.Th3TE;

public class Th3GUITE extends GuiContainer {

    public Th3GUITE(IInventory playerInv, Th3TE te) {
        super(new Th3ContainerTE(playerInv, te));

        this.xSize = 176;
        this.ySize = 166;
    }

    
	@Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		 int GuiX = (width - xSize) / 2;
         int GuiY = (height - ySize) / 2;
		 this.mc.getTextureManager().bindTexture(new ResourceLocation("th3test:textures/gui/Th3GUI.png"));
		 this.drawTexturedModalRect(GuiX, GuiY, 0, 0, 192,192);
    }
}
