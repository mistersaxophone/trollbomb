package net.minecraft.world.gen.feature;

import com.mojang.serialization.Codec;
import java.util.Random;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;

public class SingleRandomFeatureConfig extends Feature<SingleRandomFeature> {
   public SingleRandomFeatureConfig(Codec<SingleRandomFeature> p_i231992_1_) {
      super(p_i231992_1_);
   }

   public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos, SingleRandomFeature config) {
      int i = rand.nextInt(config.features.size());
      ConfiguredFeature<?, ?> configuredfeature = config.features.get(i).get();
      return configuredfeature.generate(reader, generator, rand, pos);
   }
}