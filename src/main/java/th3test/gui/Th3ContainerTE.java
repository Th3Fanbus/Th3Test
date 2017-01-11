package th3test.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import th3test.tileentity.Th3TE;

public class Th3ContainerTE extends Container {
	
    private Th3TE te;
    private IInventory playerInv;

    public Th3ContainerTE(IInventory playerInv, Th3TE te) {
        this.te = te;

        // Tile Entity, Slot 0-26, Slot IDs 36-71
        for (int y = 0; y < 4; ++y) {
            for (int x = 0; x < 9; ++x) {
                this.addSlotToContainer(new Slot(te, x + y * 9, 8 + x * 18, 8 + y * 18));
            }
        }
        // Player Inventory, Slot 0-8, Slot IDs 0-8
        for (int x = 0; x < 9; ++x) {
            this.addSlotToContainer(new Slot(playerInv, x, 8 + x * 18, 142));
        }
        // Player Inventory, Slot 9-35, Slot IDs 9-35
        for (int y = 0; y < 3; ++y) {
            for (int x = 0; x < 9; ++x) {
                this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
            }
        }
    }
    
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
        ItemStack previous = null;
        Slot slot = (Slot) this.inventorySlots.get(fromSlot);

        if (slot != null && slot.getHasStack()) {
            ItemStack current = slot.getStack();
            previous = current.copy();
            //System.out.println(current);
            //System.out.println(slot.isSlotInInventory(te, fromSlot));
            //System.out.println(slot.inventory == te);
            //System.out.println(slot.getSlotIndex());
            if (fromSlot < 36) {
                // From TE Inventory to Player Inventory
                if (!this.mergeItemStack(current, 36, 72, false)) {
                    //System.out.println("Failed 1st attempt");
                    return null;
                }
                //System.out.println("Succeeded 1st attempt");
            } else {
                // From Player Inventory to TE Inventory
                if (!this.mergeItemStack(current, 0, 36, false)) {
                    //System.out.println("Failed 2nd attempt");
                    return null;
                }
                //System.out.println("Succeeded 2nd attempt");
            }

            if (current.stackSize == 0)
                slot.putStack((ItemStack) null);
            else
                slot.onSlotChanged();

            if (current.stackSize == previous.stackSize)
                return null;
            slot.onPickupFromSlot(playerIn, current);
        }
        return previous;
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return this.te.isUseableByPlayer(playerIn);
    }
}
