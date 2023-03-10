package net.minecraft.client.renderer.model;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenCustomHashMap;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.Direction;
import net.minecraft.util.Util;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.apache.commons.lang3.tuple.Pair;

@OnlyIn(Dist.CLIENT)
public class MultipartBakedModel implements net.minecraftforge.client.model.data.IDynamicBakedModel {
   private final List<Pair<Predicate<BlockState>, IBakedModel>> selectors;
   protected final boolean ambientOcclusion;
   protected final boolean gui3D;
   protected final boolean isSideLit;
   protected final TextureAtlasSprite particleTexture;
   protected final ItemCameraTransforms cameraTransforms;
   protected final ItemOverrideList overrides;
   private final Map<BlockState, BitSet> bitSetCache = new Object2ObjectOpenCustomHashMap<>(Util.identityHashStrategy());
   private final IBakedModel defaultModel;

   public MultipartBakedModel(List<Pair<Predicate<BlockState>, IBakedModel>> selectors) {
      this.selectors = selectors;
      IBakedModel ibakedmodel = selectors.iterator().next().getRight();
      this.defaultModel = ibakedmodel;
      this.ambientOcclusion = ibakedmodel.isAmbientOcclusion();
      this.gui3D = ibakedmodel.isGui3d();
      this.isSideLit = ibakedmodel.isSideLit();
      this.particleTexture = ibakedmodel.getParticleTexture();
      this.cameraTransforms = ibakedmodel.getItemCameraTransforms();
      this.overrides = ibakedmodel.getOverrides();
   }

   // FORGE: Implement our overloads (here and below) so child models can have custom logic 
   public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, Random rand, net.minecraftforge.client.model.data.IModelData modelData) {
      if (state == null) {
         return Collections.emptyList();
      } else {
         BitSet bitset = this.bitSetCache.get(state);
         if (bitset == null) {
            bitset = new BitSet();

            for(int i = 0; i < this.selectors.size(); ++i) {
               Pair<Predicate<BlockState>, IBakedModel> pair = this.selectors.get(i);
               if (pair.getLeft().test(state)) {
                  bitset.set(i);
               }
            }

            this.bitSetCache.put(state, bitset);
         }

         List<BakedQuad> list = Lists.newArrayList();
         long k = rand.nextLong();

         for(int j = 0; j < bitset.length(); ++j) {
            if (bitset.get(j)) {
               list.addAll(this.selectors.get(j).getRight().getQuads(state, side, new Random(k), net.minecraftforge.client.model.data.MultipartModelData.resolve(this.selectors.get(j).getRight(), modelData)));
            }
         }

         return list;
      }
   }

   public boolean isAmbientOcclusion() {
      return this.ambientOcclusion;
   }

   public boolean isAmbientOcclusion(BlockState state) {
      return this.defaultModel.isAmbientOcclusion(state);
   }

   public boolean isGui3d() {
      return this.gui3D;
   }

   public boolean isSideLit() {
      return this.isSideLit;
   }

   public boolean isBuiltInRenderer() {
      return false;
   }

   @Deprecated
   public TextureAtlasSprite getParticleTexture() {
      return this.particleTexture;
   }

   public TextureAtlasSprite getParticleTexture(net.minecraftforge.client.model.data.IModelData modelData) {
      return this.defaultModel.getParticleTexture(modelData);
   }

   @Deprecated
   public ItemCameraTransforms getItemCameraTransforms() {
      return this.cameraTransforms;
   }

   public IBakedModel handlePerspective(net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType transformType, com.mojang.blaze3d.matrix.MatrixStack matrixStack) {
      return this.defaultModel.handlePerspective(transformType, matrixStack);
   }

   public ItemOverrideList getOverrides() {
      return this.overrides;
   }

   @Override
   public net.minecraftforge.client.model.data.IModelData getModelData(net.minecraft.world.IBlockDisplayReader world, net.minecraft.util.math.BlockPos pos, BlockState state, net.minecraftforge.client.model.data.IModelData tileData) {
      return net.minecraftforge.client.model.data.MultipartModelData.create(selectors, world, pos, state, tileData);
   }

   @OnlyIn(Dist.CLIENT)
   public static class Builder {
      private final List<Pair<Predicate<BlockState>, IBakedModel>> selectors = Lists.newArrayList();

      public void putModel(Predicate<BlockState> predicate, IBakedModel model) {
         this.selectors.add(Pair.of(predicate, model));
      }

      public IBakedModel build() {
         return new MultipartBakedModel(this.selectors);
      }
   }
}
