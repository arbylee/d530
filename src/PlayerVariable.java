final class PlayerVariable {

  static boolean aBoolean554 = false;
  static int anInt555;
  static FileUnpacker aClass153_557;
  static int[][][] anIntArrayArrayArray558;
  static GameString aClass94_559 = SpawnedGameObject.createString("m-Ochte mit Ihnen handeln)3");
  static GameString aClass94_560 = SpawnedGameObject.createString(" zuerst von Ihrer Freunde)2Liste(Q");
  static int mouseWheelOffset = 0;
  static int anInt562;
  int anInt556 = 0;

  static final void method968(int var0) {
    try {
      int[] var1 = new int[TextureSampler39.anInt3287];
      int var2 = 0;

      int var3;
      for (var3 = 0; TextureSampler39.anInt3287 > var3; ++var3) {
        ItemConfig var4 = DummyClass35.getItemConfig(var3, (byte) 119);
        if (-1 >= ~var4.anInt793 || ~var4.anInt761 <= -1) {
          var1[var2++] = var3;
        }
      }

      SomethingTexture4.anIntArray2664 = new int[var2];

      for (var3 = 0; var3 < var2; ++var3) {
        SomethingTexture4.anIntArray2664[var3] = var1[var3];
      }

      if (var0 != 128) {
        method968(19);
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "eh.A(" + var0 + ')');
    }
  }

  static final void method969(FileUnpacker var0, int var1) {
    try {
      SomethingSceneJ.aClass153_322 = var0;
      if (var1 < 39) {
        mouseWheelOffset = -82;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "eh.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method971(int var0, int[][] var1, float[][] var2, int var3, float[][] var4,
                              int var5, byte var6, int var7, int var8, byte var9, boolean var10,
                              byte var11, int var12, float[][] var13, int var14,
                              SomethingGl0 var15) {
    try {
      int var16 = 255 + (var0 << 8);
      int var17 = (var5 << 8) - -255;
      int var18 = (var8 << 8) - -255;
      int var19 = (var14 << 8) - -255;
      int[] var20 = DummyClass21.anIntArrayArray1763[var11];
      int[] var22 = new int[var20.length >> 1];

      int var23;
      for (var23 = 0; var23 < var22.length; ++var23) {
        var22[var23] = BufferData
          .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18, (byte) -125, var6,
            false, var15, var2, var12, var20[var23 + var23], var4, var20[var23 + var23 + 1]);
      }

      if (var9 == 88) {
        int[] var21 = null;
        if (var10) {
          int var24;
          if (1 == var11) {
            var23 = BufferData
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18, (byte) -122,
                var6, true, var15, var2, var12, 64, var4, 128);
            var24 = BufferData
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18, (byte) -114,
                var6, true, var15, var2, var12, 128, var4, 64);
            var21 = new int[] {var24, var23, var22[2], var23, var22[0], var22[2]};
          } else if (2 == var11) {
            var21 = new int[6];
            var23 = BufferData
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18, (byte) -121,
                var6, true, var15, var2, var12, 128, var4, 128);
            var24 = BufferData
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18, (byte) -128,
                var6, true, var15, var2, var12, 64, var4, 0);
            var21[2] = var23;
            var21[0] = var22[0];
            var21[5] = var22[0];
            var21[3] = var23;
            var21[1] = var24;
            var21[4] = var22[1];
          } else if (~var11 != -4) {
            if (~var11 == -5) {
              var21 = new int[3];
              var23 = BufferData
                .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18, (byte) -115,
                  var6, true, var15, var2, var12, 0, var4, 128);
              var21[0] = var22[3];
              var21[2] = var22[0];
              var21[1] = var23;
            } else if (~var11 != -6) {
              if (~var11 != -7) {
                if (~var11 == -8) {
                  var21 = new int[6];
                  var23 = BufferData
                    .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                      (byte) -126, var6, true, var15, var2, var12, 0, var4, 128);
                  var24 = BufferData
                    .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                      (byte) -117, var6, true, var15, var2, var12, 128, var4, 0);
                  var21[3] = var23;
                  var21[2] = var23;
                  var21[0] = var22[1];
                  var21[4] = var22[2];
                  var21[1] = var24;
                  var21[5] = var22[1];
                } else if (var11 == 8) {
                  var21 = new int[3];
                  var23 = BufferData
                    .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                      (byte) -117, var6, true, var15, var2, var12, 0, var4, 0);
                  var21[2] = var22[4];
                  var21[0] = var22[3];
                  var21[1] = var23;
                } else if (var11 == 9) {
                  var23 = BufferData
                    .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                      (byte) -118, var6, true, var15, var2, var12, 128, var4, 64);
                  var24 = BufferData
                    .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                      (byte) -121, var6, true, var15, var2, var12, 96, var4, 32);
                  int var25 = BufferData
                    .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                      (byte) -120, var6, true, var15, var2, var12, 64, var4, 0);
                  var21 = new int[] {
                    var24, var23, var22[4], var24, var22[4], var22[3], var24, var22[3], var22[2],
                    var24, var22[2], var22[1], var24, var22[1], var25
                  };
                } else if (10 != var11) {
                  if (-12 == ~var11) {
                    var21 = new int[12];
                    var23 = BufferData
                      .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                        (byte) -119, var6, true, var15, var2, var12, 0, var4, 64);
                    var24 = BufferData
                      .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                        (byte) -121, var6, true, var15, var2, var12, 128, var4, 64);
                    var21[5] = var23;
                    var21[1] = var23;
                    var21[8] = var23;
                    var21[0] = var22[3];
                    var21[2] = var22[0];
                    var21[11] = var24;
                    var21[6] = var22[2];
                    var21[7] = var24;
                    var21[10] = var22[1];
                    var21[3] = var22[3];
                    var21[4] = var22[2];
                    var21[9] = var22[2];
                  }
                } else {
                  var21 = new int[9];
                  var23 = BufferData
                    .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                      (byte) -120, var6, true, var15, var2, var12, 0, var4, 128);
                  var21[0] = var22[2];
                  var21[8] = var22[0];
                  var21[1] = var23;
                  var21[4] = var23;
                  var21[2] = var22[3];
                  var21[7] = var23;
                  var21[3] = var22[3];
                  var21[5] = var22[4];
                  var21[6] = var22[4];
                }
              } else {
                var21 = new int[6];
                var23 = BufferData
                  .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                    (byte) -123, var6, true, var15, var2, var12, 128, var4, 0);
                var24 = BufferData
                  .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18,
                    (byte) -115, var6, true, var15, var2, var12, 128, var4, 128);
                var21[1] = var23;
                var21[0] = var22[3];
                var21[2] = var24;
                var21[4] = var22[0];
                var21[3] = var24;
                var21[5] = var22[3];
              }
            } else {
              var21 = new int[3];
              var23 = BufferData
                .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18, (byte) -112,
                  var6, true, var15, var2, var12, 128, var4, 128);
              var21[1] = var23;
              var21[0] = var22[2];
              var21[2] = var22[3];
            }
          } else {
            var21 = new int[6];
            var23 = BufferData
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18, (byte) -114,
                var6, true, var15, var2, var12, 0, var4, 128);
            var24 = BufferData
              .method1734(var19, 0.0F, var16, var17, null, var1, var3, var13, var18, (byte) -115,
                var6, true, var15, var2, var12, 64, var4, 0);
            var21[4] = var24;
            var21[1] = var22[1];
            var21[0] = var22[2];
            var21[3] = var23;
            var21[2] = var23;
            var21[5] = var22[2];
          }
        }

        var15.method150(var7, var3, var12, var22, var21, false);
      }
    } catch (RuntimeException var26) {
      throw AbstractGameWorld.cascadeException(var26,
        "eh.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ?
          "{...}" :
          "null") + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6
          + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ',' + var12 + ',' + (
          var13 != null ?
            "{...}" :
            "null") + ',' + var14 + ',' + (var15 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method973(byte var0) {
    try {
      aClass94_559 = null;
      aClass94_560 = null;
      aClass153_557 = null;
      anIntArrayArrayArray558 = null;
      if (var0 != 62) {
        aClass153_557 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "eh.E(" + var0 + ')');
    }
  }

  final void method970(int var1, Buffer var2) {
    try {
      while (true) {
        int var3 = var2.readUnsignedByte();
        if (0 == var3) {
          if (var1 != -20638) {
            method969(null, 55);
          }

          return;
        }

        this.method972(var2, (byte) -117, var3);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "eh.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  private final void method972(Buffer var1, byte var2, int var3) {
    try {
      if (var2 > -86) {
        this.method970(-83, null);
      }

      if (~var3 == -6) {
        this.anInt556 = var1.readUnsignedShort();
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "eh.F(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

}
