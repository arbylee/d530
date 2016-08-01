final class SceneShadowMap {

  private static GameString aClass94_1775 = SpawnedGameObject.createString("Connection lost)3");
  static int anInt1771;
  static ObjectCache aClass93_1772 = new ObjectCache(64);
  static byte[][][] aByteArrayArrayArray1774;
  static int anInt1776;
  static SignLinkRequest aClass64_1778;
  static short[] aShortArray1779 = new short[256];
  static int anInt1780;
  static GameString CONNECTION_LOST = aClass94_1775;
  SoftwareIndexedColorSprite shadow;
  SceneNode node;

  static final void method1814(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               int var7, int var8, int var9, int var10) {
    try {
      int var11 = var2 - var4;
      int var13 = -1;
      if (~AbstractDirectColorSprite.anInt3704 < -1) {
        if (ByteArrayNode.anInt3611 <= 10) {
          var13 = 5 * ByteArrayNode.anInt3611;
        } else {
          var13 = -((-10 + ByteArrayNode.anInt3611) * 5) + 50;
        }
      }

      int var12 = -var9 + var1;
      int var15 = 983040 / var8;
      int var16 = 983040 / var3;

      for (int var17 = -var15; var17 < var11 - -var15; ++var17) {
        int var18 = var5 - -(var17 * var8) >> 16;
        int var19 = var8 * (var17 + 1) + var5 >> 16;
        int var20 = -var18 + var19;
        if (-1 > ~var20) {
          int var21 = var4 + var17 >> 6;
          var18 += var0;
          int var10000 = var19 + var0;
          if (~var21 <= -1 && var21 <= -1 + AbstractGameWorld.anIntArrayArrayArray720.length) {
            int[][] var22 = AbstractGameWorld.anIntArrayArrayArray720[var21];

            for (int var23 = -var16; var23 < var12 - -var16; ++var23) {
              int var25 = var6 - -(var3 * (var23 - -1)) >> 16;
              int var24 = var23 * var3 + var6 >> 16;
              int var26 = var25 + -var24;
              if (0 < var26) {
                var24 += var10;
                int var27 = var9 + var23 >> 6;
                var10000 = var25 + var10;
                if (~var27 <= -1 && ~var27 >= ~(-1 + var22.length) && null != var22[var27]) {
                  int var28 = (63 & var17 + var4) + (4032 & var9 + var23 << 6);
                  int var29 = var22[var27][var28];
                  if (-1 != ~var29) {
                    GameObjectConfig var14 = DummyClass11.method2207(4, -1 + var29);
                    if (!AudioStreamEncoder4.aBooleanArray3503[var14.anInt1482]) {
                      if (~var13 != 0 && ~var14.anInt1482 == ~FileSystem.anInt101) {
                        SomethingOtherWorldMap var30 = new SomethingOtherWorldMap();
                        var30.anInt2531 = var18;
                        var30.anInt2539 = var24;
                        var30.anInt2532 = var14.anInt1482;
                        DummyClass55.aClass61_1424.addLast(var30);
                      } else {
                        SceneNode.aClass3_Sub28_Sub16_Sub2Array1839[var14.anInt1482].method643(
                          var18 + -7, -7 + var24);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }

      if (var7 >= 124) {
        for (SomethingOtherWorldMap var32 =
             (SomethingOtherWorldMap) DummyClass55.aClass61_1424.getFirst();
             null != var32; var32 = (SomethingOtherWorldMap) DummyClass55.aClass61_1424.getNext()) {
          DummyClass47.method1330(var32.anInt2531, var32.anInt2539, 15, 16776960, var13);
          DummyClass47.method1330(var32.anInt2531, var32.anInt2539, 13, 16776960, var13);
          DummyClass47.method1330(var32.anInt2531, var32.anInt2539, 11, 16776960, var13);
          DummyClass47.method1330(var32.anInt2531, var32.anInt2539, 9, 16776960, var13);
          SceneNode.aClass3_Sub28_Sub16_Sub2Array1839[var32.anInt2532].method643(
            -7 + var32.anInt2531, -7 + var32.anInt2539);
        }

        DummyClass55.aClass61_1424.clear(-76);
      }
    } catch (RuntimeException var31) {
      throw AbstractGameWorld.cascadeException(var31,
        "sm.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ')');
    }
  }

  public static void method1815(byte var0) {
    try {
      aShortArray1779 = null;
      aClass93_1772 = null;
      aClass64_1778 = null;
      if (var0 > -33) {
        method1816(-10, 68);
      }

      CONNECTION_LOST = null;
      aByteArrayArrayArray1774 = null;
      aClass94_1775 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sm.A(" + var0 + ')');
    }
  }

  static final void method1816(int var0, int var1) {
    try {
      if (var1 == -7) {
        MilliFrameRegulator.anIntArray2696 = new int[var0];
        DummyClass13.anIntArray2021 = new int[var0];
        AnimationSequence.anIntArray1871 = new int[var0];
        Player.anIntArray3959 = new int[var0];
        FileCache.anIntArray686 = new int[var0];
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sm.C(" + var0 + ',' + var1 + ')');
    }
  }

}
