abstract class BufferObject {

  static int anInt1881 = 0;
  static GameString aClass94_1882 = SpawnedGameObject.createString("Librairie 3D d-Bmarr-Be");
  static int anInt1883;
  static GameString COOKIE_HOST = SpawnedGameObject.createString("cookiehost");
  static int anInt1886;
  static int anInt1887;
  private static GameString aClass94_1888 =
    SpawnedGameObject.createString("Your ignore list is full)3 Max of 100 users)3");
  static GameString aClass94_1884 = aClass94_1888;

  static final void method2065(byte var0, FileUnpacker var1, FileUnpacker var2) {
    try {
      TextureSampler4.aClass153_3227 = var1;
      if (var0 <= -103) {
        AnimationSequence.aClass153_1852 = var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "u.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  static final void method2067(boolean var0) {
    try {
      if (!var0) {
        for (StillGraphicNode var1 = (StillGraphicNode) TextureSampler17.stillGraphics.getFirst();
             null != var1; var1 = (StillGraphicNode) TextureSampler17.stillGraphics.getNext()) {
          StillGraphic var2 = var1.aClass140_Sub2_3545;
          if (~var2.anInt2717 == ~GameWorldSomething.currentPlane && !var2.aBoolean2718) {
            if (~var2.anInt2703 >= ~AbstractGameWorld.updateCycle) {
              var2.method1955(true, DisplayMode.loopCycle);
              if (!var2.aBoolean2718) {
                DummyClass29.addNodeToSceneGraph(var2.anInt2717, var2.anInt2716, var2.anInt2710,
                  var2.anInt2712, 60, var2, 0, -1L, false);
              } else {
                var1.unlinkNode();
              }
            }
          } else {
            var1.unlinkNode();
          }
        }

      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "u.G(" + var0 + ')');
    }
  }

  static final void method2068(NpcConfiguration var0, int var1, int var2, int var3, int var4) {
    try {
      if (TextureSampler25.amountContextActions < 400) {
        if (var0.anIntArray1292 != null) {
          var0 = var0.method1471((byte) 66);
        }

        if (null != var0) {
          if (var0.aBoolean1270) {
            if (var2 > -83) {
              aClass94_1884 = null;
            }

            GameString var5 = var0.aClass94_1273;
            if (0 != var0.anInt1260) {
              GameString var6 = AbstractImageProducer.gameId != 1 ?
                DummyClass32.aClass94_525 :
                AudioSomethingSomething.aClass94_2526;
              var5 = RenderAnimation.concat(new GameString[] {
                var5, SomethingScene.method1295(var0.anInt1260, (byte) -122,
                TextureCache.localPlayer.combatLevel), SomethingScene.aClass94_1072, var6,
                SomethingScene.toString(var0.anInt1260), AreaSoundEffect.aClass94_2335
              });
            }

            if (-2 == ~Something3d.anInt3012) {
              ScriptState.method1177(DummyClass54.anInt1403, (long) var3, (byte) -125,
                RenderAnimation.concat(new GameString[] {
                  RenderAnimation.aClass94_378, AbstractDirectColorSprite.aClass94_3702, var5
                }), var1, (short) 26, TextureSampler14.aClass94_3388, var4);
              ++GZipDecompressor.anInt816;
            } else if (!SceneNode.aBoolean1837) {
              ++Buffer.anInt2592;
              GameString[] var11 = var0.aClass94Array1259;
              if (DummyClass24.aBoolean1656) {
                var11 = SomethingPacket151.method822(19406, var11);
              }

              int var7;
              if (var11 != null) {
                for (var7 = 4; var7 >= 0; --var7) {
                  if (var11[var7] != null && (AbstractImageProducer.gameId != 0 || !var11[var7]
                    .method1531(TextureSampler36.aClass94_3427))) {
                    ++ItemConfig.anInt763;
                    byte var8 = 0;
                    if (var7 == 0) {
                      var8 = 17;
                    }

                    if (-2 == ~var7) {
                      var8 = 16;
                    }

                    int var9 = -1;
                    if (~var7 == -3) {
                      var8 = 4;
                    }

                    if (var7 == 3) {
                      var8 = 19;
                    }

                    if (var0.anInt1296 == var7) {
                      var9 = var0.anInt1253;
                    }

                    if (~var7 == ~var0.anInt1289) {
                      var9 = var0.anInt1278;
                    }

                    if (~var7 == -5) {
                      var8 = 2;
                    }

                    ScriptState.method1177(var9, (long) var3, (byte) -103,
                      RenderAnimation.concat(new GameString[] {DummyClass22.aClass94_1738, var5}),
                      var1, var8, var11[var7], var4);
                  }
                }
              }

              if (0 == AbstractImageProducer.gameId && var11 != null) {
                for (var7 = 4; var7 >= 0; --var7) {
                  if (null != var11[var7] && var11[var7]
                    .method1531(TextureSampler36.aClass94_3427)) {
                    ++FileCacheRequest.anInt4054;
                    short var14 = 0;
                    if (var0.anInt1260 > TextureCache.localPlayer.combatLevel) {
                      var14 = 2000;
                    }

                    short var13 = 0;
                    if (var7 == 0) {
                      var13 = 17;
                    }

                    if (-2 == ~var7) {
                      var13 = 16;
                    }

                    if (2 == var7) {
                      var13 = 4;
                    }

                    if (3 == var7) {
                      var13 = 19;
                    }

                    if (~var7 == -5) {
                      var13 = 2;
                    }

                    if (0 != var13) {
                      var13 += var14;
                    }

                    ScriptState.method1177(var0.anInt1298, (long) var3, (byte) -128,
                      RenderAnimation.concat(new GameString[] {DummyClass22.aClass94_1738, var5}),
                      var1, var13, var11[var7], var4);
                  }
                }
              }

              ScriptState.method1177(WorldMapLabel.anInt1719, (long) var3, (byte) -73,
                RenderAnimation.concat(new GameString[] {DummyClass22.aClass94_1738, var5}), var1,
                (short) 1007, BlockConfig.aClass94_1180, var4);
            } else {
              Parameter var12 = -1 == LinearHashTable.anInt1038 ?
                null :
                Deque.method1210(64, LinearHashTable.anInt1038);
              if (~(2 & Something3dRoot.anInt2051) != -1 && (var12 == null
                || var0.method1475(LinearHashTable.anInt1038, -26460, var12.anInt3614)
                != var12.anInt3614)) {
                ScriptState.method1177(anInt1887, (long) var3, (byte) -93, RenderAnimation.concat(
                  new GameString[] {
                    DummyClass59.aClass94_676, AbstractDirectColorSprite.aClass94_3702, var5
                  }), var1, (short) 45, Parameter.aClass94_3621, var4);
                ++DummyClass25.anInt1629;
              }
            }

          }
        }
      }
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "u.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ','
          + var4 + ')');
    }
  }

  static final InventoryConfig method2069(int var0, int var1) {
    try {
      if (var1 >= -99) {
        return null;
      } else {
        InventoryConfig var2 =
          (InventoryConfig) GZipDecompressor.aClass47_818.get((long) var0, 1400);
        if (null != var2) {
          return var2;
        } else {
          byte[] var3 = FileSystem.aClass153_105.getBytes(5, var0);
          var2 = new InventoryConfig();
          if (var3 != null) {
            var2.method610(new Buffer(var3), 0);
          }

          GZipDecompressor.aClass47_818.put((long) var0, var2);
          return var2;
        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "u.C(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method2070(byte var0) {
    try {
      aClass94_1884 = null;
      aClass94_1888 = null;
      if (var0 < 0) {
        anInt1881 = -60;
      }

      aClass94_1882 = null;
      COOKIE_HOST = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "u.F(" + var0 + ')');
    }
  }

  abstract byte[] get(int var1);

  abstract void put(int var1, byte[] var2);

}
