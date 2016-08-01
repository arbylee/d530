final class MidiSomething {

  static MidiFile aClass3_Sub27_1154;
  static int anInt1156 = 0;
  static boolean aBoolean1158 = false;
  private FileUnpacker soundEffects;
  private HashTable aClass130_1155 = new HashTable(256);
  private FileUnpacker midiInstruments;
  private HashTable aClass130_1159 = new HashTable(256);


  MidiSomething(FileUnpacker var1, FileUnpacker var2) {
    try {
      this.soundEffects = var1;
      this.midiInstruments = var2;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "le.<init>(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null")
          + ')');
    }
  }

  private final SomethingMusic0 method1412(int[] var1, int var2, int var3, int var4) {
    try {
      if (var2 != 31947) {
        return null;
      } else {
        int var5 = var4 ^ (var3 >>> 12 | var3 << 4 & '\ufff3');
        var5 |= var3 << 16;
        long var6 = (long) var5;
        SomethingMusic0 var8 = (SomethingMusic0) this.aClass130_1159.get(var6);
        if (var8 != null) {
          return var8;
        } else if (null != var1 && ~var1[0] >= -1) {
          return null;
        } else {
          SoundEffect var9 = SoundEffect.method1811(this.soundEffects, var3, var4);
          if (null != var9) {
            var8 = var9.method1812();
            this.aClass130_1159.put(var6, var8);
            if (var1 != null) {
              var1[0] -= var8.aByteArray3030.length;
            }

            return var8;
          } else {
            return null;
          }
        }
      }
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "le.B(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  final SomethingMusic0 method1413(int var1, int var2, int[] var3) {
    try {
      if (1 != this.soundEffects.method2121(0)) {
        if (-2 == ~this.soundEffects.getAmountChildren(var1, (byte) 83)) {
          return this.method1412(var3, 31947, var1, 0);
        } else {
          if (var2 < 0) {
            this.aClass130_1159 = null;
          }

          throw new RuntimeException();
        }
      } else {
        return this.method1412(var3, 31947, 0, var1);
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "le.A(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

  private final SomethingMusic0 method1415(int var1, int[] var2, int var3, byte var4) {
    try {
      int var5 = var3 ^ (var1 >>> 12 | '\ufff3' & var1 << 4);
      var5 |= var1 << 16;
      long var6 = (long) var5 ^ 4294967296L;
      SomethingMusic0 var8 = (SomethingMusic0) this.aClass130_1159.get(var6);
      if (null != var8) {
        return var8;
      } else if (var2 != null && var2[0] <= 0) {
        return null;
      } else {
        MidiInstrument var9 = (MidiInstrument) this.aClass130_1155.get(var6);
        if (null == var9) {
          var9 = MidiInstrument.method363(this.midiInstruments, var1, var3);
          if (null == var9) {
            return null;
          }

          this.aClass130_1155.put(var6, var9);
        }

        var8 = var9.method359(var2);
        if (null == var8) {
          return null;
        } else {
          var9.unlinkNode();
          this.aClass130_1159.put(var6, var8);
          if (var4 != 11) {
            this.method1413(64, -18, null);
          }

          return var8;
        }
      }
    } catch (RuntimeException var10) {
      // var10.printStackTrace();
      throw AbstractGameWorld.cascadeException(var10,
        "le.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
    }
  }

  final SomethingMusic0 method1416(int var1, int var2, int[] var3) {
    try {
      if (var1 != 10089) {
        return null;
      } else if (-2 == ~this.midiInstruments.method2121(0)) {
        return this.method1415(0, var3, var2, (byte) 11);
      } else if (-2 != ~this.midiInstruments.getAmountChildren(var2, (byte) 99)) {
        throw new RuntimeException();
      } else {
        return this.method1415(var2, var3, 0, (byte) 11);
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "le.G(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method1410(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               int var7, int var8, int var9, int var10) {
    try {
      int var11 = var4 - var6;
      int var12 = -var3 + var2;
      if (DummyClass30.anInt455 > var4) {
        ++var11;
      }

      if (DummyClass58.anInt1460 > var2) {
        ++var12;
      }

      if (var10 != -12541) {
        getWindowMode();
      }

      int var13;
      int var14;
      int var15;
      int var17;
      int var16;
      int var19;
      int var21;
      int var20;
      int var22;
      int var25;
      int var24;
      int var26;
      int var28;
      int var31;
      int var30;
      int var32;
      int var33;
      int[][] var41;
      int var10000;
      for (var13 = 0; ~var11 < ~var13; ++var13) {
        var14 = var13 * var8 + var1 >> 16;
        var15 = (var13 + 1) * var8 + var1 >> 16;
        var16 = -var14 + var15;
        if (var16 > 0) {
          var17 = var13 - -var6 >> 6;
          if (0 <= var17 && ~(AbstractMouseWheel.anIntArrayArrayArray1903.length + -1) <= ~var17) {
            var14 += var5;
            var41 = AbstractMouseWheel.anIntArrayArrayArray1903[var17];
            byte[][] var45 = RenderAnimation.aByteArrayArrayArray383[var17];
            byte[][] var42 = StringNode0.aByteArrayArrayArray2339[var17];
            byte[][] var23 = HuffmanEncoder.aByteArrayArrayArray640[var17];
            byte[][] var43 = ClientScriptCall.aByteArrayArrayArray2452[var17];
            var15 += var5;
            byte[][] var46 = TextureSampler29.aByteArrayArrayArray3390[var17];

            for (var24 = 0; var12 > var24; ++var24) {
              var25 = var7 * var24 + var9 >> 16;
              var26 = var9 - -((1 + var24) * var7) >> 16;
              int var27 = -var25 + var26;
              if (~var27 < -1) {
                var26 += var0;
                var28 = var3 + var24 >> 6;
                int var29 = 63 & var3 + var24;
                var25 += var0;
                var30 = var13 + var6 & 63;
                var31 = (var29 << 6) + var30;
                if (0 <= var28 && var41.length + -1 >= var28 && null != var41[var28]) {
                  var32 = var41[var28][var31];
                } else {
                  if (~Buffer.aClass3_Sub28_Sub3_2600.anInt3550 == 0) {
                    if (~(4 & var24 + var3) != ~(var6 + var13 & 4)) {
                      var32 = 4936552;
                    } else {
                      var32 = DummyClass51.anIntArray1161[1 + TextureSampler26.anInt3081];
                    }
                  } else {
                    var32 = Buffer.aClass3_Sub28_Sub3_2600.anInt3550;
                  }

                  if (~var28 > -1 || var28 > var41.length + -1) {
                    if (var32 == 0) {
                      var32 = 1;
                    }

                    DummyClass47.method1323(var14, var25, var16, var27, var32);
                    continue;
                  }
                }

                var33 =
                  var45[var28] == null ? 0 : DummyClass51.anIntArray1161[var45[var28][var31] & 255];
                if (-1 == ~var32) {
                  var32 = 1;
                }

                int var34 =
                  var46[var28] != null ? DummyClass51.anIntArray1161[255 & var46[var28][var31]] : 0;
                int var36;
                if (var33 == 0 && -1 == ~var34) {
                  DummyClass47.method1323(var14, var25, var16, var27, var32);
                } else {
                  byte var35;
                  if (0 != var33) {
                    if (~var33 == 0) {
                      var33 = 1;
                    }

                    var35 = var42[var28] != null ? var42[var28][var31] : 0;
                    var36 = var35 & 252;
                    if (-1 != ~var36 && ~var16 < -2 && var27 > 1) {
                      FloorOverlay.method2272(DummyClass47.anIntArray1100, var33, var14, var35 & 3,
                        var32, var36 >> 2, var27, var16, var25, true, (byte) 21);
                    } else {
                      DummyClass47.method1323(var14, var25, var16, var27, var33);
                    }
                  }

                  if (~var34 != -1) {
                    if (var34 == -1) {
                      var34 = var32;
                    }

                    var35 = var43[var28][var31];
                    var36 = 252 & var35;
                    if (~var36 == -1 || -2 <= ~var16 || 1 >= var27) {
                      DummyClass47.method1323(var14, var25, var16, var27, var34);
                    }

                    FloorOverlay.method2272(DummyClass47.anIntArray1100, var34, var14, var35 & 3, 0,
                      var36 >> 2, var27, var16, var25, var33 == 0, (byte) 21);
                  }
                }

                if (var23[var28] != null) {
                  int var49 = var23[var28][var31] & 255;
                  if (-1 != ~var49) {
                    if (1 != var16) {
                      var36 = var15 - 1;
                    } else {
                      var36 = var14;
                    }

                    int var37;
                    if (1 != var27) {
                      var37 = -1 + var26;
                    } else {
                      var37 = var25;
                    }

                    int var38 = 13421772;
                    if (5 <= var49 && 8 >= var49 || var49 >= 13 && 16 >= var49
                      || 21 <= var49 && ~var49 >= -25 || -28 == ~var49 || 28 == var49) {
                      var38 = 13369344;
                      var49 -= 4;
                    }

                    if (1 == var49) {
                      DummyClass47.method1318(var14, var25, var27, var38);
                    } else if (2 == var49) {
                      DummyClass47.method1317(var14, var25, var16, var38);
                    } else if (3 != var49) {
                      if (-5 != ~var49) {
                        if (var49 != 9) {
                          if (~var49 != -11) {
                            if (-12 == ~var49) {
                              DummyClass47.method1318(var36, var25, var27, 16777215);
                              DummyClass47.method1317(var14, var37, var16, var38);
                            } else if (var49 != 12) {
                              if (var49 == 17) {
                                DummyClass47.method1317(var14, var25, 1, var38);
                              } else if (var49 != 18) {
                                if (~var49 == -20) {
                                  DummyClass47.method1317(var36, var37, 1, var38);
                                } else if (~var49 == -21) {
                                  DummyClass47.method1317(var14, var37, 1, var38);
                                } else {
                                  int var39;
                                  if (25 == var49) {
                                    for (var39 = 0; ~var39 > ~var27; ++var39) {
                                      DummyClass47.method1317(var39 + var14, -var39 + var37, 1,
                                        var38);
                                    }
                                  } else if (26 == var49) {
                                    for (var39 = 0; var39 < var27; ++var39) {
                                      DummyClass47.method1317(var39 + var14, var25 + var39, 1,
                                        var38);
                                    }
                                  }
                                }
                              } else {
                                DummyClass47.method1317(var36, var25, 1, var38);
                              }
                            } else {
                              DummyClass47.method1318(var14, var25, var27, 16777215);
                              DummyClass47.method1317(var14, var37, var16, var38);
                            }
                          } else {
                            DummyClass47.method1318(var36, var25, var27, 16777215);
                            DummyClass47.method1317(var14, var25, var16, var38);
                          }
                        } else {
                          DummyClass47.method1318(var14, var25, var27, 16777215);
                          DummyClass47.method1317(var14, var25, var16, var38);
                        }
                      } else {
                        DummyClass47.method1317(var14, var37, var16, var38);
                      }
                    } else {
                      DummyClass47.method1318(var36, var25, var27, var38);
                    }
                  }
                }
              }
            }
          } else {
            var14 += var5;

            for (int var18 = 0; ~var12 < ~var18; ++var18) {
              if (-1 != Buffer.aClass3_Sub28_Sub3_2600.anInt3550) {
                var19 = Buffer.aClass3_Sub28_Sub3_2600.anInt3550;
              } else if ((var13 - -var6 & 4) == (4 & var18 + var3)) {
                var19 = DummyClass51.anIntArray1161[1 + TextureSampler26.anInt3081];
              } else {
                var19 = 4936552;
              }

              if (~var19 == -1) {
                var19 = 1;
              }

              var20 = (var7 * var18 + var9 >> 16) + var0;
              var21 = var0 + ((var18 + 1) * var7 + var9 >> 16);
              var22 = var21 + -var20;
              DummyClass47.method1323(var14, var20, var16, var22, var19);
            }

            var10000 = var15 + var5;
          }
        }
      }

      for (var13 = -2; 2 + var11 > var13; ++var13) {
        var14 = var1 - -(var13 * var8) >> 16;
        var15 = var8 * (var13 + 1) + var1 >> 16;
        var16 = -var14 + var15;
        if (~var16 < -1) {
          var14 += var5;
          var17 = var6 + var13 >> 6;
          var10000 = var15 + var5;
          if (-1 >= ~var17 && PlayerVariable.anIntArrayArrayArray558.length + -1 >= var17) {
            var41 = PlayerVariable.anIntArrayArrayArray558[var17];

            for (var19 = -2; ~var19 > ~(var12 - -2); ++var19) {
              var20 = var9 - -(var19 * var7) >> 16;
              var21 = var9 - -((var19 + 1) * var7) >> 16;
              var22 = var21 + -var20;
              if (~var22 < -1) {
                var20 += var0;
                int var44 = var19 - -var3 >> 6;
                var10000 = var21 + var0;
                if (~var44 <= -1 && var44 <= -1 + var41.length) {
                  var24 = ((63 & var3 + var19) << 6) - -(var13 - -var6 & 63);
                  if (null != var41[var44]) {
                    var25 = var41[var44][var24];
                    var26 = 16383 & var25;
                    if (-1 != ~var26) {
                      var28 = ('\ud228' & var25) >> 14;
                      MapScene var47 = WidgetUpdate.c(-1 + var26, 0);
                      SoftwareIndexedColorSprite var48 = var47.getSprite(var28, (byte) -71);
                      if (var48 != null) {
                        var31 = var22 * var48.height / 4;
                        var30 = var16 * var48.width / 4;
                        if (var47.aBoolean69) {
                          var32 = var25 >> 16 & 15;
                          var33 = (16103184 & var25) >> 20;
                          if (-2 == ~(1 & var28)) {
                            var28 = var32;
                            var32 = var33;
                            var33 = var28;
                          }

                          var30 = var16 * var32;
                          var31 = var22 * var33;
                        }

                        if (-1 != ~var30 && -1 != ~var31) {
                          if (~var47.anInt61 == -1) {
                            var48.method1677(var14, -var31 + var20 - -var22, var30, var31);
                          } else {
                            var48.method1669(var14, var20 - (var31 - var22), var30, var31,
                              var47.anInt61);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }

    } catch (RuntimeException var40) {
      throw AbstractGameWorld.cascadeException(var40,
        "le.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ')');
    }
  }

  static final int getWindowMode() {
    try {
      if (TextureSampler30.fullScreenFrame == null) {
        if (GlRenderer.useOpenGlRenderer && SomethingVolume15.aBoolean2427) {
          return 2;
        } else {

          return GlRenderer.useOpenGlRenderer && !SomethingVolume15.aBoolean2427 ? 1 : 0;
        }
      } else {
        return 3;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "le.D()");
    }
  }

  public static void method1414(int var0) {
    try {
      if (var0 < 86) {
        method1410(73, 59, 119, 60, 89, -42, -25, 37, 88, -62, 69);
      }

      aClass3_Sub27_1154 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "le.E(" + var0 + ')');
    }
  }

}
