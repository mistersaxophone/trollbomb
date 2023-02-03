// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeltank extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer body;
	private final ModelRenderer tread1;
	private final ModelRenderer wheel1;
	private final ModelRenderer wheel5;
	private final ModelRenderer wheel6;
	private final ModelRenderer wheel7;
	private final ModelRenderer wheel2;
	private final ModelRenderer tread2;
	private final ModelRenderer wheel3;
	private final ModelRenderer wheel8;
	private final ModelRenderer wheel9;
	private final ModelRenderer wheel10;
	private final ModelRenderer wheel4;

	public Modeltank() {
		textureWidth = 512;
		textureHeight = 512;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(body);
		body.setTextureOffset(0, 0).addBox(-17.0F, -10.0F, -28.0F, 34.0F, 9.0F, 56.0F, 0.0F, false);
		body.setTextureOffset(0, 65).addBox(-16.0F, -20.0F, -18.0F, 32.0F, 10.0F, 42.0F, 0.0F, false);
		body.setTextureOffset(124, 0).addBox(-14.0F, -38.0F, -13.0F, 28.0F, 18.0F, 33.0F, 0.0F, false);
		body.setTextureOffset(102, 186).addBox(-14.0F, -21.0F, -21.0F, 28.0F, 11.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(53, 184).addBox(-3.0F, -34.0F, -46.0F, 6.0F, 6.0F, 37.0F, 0.0F, false);
		body.setTextureOffset(179, 86).addBox(-3.0F, -36.0F, -48.0F, 6.0F, 2.0F, 39.0F, 0.0F, false);
		body.setTextureOffset(0, 177).addBox(-3.0F, -28.0F, -48.0F, 6.0F, 2.0F, 39.0F, 0.0F, false);
		body.setTextureOffset(182, 192).addBox(-5.0F, -34.0F, -48.0F, 2.0F, 6.0F, 39.0F, 0.0F, false);
		body.setTextureOffset(139, 186).addBox(3.0F, -34.0F, -48.0F, 2.0F, 6.0F, 39.0F, 0.0F, false);
		body.setTextureOffset(160, 51).addBox(-13.0F, -40.0F, -12.0F, 26.0F, 2.0F, 31.0F, 0.0F, false);

		tread1 = new ModelRenderer(this);
		tread1.setRotationPoint(-1.0F, 0.0F, 0.0F);
		main.addChild(tread1);
		tread1.setTextureOffset(140, 127).addBox(17.0F, 0.0F, -29.0F, 6.0F, 2.0F, 57.0F, 0.0F, false);
		tread1.setTextureOffset(120, 86).addBox(17.0F, -10.0F, 28.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		tread1.setTextureOffset(120, 73).addBox(17.0F, -10.0F, -30.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		tread1.setTextureOffset(116, 117).addBox(17.0F, -2.0F, -30.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		tread1.setTextureOffset(120, 79).addBox(17.0F, -2.0F, 28.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		tread1.setTextureOffset(124, 0).addBox(17.0F, -8.0F, 29.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
		tread1.setTextureOffset(0, 124).addBox(17.0F, -8.0F, -31.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
		tread1.setTextureOffset(0, 117).addBox(17.0F, -12.0F, -29.0F, 6.0F, 2.0F, 58.0F, 0.0F, false);

		wheel1 = new ModelRenderer(this);
		wheel1.setRotationPoint(14.0F, 0.0F, -24.0F);
		tread1.addChild(wheel1);
		wheel1.setTextureOffset(0, 65).addBox(4.0F, -9.0F, -4.0F, 4.0F, 8.0F, 8.0F, 0.0F, false);
		wheel1.setTextureOffset(120, 66).addBox(4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel1.setTextureOffset(34, 118).addBox(4.0F, -10.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel1.setTextureOffset(0, 132).addBox(4.0F, -8.0F, -5.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		wheel1.setTextureOffset(80, 131).addBox(4.0F, -8.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		wheel5 = new ModelRenderer(this);
		wheel5.setRotationPoint(14.0F, 0.0F, -12.0F);
		tread1.addChild(wheel5);
		wheel5.setTextureOffset(32, 0).addBox(4.0F, -9.0F, -4.0F, 4.0F, 8.0F, 8.0F, 0.0F, false);
		wheel5.setTextureOffset(106, 79).addBox(4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel5.setTextureOffset(106, 72).addBox(4.0F, -10.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel5.setTextureOffset(90, 125).addBox(4.0F, -8.0F, -5.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		wheel5.setTextureOffset(46, 125).addBox(4.0F, -8.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		wheel6 = new ModelRenderer(this);
		wheel6.setRotationPoint(14.0F, 0.0F, 0.0F);
		tread1.addChild(wheel6);
		wheel6.setTextureOffset(0, 32).addBox(4.0F, -9.0F, -4.0F, 4.0F, 8.0F, 8.0F, 0.0F, false);
		wheel6.setTextureOffset(106, 65).addBox(4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel6.setTextureOffset(14, 96).addBox(4.0F, -10.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel6.setTextureOffset(36, 125).addBox(4.0F, -8.0F, -5.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		wheel6.setTextureOffset(26, 125).addBox(4.0F, -8.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		wheel7 = new ModelRenderer(this);
		wheel7.setRotationPoint(14.0F, 0.0F, 12.0F);
		tread1.addChild(wheel7);
		wheel7.setTextureOffset(16, 24).addBox(4.0F, -9.0F, -4.0F, 4.0F, 8.0F, 8.0F, 0.0F, false);
		wheel7.setTextureOffset(0, 95).addBox(4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel7.setTextureOffset(14, 89).addBox(4.0F, -10.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel7.setTextureOffset(80, 124).addBox(4.0F, -8.0F, -5.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		wheel7.setTextureOffset(70, 124).addBox(4.0F, -8.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		wheel2 = new ModelRenderer(this);
		wheel2.setRotationPoint(14.0F, 0.0F, 24.0F);
		tread1.addChild(wheel2);
		wheel2.setTextureOffset(16, 40).addBox(4.0F, -9.0F, -4.0F, 4.0F, 8.0F, 8.0F, 0.0F, false);
		wheel2.setTextureOffset(70, 117).addBox(4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel2.setTextureOffset(20, 117).addBox(4.0F, -10.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel2.setTextureOffset(70, 131).addBox(4.0F, -8.0F, -5.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		wheel2.setTextureOffset(15, 131).addBox(4.0F, -8.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		tread2 = new ModelRenderer(this);
		tread2.setRotationPoint(-39.0F, 0.0F, 0.0F);
		main.addChild(tread2);
		tread2.setTextureOffset(71, 125).addBox(17.0F, 0.0F, -29.0F, 6.0F, 2.0F, 57.0F, 0.0F, false);
		tread2.setTextureOffset(100, 117).addBox(17.0F, -10.0F, 28.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		tread2.setTextureOffset(84, 117).addBox(17.0F, -10.0F, -30.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		tread2.setTextureOffset(16, 103).addBox(17.0F, -2.0F, -30.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		tread2.setTextureOffset(0, 102).addBox(17.0F, -2.0F, 28.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		tread2.setTextureOffset(40, 48).addBox(17.0F, -8.0F, 29.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
		tread2.setTextureOffset(0, 48).addBox(17.0F, -8.0F, -31.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
		tread2.setTextureOffset(90, 65).addBox(17.0F, -12.0F, -29.0F, 6.0F, 2.0F, 58.0F, 0.0F, false);

		wheel3 = new ModelRenderer(this);
		wheel3.setRotationPoint(14.0F, 0.0F, -24.0F);
		tread2.addChild(wheel3);
		wheel3.setTextureOffset(32, 32).addBox(4.0F, -9.0F, -4.0F, 4.0F, 8.0F, 8.0F, 0.0F, false);
		wheel3.setTextureOffset(0, 117).addBox(4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel3.setTextureOffset(106, 100).addBox(4.0F, -10.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel3.setTextureOffset(110, 125).addBox(4.0F, -8.0F, -5.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		wheel3.setTextureOffset(100, 125).addBox(4.0F, -8.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		wheel8 = new ModelRenderer(this);
		wheel8.setRotationPoint(14.0F, 0.0F, -12.0F);
		tread2.addChild(wheel8);
		wheel8.setTextureOffset(16, 8).addBox(4.0F, -9.0F, -4.0F, 4.0F, 8.0F, 8.0F, 0.0F, false);
		wheel8.setTextureOffset(0, 88).addBox(4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel8.setTextureOffset(14, 82).addBox(4.0F, -10.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel8.setTextureOffset(124, 22).addBox(4.0F, -8.0F, -5.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		wheel8.setTextureOffset(16, 124).addBox(4.0F, -8.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		wheel9 = new ModelRenderer(this);
		wheel9.setRotationPoint(14.0F, 0.0F, 0.0F);
		tread2.addChild(wheel9);
		wheel9.setTextureOffset(0, 16).addBox(4.0F, -9.0F, -4.0F, 4.0F, 8.0F, 8.0F, 0.0F, false);
		wheel9.setTextureOffset(0, 81).addBox(4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel9.setTextureOffset(18, 75).addBox(4.0F, -10.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel9.setTextureOffset(124, 15).addBox(4.0F, -8.0F, -5.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		wheel9.setTextureOffset(124, 8).addBox(4.0F, -8.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		wheel10 = new ModelRenderer(this);
		wheel10.setRotationPoint(14.0F, 0.0F, 12.0F);
		tread2.addChild(wheel10);
		wheel10.setTextureOffset(0, 0).addBox(4.0F, -9.0F, -4.0F, 4.0F, 8.0F, 8.0F, 0.0F, false);
		wheel10.setTextureOffset(16, 65).addBox(4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel10.setTextureOffset(16, 0).addBox(4.0F, -10.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel10.setTextureOffset(48, 117).addBox(4.0F, -8.0F, -5.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		wheel10.setTextureOffset(32, 72).addBox(4.0F, -8.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		wheel4 = new ModelRenderer(this);
		wheel4.setRotationPoint(14.0F, 0.0F, 24.0F);
		tread2.addChild(wheel4);
		wheel4.setTextureOffset(32, 16).addBox(4.0F, -9.0F, -4.0F, 4.0F, 8.0F, 8.0F, 0.0F, false);
		wheel4.setTextureOffset(106, 93).addBox(4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel4.setTextureOffset(106, 86).addBox(4.0F, -10.0F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		wheel4.setTextureOffset(125, 99).addBox(4.0F, -8.0F, -5.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		wheel4.setTextureOffset(125, 92).addBox(4.0F, -8.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}