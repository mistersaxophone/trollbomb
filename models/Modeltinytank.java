// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeltinytank extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer body;
	private final ModelRenderer tread1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer mainwheel;
	private final ModelRenderer tinywheel2;
	private final ModelRenderer tinywheel3;
	private final ModelRenderer bigwheel;
	private final ModelRenderer bigwheel2;
	private final ModelRenderer tread2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer mainwheel2;
	private final ModelRenderer tinywheel4;
	private final ModelRenderer tinywheel5;
	private final ModelRenderer bigwheel3;
	private final ModelRenderer bigwheel4;

	public Modeltinytank() {
		textureWidth = 128;
		textureHeight = 128;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 25.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(body);
		body.setTextureOffset(0, 0).addBox(-8.0F, -5.0F, -12.0F, 16.0F, 4.0F, 24.0F, 0.0F, false);
		body.setTextureOffset(0, 28).addBox(-8.0F, -9.0F, -10.0F, 16.0F, 4.0F, 20.0F, 0.0F, false);
		body.setTextureOffset(60, 55).addBox(-7.0F, -21.0F, -7.0F, 14.0F, 12.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(34, 55).addBox(-6.0F, -15.0F, 7.0F, 12.0F, 6.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 63).addBox(-4.0F, -17.0F, -16.0F, 2.0F, 2.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(0, 52).addBox(2.0F, -17.0F, -16.0F, 2.0F, 2.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(56, 0).addBox(-6.0F, -22.0F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);

		tread1 = new ModelRenderer(this);
		tread1.setRotationPoint(1.0F, 0.0F, 0.0F);
		main.addChild(tread1);
		tread1.setTextureOffset(0, 52).addBox(6.0F, -1.0F, -13.0F, 4.0F, 1.0F, 26.0F, 0.0F, false);
		tread1.setTextureOffset(13, 52).addBox(6.0F, -6.0F, -14.0F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		tread1.setTextureOffset(10, 16).addBox(6.0F, -6.0F, 13.0F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		tread1.setTextureOffset(80, 36).addBox(6.0F, -10.0F, -5.0F, 4.0F, 1.0F, 10.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(8.0F, -9.5F, -4.5F);
		tread1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(80, 14).addBox(-2.0F, -0.5F, -9.5F, 4.0F, 1.0F, 10.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(8.0F, -9.5F, 4.5F);
		tread1.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(80, 25).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 10.0F, 0.0F, false);

		mainwheel = new ModelRenderer(this);
		mainwheel.setRotationPoint(8.0F, -5.0F, 0.0F);
		tread1.addChild(mainwheel);
		mainwheel.setTextureOffset(0, 28).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F, 0.0F, false);

		tinywheel2 = new ModelRenderer(this);
		tinywheel2.setRotationPoint(8.0F, -2.0F, 6.0F);
		tread1.addChild(tinywheel2);
		tinywheel2.setTextureOffset(12, 28).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		tinywheel3 = new ModelRenderer(this);
		tinywheel3.setRotationPoint(8.0F, -2.0F, -6.0F);
		tread1.addChild(tinywheel3);
		tinywheel3.setTextureOffset(0, 28).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bigwheel = new ModelRenderer(this);
		bigwheel.setRotationPoint(8.0F, -3.5F, 10.5F);
		tread1.addChild(bigwheel);
		bigwheel.setTextureOffset(34, 64).addBox(-1.0F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		bigwheel2 = new ModelRenderer(this);
		bigwheel2.setRotationPoint(8.0F, -3.5F, -10.5F);
		tread1.addChild(bigwheel2);
		bigwheel2.setTextureOffset(59, 59).addBox(-1.0F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		tread2 = new ModelRenderer(this);
		tread2.setRotationPoint(-17.0F, 0.0F, 0.0F);
		main.addChild(tread2);
		tread2.setTextureOffset(46, 28).addBox(6.0F, -1.0F, -13.0F, 4.0F, 1.0F, 26.0F, 0.0F, false);
		tread2.setTextureOffset(0, 16).addBox(6.0F, -6.0F, -14.0F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		tread2.setTextureOffset(12, 0).addBox(6.0F, -6.0F, 13.0F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		tread2.setTextureOffset(28, 79).addBox(6.0F, -10.0F, -5.0F, 4.0F, 1.0F, 10.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(8.0F, -9.5F, -4.5F);
		tread2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(56, 13).addBox(-2.0F, -0.5F, -9.5F, 4.0F, 1.0F, 10.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(8.0F, -9.5F, 4.5F);
		tread2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3491F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 79).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 10.0F, 0.0F, false);

		mainwheel2 = new ModelRenderer(this);
		mainwheel2.setRotationPoint(8.0F, -5.0F, 0.0F);
		tread2.addChild(mainwheel2);
		mainwheel2.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F, 0.0F, false);

		tinywheel4 = new ModelRenderer(this);
		tinywheel4.setRotationPoint(8.0F, -2.0F, 6.0F);
		tread2.addChild(tinywheel4);
		tinywheel4.setTextureOffset(0, 4).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		tinywheel5 = new ModelRenderer(this);
		tinywheel5.setRotationPoint(8.0F, -2.0F, -6.0F);
		tread2.addChild(tinywheel5);
		tinywheel5.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bigwheel3 = new ModelRenderer(this);
		bigwheel3.setRotationPoint(8.0F, -3.5F, 10.5F);
		tread2.addChild(bigwheel3);
		bigwheel3.setTextureOffset(52, 38).addBox(-1.0F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		bigwheel4 = new ModelRenderer(this);
		bigwheel4.setRotationPoint(8.0F, -3.5F, -10.5F);
		tread2.addChild(bigwheel4);
		bigwheel4.setTextureOffset(52, 28).addBox(-1.0F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);
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