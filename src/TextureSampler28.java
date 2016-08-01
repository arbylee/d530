import java.util.Random;

final class TextureSampler28 extends AbstractTextureSampler {

  private static GameString aClass94_3306 =
    SpawnedGameObject.createString(" is already on your ignore list)3");
  static GameString aClass94_3302 = SpawnedGameObject.createString("Connexion perdue)3");
  static FileUnpacker fileUnpacker10;
  static int loginState = 0;
  static GameString aClass94_3307 = SpawnedGameObject.createString("<col=00ff80>");
  static int anInt3313 = 500;
  static int anInt3315;
  static GameString aClass94_3311 = aClass94_3306;
  private int anInt3299 = 1024;
  private int anInt3300 = 1024;
  private int anInt3301 = 819;
  private int anInt3303 = 1024;
  private int anInt3308 = 2048;
  private int anInt3309 = 0;
  private int anInt3310 = 409;
  private int anInt3312 = 0;
  private int anInt3314;
  private int anInt3316 = 1024;


  public TextureSampler28() {
    super(0, true);
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var4 = 105 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[][] var5 = this.monoChromaticImageCache.method1710((byte) 97);
        int var9 = 0;
        int var8 = 0;
        int var6 = 0;
        int var7 = 0;
        int var10 = 0;
        boolean var11 = true;
        boolean var12 = true;
        int var13 = 0;
        int var14 = 0;
        int var15 = SomethingLight0.anInt1559 * this.anInt3300 >> 12;
        int var16 = SomethingLight0.anInt1559 * this.anInt3308 >> 12;
        int var18 = this.anInt3301 * DummyClass55.anInt1427 >> 12;
        int var17 = DummyClass55.anInt1427 * this.anInt3310 >> 12;
        if (var18 <= 1) {
          return var5[var1];
        } else {
          int var19 = SomethingLight0.anInt1559 / var15 + 1;
          this.anInt3314 = SomethingLight0.anInt1559 / 8 * this.anInt3303 >> 12;
          int[][] var21 = new int[var19][3];
          int[][] var20 = new int[var19][3];
          Random var22 = new Random((long) this.anInt3312);

          while (true) {
            while (true) {
              int var24 = var15 - -FloorUnderlay.method1603((byte) -93, var16 - var15, var22);
              int var25 = FloorUnderlay.method1603((byte) -96, -var17 + var18, var22) + var17;
              int var26 = var9 + var24;
              if (SomethingLight0.anInt1559 < var26) {
                var26 = SomethingLight0.anInt1559;
                var24 = SomethingLight0.anInt1559 - var9;
              }

              int var23;
              int var29;
              if (!var12) {
                int var27 = var10;
                int[] var28 = var21[var10];
                var23 = var28[2];
                var29 = 0;
                int var30 = var6 + var26;
                if (0 > var30) {
                  var30 += SomethingLight0.anInt1559;
                }

                if (~SomethingLight0.anInt1559 > ~var30) {
                  var30 -= SomethingLight0.anInt1559;
                }

                while (true) {
                  int[] var31 = var21[var27];
                  if (~var30 <= ~var31[0] && ~var31[1] <= ~var30) {
                    if (var10 != var27) {
                      int var42 = var6 + var9;
                      if (-1 < ~var42) {
                        var42 += SomethingLight0.anInt1559;
                      }

                      if (var42 > SomethingLight0.anInt1559) {
                        var42 -= SomethingLight0.anInt1559;
                      }

                      int var32;
                      int[] var33;
                      for (var32 = 1; ~var29 <= ~var32; ++var32) {
                        var33 = var21[(var10 + var32) % var13];
                        var23 = Math.max(var23, var33[2]);
                      }

                      for (var32 = 0; var32 <= var29; ++var32) {
                        var33 = var21[(var10 - -var32) % var13];
                        int var34 = var33[2];
                        if (~var34 != ~var23) {
                          int var37 = var33[0];
                          int var38 = var33[1];
                          int var35;
                          int var36;
                          if (~var30 < ~var42) {
                            var35 = Math.max(var42, var37);
                            var36 = Math.min(var30, var38);
                          } else if (var37 != 0) {
                            var35 = Math.max(var42, var37);
                            var36 = SomethingLight0.anInt1559;
                          } else {
                            var36 = Math.min(var30, var38);
                            var35 = 0;
                          }

                          this.method291(var34, var22, var8 + var35, -var35 + var36, (byte) -69,
                            -var34 + var23, var5);
                        }
                      }
                    }

                    var10 = var27;
                    break;
                  }

                  ++var29;
                  ++var27;
                  if (~var27 <= ~var13) {
                    var27 = 0;
                  }
                }
              } else {
                var23 = 0;
              }

              if (DummyClass55.anInt1427 >= var23 - -var25) {
                var11 = false;
              } else {
                var25 = DummyClass55.anInt1427 - var23;
              }

              int[] var40;
              if (~var26 == ~SomethingLight0.anInt1559) {
                this.method291(var23, var22, var7 + var9, var24, (byte) -69, var25, var5);
                if (var11) {
                  return var3;
                }

                var11 = true;
                var8 = var7;
                var12 = false;
                var40 = var20[var14++];
                var40[0] = var9;
                var10 = 0;
                var13 = var14;
                var14 = 0;
                var40[2] = var25 + var23;
                var40[1] = var26;
                var7 = FloorUnderlay.method1603((byte) -107, SomethingLight0.anInt1559, var22);
                var6 = var7 + -var8;
                int[][] var41 = var21;
                var9 = 0;
                var21 = var20;
                var29 = var6;
                if (var6 < 0) {
                  var29 = var6 + SomethingLight0.anInt1559;
                }

                var20 = var41;
                if (~SomethingLight0.anInt1559 > ~var29) {
                  var29 -= SomethingLight0.anInt1559;
                }

                while (true) {
                  int[] var43 = var21[var10];
                  if (var43[0] <= var29 && ~var43[1] <= ~var29) {
                    break;
                  }

                  ++var10;
                  if (var13 <= var10) {
                    var10 = 0;
                  }
                }
              } else {
                var40 = var20[var14++];
                var40[1] = var26;
                var40[2] = var25 + var23;
                var40[0] = var9;
                this.method291(var23, var22, var9 + var7, var24, (byte) -69, var25, var5);
                var9 = var26;
              }
            }
          }
        }
      } else {
        return var3;
      }
    } catch (RuntimeException var39) {
      throw AbstractGameWorld.cascadeException(var39, "ol.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (!var3) {
        this.anInt3301 = 4;
      }

      if (~var1 != -1) {
        if (var1 == 1) {
          this.anInt3300 = var2.readUnsignedShort();
        } else if (2 != var1) {
          if (var1 != 3) {
            if (-5 == ~var1) {
              this.anInt3301 = var2.readUnsignedShort();
            } else if (var1 != 5) {
              if (-7 != ~var1) {
                if (-8 != ~var1) {
                  if (~var1 == -9) {
                    this.anInt3316 = var2.readUnsignedShort();
                  }
                } else {
                  this.anInt3299 = var2.readUnsignedShort();
                }
              } else {
                this.anInt3309 = var2.readUnsignedByte();
              }
            } else {
              this.anInt3303 = var2.readUnsignedShort();
            }
          } else {
            this.anInt3310 = var2.readUnsignedShort();
          }
        } else {
          this.anInt3308 = var2.readUnsignedShort();
        }
      } else {
        this.anInt3312 = var2.readUnsignedByte();
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ol.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final void method158(int var1) {
    try {
      if (var1 != 16251) {
        this.parseConfig(-7, null, true);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ol.P(" + var1 + ')');
    }
  }

  private final void method291(int var1, Random var2, int var3, int var4, byte var5, int var6,
                               int[][] var7) {
    try {
      if (var5 == -69) {
        int var8 = -1 > ~this.anInt3316 ?
          4096 + -FloorUnderlay.method1603((byte) -128, this.anInt3316, var2) :
          4096;
        int var9 = this.anInt3299 * this.anInt3314 >> 12;
        int var10 =
          this.anInt3314 - (0 < var9 ? FloorUnderlay.method1603((byte) 39, var9, var2) : 0);
        if (SomethingLight0.anInt1559 <= var3) {
          var3 -= SomethingLight0.anInt1559;
        }

        int var11;
        int var12;
        if (0 < var10) {
          if (0 >= var6 || var4 <= 0) {
            return;
          }

          var11 = var4 / 2;
          var12 = var6 / 2;
          int var13 = var11 < var10 ? var11 : var10;
          int var14 = ~var12 <= ~var10 ? var10 : var12;
          int var16 = var4 + -(2 * var13);
          int var15 = var13 + var3;

          for (int var17 = 0; var17 < var6; ++var17) {
            int[] var18 = var7[var1 + var17];
            int var19;
            int var21;
            int var20;
            if (~var17 > ~var14) {
              var19 = var17 * var8 / var14;
              if (~this.anInt3309 != -1) {
                for (var20 = 0; var20 < var13; ++var20) {
                  var21 = var20 * var8 / var13;
                  var18[ClientScript.bitAnd(RenderAnimation.anInt396, var3 - -var20)] =
                    var18[ClientScript.bitAnd(RenderAnimation.anInt396, var4 + var3 + -var20 - 1)] =
                      ~var19 >= ~var21 ? var19 : var21;
                }
              } else {
                for (var20 = 0; ~var13 < ~var20; ++var20) {
                  var21 = var20 * var8 / var13;
                  var18[ClientScript.bitAnd(RenderAnimation.anInt396, var20 + var3)] =
                    var18[ClientScript.bitAnd(-1 + var4 + var3 + -var20,
                      RenderAnimation.anInt396)] = var21 * var19 >> 12;
                }
              }

              if (SomethingLight0.anInt1559 >= var16 + var15) {
                ArrayUtils.fill(var18, var15, var16, var19);
              } else {
                var20 = -var15 + SomethingLight0.anInt1559;
                ArrayUtils.fill(var18, var15, var20, var19);
                ArrayUtils.fill(var18, 0, -var20 + var16, var19);
              }
            } else {
              var19 = var6 + -var17 - 1;
              if (~var19 <= ~var14) {
                for (var20 = 0; var13 > var20; ++var20) {
                  var18[ClientScript.bitAnd(RenderAnimation.anInt396, var3 + var20)] =
                    var18[ClientScript.bitAnd(-1 + -var20 + var3 - -var4,
                      RenderAnimation.anInt396)] = var8 * var20 / var13;
                }

                if (~(var15 - -var16) < ~SomethingLight0.anInt1559) {
                  var20 = -var15 + SomethingLight0.anInt1559;
                  ArrayUtils.fill(var18, var15, var20, var8);
                  ArrayUtils.fill(var18, 0, var16 - var20, var8);
                } else {
                  ArrayUtils.fill(var18, var15, var16, var8);
                }
              } else {
                var20 = var19 * var8 / var14;
                int var22;
                if (this.anInt3309 == 0) {
                  for (var21 = 0; var13 > var21; ++var21) {
                    var22 = var8 * var21 / var13;
                    var18[ClientScript.bitAnd(RenderAnimation.anInt396, var3 - -var21)] =
                      var18[ClientScript.bitAnd(RenderAnimation.anInt396,
                        -1 + var3 - (-var4 + var21))] = var22 * var20 >> 12;
                  }
                } else {
                  for (var21 = 0; ~var13 < ~var21; ++var21) {
                    var22 = var21 * var8 / var13;
                    var18[ClientScript.bitAnd(var3 - -var21, RenderAnimation.anInt396)] =
                      var18[ClientScript.bitAnd(-1 + -var21 + var4 + var3,
                        RenderAnimation.anInt396)] = ~var20 >= ~var22 ? var20 : var22;
                  }
                }

                if (var16 + var15 > SomethingLight0.anInt1559) {
                  var21 = SomethingLight0.anInt1559 + -var15;
                  ArrayUtils.fill(var18, var15, var21, var20);
                  ArrayUtils.fill(var18, 0, -var21 + var16, var20);
                } else {
                  ArrayUtils.fill(var18, var15, var16, var20);
                }
              }
            }
          }
        } else if (~SomethingLight0.anInt1559 <= ~(var3 - -var4)) {
          for (var11 = 0; ~var6 < ~var11; ++var11) {
            ArrayUtils.fill(var7[var1 - -var11], var3, var4, var8);
          }
        } else {
          var11 = SomethingLight0.anInt1559 - var3;

          for (var12 = 0; var6 > var12; ++var12) {
            int[] var24 = var7[var12 + var1];
            ArrayUtils.fill(var24, var3, var11, var8);
            ArrayUtils.fill(var24, 0, -var11 + var4, var8);
          }
        }

      }
    } catch (RuntimeException var23) {
      throw AbstractGameWorld.cascadeException(var23,
        "ol.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ','
          + var5 + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method290(int var0) {
    try {
      aClass94_3307 = null;
      aClass94_3302 = null;
      if (var0 == -9) {
        fileUnpacker10 = null;
        aClass94_3306 = null;
        aClass94_3311 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ol.F(" + var0 + ')');
    }
  }

  static final boolean method292(int var0, int var1, int var2, int var3, SceneNode var4, int var5,
                                 long var6, int var8, int var9, int var10, int var11) {
    return var4 == null ?
      true :
      DummyClass42.addNodeToSceneGraph(var0, var8, var9, var10 - var8 + 1, var11 - var9 + 1, var1,
        var2, var3, var4, var5, true, var6);
  }

  static final int method293(int var0, int var1, boolean var2, int var3) {
    try {
      var1 &= 3;
      return var2 ?
        120 :
        (0 == var1 ? var3 : (1 != var1 ? (-3 != ~var1 ? var0 : -var3 + 1023) : -var0 + 1023));
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ol.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

}
