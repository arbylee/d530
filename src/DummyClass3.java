final class DummyClass3 {

  static int[] anIntArray52 = new int[4096];
  static GameString openingMusic;
  static boolean[] aBooleanArray54;
  static int screenUpperY;
  static int anInt56;
  static int anInt57;
  static GameString aClass94_58;

  static {
    for (int var0 = 0; var0 < 4096; ++var0) {
      anIntArray52[var0] = Something3d2.method2246((byte) 83, var0);
    }

    aBooleanArray54 = new boolean[8];
    openingMusic = SpawnedGameObject.createString("scape main");
    anInt57 = 0;
    aClass94_58 = SpawnedGameObject.createString("<col=ffffff> )4 ");
  }

  static final void method69(HuffmanEncoder var0, int var1) {
    try {
      if (var1 < 2) {
        method69(null, -115);
      }

      TextureSampler16.huffmanEncoder = var0;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "a.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final SomethingGl0[] method70(float[][] var0, float[][] var1, int[][] var2, int var3,
                                       float[][] var4, byte[][] var5, int[][] var6, int var7,
                                       byte[][] var8, byte[][] var9, byte[][] var10,
                                       byte[][][] var11) {
    try {
      HashTable var12 = new HashTable(128);

      int var13;
      int var14;
      int var15;
      int var16;
      int var21;
      int var23;
      int var22;
      int var25;
      int var24;
      int var27;
      int var26;
      int var29;
      int var28;
      int var30;
      int var35;
      byte var33;
      int var36;
      int var58;
      int var65;
      boolean[] var79;
      int var73;
      int var74;
      boolean[] var75;
      boolean[] var81;
      for (var13 = 1; var13 <= 102; ++var13) {
        for (var14 = 1; ~var14 >= -103; ++var14) {
          var15 = var9[var13][var14] & 255;
          var16 = 255 & var10[var13][var14];
          if (~var16 != -1) {
            FloorOverlay var17 = TextureSampler10.method350((byte) -81, -1 + var16);
            if (var17.anInt2103 == -1) {
              continue;
            }

            SomethingGl0 var18 = AnimationSequence.method2052(var12, false, var17);
            byte var19 = var8[var13][var14];
            int[] var20 = DummyClass21.anIntArrayArray1763[var19];
            var18.anInt2342 += var20.length / 2;
            ++var18.anInt2344;
            if (var17.aBoolean2092 && var15 != 0) {
              var18.anInt2342 += AbstractObjectNode.anIntArray3607[var19];
            }
          }

          if (-1 != ~(var9[var13][var14] & 255) || ~var16 != -1 && ~var8[var13][var14] == -1) {
            var58 = 0;
            int var60 = 0;
            var21 = 0;
            var65 = 0;
            var23 = 255 & var10[var13][1 + var14];
            var25 = var10[var13][var14 - 1] & 255;
            var24 = var10[-1 + var13][var14] & 255;
            int[] var63 = new int[8];
            var22 = 0;
            var27 = 255 & var10[var13 + -1][1 + var14];
            var26 = var10[var13 + 1][var14] & 255;
            var29 = 255 & var10[var13 + 1][-1 + var14];
            var28 = var10[var13 - 1][-1 + var14] & 255;
            var30 = var10[1 + var13][var14 - -1] & 255;
            FloorOverlay var31;
            int var34;
            byte var32;
            boolean var70;
            if (0 != var27 && ~var16 != ~var27) {
              var31 = TextureSampler10.method350((byte) 106, -1 + var27);
              if (var31.aBoolean2092 && ~var31.anInt2103 != 0) {
                var32 = var5[var13 + -1][var14 - -1];
                var33 = var8[-1 + var13][var14 + 1];
                var34 = SomethingTexture1.anIntArray2642[4 * var33 - -(2 + var32 & 3)];
                var35 = SomethingTexture1.anIntArray2642[(3 + var32 & 3) + 4 * var33];
                if (TextureSampler8.aBooleanArrayArray3468[var35][1]
                  && TextureSampler8.aBooleanArrayArray3468[var34][0]) {
                  var70 = false;
                } else {
                  for (var36 = 0; 8 > var36; ++var36) {
                    if (~var36 == ~var58) {
                      var63[var58++] = var27;
                      break;
                    }

                    if (~var27 == ~var63[var36]) {
                      break;
                    }
                  }
                }
              } else {
                var70 = false;
              }
            } else {
              var70 = false;
            }

            boolean var69;
            if (-1 != ~var28 && var28 != var16) {
              var31 = TextureSampler10.method350((byte) 114, -1 + var28);
              if (var31.aBoolean2092 && 0 != ~var31.anInt2103) {
                var32 = var5[-1 + var13][var14 + -1];
                var33 = var8[-1 + var13][-1 + var14];
                var34 = SomethingTexture1.anIntArray2642[var33 * 4 - -(var32 & 3)];
                var35 = SomethingTexture1.anIntArray2642[(var32 - -3 & 3) + var33 * 4];
                if (TextureSampler8.aBooleanArrayArray3468[var34][1]
                  && TextureSampler8.aBooleanArrayArray3468[var35][0]) {
                  var69 = false;
                } else {
                  for (var36 = 0; ~var36 > -9; ++var36) {
                    if (~var58 == ~var36) {
                      var63[var58++] = var28;
                      break;
                    }

                    if (~var63[var36] == ~var28) {
                      break;
                    }
                  }
                }
              } else {
                var69 = false;
              }
            } else {
              var69 = false;
            }

            boolean var72;
            if (-1 != ~var29 && ~var16 != ~var29) {
              var31 = TextureSampler10.method350((byte) 107, var29 - 1);
              if (var31.aBoolean2092 && ~var31.anInt2103 != 0) {
                var32 = var5[1 + var13][var14 - 1];
                var33 = var8[var13 - -1][var14 + -1];
                var35 = SomethingTexture1.anIntArray2642[4 * var33 + (3 & 1 + var32)];
                var34 = SomethingTexture1.anIntArray2642[var33 * 4 - -(var32 & 3)];
                if (TextureSampler8.aBooleanArrayArray3468[var35][1]
                  && TextureSampler8.aBooleanArrayArray3468[var34][0]) {
                  var72 = false;
                } else {
                  for (var36 = 0; ~var36 > -9; ++var36) {
                    if (~var58 == ~var36) {
                      var63[var58++] = var29;
                      break;
                    }

                    if (~var29 == ~var63[var36]) {
                      break;
                    }
                  }
                }
              } else {
                var72 = false;
              }
            } else {
              var72 = false;
            }

            boolean var71;
            if (var30 != 0 && ~var30 != ~var16) {
              var31 = TextureSampler10.method350((byte) 105, var30 + -1);
              if (var31.aBoolean2092 && 0 != ~var31.anInt2103) {
                var32 = var5[var13 - -1][1 + var14];
                var33 = var8[var13 + 1][1 + var14];
                var35 = SomethingTexture1.anIntArray2642[4 * var33 + (var32 - -1 & 3)];
                var34 = SomethingTexture1.anIntArray2642[var33 * 4 + (var32 - -2 & 3)];
                if (TextureSampler8.aBooleanArrayArray3468[var34][1]
                  && TextureSampler8.aBooleanArrayArray3468[var35][0]) {
                  var71 = false;
                } else {
                  for (var36 = 0; ~var36 > -9; ++var36) {
                    if (var58 == var36) {
                      var63[var58++] = var30;
                      break;
                    }

                    if (~var30 == ~var63[var36]) {
                      break;
                    }
                  }
                }
              } else {
                var71 = false;
              }
            } else {
              var71 = false;
            }

            if (-1 != ~var23 && ~var16 != ~var23) {
              var31 = TextureSampler10.method350((byte) -29, -1 + var23);
              if (var31.aBoolean2092 && var31.anInt2103 != -1) {
                var60 = SomethingTexture1.anIntArray2642[4 * var8[var13][var14 - -1] + (
                  var5[var13][var14 - -1] - -2 & 3)];

                for (var74 = 0; ~var74 > -9; ++var74) {
                  if (~var58 == ~var74) {
                    var63[var58++] = var23;
                    break;
                  }

                  if (var63[var74] == var23) {
                    break;
                  }
                }
              }
            }

            if (0 != var24 && ~var16 != ~var24) {
              var31 = TextureSampler10.method350((byte) -32, var24 + -1);
              if (var31.aBoolean2092 && var31.anInt2103 != -1) {
                var65 = SomethingTexture1.anIntArray2642[(3 & 3 + var5[var13 + -1][var14])
                  + var8[var13 + -1][var14] * 4];

                for (var74 = 0; -9 < ~var74; ++var74) {
                  if (var58 == var74) {
                    var63[var58++] = var24;
                    break;
                  }

                  if (~var24 == ~var63[var74]) {
                    break;
                  }
                }
              }
            }

            if (-1 != ~var25 && var16 != var25) {
              var31 = TextureSampler10.method350((byte) 112, -1 + var25);
              if (var31.aBoolean2092 && ~var31.anInt2103 != 0) {
                var21 = SomethingTexture1.anIntArray2642[(3 & var5[var13][var14 + -1])
                  + var8[var13][var14 + -1] * 4];

                for (var74 = 0; ~var74 > -9; ++var74) {
                  if (~var74 == ~var58) {
                    var63[var58++] = var25;
                    break;
                  }

                  if (var25 == var63[var74]) {
                    break;
                  }
                }
              }
            }

            if (0 != var26 && var16 != var26) {
              var31 = TextureSampler10.method350((byte) -41, var26 - 1);
              if (var31.aBoolean2092 && ~var31.anInt2103 != 0) {
                var22 =
                  SomethingTexture1.anIntArray2642[(3 & var5[var13 + 1][var14] + 1) + 4 * var8[1
                    + var13][var14]];

                for (var74 = 0; ~var74 > -9; ++var74) {
                  if (~var58 == ~var74) {
                    var63[var58++] = var26;
                    break;
                  }

                  if (var63[var74] == var26) {
                    break;
                  }
                }
              }
            }

            for (var73 = 0; var58 > var73; ++var73) {
              var74 = var63[var73];
              var79 = TextureSampler8.aBooleanArrayArray3468[~var24 != ~var74 ? 0 : var65];
              var75 = TextureSampler8.aBooleanArrayArray3468[~var74 != ~var25 ? 0 : var21];
              boolean[] var80 = TextureSampler8.aBooleanArrayArray3468[var23 == var74 ? var60 : 0];
              var81 = TextureSampler8.aBooleanArrayArray3468[var26 == var74 ? var22 : 0];
              FloorOverlay var37 = TextureSampler10.method350((byte) 113, -1 + var74);
              SomethingGl0 var38 = AnimationSequence.method2052(var12, false, var37);
              var38.anInt2342 += 5;
              var38.anInt2342 += -2 + var80.length;
              var38.anInt2342 += -2 + var79.length;
              var38.anInt2342 += var75.length - 2;
              var38.anInt2342 += -2 + var81.length;
              ++var38.anInt2344;
            }
          }
        }
      }

      SomethingGl0 var56;
      for (
        var56 = (SomethingGl0) var12.getFirst(var7 + 36);
        null != var56; var56 = (SomethingGl0) var12.getNext(var7 ^ -117)) {
        var56.method145();
      }

      for (var13 = 1; 102 >= var13; ++var13) {
        for (var14 = 1; ~var14 >= -103; ++var14) {
          var16 = 255 & var9[var13][var14];
          var58 = 255 & var10[var13][var14];
          if ((8 & var11[var3][var13][var14]) != 0) {
            var15 = 0;
          } else if (2 == (var11[1][var13][var14] & 2) && ~var3 < -1) {
            var15 = var3 + -1;
          } else {
            var15 = var3;
          }

          if (0 != var58) {
            FloorOverlay var62 = TextureSampler10.method350((byte) -25, -1 + var58);
            if (var62.anInt2103 == -1) {
              continue;
            }

            SomethingGl0 var66 = AnimationSequence.method2052(var12, false, var62);
            byte var67 = var8[var13][var14];
            byte var68 = var5[var13][var14];
            var22 = TextureSampler34
              .method190(var62.anInt2095, var62.anInt2103, (byte) -111, var6[var13][var14]);
            var23 = TextureSampler34
              .method190(var62.anInt2095, var62.anInt2103, (byte) 65, var6[var13 + 1][var14]);
            var24 = TextureSampler34
              .method190(var62.anInt2095, var62.anInt2103, (byte) 68, var6[1 + var13][var14 + 1]);
            var25 = TextureSampler34
              .method190(var62.anInt2095, var62.anInt2103, (byte) -84, var6[var13][var14 - -1]);
            PlayerVariable
              .method971(var22, var2, var1, var13, var0, var23, var68, var15, var24, (byte) 88,
                ~var16 != -1 && var62.aBoolean2092, var67, var14, var4, var25, var66);
          }

          if (~(var9[var13][var14] & 255) != -1 || ~var58 != -1 && 0 == var8[var13][var14]) {
            int[] var64 = new int[8];
            var65 = 0;
            int var61 = 0;
            var21 = 0;
            var22 = 0;
            var24 = var10[var13][var14 - -1] & 255;
            var23 = 0;
            var25 = var10[-1 + var13][var14] & 255;
            var27 = var10[1 + var13][var14] & 255;
            var26 = var10[var13][-1 + var14] & 255;
            var28 = 255 & var10[-1 + var13][var14 + 1];
            var29 = 255 & var10[var13 - 1][var14 - 1];
            var30 = 255 & var10[1 + var13][var14 + -1];
            var73 = var10[1 + var13][var14 + 1] & 255;
            FloorOverlay var76;
            byte var77;
            int var83;
            if (0 != var28 && var28 != var58) {
              var76 = TextureSampler10.method350((byte) -88, -1 + var28);
              if (var76.aBoolean2092 && var76.anInt2103 != -1) {
                var33 = var5[var13 + -1][1 + var14];
                var77 = var8[-1 + var13][1 + var14];
                var35 = SomethingTexture1.anIntArray2642[4 * var77 - -(2 + var33 & 3)];
                var36 = SomethingTexture1.anIntArray2642[var77 * 4 - -(3 + var33 & 3)];
                if (TextureSampler8.aBooleanArrayArray3468[var36][1]
                  && TextureSampler8.aBooleanArrayArray3468[var35][0]) {
                  var28 = 0;
                } else {
                  for (var83 = 0; -9 < ~var83; ++var83) {
                    if (var61 == var83) {
                      var64[var61++] = var28;
                      break;
                    }

                    if (~var64[var83] == ~var28) {
                      break;
                    }
                  }
                }
              } else {
                var28 = 0;
              }
            } else {
              var28 = 0;
            }

            if (0 != var29 && ~var58 != ~var29) {
              var76 = TextureSampler10.method350((byte) -87, -1 + var29);
              if (var76.aBoolean2092 && -1 != var76.anInt2103) {
                var33 = var5[var13 + -1][-1 + var14];
                var77 = var8[-1 + var13][var14 + -1];
                var35 = SomethingTexture1.anIntArray2642[(3 & var33) + var77 * 4];
                var36 = SomethingTexture1.anIntArray2642[(var33 - -3 & 3) + 4 * var77];
                if (TextureSampler8.aBooleanArrayArray3468[var35][1]
                  && TextureSampler8.aBooleanArrayArray3468[var36][0]) {
                  var29 = 0;
                } else {
                  for (var83 = 0; 8 > var83; ++var83) {
                    if (var83 == var61) {
                      var64[var61++] = var29;
                      break;
                    }

                    if (var29 == var64[var83]) {
                      break;
                    }
                  }
                }
              } else {
                var29 = 0;
              }
            } else {
              var29 = 0;
            }

            if (var30 != 0 && ~var30 != ~var58) {
              var76 = TextureSampler10.method350((byte) -123, -1 + var30);
              if (var76.aBoolean2092 && -1 != var76.anInt2103) {
                var33 = var5[1 + var13][var14 - 1];
                var77 = var8[1 + var13][var14 + -1];
                var36 = SomethingTexture1.anIntArray2642[(1 + var33 & 3) + 4 * var77];
                var35 = SomethingTexture1.anIntArray2642[var77 * 4 + (var33 & 3)];
                if (TextureSampler8.aBooleanArrayArray3468[var36][1]
                  && TextureSampler8.aBooleanArrayArray3468[var35][0]) {
                  var30 = 0;
                } else {
                  for (var83 = 0; 8 > var83; ++var83) {
                    if (~var83 == ~var61) {
                      var64[var61++] = var30;
                      break;
                    }

                    if (var64[var83] == var30) {
                      break;
                    }
                  }
                }
              } else {
                var30 = 0;
              }
            } else {
              var30 = 0;
            }

            if (~var73 != -1 && ~var58 != ~var73) {
              var76 = TextureSampler10.method350((byte) 119, -1 + var73);
              if (var76.aBoolean2092 && var76.anInt2103 != -1) {
                var77 = var8[1 + var13][1 + var14];
                var33 = var5[1 + var13][var14 + 1];
                var35 = SomethingTexture1.anIntArray2642[(3 & var33 - -2) + 4 * var77];
                var36 = SomethingTexture1.anIntArray2642[(var33 + 1 & 3) + 4 * var77];
                if (TextureSampler8.aBooleanArrayArray3468[var35][1]
                  && TextureSampler8.aBooleanArrayArray3468[var36][0]) {
                  var73 = 0;
                } else {
                  for (var83 = 0; ~var83 > -9; ++var83) {
                    if (~var83 == ~var61) {
                      var64[var61++] = var73;
                      break;
                    }

                    if (var64[var83] == var73) {
                      break;
                    }
                  }
                }
              } else {
                var73 = 0;
              }
            } else {
              var73 = 0;
            }

            int var78;
            if (-1 != ~var24 && ~var24 != ~var58) {
              var76 = TextureSampler10.method350((byte) 113, var24 - 1);
              if (var76.aBoolean2092 && -1 != var76.anInt2103) {
                var65 = SomethingTexture1.anIntArray2642[var8[var13][var14 - -1] * 4 + (
                  2 + var5[var13][var14 - -1] & 3)];

                for (var78 = 0; 8 > var78; ++var78) {
                  if (~var78 == ~var61) {
                    var64[var61++] = var24;
                    break;
                  }

                  if (~var64[var78] == ~var24) {
                    break;
                  }
                }
              }
            }

            if (var25 != 0 && var58 != var25) {
              var76 = TextureSampler10.method350((byte) -103, var25 + -1);
              if (var76.aBoolean2092 && 0 != ~var76.anInt2103) {
                var21 =
                  SomethingTexture1.anIntArray2642[(3 & var5[var13 - 1][var14] - -3) + 4 * var8[
                    var13 + -1][var14]];

                for (var78 = 0; var78 < 8; ++var78) {
                  if (~var61 == ~var78) {
                    var64[var61++] = var25;
                    break;
                  }

                  if (var25 == var64[var78]) {
                    break;
                  }
                }
              }
            }

            if (var26 != 0 && ~var26 != ~var58) {
              var76 = TextureSampler10.method350((byte) 126, var26 - 1);
              if (var76.aBoolean2092 && -1 != var76.anInt2103) {
                var22 =
                  SomethingTexture1.anIntArray2642[(var5[var13][var14 + -1] & 3) + 4 * var8[var13][
                    -1 + var14]];

                for (var78 = 0; ~var78 > -9; ++var78) {
                  if (~var61 == ~var78) {
                    var64[var61++] = var26;
                    break;
                  }

                  if (~var26 == ~var64[var78]) {
                    break;
                  }
                }
              }
            }

            if (var27 != 0 && var27 != var58) {
              var76 = TextureSampler10.method350((byte) 116, var27 + -1);
              if (var76.aBoolean2092 && var76.anInt2103 != -1) {
                var23 = SomethingTexture1.anIntArray2642[4 * var8[1 + var13][var14] - -(3
                  & var5[var13 + 1][var14] - -1)];

                for (var78 = 0; ~var78 > -9; ++var78) {
                  if (~var78 == ~var61) {
                    var64[var61++] = var27;
                    break;
                  }

                  if (~var64[var78] == ~var27) {
                    break;
                  }
                }
              }
            }

            for (var74 = 0; ~var74 > ~var61; ++var74) {
              var78 = var64[var74];
              var79 = TextureSampler8.aBooleanArrayArray3468[var78 == var24 ? var65 : 0];
              var75 = TextureSampler8.aBooleanArrayArray3468[var25 == var78 ? var21 : 0];
              var81 = TextureSampler8.aBooleanArrayArray3468[~var78 == ~var26 ? var22 : 0];
              boolean[] var84 = TextureSampler8.aBooleanArrayArray3468[var78 != var27 ? 0 : var23];
              FloorOverlay var82 = TextureSampler10.method350((byte) 121, -1 + var78);
              SomethingGl0 var39 = AnimationSequence.method2052(var12, false, var82);
              int var40 = TextureSampler34
                .method190(var82.anInt2095, var82.anInt2103, (byte) -76, var6[var13][var14]) << 8
                | 255;
              byte var44 = 6;
              int var41 = 255 | TextureSampler34
                .method190(var82.anInt2095, var82.anInt2103, (byte) -85, var6[1 + var13][var14])
                << 8;
              int var42 = TextureSampler34.method190(var82.anInt2095, var82.anInt2103, (byte) 123,
                var6[var13 - -1][var14 - -1]) << 8 | 255;
              int var43 = 255 | TextureSampler34
                .method190(var82.anInt2095, var82.anInt2103, (byte) 106, var6[var13][var14 - -1])
                << 8;
              boolean var48 = ~var78 != ~var29 && var81[0] && var75[1];
              boolean var47 = ~var78 != ~var73 && var79[0] && var84[1];
              boolean var46 = var28 != var78 && var75[0] && var79[1];
              int var85 = var44 + -2 + var79.length;
              boolean var49 = ~var78 != ~var30 && var84[0] && var81[1];
              var85 += -2 + var75.length;
              var85 += var81.length - 2;
              var85 += -2 + var84.length;
              int var50 = BufferData
                .method1734(var43, 0.0F, var40, var41, null, var2, var13, var4, var42, (byte) -127,
                  0, true, var39, var1, var14, 64, var0, 64);
              int[] var45 = new int[var85];
              var44 = 0;
              int var51 = BufferData
                .method1734(var43, 0.0F, var40, var41, null, var2, var13, var4, var42, (byte) -112,
                  0, var46, var39, var1, var14, 0, var0, 128);
              int var52 = BufferData
                .method1734(var43, 0.0F, var40, var41, null, var2, var13, var4, var42, (byte) -119,
                  0, var47, var39, var1, var14, 128, var0, 128);
              int var53 = BufferData
                .method1734(var43, 0.0F, var40, var41, null, var2, var13, var4, var42, (byte) -127,
                  0, var48, var39, var1, var14, 0, var0, 0);
              int var54 = BufferData
                .method1734(var43, 0.0F, var40, var41, null, var2, var13, var4, var42, (byte) -114,
                  0, var49, var39, var1, var14, 128, var0, 0);
              var85 = var44 + 1;
              var45[var44] = var50;
              var45[var85++] = var52;
              if (-3 > ~var79.length) {
                var45[var85++] = BufferData
                  .method1734(var43, 0.0F, var40, var41, null, var2, var13, var4, var42,
                    (byte) -117, 0, var79[2], var39, var1, var14, 64, var0, 128);
              }

              var45[var85++] = var51;
              if (var75.length > 2) {
                var45[var85++] = BufferData
                  .method1734(var43, 0.0F, var40, var41, null, var2, var13, var4, var42,
                    (byte) -128, 0, var75[2], var39, var1, var14, 0, var0, 64);
              }

              var45[var85++] = var53;
              if (var81.length > 2) {
                var45[var85++] = BufferData
                  .method1734(var43, 0.0F, var40, var41, null, var2, var13, var4, var42,
                    (byte) -112, 0, var81[2], var39, var1, var14, 64, var0, 0);
              }

              var45[var85++] = var54;
              if (-3 > ~var84.length) {
                var45[var85++] = BufferData
                  .method1734(var43, 0.0F, var40, var41, null, var2, var13, var4, var42,
                    (byte) -127, 0, var84[2], var39, var1, var14, 128, var0, 64);
              }

              var45[var85++] = var52;
              var39.method150(var15, var13, var14, var45, null, true);
            }
          }
        }
      }

      for (
        var56 = (SomethingGl0) var12.getFirst(62);
        null != var56; var56 = (SomethingGl0) var12.getNext(-80)) {
        if (-1 != ~var56.anInt2343) {
          var56.method148();
        } else {
          var56.unlinkNode();
        }
      }

      var13 = var12.getSize();
      SomethingGl0[] var57 = new SomethingGl0[var13];
      long[] var59 = new long[var13];
      var12.getNodes(var57);

      for (var16 = var7; ~var13 < ~var16; ++var16) {
        var59[var16] = var57[var16].key;
      }

      DummyClass18.method824(var59, var57, var7 + -27);
      return var57;
    } catch (RuntimeException var55) {
      throw AbstractGameWorld.cascadeException(var55,
        "a.A(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ','
          + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (var4 != null ? "{...}" : "null")
          + ',' + (var5 != null ? "{...}" : "null") + ',' + (var6 != null ? "{...}" : "null") + ','
          + var7 + ',' + (var8 != null ? "{...}" : "null") + ',' + (var9 != null ? "{...}" : "null")
          + ',' + (var10 != null ? "{...}" : "null") + ',' + (var11 != null ? "{...}" : "null")
          + ')');
    }
  }

  public static void method71(byte var0) {
    try {
      aBooleanArray54 = null;
      openingMusic = null;
      if (var0 != -124) {
        aClass94_58 = null;
      }

      aClass94_58 = null;
      anIntArray52 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "a.C(" + var0 + ')');
    }
  }

  static final void method72(int var0, int var1, int var2, int var3, int var4) {
    try {
      if (GlRenderer.useOpenGlRenderer) {
        GlUtils.clip(var0, var4, var2 + var0, var1 + var4);
        GlUtils.fillQuad(var0, var4, var2, var1, 0);
      } else {
        DummyClass47.method1324(var0, var4, var2 + var0, var4 + var1);
        DummyClass47.method1323(var0, var4, var2, var1, 0);
      }

      if (~GameObject.anInt2737 <= -101) {
        if (null == HuffmanEncoder.aClass3_Sub28_Sub16_637
          || var2 != HuffmanEncoder.aClass3_Sub28_Sub16_637.anInt3707
          || HuffmanEncoder.aClass3_Sub28_Sub16_637.anInt3696 != var1) {
          SoftwareDirectColorSprite var5 = new SoftwareDirectColorSprite(var2, var1);
          DummyClass47.method1319(var5.pixels, var2, var1);
          SubNode
            .method523(var2, 0, 0, DummyClass30.anInt455, 0, 0, DummyClass58.anInt1460, var1, 0);
          if (GlRenderer.useOpenGlRenderer) {
            HuffmanEncoder.aClass3_Sub28_Sub16_637 = new GlDirectColorSprite(var5);
          } else {
            HuffmanEncoder.aClass3_Sub28_Sub16_637 = var5;
          }

          if (GlRenderer.useOpenGlRenderer) {
            DummyClass47.anIntArray1100 = null;
          } else {
            Something3d.viewImageProducer.method2182(0);
          }
        }

        HuffmanEncoder.aClass3_Sub28_Sub16_637.method635(var0, var4);
        if (var3 != 19481) {
          method70(null, null, null, 126, null, null, null, -1, null, null, null, null);
        }

        int var6 = var1 * DummyClass44.anInt934 / DummyClass58.anInt1460 + var4;
        int var8 = DummyClass1.anInt410 * var1 / DummyClass58.anInt1460;
        int var15 = var0 + var2 * DummyClass44.anInt930 / DummyClass30.anInt455;
        int var7 = var2 * GZipDecompressor.anInt817 / DummyClass30.anInt455;
        int var9 = 16711680;
        if (-2 == ~AbstractImageProducer.gameId) {
          var9 = 16777215;
        }

        if (GlRenderer.useOpenGlRenderer) {
          GlUtils.fillQuad(var15, var6, var7, var8, var9, 128);
          GlUtils.drawQuad(var15, var6, var7, var8, var9);
        } else {
          DummyClass47.method1312(var15, var6, var7, var8, var9, 128);
          DummyClass47.method1311(var15, var6, var7, var8, var9);
        }

        if (~AbstractDirectColorSprite.anInt3704 < -1) {
          int var10;
          if (-11 > ~ByteArrayNode.anInt3611) {
            var10 = (-ByteArrayNode.anInt3611 + 20) * 25;
          } else {
            var10 = 25 * ByteArrayNode.anInt3611;
          }

          for (SomethingOtherWorldMap var11 = (SomethingOtherWorldMap) DummyClass51.aClass61_1162.getFirst();
               var11 != null; var11 = (SomethingOtherWorldMap) DummyClass51.aClass61_1162.getNext()) {
            if (~var11.anInt2532 == ~FileSystem.anInt101) {
              int var13 = var4 - -(var11.anInt2539 * var1 / DummyClass58.anInt1460);
              int var12 = var2 * var11.anInt2531 / DummyClass30.anInt455 + var0;
              if (GlRenderer.useOpenGlRenderer) {
                GlUtils.fillQuad(-2 + var12, -2 + var13, 4, 4, 16776960, var10);
              } else {
                DummyClass47.method1312(var12 + -2, -2 + var13, 4, 4, 16776960, var10);
              }
            }
          }
        }

      }
    } catch (RuntimeException var14) {
      throw AbstractGameWorld.cascadeException(var14,
        "a.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }
}
