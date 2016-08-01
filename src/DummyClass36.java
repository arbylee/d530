final class DummyClass36 extends DummyClass35 {

  static int[][][] anIntArrayArrayArray2609;
  static GameString aClass94_2610 = SpawnedGameObject.createString(")1o");
  static String aString2611;
  static int anInt2612;
  static AudioWorker aClass15_2613;
  static int anInt2614 = 0;
  static boolean aBoolean2615 = false;
  static GameString aClass94_2616 = SpawnedGameObject.createString("blinken3:");
  static int updateTime = 0;
  static int anInt2618;


  static final void method1030(Widget var0, AbstractDirectColorSprite var1, int var2, int var3,
                               int var4, byte var5, int var6) {
    try {
      if (null != var1) {
        if (var5 != 11) {
          method1032(true);
        }

        int var9 = var3 * var3 - -(var2 * var2);
        int var7 = 2047 & TextureSampler9.anInt3102 + SpotAnimationConfig.anInt531;
        int var8 = Math.max(var0.anInt168 / 2, var0.anInt193 / 2) - -10;
        if (var8 * var8 >= var9) {
          int var10 = DummyClass40.SINE_TABLE[var7];
          var10 = var10 * 256 / (Something3d2.anInt3020 - -256);
          int var11 = DummyClass40.COSINE_TABLE[var7];
          var11 = 256 * var11 / (256 + Something3d2.anInt3020);
          int var12 = var10 * var2 - -(var3 * var11) >> 16;
          int var13 = var11 * var2 + -(var3 * var10) >> 16;
          if (!GlRenderer.useOpenGlRenderer) {
            ((SoftwareDirectColorSprite) var1).method666(
              var0.anInt168 / 2 + var6 - -var12 + -(var1.anInt3697 / 2),
              -(var1.anInt3706 / 2) + var0.anInt193 / 2 + var4 + -var13, var0.anIntArray207,
              var0.anIntArray291);
          } else {
            ((GlDirectColorSprite) var1).method645(
              var0.anInt168 / 2 + var6 + var12 - var1.anInt3697 / 2,
              var0.anInt193 / 2 + var4 - (var13 + var1.anInt3706 / 2),
              (GlDirectColorSprite) var0.method866((byte) -113, false));
          }

        }
      }
    } catch (RuntimeException var14) {
      throw AbstractGameWorld.cascadeException(var14,
        "em.B(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ','
          + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
    }
  }

  static final int method1031(int var0, int var1) {
    try {
      if (var1 != 2) {
        aClass94_2610 = null;
      }

      return var0 >>> 7;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "em.C(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1032(boolean var0) {
    try {
      anIntArrayArrayArray2609 = null;
      aString2611 = null;
      aClass94_2616 = null;
      aClass94_2610 = null;
      aClass15_2613 = null;
      if (var0) {
        method1032(true);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "em.A(" + var0 + ')');
    }
  }

}
