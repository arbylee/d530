final class TextureSampler11 extends AbstractTextureSampler {

  private static GameString aClass94_3247 = SpawnedGameObject.createString("flash1:");
  static int anInt3244 = 0;
  static int anInt3248;
  static GameString aClass94_3251 = SpawnedGameObject.createString("M-Bmoire attribu-Be");
  static GameString aClass94_3249 = aClass94_3247;
  static GameString aClass94_3246 = aClass94_3247;
  private int anInt3245 = 4096;
  private int anInt3250 = 4096;
  private int anInt3252 = 4096;

  public TextureSampler11() {
    super(1, false);
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (-1 != ~var1) {
        if (var1 != 1) {
          if (2 == var1) {
            this.anInt3250 = var2.readUnsignedShort();
          }
        } else {
          this.anInt3245 = var2.readUnsignedShort();
        }
      } else {
        this.anInt3252 = var2.readUnsignedShort();
      }

      if (!var3) {
        method266(12);
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "mg.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final int[][] method166(int var1, int var2) {
    try {
      if (var1 != -1) {
        anInt3244 = -40;
      }

      int[][] var3 = this.triChromaticImageCache.method1594((byte) -115, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 = this.method162(var2, 0, (byte) -74);
        int[] var5 = var4[0];
        int[] var6 = var4[1];
        int[] var7 = var4[2];
        int[] var9 = var3[1];
        int[] var8 = var3[0];
        int[] var10 = var3[2];

        for (int var11 = 0; ~var11 > ~SomethingLight0.anInt1559; ++var11) {
          int var12 = var5[var11];
          int var14 = var6[var11];
          int var13 = var7[var11];
          if (~var12 == ~var13 && ~var14 == ~var13) {
            var8[var11] = this.anInt3252 * var12 >> 12;
            var9[var11] = var13 * this.anInt3245 >> 12;
            var10[var11] = var14 * this.anInt3250 >> 12;
          } else {
            var8[var11] = this.anInt3252;
            var9[var11] = this.anInt3245;
            var10[var11] = this.anInt3250;
          }
        }
      }

      return var3;
    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15, "mg.T(" + var1 + ',' + var2 + ')');
    }
  }

  public static void method266(int var0) {
    try {
      aClass94_3249 = null;
      aClass94_3247 = null;
      if (var0 == -1443422260) {
        aClass94_3246 = null;
        aClass94_3251 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "mg.U(" + var0 + ')');
    }
  }

}
