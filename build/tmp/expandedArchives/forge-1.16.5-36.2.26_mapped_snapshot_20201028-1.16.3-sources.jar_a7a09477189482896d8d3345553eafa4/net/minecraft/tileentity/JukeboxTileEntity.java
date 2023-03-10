package net.minecraft.tileentity;

import net.minecraft.block.BlockState;
import net.minecraft.inventory.IClearable;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class JukeboxTileEntity extends TileEntity implements IClearable {
   private ItemStack record = ItemStack.EMPTY;

   public JukeboxTileEntity() {
      super(TileEntityType.JUKEBOX);
   }

   public void read(BlockState state, CompoundNBT nbt) {
      super.read(state, nbt);
      if (nbt.contains("RecordItem", 10)) {
         this.setRecord(ItemStack.read(nbt.getCompound("RecordItem")));
      }

   }

   public CompoundNBT write(CompoundNBT compound) {
      super.write(compound);
      if (!this.getRecord().isEmpty()) {
         compound.put("RecordItem", this.getRecord().write(new CompoundNBT()));
      }

      return compound;
   }

   public ItemStack getRecord() {
      return this.record;
   }

   public void setRecord(ItemStack p_195535_1_) {
      this.record = p_195535_1_;
      this.markDirty();
   }

   public void clear() {
      this.setRecord(ItemStack.EMPTY);
   }
}