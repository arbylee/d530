final class DummyClass31 {

  static Deque aClass61_1471 = new Deque();
  static int anInt1472 = 0;
  static int anInt1473;
  static GameString SERVER_JS5_DROP = SpawnedGameObject.createString("::serverjs5drop");
  static float aFloat1475;


  static final void method1681(int var0) {
    try {
      if (TextureSampler28.loginState == 5) {
        if (var0 != -1) {
          SERVER_JS5_DROP = null;
        }

        TextureSampler28.loginState = 6;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "p.A(" + var0 + ')');
    }
  }

  public static void method1682(int var0) {
    try {
      SERVER_JS5_DROP = null;
      aClass61_1471 = null;
      if (var0 >= -65) {
        method1681(-121);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "p.C(" + var0 + ')');
    }
  }

  static final void method1683(int var0, boolean var1, int var2, boolean var3, CollisionMap var4,
                               int var5, int var6, int var7, byte var8, int var9, int var10) {
    try {
      if (var1 && !NPC.method1986(103) && 0 == (2
        & BZipDecompressorState.tileFlags[0][var7][var9])) {
        if (0 != (16 & BZipDecompressorState.tileFlags[var2][var7][var9])) {
          return;
        }

        if (~DummyClass18.method823(var9, var7, var8 ^ -127, var2) != ~GameObject.plane) {
          return;
        }
      }

      if (~var2 > ~DummyClass52.anInt1174) {
        DummyClass52.anInt1174 = var2;
      }

      GameObjectConfig var11 = DummyClass11.method2207(4, var5);
      if (!GlRenderer.useOpenGlRenderer || !var11.aBoolean1530) {
        int var12;
        int var13;
        if (-2 != ~var10 && ~var10 != -4) {
          var12 = var11.anInt1480;
          var13 = var11.anInt1485;
        } else {
          var13 = var11.anInt1480;
          var12 = var11.anInt1485;
        }

        int var14;
        int var15;
        if (var7 + var12 <= 104) {
          var14 = var7 + (var12 >> 1);
          var15 = var7 - -(1 + var12 >> 1);
        } else {
          var15 = 1 + var7;
          var14 = var7;
        }

        int var17;
        int var16;
        if (-105 > ~(var13 + var9)) {
          var16 = var9;
          var17 = var9 - -1;
        } else {
          var16 = (var13 >> 1) + var9;
          var17 = var9 + (var13 + 1 >> 1);
        }

        int[][] var18 = AbstractGameWorld.heightMap[var0];
        if (var8 == 50) {
          int var20 = (var12 << 6) + (var7 << 7);
          int var21 = (var13 << 6) + (var9 << 7);
          int var19 =
            var18[var14][var17] + var18[var15][var16] + var18[var14][var16] + var18[var15][var17]
              >> 2;
          int var22 = 0;
          int[][] var23;
          if (GlRenderer.useOpenGlRenderer && -1 != ~var0) {
            var23 = AbstractGameWorld.heightMap[0];
            var22 = var19 - (
              var23[var15][var17] + var23[var15][var16] + var23[var14][var16] + var23[var14][var17]
                >> 2);
          }

          var23 = null;
          long var24 = (long) (1073741824 | var7 | var9 << 7 | var6 << 14 | var10 << 20);
          if (var3) {
            var23 = DummyClass43.somethingHeightMap[0];
          } else if (-4 < ~var0) {
            var23 = AbstractGameWorld.heightMap[1 + var0];
          }

          if (0 == var11.anInt1529 || var3) {
            var24 |= Long.MIN_VALUE;
          }

          if (1 == var11.anInt1540) {
            var24 |= 4194304L;
          }

          if (var11.aBoolean1507) {
            var24 |= 2147483648L;
          }

          if (var11.method1690(28933)) {
            SceneSomething2.method1286(var9, false, var11, var10, null, var7, var2, null);
          }

          boolean var26 = var11.aBoolean1503 & !var3;
          var24 |= (long) var5 << 32;
          Object var27;
          SceneShadowMap var28;
          if (22 != var6) {
            if (10 != var6 && 11 != var6) {
              if (12 <= var6) {
                if (-1 == var11.anInt1531 && null == var11.anIntArray1524 && !var11.aBoolean1510) {
                  var28 = var11
                    .method1696(var10, var20, var18, var6, var19, var23, var1, null, (byte) -82,
                      var26, var21);
                  if (GlRenderer.useOpenGlRenderer && var26) {
                    DummyClass16.method2051(var28.shadow, var20, var22, var21);
                  }

                  var27 = var28.node;
                } else {
                  var27 = new GameObject(var5, var6, var10, var0, var7, var9, var11.anInt1531,
                    var11.aBoolean1492, null);
                }

                EnumStringFetcher
                  .method835(var2, var7, var9, var19, 1, 1, (SceneNode) var27, 0, var24);
                if (var1 && 12 <= var6 && -18 <= ~var6 && -14 != ~var6 && var2 > 0) {
                  DummyClass36.anIntArrayArrayArray2609[var2][var7][var9] = TextureSampler3
                    .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7][var9], 4);
                }

                if (-1 != ~var11.anInt1538 && null != var4) {
                  var4.method1489(var7, var11.aBoolean1486, (byte) 73, var9, var12, var13);
                }

              } else if (0 == var6) {
                if (0 == ~var11.anInt1531 && null == var11.anIntArray1524 && !var11.aBoolean1510) {
                  var28 = var11
                    .method1696(var10, var20, var18, 0, var19, var23, var1, null, (byte) -74, var26,
                      var21);
                  if (GlRenderer.useOpenGlRenderer && var26) {
                    DummyClass16.method2051(var28.shadow, var20, var22, var21);
                  }

                  var27 = var28.node;
                } else {
                  var27 = new GameObject(var5, 0, var10, var0, var7, var9, var11.anInt1531,
                    var11.aBoolean1492, null);
                }

                DummyClass14.method2146(var2, var7, var9, var19, (SceneNode) var27, null,
                  DummyClass13.anIntArray2017[var10], 0, var24);
                if (var1) {
                  if (~var10 == -1) {
                    if (var11.aBoolean1525) {
                      MouseRecorder.aByteArrayArrayArray1014[var2][var7][var9] = 50;
                      MouseRecorder.aByteArrayArrayArray1014[var2][var7][1 + var9] = 50;
                    }

                    if (var11.aBoolean1542) {
                      DummyClass36.anIntArrayArrayArray2609[var2][var7][var9] = TextureSampler3
                        .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7][var9], 1);
                    }
                  } else if (1 != var10) {
                    if (~var10 != -3) {
                      if (-4 == ~var10) {
                        if (var11.aBoolean1525) {
                          MouseRecorder.aByteArrayArrayArray1014[var2][var7][var9] = 50;
                          MouseRecorder.aByteArrayArrayArray1014[var2][1 + var7][var9] = 50;
                        }

                        if (var11.aBoolean1542) {
                          DummyClass36.anIntArrayArrayArray2609[var2][var7][var9] = TextureSampler3
                            .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7][var9], 2);
                        }
                      }
                    } else {
                      if (var11.aBoolean1525) {
                        MouseRecorder.aByteArrayArrayArray1014[var2][var7 + 1][var9] = 50;
                        MouseRecorder.aByteArrayArrayArray1014[var2][1 + var7][1 + var9] = 50;
                      }

                      if (var11.aBoolean1542) {
                        DummyClass36.anIntArrayArrayArray2609[var2][var7 - -1][var9] =
                          TextureSampler3
                            .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7 - -1][var9],
                              1);
                      }
                    }
                  } else {
                    if (var11.aBoolean1525) {
                      MouseRecorder.aByteArrayArrayArray1014[var2][var7][var9 - -1] = 50;
                      MouseRecorder.aByteArrayArrayArray1014[var2][var7 - -1][var9 + 1] = 50;
                    }

                    if (var11.aBoolean1542) {
                      DummyClass36.anIntArrayArrayArray2609[var2][var7][1 + var9] = TextureSampler3
                        .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7][1 + var9], 2);
                    }
                  }
                }

                if (0 != var11.anInt1538 && var4 != null) {
                  var4.method1486(var10, 2, var6, var11.aBoolean1486, var9, var7);
                }

                if (~var11.anInt1528 != -17) {
                  StillGraphic.method1956(var2, var7, var9, var11.anInt1528);
                }

              } else if (~var6 == -2) {
                if (-1 == var11.anInt1531 && var11.anIntArray1524 == null && !var11.aBoolean1510) {
                  var28 = var11
                    .method1696(var10, var20, var18, 1, var19, var23, var1, null, (byte) -83, var26,
                      var21);
                  if (GlRenderer.useOpenGlRenderer && var26) {
                    DummyClass16.method2051(var28.shadow, var20, var22, var21);
                  }

                  var27 = var28.node;
                } else {
                  var27 = new GameObject(var5, 1, var10, var0, var7, var9, var11.anInt1531,
                    var11.aBoolean1492, null);
                }

                DummyClass14.method2146(var2, var7, var9, var19, (SceneNode) var27, null,
                  DummyClass59.anIntArray675[var10], 0, var24);
                if (var11.aBoolean1525 && var1) {
                  if (0 != var10) {
                    if (-2 != ~var10) {
                      if (-3 == ~var10) {
                        MouseRecorder.aByteArrayArrayArray1014[var2][1 + var7][var9] = 50;
                      } else if (3 == var10) {
                        MouseRecorder.aByteArrayArrayArray1014[var2][var7][var9] = 50;
                      }
                    } else {
                      MouseRecorder.aByteArrayArrayArray1014[var2][var7 - -1][1 + var9] = 50;
                    }
                  } else {
                    MouseRecorder.aByteArrayArrayArray1014[var2][var7][var9 + 1] = 50;
                  }
                }

                if (-1 != ~var11.anInt1538 && null != var4) {
                  var4.method1486(var10, 2, var6, var11.aBoolean1486, var9, var7);
                }

              } else {
                int var43;
                if (~var6 == -3) {
                  var43 = 1 + var10 & 3;
                  Object var38;
                  Object var42;
                  if (~var11.anInt1531 == 0 && var11.anIntArray1524 == null
                    && !var11.aBoolean1510) {
                    SceneShadowMap var45 = var11
                      .method1696(var10 + 4, var20, var18, 2, var19, var23, var1, null, (byte) -108,
                        var26, var21);
                    if (GlRenderer.useOpenGlRenderer && var26) {
                      DummyClass16.method2051(var45.shadow, var20, var22, var21);
                    }

                    var42 = var45.node;
                    var45 = var11
                      .method1696(var43, var20, var18, 2, var19, var23, var1, null, (byte) -69,
                        var26, var21);
                    if (GlRenderer.useOpenGlRenderer && var26) {
                      DummyClass16.method2051(var45.shadow, var20, var22, var21);
                    }

                    var38 = var45.node;
                  } else {
                    var42 = new GameObject(var5, 2, 4 + var10, var0, var7, var9, var11.anInt1531,
                      var11.aBoolean1492, null);
                    var38 = new GameObject(var5, 2, var43, var0, var7, var9, var11.anInt1531,
                      var11.aBoolean1492, null);
                  }

                  DummyClass14
                    .method2146(var2, var7, var9, var19, (SceneNode) var42, (SceneNode) var38,
                      DummyClass13.anIntArray2017[var10], DummyClass13.anIntArray2017[var43],
                      var24);
                  if (var11.aBoolean1542 && var1) {
                    if (-1 != ~var10) {
                      if (-2 != ~var10) {
                        if (-3 == ~var10) {
                          DummyClass36.anIntArrayArrayArray2609[var2][1 + var7][var9] =
                            TextureSampler3.method308(
                              DummyClass36.anIntArrayArrayArray2609[var2][1 + var7][var9], 1);
                          DummyClass36.anIntArrayArrayArray2609[var2][var7][var9] = TextureSampler3
                            .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7][var9], 2);
                        } else if (~var10 == -4) {
                          DummyClass36.anIntArrayArrayArray2609[var2][var7][var9] = TextureSampler3
                            .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7][var9], 2);
                          DummyClass36.anIntArrayArrayArray2609[var2][var7][var9] = TextureSampler3
                            .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7][var9], 1);
                        }
                      } else {
                        DummyClass36.anIntArrayArrayArray2609[var2][var7][var9 - -1] =
                          TextureSampler3
                            .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7][var9 - -1],
                              2);
                        DummyClass36.anIntArrayArrayArray2609[var2][var7 - -1][var9] =
                          TextureSampler3
                            .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7 - -1][var9],
                              1);
                      }
                    } else {
                      DummyClass36.anIntArrayArrayArray2609[var2][var7][var9] = TextureSampler3
                        .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7][var9], 1);
                      DummyClass36.anIntArrayArrayArray2609[var2][var7][1 + var9] = TextureSampler3
                        .method308(DummyClass36.anIntArrayArrayArray2609[var2][var7][1 + var9], 2);
                    }
                  }

                  if (var11.anInt1538 != 0 && var4 != null) {
                    var4.method1486(var10, 2, var6, var11.aBoolean1486, var9, var7);
                  }

                  if (~var11.anInt1528 != -17) {
                    StillGraphic.method1956(var2, var7, var9, var11.anInt1528);
                  }

                } else if (var6 == 3) {
                  if (~var11.anInt1531 == 0 && null == var11.anIntArray1524
                    && !var11.aBoolean1510) {
                    var28 = var11
                      .method1696(var10, var20, var18, 3, var19, var23, var1, null, (byte) -54,
                        var26, var21);
                    if (GlRenderer.useOpenGlRenderer && var26) {
                      DummyClass16.method2051(var28.shadow, var20, var22, var21);
                    }

                    var27 = var28.node;
                  } else {
                    var27 = new GameObject(var5, 3, var10, var0, var7, var9, var11.anInt1531,
                      var11.aBoolean1492, null);
                  }

                  DummyClass14.method2146(var2, var7, var9, var19, (SceneNode) var27, null,
                    DummyClass59.anIntArray675[var10], 0, var24);
                  if (var11.aBoolean1525 && var1) {
                    if (0 != var10) {
                      if (var10 == 1) {
                        MouseRecorder.aByteArrayArrayArray1014[var2][1 + var7][var9 + 1] = 50;
                      } else if (var10 != 2) {
                        if (~var10 == -4) {
                          MouseRecorder.aByteArrayArrayArray1014[var2][var7][var9] = 50;
                        }
                      } else {
                        MouseRecorder.aByteArrayArrayArray1014[var2][1 + var7][var9] = 50;
                      }
                    } else {
                      MouseRecorder.aByteArrayArrayArray1014[var2][var7][var9 + 1] = 50;
                    }
                  }

                  if (0 != var11.anInt1538 && var4 != null) {
                    var4.method1486(var10, 2, var6, var11.aBoolean1486, var9, var7);
                  }

                } else if (~var6 != -10) {
                  if (4 != var6) {
                    Object var39;
                    SceneShadowMap var47;
                    long var44;
                    if (~var6 != -6) {
                      if (-7 != ~var6) {
                        if (7 != var6) {
                          if (var6 == 8) {
                            var43 = 8;
                            var44 = SomethingAudio.method2174(var2, var7, var9);
                            if (-1L != ~var44) {
                              var43 = DummyClass11
                                .method2207(4, Integer.MAX_VALUE & (int) (var44 >>> 32)).anInt1528
                                / 2;
                            }

                            int var32 = var10 + 2 & 3;
                            Object var46;
                            if (-1 == var11.anInt1531 && null == var11.anIntArray1524
                              && !var11.aBoolean1510) {
                              int var34 = 8 * DummyClass4.anIntArray3007[var10];
                              int var33 = AbstractTextureSampler.anIntArray2386[var10] * 8;
                              SceneShadowMap var35 = var11
                                .method1696(4 + var10, var20, var18, 4, var19, var23, var1, null,
                                  (byte) -25, var26, var21);
                              if (GlRenderer.useOpenGlRenderer && var26) {
                                DummyClass16
                                  .method2051(var35.shadow, var20 + -var33, var22, -var34 + var21);
                              }

                              var39 = var35.node;
                              var35 = var11
                                .method1696(var32 - -4, var20, var18, 4, var19, var23, var1, null,
                                  (byte) -101, var26, var21);
                              if (GlRenderer.useOpenGlRenderer && var26) {
                                DummyClass16
                                  .method2051(var35.shadow, var20 - var33, var22, -var34 + var21);
                              }

                              var46 = var35.node;
                            } else {
                              var39 = new GameObject(var5, 4, 4 + var10, var0, var7, var9,
                                var11.anInt1531, var11.aBoolean1492, null);
                              var46 = new GameObject(var5, 4, var32 + 4, var0, var7, var9,
                                var11.anInt1531, var11.aBoolean1492, null);
                            }

                            ByteArrayNode.method577(var2, var7, var9, var19, (SceneNode) var39,
                              (SceneNode) var46, 256, var10,
                              var43 * AbstractTextureSampler.anIntArray2386[var10],
                              DummyClass4.anIntArray3007[var10] * var43, var24);
                          }
                        } else {
                          int var40 = 3 & var10 - -2;
                          if (~var11.anInt1531 == 0 && var11.anIntArray1524 == null
                            && !var11.aBoolean1510) {
                            SceneShadowMap var41 = var11
                              .method1696(var40 - -4, var20, var18, 4, var19, var23, var1, null,
                                (byte) -39, var26, var21);
                            if (GlRenderer.useOpenGlRenderer && var26) {
                              DummyClass16.method2051(var41.shadow, var20, var22, var21);
                            }

                            var27 = var41.node;
                          } else {
                            var27 =
                              new GameObject(var5, 4, var40 + 4, var0, var7, var9, var11.anInt1531,
                                var11.aBoolean1492, null);
                          }

                          ByteArrayNode
                            .method577(var2, var7, var9, var19, (SceneNode) var27, null, 256, var40,
                              0, 0, var24);
                        }
                      } else {
                        var43 = 8;
                        var44 = SomethingAudio.method2174(var2, var7, var9);
                        if (-1L != ~var44) {
                          var43 = DummyClass11
                            .method2207(4, Integer.MAX_VALUE & (int) (var44 >>> 32)).anInt1528 / 2;
                        }

                        if (var11.anInt1531 == -1 && var11.anIntArray1524 == null
                          && !var11.aBoolean1510) {
                          var47 = var11
                            .method1696(var10 + 4, var20, var18, 4, var19, var23, var1, null,
                              (byte) -65, var26, var21);
                          if (GlRenderer.useOpenGlRenderer && var26) {
                            DummyClass16.method2051(var47.shadow,
                              -(8 * AbstractTextureSampler.anIntArray2386[var10]) + var20, var22,
                              -(8 * DummyClass4.anIntArray3007[var10]) + var21);
                          }

                          var39 = var47.node;
                        } else {
                          var39 =
                            new GameObject(var5, 4, 4 + var10, var0, var7, var9, var11.anInt1531,
                              var11.aBoolean1492, null);
                        }

                        ByteArrayNode
                          .method577(var2, var7, var9, var19, (SceneNode) var39, null, 256, var10,
                            var43 * AbstractTextureSampler.anIntArray2386[var10],
                            var43 * DummyClass4.anIntArray3007[var10], var24);
                      }
                    } else {
                      var43 = 16;
                      var44 = SomethingAudio.method2174(var2, var7, var9);
                      if (~var44 != -1L) {
                        var43 = DummyClass11
                          .method2207(4, Integer.MAX_VALUE & (int) (var44 >>> 32)).anInt1528;
                      }

                      if (0 == ~var11.anInt1531 && null == var11.anIntArray1524
                        && !var11.aBoolean1510) {
                        var47 = var11
                          .method1696(var10, var20, var18, 4, var19, var23, var1, null, (byte) -125,
                            var26, var21);
                        if (GlRenderer.useOpenGlRenderer && var26) {
                          DummyClass16.method2051(var47.shadow,
                            var20 + -(RenderAnimation.anIntArray356[var10] * 8), var22,
                            -(AudioStreamEncoder3.anIntArray3491[var10] * 8) + var21);
                        }

                        var39 = var47.node;
                      } else {
                        var39 = new GameObject(var5, 4, var10, var0, var7, var9, var11.anInt1531,
                          var11.aBoolean1492, null);
                      }

                      ByteArrayNode.method577(var2, var7, var9, var19, (SceneNode) var39, null,
                        DummyClass13.anIntArray2017[var10], 0,
                        var43 * RenderAnimation.anIntArray356[var10],
                        AudioStreamEncoder3.anIntArray3491[var10] * var43, var24);
                    }
                  } else {
                    if (var11.anInt1531 == -1 && null == var11.anIntArray1524
                      && !var11.aBoolean1510) {
                      var28 = var11
                        .method1696(var10, var20, var18, 4, var19, var23, var1, null, (byte) -103,
                          var26, var21);
                      if (GlRenderer.useOpenGlRenderer && var26) {
                        DummyClass16.method2051(var28.shadow, var20, var22, var21);
                      }

                      var27 = var28.node;
                    } else {
                      var27 = new GameObject(var5, 4, var10, var0, var7, var9, var11.anInt1531,
                        var11.aBoolean1492, null);
                    }

                    ByteArrayNode.method577(var2, var7, var9, var19, (SceneNode) var27, null,
                      DummyClass13.anIntArray2017[var10], 0, 0, 0, var24);
                  }
                } else {
                  if (~var11.anInt1531 == 0 && var11.anIntArray1524 == null
                    && !var11.aBoolean1510) {
                    var28 = var11
                      .method1696(var10, var20, var18, var6, var19, var23, var1, null, (byte) -30,
                        var26, var21);
                    if (GlRenderer.useOpenGlRenderer && var26) {
                      DummyClass16.method2051(var28.shadow, var20, var22, var21);
                    }

                    var27 = var28.node;
                  } else {
                    var27 = new GameObject(var5, var6, var10, var0, var7, var9, var11.anInt1531,
                      var11.aBoolean1492, null);
                  }

                  EnumStringFetcher
                    .method835(var2, var7, var9, var19, 1, 1, (SceneNode) var27, 0, var24);
                  if (-1 != ~var11.anInt1538 && var4 != null) {
                    var4.method1489(var7, var11.aBoolean1486, (byte) 127, var9, var12, var13);
                  }

                  if (~var11.anInt1528 != -17) {
                    StillGraphic.method1956(var2, var7, var9, var11.anInt1528);
                  }

                }
              }
            } else {
              if (~var11.anInt1531 == 0 && var11.anIntArray1524 == null && !var11.aBoolean1510) {
                var28 = var11
                  .method1696(var6 == 11 ? 4 + var10 : var10, var20, var18, 10, var19, var23, var1,
                    null, (byte) -26, var26, var21);
                if (GlRenderer.useOpenGlRenderer && var26) {
                  DummyClass16.method2051(var28.shadow, var20, var22, var21);
                }

                var27 = var28.node;
              } else {
                var27 = new GameObject(var5, 10, 11 == var6 ? 4 - -var10 : var10, var0, var7, var9,
                  var11.anInt1531, var11.aBoolean1492, null);
              }

              if (var27 != null) {
                boolean var37 = EnumStringFetcher
                  .method835(var2, var7, var9, var19, var12, var13, (SceneNode) var27, 0, var24);
                if (var11.aBoolean1525 && var37 && var1) {
                  int var29 = 15;
                  if (var27 instanceof AbstractModel) {
                    var29 = ((AbstractModel) var27).method1888() / 4;
                    if (~var29 < -31) {
                      var29 = 30;
                    }
                  }

                  for (int var30 = 0; var30 <= var12; ++var30) {
                    for (int var31 = 0; var13 >= var31; ++var31) {
                      if (~MouseRecorder.aByteArrayArrayArray1014[var2][var7 + var30][var31 + var9]
                        > ~var29) {
                        MouseRecorder.aByteArrayArrayArray1014[var2][var7 - -var30][var9 - -var31] =
                          (byte) var29;
                      }
                    }
                  }
                }
              }

              if (0 != var11.anInt1538 && null != var4) {
                var4.method1489(var7, var11.aBoolean1486, (byte) 96, var9, var12, var13);
              }

            }
          } else if (Keyboard.aBoolean1905 || ~var11.anInt1529 != -1 || -2 == ~var11.anInt1538
            || var11.aBoolean1483) {
            if (0 == ~var11.anInt1531 && var11.anIntArray1524 == null && !var11.aBoolean1510) {
              var28 = var11
                .method1696(var10, var20, var18, 22, var19, var23, var1, null, (byte) -126, var26,
                  var21);
              if (GlRenderer.useOpenGlRenderer && var26) {
                DummyClass16.method2051(var28.shadow, var20, var22, var21);
              }

              var27 = var28.node;
            } else {
              var27 = new GameObject(var5, 22, var10, var0, var7, var9, var11.anInt1531,
                var11.aBoolean1492, null);
            }

            TextureSampler39
              .method276(var2, var7, var9, var19, (SceneNode) var27, var24, var11.aBoolean1502);
            if (var11.anInt1538 == 1 && null != var4) {
              var4.method1503(var7, var9, var8 + -55);
            }

          }
        }
      }
    } catch (RuntimeException var36) {
      throw AbstractGameWorld.cascadeException(var36,
        "p.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ?
          "{...}" :
          "null") + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10
          + ')');
    }
  }

}
