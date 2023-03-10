package net.minecraft.util;

public enum ActionResultType {
   SUCCESS,
   CONSUME,
   PASS,
   FAIL;

   public boolean isSuccessOrConsume() {
      return this == SUCCESS || this == CONSUME;
   }

   public boolean isSuccess() {
      return this == SUCCESS;
   }

   public static ActionResultType func_233537_a_(boolean isRemote) {
      return isRemote ? SUCCESS : CONSUME;
   }
}