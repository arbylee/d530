final class TextureSampler35 extends AbstractTextureSampler {

  static int anInt3332 = 50;
  static GameString[] aClass94Array3317 = new GameString[anInt3332];
  static int[] anIntArray3318 = new int[anInt3332];
  static int[] anIntArray3319 = new int[anInt3332];
  static int rights = 0;
  static int[] anIntArray3321 = new int[] {76, 8, 137, 4, 0, 1, 38, 2, 19};
  static int anInt3323 = 50;
  static GameString aClass94_3324 = SpawnedGameObject.createString(" loggt sich ein)3");
  static GameString aClass94_3326 = SpawnedGameObject.createString("leuchten1:");
  static int[] anIntArray3327 = new int[anInt3332];
  static int[] anIntArray3328 = new int[8];
  static int[] anIntArray3329 = new int[anInt3332];
  static GameString ASSIST_REQ = SpawnedGameObject.createString(":assistreq:");
  static int[] anIntArray3331 = new int[anInt3332];
  static byte[][] aByteArrayArray3335;
  static int[] anIntArray3336 = new int[anInt3332];
  static int[] anIntArray3337 = new int[anInt3332];
  private static GameString aClass94_3334 = SpawnedGameObject.createString("wave2:");
  static GameString aClass94_3325 = aClass94_3334;
  static GameString aClass94_3333 = aClass94_3334;
  private int anInt3322 = 4096;


  public TextureSampler35() {
    super(1, true);
  }

  public static void method294(byte var0) {
    try {
      anIntArray3327 = null;
      anIntArray3337 = null;
      aClass94_3326 = null;
      aClass94Array3317 = null;
      aClass94_3334 = null;
      anIntArray3328 = null;
      ASSIST_REQ = null;
      aClass94_3324 = null;
      anIntArray3319 = null;
      aByteArrayArray3335 = null;
      anIntArray3329 = null;
      aClass94_3333 = null;
      anIntArray3336 = null;
      int var1 = -62 % ((-59 - var0) / 47);
      anIntArray3321 = null;
      anIntArray3318 = null;
      anIntArray3331 = null;
      aClass94_3325 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "pg.B(" + var0 + ')');
    }
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var3 = 42 / ((30 - var2) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 = this.method152(0, var1 - 1 & TriChromaticImageBuffer.anInt2487, 32755);
        int[] var6 = this.method152(0, var1, 32755);
        int[] var7 = this.method152(0, TriChromaticImageBuffer.anInt2487 & var1 + 1, 32755);

        for (int var8 = 0; SomethingLight0.anInt1559 > var8; ++var8) {
          int var9 = (var7[var8] + -var5[var8]) * this.anInt3322;
          int var10 = this.anInt3322 * (-var6[var8 - 1 & RenderAnimation.anInt396] + var6[
            RenderAnimation.anInt396 & var8 - -1]);
          int var11 = var10 >> 12;
          int var12 = var9 >> 12;
          int var13 = var11 * var11 >> 12;
          int var14 = var12 * var12 >> 12;
          int var15 =
            (int) (Math.sqrt((double) ((float) (4096 + var14 + var13) / 4096.0F)) * 4096.0D);
          int var16 = 0 != var15 ? 16777216 / var15 : 0;
          var4[var8] = 4096 + -var16;
        }
      }

      return var4;
    } catch (RuntimeException var17) {
      throw AbstractGameWorld.cascadeException(var17, "pg.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (!var3) {
        method294((byte) -57);
      }

      if (var1 == 0) {
        this.anInt3322 = var2.readUnsignedShort();
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "pg.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

}