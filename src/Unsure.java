final class Unsure {

  static GameString aClass94_1889 = SpawnedGameObject.createString("blinken2:");
  static SomethingLight0[] aClass113Array1895;
  static int anInt1896;
  static int screenUpperX;
  private static GameString aClass94_1899 = SpawnedGameObject.createString("Loading textures )2 ");
  static GameString aClass94_1892 = aClass94_1899;
  int anInt1890;
  int anInt1891;
  int anInt1893;
  int anInt1894;
  int anInt1897;
  int anInt1900;

  public static void method2071(byte var0) {
    try {
      aClass94_1892 = null;
      aClass94_1889 = null;
      aClass113Array1895 = null;
      aClass94_1899 = null;
      if (var0 <= 1) {
        method2075(112, (byte) 44);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ub.G(" + var0 + ')');
    }
  }

  static final void method2072(int var0, int var1, int var2, int var3, int var4, int var5,
                               int var6) {
    try {
      if (DummyClass55.anInt1425 <= var1 && GlTexture2d.anInt3765 >= var3
        && ~DummyClass13.anInt2020 >= ~var2 && var4 <= LightIntensity.anInt902) {
        if (-2 == ~var5) {
          DummyClass49.method1367(var0, var3, var2, (byte) 34, var4, var1);
        } else {
          AbstractIndexedColorSprite.method1665(var6 + -19617, var3, var2, var0, var4, var5, var1);
        }
      } else if (1 != var5) {
        TextureSampler33.method184(var4, var5, var3, var1, 1, var0, var2);
      } else {
        TextureCache.method1617(var0, var1, var4, var3, var2, (byte) 29);
      }

      if (var6 != -2) {
        method2075(89, (byte) -73);
      }

    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "ub.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ')');
    }
  }

  static final void drawSceneTile(SceneGraphTile var0, boolean var1) {
    DummyClass5.aClass61_2990.addLast(var0);

    while (true) {
      SceneGraphTile var2 = (SceneGraphTile) DummyClass5.aClass61_2990.method1220((byte) -3);
      if (var2 == null) {
        return;
      }

      if (var2.aBoolean2225) {
        int var3 = var2.anInt2239;
        int var4 = var2.anInt2231;
        int var5 = var2.anInt2244;
        int var6 = var2.anInt2238;
        SceneGraphTile[][] var7 = SomethingTexture1.sceneGraphTiles[var5];
        float var8 = 0.0F;
        int var9;
        int var10;
        int var11;
        int var12;
        if (GlRenderer.useOpenGlRenderer) {
          if (AbstractObjectNode.othrrHeightMap == AbstractGameWorld.heightMap) {
            var9 = TextureSampler16.anIntArrayArray3115[var3][var4];
            var10 = var9 & 16777215;
            if (var10 != SocketStream.anInt1244) {
              SocketStream.anInt1244 = var10;
              StillGraphicNode.method535((byte) 56, var10);
              GlEnvironment.setFogColor(SomethingScene.method1297((byte) -50));
            }

            var11 = var9 >>> 24 << 3;
            if (var11 != TextureSampler21.anInt3072) {
              TextureSampler21.anInt3072 = var11;
              SomethingWorldMappy.method394(var11, 121);
            }

            var12 =
              DummyClass43.somethingHeightMap[0][var3][var4] + DummyClass43.somethingHeightMap[0][
                var3 + 1][var4] + DummyClass43.somethingHeightMap[0][var3][var4 + 1]
                + DummyClass43.somethingHeightMap[0][var3 + 1][var4 + 1] >> 2;
            SomethingQuickChat.method551(0, -var12, 3);
            var8 = 201.5F;
            GlRenderer.method1832(var8);
          } else {
            var8 = 201.5F - 50.0F * (float) (var6 + 1);
            GlRenderer.method1832(var8);
          }
        }

        int var14;
        int var15;
        int var17;
        int var16;
        int var18;
        SceneGraphTile var21;
        SceneSomething2 var23;
        boolean var22;
        SceneSomething var25;
        SceneGraphTile var35;
        if (var2.aBoolean2222) {
          if (var1) {
            if (var5 > 0) {
              var21 = SomethingTexture1.sceneGraphTiles[var5 - 1][var3][var4];
              if (var21 != null && var21.aBoolean2225) {
                continue;
              }
            }

            if (var3 <= TriChromaticImageCache.cameraTileX && var3 > DummyClass9.viewportLowerX) {
              var21 = var7[var3 - 1][var4];
              if (var21 != null && var21.aBoolean2225 && (var21.aBoolean2222
                || (var2.flags & 1) == 0)) {
                continue;
              }
            }

            if (var3 >= TriChromaticImageCache.cameraTileX && var3 < MapScene.viewportUpperX - 1) {
              var21 = var7[var3 + 1][var4];
              if (var21 != null && var21.aBoolean2225 && (var21.aBoolean2222
                || (var2.flags & 4) == 0)) {
                continue;
              }
            }

            if (var4 <= TextureSampler7.cameraTileZ && var4 > AbstractObjectNode.viewportLowerZ) {
              var21 = var7[var3][var4 - 1];
              if (var21 != null && var21.aBoolean2225 && (var21.aBoolean2222
                || (var2.flags & 8) == 0)) {
                continue;
              }
            }

            if (var4 >= TextureSampler7.cameraTileZ && var4 < SomethingTilek.viewportUpperZ - 1) {
              var21 = var7[var3][var4 + 1];
              if (var21 != null && var21.aBoolean2225 && (var21.aBoolean2222
                || (var2.flags & 2) == 0)) {
                continue;
              }
            }
          } else {
            var1 = true;
          }

          var2.aBoolean2222 = false;
          if (var2.aClass3_Sub2_2235 != null) {
            var21 = var2.aClass3_Sub2_2235;
            if (GlRenderer.useOpenGlRenderer) {
              GlRenderer.method1832(201.5F - 50.0F * (float) (var21.anInt2238 + 1));
            }

            if (var21.aClass126_2240 != null) {
              if (!FileSystem.method846(0, var3, var4)) {
                TextureSampler19.method259(var21.aClass126_2240, 0, DummyClass44.pitchSine,
                  LinearHashTable.pitchCosine, TextureSampler25.yawSine, TextureSampler20.yawCosine,
                  var3, var4, false);
              } else {
                TextureSampler19.method259(var21.aClass126_2240, 0, DummyClass44.pitchSine,
                  LinearHashTable.pitchCosine, TextureSampler25.yawSine, TextureSampler20.yawCosine,
                  var3, var4, true);
              }
            } else if (var21.aClass35_2226 != null) {
              if (!FileSystem.method846(0, var3, var4)) {
                SomethingWorldMappy.method395(var21.aClass35_2226, DummyClass44.pitchSine,
                  LinearHashTable.pitchCosine, TextureSampler25.yawSine, TextureSampler20.yawCosine,
                  var3, var4, false);
              } else {
                SomethingWorldMappy.method395(var21.aClass35_2226, DummyClass44.pitchSine,
                  LinearHashTable.pitchCosine, TextureSampler25.yawSine, TextureSampler20.yawCosine,
                  var3, var4, true);
              }
            }

            var23 = var21.aClass70_2234;
            if (var23 != null) {
              if (GlRenderer.useOpenGlRenderer) {
                if ((var23.anInt1055 & var2.anInt2241) != 0) {
                  DummyClass46.method1263(var23.anInt1055, MilliFrameRegulator.cameraPosX,
                    ClientScriptEnum.cameraY, TextureSampler13.cameraZ, var6, var3, var4);
                } else {
                  DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                    TextureSampler13.cameraZ, var5, var3, var4);
                }
              }

              var23.sceneNode0.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                TextureSampler25.yawSine, TextureSampler20.yawCosine,
                var23.positionX - MilliFrameRegulator.cameraPosX,
                var23.positionY - ClientScriptEnum.cameraY,
                var23.positionZ - TextureSampler13.cameraZ, var23.key, var5, null);
            }

            for (var11 = 0; var11 < var21.anInt2223; ++var11) {
              var25 = var21.sceneGraphNodes[var11];
              if (var25 != null) {
                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                    TextureSampler13.cameraZ, var5, var3, var4);
                }

                var25.sceneNode
                  .draw(var25.anInt496, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                    TextureSampler25.yawSine, TextureSampler20.yawCosine,
                    var25.anInt482 - MilliFrameRegulator.cameraPosX,
                    var25.anInt489 - ClientScriptEnum.cameraY,
                    var25.anInt484 - TextureSampler13.cameraZ, var25.aLong498, var5, null);
              }
            }

            if (GlRenderer.useOpenGlRenderer) {
              GlRenderer.method1832(var8);
            }
          }

          var22 = false;
          if (var2.aClass126_2240 != null) {
            if (!FileSystem.method846(var6, var3, var4)) {
              var22 = true;
              if (var2.aClass126_2240.anInt1664 != 12345678
                || TextureSampler37.aBoolean3261 && var5 <= CollisionMap.anInt1302) {
                TextureSampler19.method259(var2.aClass126_2240, var6, DummyClass44.pitchSine,
                  LinearHashTable.pitchCosine, TextureSampler25.yawSine, TextureSampler20.yawCosine,
                  var3, var4, false);
              }
            } else {
              TextureSampler19.method259(var2.aClass126_2240, var6, DummyClass44.pitchSine,
                LinearHashTable.pitchCosine, TextureSampler25.yawSine, TextureSampler20.yawCosine,
                var3, var4, true);
            }
          } else if (var2.aClass35_2226 != null) {
            if (!FileSystem.method846(var6, var3, var4)) {
              var22 = true;
              SomethingWorldMappy
                .method395(var2.aClass35_2226, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                  TextureSampler25.yawSine, TextureSampler20.yawCosine, var3, var4, false);
            } else {
              SomethingWorldMappy
                .method395(var2.aClass35_2226, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                  TextureSampler25.yawSine, TextureSampler20.yawCosine, var3, var4, true);
            }
          }

          if (var22) {
            SomethingSceneJ var24 = var2.aClass12_2230;
            if (var24 != null && (var24.aLong328 & 2147483648L) != 0L) {
              if (GlRenderer.useOpenGlRenderer && var24.aBoolean329) {
                GlRenderer.method1832(var8 + 50.0F - 1.5F);
              }

              if (GlRenderer.useOpenGlRenderer) {
                DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                  TextureSampler13.cameraZ, var5, var3, var4);
              }

              var24.aClass140_320.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                TextureSampler25.yawSine, TextureSampler20.yawCosine,
                var24.anInt324 - MilliFrameRegulator.cameraPosX,
                var24.anInt326 - ClientScriptEnum.cameraY,
                var24.anInt330 - TextureSampler13.cameraZ, var24.aLong328, var5, null);
              if (GlRenderer.useOpenGlRenderer && var24.aBoolean329) {
                GlRenderer.method1832(var8);
              }
            }
          }

          var10 = 0;
          var11 = 0;
          SceneSomething2 var26 = var2.aClass70_2234;
          SomethingSceneI var13 = var2.aClass19_2233;
          if (var26 != null || var13 != null) {
            if (TriChromaticImageCache.cameraTileX == var3) {
              ++var10;
            } else if (TriChromaticImageCache.cameraTileX < var3) {
              var10 += 2;
            }

            if (TextureSampler7.cameraTileZ == var4) {
              var10 += 3;
            } else if (TextureSampler7.cameraTileZ > var4) {
              var10 += 6;
            }

            var11 = NPC.anIntArray3997[var10];
            var2.anInt2241 = TextureSampler35.anIntArray3321[var10];
          }

          if (var26 != null) {
            if ((var26.anInt1055 & StringNode0.anIntArray2338[var10]) != 0) {
              if (var26.anInt1055 == 16) {
                var2.anInt2227 = 3;
                var2.anInt2229 = IntegerNode.anIntArray2470[var10];
                var2.anInt2232 = 3 - var2.anInt2229;
              } else if (var26.anInt1055 == 32) {
                var2.anInt2227 = 6;
                var2.anInt2229 = GroundItem.anIntArray2933[var10];
                var2.anInt2232 = 6 - var2.anInt2229;
              } else if (var26.anInt1055 == 64) {
                var2.anInt2227 = 12;
                var2.anInt2229 = TextureSampler31.anIntArray3171[var10];
                var2.anInt2232 = 12 - var2.anInt2229;
              } else {
                var2.anInt2227 = 9;
                var2.anInt2229 = TextureSampler18.anIntArray4035[var10];
                var2.anInt2232 = 9 - var2.anInt2229;
              }
            } else {
              var2.anInt2227 = 0;
            }

            if ((var26.anInt1055 & var11) != 0 && !Something3d
              .method2239(var6, var3, var4, var26.anInt1055)) {
              if (GlRenderer.useOpenGlRenderer) {
                DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                  TextureSampler13.cameraZ, var5, var3, var4);
              }

              var26.sceneNode0.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                TextureSampler25.yawSine, TextureSampler20.yawCosine,
                var26.positionX - MilliFrameRegulator.cameraPosX,
                var26.positionY - ClientScriptEnum.cameraY,
                var26.positionZ - TextureSampler13.cameraZ, var26.key, var5, null);
            }

            if ((var26.anInt1059 & var11) != 0 && !Something3d
              .method2239(var6, var3, var4, var26.anInt1059)) {
              if (GlRenderer.useOpenGlRenderer) {
                DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                  TextureSampler13.cameraZ, var5, var3, var4);
              }

              var26.sceneNode1.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                TextureSampler25.yawSine, TextureSampler20.yawCosine,
                var26.positionX - MilliFrameRegulator.cameraPosX,
                var26.positionY - ClientScriptEnum.cameraY,
                var26.positionZ - TextureSampler13.cameraZ, var26.key, var5, null);
            }
          }

          if (var13 != null && !SomethingIndex150
            .method2256(var6, var3, var4, var13.aClass140_429.getMinimumY())) {
            if (GlRenderer.useOpenGlRenderer) {
              GlRenderer.method1832(var8 - 0.5F);
            }

            if ((var13.anInt432 & var11) != 0) {
              if (GlRenderer.useOpenGlRenderer) {
                DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                  TextureSampler13.cameraZ, var5, var3, var4);
              }

              var13.aClass140_429.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                TextureSampler25.yawSine, TextureSampler20.yawCosine,
                var13.anInt424 - MilliFrameRegulator.cameraPosX + var13.anInt430,
                var13.anInt425 - ClientScriptEnum.cameraY,
                var13.anInt427 - TextureSampler13.cameraZ + var13.anInt426, var13.aLong428, var5,
                null);
            } else if (var13.anInt432 == 256) {
              var14 = var13.anInt424 - MilliFrameRegulator.cameraPosX;
              var15 = var13.anInt425 - ClientScriptEnum.cameraY;
              var16 = var13.anInt427 - TextureSampler13.cameraZ;
              var17 = var13.anInt420;
              if (var17 != 1 && var17 != 2) {
                var18 = var14;
              } else {
                var18 = -var14;
              }

              int var19;
              if (var17 != 2 && var17 != 3) {
                var19 = var16;
              } else {
                var19 = -var16;
              }

              if (var19 < var18) {
                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                    TextureSampler13.cameraZ, var5, var3, var4);
                }

                var13.aClass140_429.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                  TextureSampler25.yawSine, TextureSampler20.yawCosine, var14 + var13.anInt430,
                  var15, var16 + var13.anInt426, var13.aLong428, var5, null);
              } else if (var13.aClass140_423 != null) {
                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                    TextureSampler13.cameraZ, var5, var3, var4);
                }

                var13.aClass140_423.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                  TextureSampler25.yawSine, TextureSampler20.yawCosine, var14, var15, var16,
                  var13.aLong428, var5, null);
              }
            }

            if (GlRenderer.useOpenGlRenderer) {
              GlRenderer.method1832(var8);
            }
          }

          if (var22) {
            SomethingSceneJ var30 = var2.aClass12_2230;
            if (var30 != null && (var30.aLong328 & 2147483648L) == 0L) {
              if (GlRenderer.useOpenGlRenderer && var30.aBoolean329) {
                GlRenderer.method1832(var8 + 50.0F - 1.5F);
              }

              if (GlRenderer.useOpenGlRenderer) {
                DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                  TextureSampler13.cameraZ, var5, var3, var4);
              }

              var30.aClass140_320.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                TextureSampler25.yawSine, TextureSampler20.yawCosine,
                var30.anInt324 - MilliFrameRegulator.cameraPosX,
                var30.anInt326 - ClientScriptEnum.cameraY,
                var30.anInt330 - TextureSampler13.cameraZ, var30.aLong328, var5, null);
              if (GlRenderer.useOpenGlRenderer && var30.aBoolean329) {
                GlRenderer.method1832(var8);
              }
            }

            SomethingScene var28 = var2.aClass72_2245;
            if (var28 != null && var28.anInt1077 == 0) {
              if (GlRenderer.useOpenGlRenderer) {
                DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                  TextureSampler13.cameraZ, var5, var3, var4);
              }

              if (var28.aClass140_1067 != null) {
                var28.aClass140_1067.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                  TextureSampler25.yawSine, TextureSampler20.yawCosine,
                  var28.anInt1078 - MilliFrameRegulator.cameraPosX,
                  var28.anInt1068 - ClientScriptEnum.cameraY,
                  var28.anInt1075 - TextureSampler13.cameraZ, var28.aLong1079, var5, null);
              }

              if (var28.aClass140_1069 != null) {
                var28.aClass140_1069.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                  TextureSampler25.yawSine, TextureSampler20.yawCosine,
                  var28.anInt1078 - MilliFrameRegulator.cameraPosX,
                  var28.anInt1068 - ClientScriptEnum.cameraY,
                  var28.anInt1075 - TextureSampler13.cameraZ, var28.aLong1079, var5, null);
              }

              if (var28.aClass140_1073 != null) {
                var28.aClass140_1073.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                  TextureSampler25.yawSine, TextureSampler20.yawCosine,
                  var28.anInt1078 - MilliFrameRegulator.cameraPosX,
                  var28.anInt1068 - ClientScriptEnum.cameraY,
                  var28.anInt1075 - TextureSampler13.cameraZ, var28.aLong1079, var5, null);
              }
            }
          }

          var14 = var2.flags;
          if (var14 != 0) {
            if (var3 < TriChromaticImageCache.cameraTileX && (var14 & 4) != 0) {
              var35 = var7[var3 + 1][var4];
              if (var35 != null && var35.aBoolean2225) {
                DummyClass5.aClass61_2990.addLast(var35);
              }
            }

            if (var4 < TextureSampler7.cameraTileZ && (var14 & 2) != 0) {
              var35 = var7[var3][var4 + 1];
              if (var35 != null && var35.aBoolean2225) {
                DummyClass5.aClass61_2990.addLast(var35);
              }
            }

            if (var3 > TriChromaticImageCache.cameraTileX && (var14 & 1) != 0) {
              var35 = var7[var3 - 1][var4];
              if (var35 != null && var35.aBoolean2225) {
                DummyClass5.aClass61_2990.addLast(var35);
              }
            }

            if (var4 > TextureSampler7.cameraTileZ && (var14 & 8) != 0) {
              var35 = var7[var3][var4 - 1];
              if (var35 != null && var35.aBoolean2225) {
                DummyClass5.aClass61_2990.addLast(var35);
              }
            }
          }
        }

        int var27;
        if (var2.anInt2227 != 0) {
          var22 = true;

          for (var10 = 0; var10 < var2.anInt2223; ++var10) {
            if (var2.sceneGraphNodes[var10].anInt490 != SomethingQuickChat2.anInt3539
              && (var2.anIntArray2237[var10] & var2.anInt2227) == var2.anInt2229) {
              var22 = false;
              break;
            }
          }

          if (var22) {
            var23 = var2.aClass70_2234;
            if (!Something3d.method2239(var6, var3, var4, var23.anInt1055)) {
              if (GlRenderer.useOpenGlRenderer) {
                label736:
                {
                  if ((var23.key & 1032192L) == 16384L) {
                    var11 = var23.positionX - MilliFrameRegulator.cameraPosX;
                    var12 = var23.positionZ - TextureSampler13.cameraZ;
                    var27 = (int) (var23.key >> 20 & 3L);
                    if (var27 == 0) {
                      var11 -= 64;
                      var12 += 64;
                      if (var12 < var11 && var3 > 0 && var4 < TextureSampler17.sceneHeight - 1) {
                        DummyClass46
                          .method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                            TextureSampler13.cameraZ, var5, var3 - 1, var4 + 1);
                        break label736;
                      }
                    } else if (var27 == 1) {
                      var11 += 64;
                      var12 += 64;
                      if (var12 < -var11 && var3 < SocketStream.sceneWidth - 1
                        && var4 < TextureSampler17.sceneHeight - 1) {
                        DummyClass46
                          .method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                            TextureSampler13.cameraZ, var5, var3 + 1, var4 + 1);
                        break label736;
                      }
                    } else if (var27 == 2) {
                      var11 += 64;
                      var12 -= 64;
                      if (var12 > var11 && var3 < SocketStream.sceneWidth - 1 && var4 > 0) {
                        DummyClass46
                          .method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                            TextureSampler13.cameraZ, var5, var3 + 1, var4 - 1);
                        break label736;
                      }
                    } else if (var27 == 3) {
                      var11 -= 64;
                      var12 -= 64;
                      if (var12 > -var11 && var3 > 0 && var4 > 0) {
                        DummyClass46
                          .method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                            TextureSampler13.cameraZ, var5, var3 - 1, var4 - 1);
                        break label736;
                      }
                    }
                  }

                  DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                    TextureSampler13.cameraZ, var5, var3, var4);
                }
              }

              var23.sceneNode0.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                TextureSampler25.yawSine, TextureSampler20.yawCosine,
                var23.positionX - MilliFrameRegulator.cameraPosX,
                var23.positionY - ClientScriptEnum.cameraY,
                var23.positionZ - TextureSampler13.cameraZ, var23.key, var5, null);
            }

            var2.anInt2227 = 0;
          }
        }

        if (var2.aBoolean2236) {
          try {
            var9 = var2.anInt2223;
            var2.aBoolean2236 = false;
            var10 = 0;

            label712:
            for (var11 = 0; var11 < var9; ++var11) {
              var25 = var2.sceneGraphNodes[var11];
              if (var25.anInt490 != SomethingQuickChat2.anInt3539) {
                for (var27 = var25.anInt483; var27 <= var25.anInt495; ++var27) {
                  for (var14 = var25.anInt478; var14 <= var25.anInt481; ++var14) {
                    var35 = var7[var27][var14];
                    if (var35.aBoolean2222) {
                      var2.aBoolean2236 = true;
                      continue label712;
                    }

                    if (var35.anInt2227 != 0) {
                      var16 = 0;
                      if (var27 > var25.anInt483) {
                        ++var16;
                      }

                      if (var27 < var25.anInt495) {
                        var16 += 4;
                      }

                      if (var14 > var25.anInt478) {
                        var16 += 8;
                      }

                      if (var14 < var25.anInt481) {
                        var16 += 2;
                      }

                      if ((var16 & var35.anInt2227) == var2.anInt2232) {
                        var2.aBoolean2236 = true;
                        continue label712;
                      }
                    }
                  }
                }

                FileCacheRequest.aClass25Array4060[var10++] = var25;
                var27 = TriChromaticImageCache.cameraTileX - var25.anInt483;
                var14 = var25.anInt495 - TriChromaticImageCache.cameraTileX;
                if (var14 > var27) {
                  var27 = var14;
                }

                var15 = TextureSampler7.cameraTileZ - var25.anInt478;
                var16 = var25.anInt481 - TextureSampler7.cameraTileZ;
                if (var16 > var15) {
                  var25.anInt487 = var27 + var16;
                } else {
                  var25.anInt487 = var27 + var15;
                }
              }
            }

            while (var10 > 0) {
              var11 = -50;
              var12 = -1;

              for (var27 = 0; var27 < var10; ++var27) {
                SceneSomething var34 = FileCacheRequest.aClass25Array4060[var27];
                if (var34.anInt490 != SomethingQuickChat2.anInt3539) {
                  if (var34.anInt487 > var11) {
                    var11 = var34.anInt487;
                    var12 = var27;
                  } else if (var34.anInt487 == var11) {
                    var15 = var34.anInt482 - MilliFrameRegulator.cameraPosX;
                    var16 = var34.anInt484 - TextureSampler13.cameraZ;
                    var17 = FileCacheRequest.aClass25Array4060[var12].anInt482
                      - MilliFrameRegulator.cameraPosX;
                    var18 =
                      FileCacheRequest.aClass25Array4060[var12].anInt484 - TextureSampler13.cameraZ;
                    if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                      var12 = var27;
                    }
                  }
                }
              }

              if (var12 == -1) {
                break;
              }

              SceneSomething var32 = FileCacheRequest.aClass25Array4060[var12];
              var32.anInt490 = SomethingQuickChat2.anInt3539;
              if (!TextureSampler1
                .method222(var6, var32.anInt483, var32.anInt495, var32.anInt478, var32.anInt481,
                  var32.sceneNode.getMinimumY())) {
                if (GlRenderer.useOpenGlRenderer) {
                  if ((var32.aLong498 & 1032192L) == 147456L) {
                    DummyClass46
                      .method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                        TextureSampler13.cameraZ, var5, var3, var4);
                    var14 = var32.anInt482 - MilliFrameRegulator.cameraPosX;
                    var15 = var32.anInt484 - TextureSampler13.cameraZ;
                    var16 = (int) (var32.aLong498 >> 20 & 3L);
                    if (var16 != 1 && var16 != 3) {
                      if (var15 > var14) {
                        DummyClass46.method1272(var5, var3, var4 - 1, var3 + 1, var4);
                      } else {
                        DummyClass46.method1272(var5, var3, var4 + 1, var3 - 1, var4);
                      }
                    } else if (var15 > -var14) {
                      DummyClass46.method1272(var5, var3, var4 - 1, var3 - 1, var4);
                    } else {
                      DummyClass46.method1272(var5, var3, var4 + 1, var3 + 1, var4);
                    }
                  } else {
                    DummyClass46
                      .method1266(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                        TextureSampler13.cameraZ, var5, var32.anInt483, var32.anInt478,
                        var32.anInt495, var32.anInt481);
                  }
                }

                var32.sceneNode
                  .draw(var32.anInt496, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                    TextureSampler25.yawSine, TextureSampler20.yawCosine,
                    var32.anInt482 - MilliFrameRegulator.cameraPosX,
                    var32.anInt489 - ClientScriptEnum.cameraY,
                    var32.anInt484 - TextureSampler13.cameraZ, var32.aLong498, var5, null);
              }

              for (var14 = var32.anInt483; var14 <= var32.anInt495; ++var14) {
                for (var15 = var32.anInt478; var15 <= var32.anInt481; ++var15) {
                  SceneGraphTile var37 = var7[var14][var15];
                  if (var37.anInt2227 != 0) {
                    DummyClass5.aClass61_2990.addLast(var37);
                  } else if ((var14 != var3 || var15 != var4) && var37.aBoolean2225) {
                    DummyClass5.aClass61_2990.addLast(var37);
                  }
                }
              }
            }

            if (var2.aBoolean2236) {
              continue;
            }
          } catch (Exception var20) {
            var2.aBoolean2236 = false;
          }
        }

        if (var2.aBoolean2225 && var2.anInt2227 == 0) {
          if (var3 <= TriChromaticImageCache.cameraTileX && var3 > DummyClass9.viewportLowerX) {
            var21 = var7[var3 - 1][var4];
            if (var21 != null && var21.aBoolean2225) {
              continue;
            }
          }

          if (var3 >= TriChromaticImageCache.cameraTileX && var3 < MapScene.viewportUpperX - 1) {
            var21 = var7[var3 + 1][var4];
            if (var21 != null && var21.aBoolean2225) {
              continue;
            }
          }

          if (var4 <= TextureSampler7.cameraTileZ && var4 > AbstractObjectNode.viewportLowerZ) {
            var21 = var7[var3][var4 - 1];
            if (var21 != null && var21.aBoolean2225) {
              continue;
            }
          }

          if (var4 >= TextureSampler7.cameraTileZ && var4 < SomethingTilek.viewportUpperZ - 1) {
            var21 = var7[var3][var4 + 1];
            if (var21 != null && var21.aBoolean2225) {
              continue;
            }
          }

          var2.aBoolean2225 = false;
          --GameStub.anInt3;
          SomethingScene var29 = var2.aClass72_2245;
          if (var29 != null && var29.anInt1077 != 0) {
            if (GlRenderer.useOpenGlRenderer) {
              DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                TextureSampler13.cameraZ, var5, var3, var4);
            }

            if (var29.aClass140_1067 != null) {
              var29.aClass140_1067.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                TextureSampler25.yawSine, TextureSampler20.yawCosine,
                var29.anInt1078 - MilliFrameRegulator.cameraPosX,
                var29.anInt1068 - ClientScriptEnum.cameraY - var29.anInt1077,
                var29.anInt1075 - TextureSampler13.cameraZ, var29.aLong1079, var5, null);
            }

            if (var29.aClass140_1069 != null) {
              var29.aClass140_1069.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                TextureSampler25.yawSine, TextureSampler20.yawCosine,
                var29.anInt1078 - MilliFrameRegulator.cameraPosX,
                var29.anInt1068 - ClientScriptEnum.cameraY - var29.anInt1077,
                var29.anInt1075 - TextureSampler13.cameraZ, var29.aLong1079, var5, null);
            }

            if (var29.aClass140_1073 != null) {
              var29.aClass140_1073.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                TextureSampler25.yawSine, TextureSampler20.yawCosine,
                var29.anInt1078 - MilliFrameRegulator.cameraPosX,
                var29.anInt1068 - ClientScriptEnum.cameraY - var29.anInt1077,
                var29.anInt1075 - TextureSampler13.cameraZ, var29.aLong1079, var5, null);
            }
          }

          if (var2.anInt2241 != 0) {
            SomethingSceneI var36 = var2.aClass19_2233;
            if (var36 != null && !SomethingIndex150
              .method2256(var6, var3, var4, var36.aClass140_429.getMinimumY())) {
              if ((var36.anInt432 & var2.anInt2241) != 0) {
                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                    TextureSampler13.cameraZ, var5, var3, var4);
                }

                var36.aClass140_429.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                  TextureSampler25.yawSine, TextureSampler20.yawCosine,
                  var36.anInt424 - MilliFrameRegulator.cameraPosX + var36.anInt430,
                  var36.anInt425 - ClientScriptEnum.cameraY,
                  var36.anInt427 - TextureSampler13.cameraZ + var36.anInt426, var36.aLong428, var5,
                  null);
              } else if (var36.anInt432 == 256) {
                var11 = var36.anInt424 - MilliFrameRegulator.cameraPosX;
                var12 = var36.anInt425 - ClientScriptEnum.cameraY;
                var27 = var36.anInt427 - TextureSampler13.cameraZ;
                var14 = var36.anInt420;
                if (var14 != 1 && var14 != 2) {
                  var15 = var11;
                } else {
                  var15 = -var11;
                }

                if (var14 != 2 && var14 != 3) {
                  var16 = var27;
                } else {
                  var16 = -var27;
                }

                if (var16 >= var15) {
                  if (GlRenderer.useOpenGlRenderer) {
                    DummyClass46
                      .method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                        TextureSampler13.cameraZ, var5, var3, var4);
                  }

                  var36.aClass140_429.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                    TextureSampler25.yawSine, TextureSampler20.yawCosine, var11 + var36.anInt430,
                    var12, var27 + var36.anInt426, var36.aLong428, var5, null);
                } else if (var36.aClass140_423 != null) {
                  if (GlRenderer.useOpenGlRenderer) {
                    DummyClass46
                      .method1268(MilliFrameRegulator.cameraPosX, ClientScriptEnum.cameraY,
                        TextureSampler13.cameraZ, var5, var3, var4);
                  }

                  var36.aClass140_423.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                    TextureSampler25.yawSine, TextureSampler20.yawCosine, var11, var12, var27,
                    var36.aLong428, var5, null);
                }
              }
            }

            SceneSomething2 var31 = var2.aClass70_2234;
            if (var31 != null) {
              if ((var31.anInt1059 & var2.anInt2241) != 0 && !Something3d
                .method2239(var6, var3, var4, var31.anInt1059)) {
                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1263(var31.anInt1059, MilliFrameRegulator.cameraPosX,
                    ClientScriptEnum.cameraY, TextureSampler13.cameraZ, var6, var3, var4);
                }

                var31.sceneNode1.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                  TextureSampler25.yawSine, TextureSampler20.yawCosine,
                  var31.positionX - MilliFrameRegulator.cameraPosX,
                  var31.positionY - ClientScriptEnum.cameraY,
                  var31.positionZ - TextureSampler13.cameraZ, var31.key, var5, null);
              }

              if ((var31.anInt1055 & var2.anInt2241) != 0 && !Something3d
                .method2239(var6, var3, var4, var31.anInt1055)) {
                if (GlRenderer.useOpenGlRenderer) {
                  DummyClass46.method1263(var31.anInt1055, MilliFrameRegulator.cameraPosX,
                    ClientScriptEnum.cameraY, TextureSampler13.cameraZ, var6, var3, var4);
                }

                var31.sceneNode0.draw(0, DummyClass44.pitchSine, LinearHashTable.pitchCosine,
                  TextureSampler25.yawSine, TextureSampler20.yawCosine,
                  var31.positionX - MilliFrameRegulator.cameraPosX,
                  var31.positionY - ClientScriptEnum.cameraY,
                  var31.positionZ - TextureSampler13.cameraZ, var31.key, var5, null);
              }
            }
          }

          SceneGraphTile var33;
          if (var5 < AnimationFrame.anInt2456 - 1) {
            var33 = SomethingTexture1.sceneGraphTiles[var5 + 1][var3][var4];
            if (var33 != null && var33.aBoolean2225) {
              DummyClass5.aClass61_2990.addLast(var33);
            }
          }

          if (var3 < TriChromaticImageCache.cameraTileX) {
            var33 = var7[var3 + 1][var4];
            if (var33 != null && var33.aBoolean2225) {
              DummyClass5.aClass61_2990.addLast(var33);
            }
          }

          if (var4 < TextureSampler7.cameraTileZ) {
            var33 = var7[var3][var4 + 1];
            if (var33 != null && var33.aBoolean2225) {
              DummyClass5.aClass61_2990.addLast(var33);
            }
          }

          if (var3 > TriChromaticImageCache.cameraTileX) {
            var33 = var7[var3 - 1][var4];
            if (var33 != null && var33.aBoolean2225) {
              DummyClass5.aClass61_2990.addLast(var33);
            }
          }

          if (var4 > TextureSampler7.cameraTileZ) {
            var33 = var7[var3][var4 - 1];
            if (var33 != null && var33.aBoolean2225) {
              DummyClass5.aClass61_2990.addLast(var33);
            }
          }
        }
      }
    }
  }

  static final void method2074(int var0, int var1, int var2, int var3, int var4, int var5,
                               int var6) {
    try {
      Widget var7 = AbstractDirectColorSprite.method638((byte) -19, var0, var1);
      if (null != var7 && null != var7.anObjectArray203) {
        ClientScriptCall var8 = new ClientScriptCall();
        var8.aClass11_2449 = var7;
        var8.arguments = var7.anObjectArray203;
        Light.executeScript(var8);
      }

      Widget.anInt278 = var1;
      LinearHashTable.anInt1038 = var3;
      if (var5 < -110) {
        ScriptState.anInt872 = var0;
        Something3dRoot.anInt2051 = var2;
        SceneNode.aBoolean1837 = true;
        BufferObject.anInt1887 = var4;
        AnimationSomething.anInt3590 = var6;
        DummyClass29.method909(126, var7);
      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "ub.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ')');
    }
  }

  static final int method2075(int var0, byte var1) {
    try {
      int var2 = 110 / ((var1 - 34) / 61);
      return 255 & var0;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ub.A(" + var0 + ',' + var1 + ')');
    }
  }

  static final PlayerVariable getPlayerVariable(int var0, int var1) {
    try {
      PlayerVariable var2 = (PlayerVariable) SceneShadowMap.aClass93_1772.get((long) var1);
      if (var2 != null) {
        return var2;
      } else {
        byte[] var3 = TextureSampler20.aClass153_3154.getBytes(16, var1);
        if (var0 > -4) {
          return null;
        } else {
          var2 = new PlayerVariable();
          if (null != var3) {
            var2.method970(-20638, new Buffer(var3));
          }

          SceneShadowMap.aClass93_1772.get((byte) -108, var2, (long) var1);
          return var2;
        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ub.D(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method2077(boolean var0) {
    try {
      SomethingPacket151.aClass93_2604.method1524(3);
      if (!var0) {
        aClass94_1899 = null;
      }

      DummyClass32.aClass93_511.method1524(3);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ub.B(" + var0 + ')');
    }
  }

}
