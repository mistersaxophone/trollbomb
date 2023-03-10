package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;

public class EndPodiumFeature extends Feature<NoFeatureConfig> {
   public static final BlockPos END_PODIUM_LOCATION = BlockPos.ZERO;
   private final boolean activePortal;

   public EndPodiumFeature(boolean activePortalIn) {
      super(NoFeatureConfig.field_236558_a_);
      this.activePortal = activePortalIn;
   }

   public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config) {
      for(BlockPos blockpos : BlockPos.getAllInBoxMutable(new BlockPos(pos.getX() - 4, pos.getY() - 1, pos.getZ() - 4), new BlockPos(pos.getX() + 4, pos.getY() + 32, pos.getZ() + 4))) {
         boolean flag = blockpos.withinDistance(pos, 2.5D);
         if (flag || blockpos.withinDistance(pos, 3.5D)) {
            if (blockpos.getY() < pos.getY()) {
               if (flag) {
                  this.setBlockState(reader, blockpos, Blocks.BEDROCK.getDefaultState());
               } else if (blockpos.getY() < pos.getY()) {
                  this.setBlockState(reader, blockpos, Blocks.END_STONE.getDefaultState());
               }
            } else if (blockpos.getY() > pos.getY()) {
               this.setBlockState(reader, blockpos, Blocks.AIR.getDefaultState());
            } else if (!flag) {
               this.setBlockState(reader, blockpos, Blocks.BEDROCK.getDefaultState());
            } else if (this.activePortal) {
               this.setBlockState(reader, new BlockPos(blockpos), Blocks.END_PORTAL.getDefaultState());
            } else {
               this.setBlockState(reader, new BlockPos(blockpos), Blocks.AIR.getDefaultState());
            }
         }
      }

      for(int i = 0; i < 4; ++i) {
         this.setBlockState(reader, pos.up(i), Blocks.BEDROCK.getDefaultState());
      }

      BlockPos blockpos1 = pos.up(2);

      for(Direction direction : Direction.Plane.HORIZONTAL) {
         this.setBlockState(reader, blockpos1.offset(direction), Blocks.WALL_TORCH.getDefaultState().with(WallTorchBlock.HORIZONTAL_FACING, direction));
      }

      return true;
   }
}