final class GroundItemNode extends SubNode {

  static boolean aBoolean3668 = false;
  static byte[][] updatedMapsData;
  static int anInt3670;
  static int anInt3671 = 0;
  static GameString EMPTY_STRING = SpawnedGameObject.createString("");
  static GameString password = EMPTY_STRING;
  static boolean[] aBooleanArray3674 = new boolean[100];
  static GameString username = EMPTY_STRING;
  static int anInt3677;
  GroundItem aClass140_Sub7_3676;


  GroundItemNode(GroundItem var1) {
    try {
      this.aClass140_Sub7_3676 = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "pa.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method626(int var0) {
    try {
      if (null != Buffer.aClass3_Sub28_Sub3_2600) {
        if (GameObject.anInt2737 < 10) {
          if (!TextureSampler23.worldMaps.method2127((byte) -83,
            Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561)) {
            GameObject.anInt2737 = SomethingPacket116.worldMapData.method2116(22813,
              Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561) / 10;
            return;
          }

          TextureSampler12.method169(var0 ^ 22166);
          GameObject.anInt2737 = 10;
        }

        if (~GameObject.anInt2737 == -11) {
          TextureSampler37.anInt3256 = Buffer.aClass3_Sub28_Sub3_2600.anInt3555 >> 6 << 6;
          MapScene.anInt65 = Buffer.aClass3_Sub28_Sub3_2600.anInt3562 >> 6 << 6;
          DummyClass58.anInt1460 =
            (Buffer.aClass3_Sub28_Sub3_2600.anInt3549 >> 6 << 6) - MapScene.anInt65 + 64;
          DummyClass30.anInt455 =
            64 + (Buffer.aClass3_Sub28_Sub3_2600.anInt3559 >> 6 << 6) + -TextureSampler37.anInt3256;
          if (Buffer.aClass3_Sub28_Sub3_2600.anInt3563 != 37) {
            if (~Buffer.aClass3_Sub28_Sub3_2600.anInt3563 != -51) {
              if (75 == Buffer.aClass3_Sub28_Sub3_2600.anInt3563) {
                AbstractGameWorld.aFloat727 = 6.0F;
                NPC.aFloat3979 = 6.0F;
              } else if (-101 != ~Buffer.aClass3_Sub28_Sub3_2600.anInt3563) {
                if (200 == Buffer.aClass3_Sub28_Sub3_2600.anInt3563) {
                  AbstractGameWorld.aFloat727 = 16.0F;
                  NPC.aFloat3979 = 16.0F;
                } else {
                  AbstractGameWorld.aFloat727 = 8.0F;
                  NPC.aFloat3979 = 8.0F;
                }
              } else {
                AbstractGameWorld.aFloat727 = 8.0F;
                NPC.aFloat3979 = 8.0F;
              }
            } else {
              AbstractGameWorld.aFloat727 = 4.0F;
              NPC.aFloat3979 = 4.0F;
            }
          } else {
            AbstractGameWorld.aFloat727 = 3.0F;
            NPC.aFloat3979 = 3.0F;
          }

          int var1 = -TextureSampler37.anInt3256 + (TextureCache.localPlayer.anInt2819 >> 7)
            + WorldMapLabel.anInt1716;
          var1 += -5 + (int) (Math.random() * 10.0D);
          int var2 = -ProceduralTexture.anInt1152 + -(TextureCache.localPlayer.anInt2829 >> 7)
            + MapScene.anInt65 + -1 + DummyClass58.anInt1460;
          var2 += -5 + (int) (Math.random() * 10.0D);
          if (-1 >= ~var1 && ~DummyClass30.anInt455 < ~var1 && 0 <= var2
            && ~var2 > ~DummyClass58.anInt1460) {
            SomethingQuickChat2.anInt3536 = var1;
            SpawnedGameObject.anInt2251 = var2;
          } else {
            SpawnedGameObject.anInt2251 =
              MapScene.anInt65 - Buffer.aClass3_Sub28_Sub3_2600.anInt3556 * 64
                + DummyClass58.anInt1460 + -1;
            SomethingQuickChat2.anInt3536 =
              Buffer.aClass3_Sub28_Sub3_2600.anInt3558 * 64 + -TextureSampler37.anInt3256;
          }

          SomethingInScenePacket202.method117((byte) 87);
          DummyClass51.anIntArray1161 = new int[1 + ScriptState.amountFloors];
          int var4 = DummyClass58.anInt1460 >> 6;
          int var3 = DummyClass30.anInt455 >> 6;
          StringNode0.aByteArrayArrayArray2339 = new byte[var3][var4][];
          int var5 = TextureSampler31.anInt3158 >> 2 << 10;
          HuffmanEncoder.aByteArrayArrayArray640 = new byte[var3][var4][];
          AbstractGameWorld.anIntArrayArrayArray720 = new int[var3][var4][];
          RenderAnimation.aByteArrayArrayArray383 = new byte[var3][var4][];
          AbstractMouseWheel.anIntArrayArrayArray1903 = new int[var3][var4][];
          TextureSampler29.aByteArrayArrayArray3390 = new byte[var3][var4][];
          int var6 = AbstractIndexedColorSprite.anInt1463 >> 1;
          ClientScriptCall.aByteArrayArrayArray2452 = new byte[var3][var4][];
          PlayerVariable.anIntArrayArrayArray558 = new int[var3][var4][];
          HuffmanEncoder.method1014(-120, var6, var5);
          GameObject.anInt2737 = 20;
        } else if (GameObject.anInt2737 != 20) {
          if (var0 != 64) {
            method628(-40, -12, 40, null);
          }

          if (GameObject.anInt2737 == 30) {
            DummyClass7.method2219(new Buffer(
              TextureSampler23.worldMaps.method2123(0, DummyClass18.aClass94_85,
                Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561)), false);
            GameObject.anInt2737 = 40;
            SomethingTexture4.resetFrameRegulator();
          } else if (-41 != ~GameObject.anInt2737) {
            if (GameObject.anInt2737 != 50) {
              if (-61 == ~GameObject.anInt2737) {
                if (!TextureSampler23.worldMaps.method2135(RenderAnimation.concat(new GameString[] {
                  Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561, SomethingAudio.aClass94_2003
                }), -106)) {
                  DummyClass25.aClass131_1624 = new WorldMapLabel(0);
                } else {
                  if (!TextureSampler23.worldMaps.method2127((byte) -83,
                    RenderAnimation.concat(new GameString[] {
                      Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561, SomethingAudio.aClass94_2003
                    }))) {
                    return;
                  }

                  DummyClass25.aClass131_1624 =
                    DummyClass50.method1403(var0 + -120, RenderAnimation.concat(new GameString[] {
                      Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561, SomethingAudio.aClass94_2003
                    }), TextureSampler23.worldMaps);
                }

                GameObject.anInt2737 = 70;
                SomethingTexture4.resetFrameRegulator();
              } else if (GameObject.anInt2737 == 70) {
                Something3d2.aClass33_3019 = new SomethingFont(11, true, InventoryConfig.canvas);
                GameObject.anInt2737 = 73;
                DummyClass5.method2210((byte) -90, true);
                SomethingTexture4.resetFrameRegulator();
              } else if (GameObject.anInt2737 != 73) {
                if (~GameObject.anInt2737 == -77) {
                  DummyClass54.aClass33_1399 = new SomethingFont(14, true, InventoryConfig.canvas);
                  GameObject.anInt2737 = 79;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                } else if (-80 == ~GameObject.anInt2737) {
                  SomethingTexture1.aClass33_2637 =
                    new SomethingFont(17, true, InventoryConfig.canvas);
                  GameObject.anInt2737 = 82;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                } else if (~GameObject.anInt2737 == -83) {
                  DummyClass25.aClass33_1626 = new SomethingFont(19, true, InventoryConfig.canvas);
                  GameObject.anInt2737 = 85;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                } else if (85 == GameObject.anInt2737) {
                  SomethingTexture1.aClass33_2648 =
                    new SomethingFont(22, true, InventoryConfig.canvas);
                  GameObject.anInt2737 = 88;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                } else if (88 != GameObject.anInt2737) {
                  CollisionMap.aClass33_1305 = new SomethingFont(30, true, InventoryConfig.canvas);
                  GameObject.anInt2737 = 100;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                  System.gc();
                } else {
                  DummyClass12.aClass33_2034 = new SomethingFont(26, true, InventoryConfig.canvas);
                  GameObject.anInt2737 = 91;
                  DummyClass5.method2210((byte) -90, true);
                  SomethingTexture4.resetFrameRegulator();
                }
              } else {
                SocketStream.aClass33_1238 = new SomethingFont(12, true, InventoryConfig.canvas);
                GameObject.anInt2737 = 76;
                DummyClass5.method2210((byte) -90, true);
                SomethingTexture4.resetFrameRegulator();
              }
            } else {
              HintMarker.method1587((byte) -83, new Buffer(
                TextureSampler23.worldMaps.method2123(var0 + -64, SomethingSceneI.aClass94_422,
                  Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561)));
              GameObject.anInt2737 = 60;
              DummyClass5.method2210((byte) -90, true);
              SomethingTexture4.resetFrameRegulator();
            }
          } else {
            TextureSampler25.method328(-21774, new Buffer(
              TextureSampler23.worldMaps.method2123(0, TextureSampler1.aClass94_3140,
                Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561)));
            GameObject.anInt2737 = 50;
            SomethingTexture4.resetFrameRegulator();
          }
        } else {
          AudioWorker.method889((byte) 105, new Buffer(
            TextureSampler23.worldMaps.method2123(0, HintMarker.aClass94_1349,
              Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561)));
          GameObject.anInt2737 = 30;
          DummyClass5.method2210((byte) -90, true);
          SomethingTexture4.resetFrameRegulator();
        }
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7, "pa.B(" + var0 + ')');
    }
  }

  public static void method627(byte var0) {
    try {
      if (var0 <= -112) {
        username = null;
        password = null;
        updatedMapsData = null;
        EMPTY_STRING = null;
        aBooleanArray3674 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "pa.A(" + var0 + ')');
    }
  }

  static final void method628(int var0, int var1, int var2, Player var3) {
    try {
      if (var0 != 0) {
        aBooleanArray3674 = null;
      }

      if (~var2 == ~var3.animationId && 0 != ~var2) {
        AnimationSequence var4 = GameClient.method45(var2, (byte) -20);
        int var5 = var4.anInt1845;
        if (1 == var5) {
          var3.anInt2828 = var1;
          var3.anInt2760 = 0;
          var3.anInt2776 = 1;
          var3.anInt2832 = 0;
          var3.anInt2773 = 0;
          SocketStream.method1470(var3.anInt2829, var4, var0 + 183921384, var3.anInt2819,
            TextureCache.localPlayer == var3, var3.anInt2832);
        }

        if (var5 == 2) {
          var3.anInt2773 = 0;
        }
      } else if (-1 == var2 || var3.animationId == -1
        || GameClient.method45(var2, (byte) -20).anInt1857 >= GameClient.method45(var3.animationId,
        (byte) -20).anInt1857) {
        var3.anInt2776 = 1;
        var3.anInt2832 = 0;
        var3.anInt2828 = var1;
        var3.anInt2811 = var3.anInt2816;
        var3.anInt2773 = 0;
        var3.anInt2760 = 0;
        var3.animationId = var2;
        if (var3.animationId != -1) {
          SocketStream.method1470(var3.anInt2829, GameClient.method45(var3.animationId, (byte) -20),
            183921384, var3.anInt2819, var3 == TextureCache.localPlayer, var3.anInt2832);
        }
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "pa.C(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

}
