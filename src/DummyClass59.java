final class DummyClass59 {

  static GameString aClass94_672 = SpawnedGameObject.createString("null");
  static GameString aClass94_673 = SpawnedGameObject.createString(")0");
  static int anInt674;
  static int[] anIntArray675 = new int[] {16, 32, 64, 128};
  static GameString aClass94_676 = null;
  static int anInt677 = 0;
  static int anInt678;
  static FileUnpacker soundEffects;
  static AbstractDirectColorSprite titlebackground;


  static final int method1040(int var0, int var1, byte var2, int var3) {
    try {
      return var2 != 0 ? -127 : (~var3 < ~var1 ? var3 : (var1 > var0 ? var0 : var1));
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "gd.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final void method1041(long var0, int var2) {
    try {
      TextureSampler12.secureBuffer.position = 0;
      TextureSampler12.secureBuffer.writeByte(186);
      TextureSampler12.secureBuffer.writeLong(var0);
      DummyCanvas.anInt23 = 1;
      if (var2 == -28236) {
        DummyClass22.anInt1734 = 0;
        SpotAnimationConfig.anInt548 = 0;
        HashTable.anInt1711 = -3;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "gd.D(" + var0 + ',' + var2 + ')');
    }
  }

  public static void method1042(boolean var0) {
    try {
      soundEffects = null;
      aClass94_676 = null;
      if (!var0) {
        soundEffects = null;
      }

      aClass94_672 = null;
      anIntArray675 = null;
      aClass94_673 = null;
      titlebackground = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gd.A(" + var0 + ')');
    }
  }

  static final SoftwareDirectColorSprite method1043(int var0, FileUnpacker var1, int var2,
                                                    int var3) {
    try {
      if (var2 != -3178) {
        method1044(-55);
      }

      return SomethingTexture4.loadSprites(var1, var0, var3, -30901) ?
        DummyClass26.method1722(-53) :
        null;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "gd.G(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final void method1044(int var0) {
    try {
      if (var0 != -3782) {
        aClass94_672 = null;
      }

      ClientScriptCall.aClass93_2450.method1523((byte) -109);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gd.E(" + var0 + ')');
    }
  }

  static final void method1045(int var0) {
    try {
      if (var0 != -19761) {
        method1046(-110);
      }

      DummyHashTable.aClass93_1683.method1524(3);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gd.B(" + var0 + ')');
    }
  }

  static final void method1046(int var0) {
    try {
      DummyClass5.method2210((byte) -90, false);
      TextureSampler5.anInt3293 = 0;
      boolean var1 = true;

      int var2;
      for (var2 = 0; ~var2 > ~Something3d2.aByteArrayArray3027.length; ++var2) {
        if (0 != ~GameClient.mapFileIds[var2] && null == Something3d2.aByteArrayArray3027[var2]) {
          Something3d2.aByteArrayArray3027[var2] =
            TextureSampler26.maps.getBytes(GameClient.mapFileIds[var2], 0);
          if (Something3d2.aByteArrayArray3027[var2] == null) {
            ++TextureSampler5.anInt3293;
            var1 = false;
          }
        }

        if (-1 != DummyClass55.landscapeFileIds[var2]
          && null == AudioSomethingSomething.landscapesData[var2]) {
          AudioSomethingSomething.landscapesData[var2] = TextureSampler26.maps
            .unpack(DummyClass55.landscapeFileIds[var2],
              AreaSoundEffect.landscapeEncryptionKeys[var2], 37, 0);
          if (null == AudioSomethingSomething.landscapesData[var2]) {
            var1 = false;
            ++TextureSampler5.anInt3293;
          }
        }

        if (GlRenderer.useOpenGlRenderer) {
          if (~TextureSampler17.updatedMapIds[var2] != 0
            && GroundItemNode.updatedMapsData[var2] == null) {
            GroundItemNode.updatedMapsData[var2] =
              TextureSampler26.maps.getBytes(TextureSampler17.updatedMapIds[var2], 0);
            if (null == GroundItemNode.updatedMapsData[var2]) {
              var1 = false;
              ++TextureSampler5.anInt3293;
            }
          }

          if (AnimationSomething.updatedLandscapeIds[var2] != -1
            && null == TextureSampler34.updatedLandscapesData[var2]) {
            TextureSampler34.updatedLandscapesData[var2] =
              TextureSampler26.maps.getBytes(AnimationSomething.updatedLandscapeIds[var2], 0);
            if (null == TextureSampler34.updatedLandscapesData[var2]) {
              ++TextureSampler5.anInt3293;
              var1 = false;
            }
          }
        }

        if (null != TextureSampler5.anIntArray3290
          && null == TextureSampler35.aByteArrayArray3335[var2]
          && TextureSampler5.anIntArray3290[var2] != -1) {
          TextureSampler35.aByteArrayArray3335[var2] = TextureSampler26.maps
            .unpack(TextureSampler5.anIntArray3290[var2],
              AreaSoundEffect.landscapeEncryptionKeys[var2], 92, 0);
          if (TextureSampler35.aByteArrayArray3335[var2] == null) {
            ++TextureSampler5.anInt3293;
            var1 = false;
          }
        }
      }

      if (TextureSampler22.aClass131_3421 == null) {
        if (null != TextureSampler37.aClass3_Sub28_Sub3_3264 && SomethingPacket116.worldMapData
          .method2135(RenderAnimation.concat(new GameString[] {
            TextureSampler37.aClass3_Sub28_Sub3_3264.aClass94_3561, Player.LABELS
          }), -104)) {
          if (!SomethingPacket116.worldMapData
            .method2127((byte) -83, RenderAnimation.concat(new GameString[] {
              TextureSampler37.aClass3_Sub28_Sub3_3264.aClass94_3561, Player.LABELS
            }))) {
            var1 = false;
            ++TextureSampler5.anInt3293;
          } else {
            TextureSampler22.aClass131_3421 =
              DummyClass50.method1403(-41, RenderAnimation.concat(new GameString[] {
                TextureSampler37.aClass3_Sub28_Sub3_3264.aClass94_3561, Player.LABELS
              }), SomethingPacket116.worldMapData);
          }
        } else {
          TextureSampler22.aClass131_3421 = new WorldMapLabel(0);
        }
      }

      if (!var1) {
        DummyClass8.anInt4019 = 1;
      } else {
        DummyClass11.anInt2038 = 0;
        var1 = true;

        int var4;
        int var5;
        for (var2 = 0; ~Something3d2.aByteArrayArray3027.length < ~var2; ++var2) {
          byte[] var3 = AudioSomethingSomething.landscapesData[var2];
          if (null != var3) {
            var5 =
              -ProceduralTexture.anInt1152 + (AudioStreamEncoder3.regionHashes[var2] & 255) * 64;
            var4 = -WorldMapLabel.anInt1716 + (AudioStreamEncoder3.regionHashes[var2] >> 8) * 64;
            if (StringNode.dynamicScene) {
              var5 = 10;
              var4 = 10;
            }

            var1 &= IdentityKit.method944((byte) -97, var4, var5, var3);
          }

          if (GlRenderer.useOpenGlRenderer) {
            var3 = TextureSampler34.updatedLandscapesData[var2];
            if (null != var3) {
              var4 = -WorldMapLabel.anInt1716 + 64 * (AudioStreamEncoder3.regionHashes[var2] >> 8);
              var5 =
                -ProceduralTexture.anInt1152 + 64 * (AudioStreamEncoder3.regionHashes[var2] & 255);
              if (StringNode.dynamicScene) {
                var5 = 10;
                var4 = 10;
              }

              var1 &= IdentityKit.method944((byte) -74, var4, var5, var3);
            }
          }
        }

        if (var0 >= -92) {
          method1042(true);
        }

        if (!var1) {
          DummyClass8.anInt4019 = 2;
        } else {
          if (~DummyClass8.anInt4019 != -1) {
            AbstractTextureSampler.drawLoadingBox(RenderAnimation.concat(
              new GameString[] {TextureSampler39.LOADING_PLEASE_WAIT, StillGraphic.aClass94_2707}),
              true);
          }

          DummyClass43.method1194(-16385);
          TextureSampler13.method313((byte) 58);
          boolean var11 = false;
          int var12;
          if (GlRenderer.useOpenGlRenderer && DummyHashTable.aBoolean1685) {
            for (var12 = 0; ~Something3d2.aByteArrayArray3027.length < ~var12; ++var12) {
              if (TextureSampler34.updatedLandscapesData[var12] != null
                || GroundItemNode.updatedMapsData[var12] != null) {
                var11 = true;
                break;
              }
            }
          }

          // 28x28
          SpawnedGameObject
            .initializeScene(4, 104, 104, GlRenderer.useOpenGlRenderer ? 28 : 25, var11);

          for (var12 = 0; 4 > var12; ++var12) {
            BlockConfig.collisionMaps[var12].method1496(0);
          }

          for (var12 = 0; ~var12 > -5; ++var12) {
            for (var4 = 0; var4 < 104; ++var4) {
              for (var5 = 0; -105 < ~var5; ++var5) {
                BZipDecompressorState.tileFlags[var12][var4][var5] = 0;
              }
            }
          }

          Something3d.method2241((byte) -115, false);
          if (GlRenderer.useOpenGlRenderer) {
            DummyClass16.shadowsSprite.clear();

            for (var12 = 0; var12 < 13; ++var12) {
              for (var4 = 0; var4 < 13; ++var4) {
                DummyClass16.blockShadows[var12][var4].needsUpdate = true;
              }
            }
          }

          if (GlRenderer.useOpenGlRenderer) {
            DummyClass46.method1279();
          }

          if (GlRenderer.useOpenGlRenderer) {
            DummyClass37.method1036(118);
          }

          DummyClass43.method1194(-16385);
          System.gc();
          DummyClass5.method2210((byte) -90, true);
          DummyClass26.method1720(false, 105);
          if (!StringNode.dynamicScene) {
            Cache.method1091(false, -93);
            DummyClass5.method2210((byte) -90, true);
            if (GlRenderer.useOpenGlRenderer) {
              var12 = TextureCache.localPlayer.waypointsX[0] >> 3;
              var4 = TextureCache.localPlayer.waypointsY[0] >> 3;
              TextureSampler1.updateSunPosition(var12, var4);
            }

            TextureSampler26.method198(false, -32624);
            if (null != TextureSampler35.aByteArrayArray3335) {
              TextureSampler37.method272((byte) -124);
            }
          }

          if (StringNode.dynamicScene) {
            GZipDecompressor.method1121(false, (byte) 98);
            DummyClass5.method2210((byte) -90, true);
            if (GlRenderer.useOpenGlRenderer) {
              var12 = TextureCache.localPlayer.waypointsX[0] >> 3;
              var4 = TextureCache.localPlayer.waypointsY[0] >> 3;
              TextureSampler1.updateSunPosition(var12, var4);
            }

            DummyClass8.method2223(false, (byte) -121);
          }

          TextureSampler13.method313((byte) 90);
          DummyClass5.method2210((byte) -90, true);
          DirectImageProducer.method2189(BlockConfig.collisionMaps, false, 66);
          if (GlRenderer.useOpenGlRenderer) {
            DummyClass46.method1270();
          }

          DummyClass5.method2210((byte) -90, true);
          var12 = DummyClass52.anInt1174;
          if (var12 > GameWorldSomething.currentPlane) {
            var12 = GameWorldSomething.currentPlane;
          }

          if (~var12 > ~(GameWorldSomething.currentPlane + -1)) {
            var12 = -1 + GameWorldSomething.currentPlane;
          }

          if (!NPC.method1986(39)) {
            DummyClass52.method1425(DummyClass52.anInt1174);
          } else {
            DummyClass52.method1425(0);
          }

          DummyClass42.method1188(-113);
          if (GlRenderer.useOpenGlRenderer && var11) {
            DummyClass10.method2264(true);
            DummyClass26.method1720(true, 105);
            if (!StringNode.dynamicScene) {
              Cache.method1091(true, -121);
              DummyClass5.method2210((byte) -90, true);
              TextureSampler26.method198(true, -32624);
            }

            if (StringNode.dynamicScene) {
              GZipDecompressor.method1121(true, (byte) 56);
              DummyClass5.method2210((byte) -90, true);
              DummyClass8.method2223(true, (byte) -105);
            }

            TextureSampler13.method313((byte) 102);
            DummyClass5.method2210((byte) -90, true);
            DirectImageProducer.method2189(BlockConfig.collisionMaps, true, 112);
            DummyClass5.method2210((byte) -90, true);
            DummyClass42.method1188(-113);
            DummyClass10.method2264(false);
          }

          if (GlRenderer.useOpenGlRenderer) {
            for (var4 = 0; var4 < 13; ++var4) {
              for (var5 = 0; ~var5 > -14; ++var5) {
                DummyClass16.blockShadows[var4][var5]
                  .update(AbstractGameWorld.heightMap[0], var4 * 8, var5 * 8);
              }
            }
          }

          for (var4 = 0; var4 < 104; ++var4) {
            for (var5 = 0; 104 > var5; ++var5) {
              DummyHashTable.method1760(var5, (byte) 65, var4);
            }
          }

          Buffer.method792(9179409);
          DummyClass43.method1194(-16385);
          TextureSampler2.method318(7759444);
          TextureSampler13.method313((byte) 100);
          TextureSampler25.aBoolean3416 = false;
          if (TextureSampler27.frame != null && null != SomethingVolume15.gameSocket
            && 25 == DummyClass15.state) {
            TextureSampler12.secureBuffer.writePacket(20);
            TextureSampler12.secureBuffer.writeInt(1057001181);
            ++TextureSampler13.anInt3365;
          }

          if (!StringNode.dynamicScene) {
            int var7 = (VariableUpdate.anInt2294 + 6) / 8;
            int var6 = (VariableUpdate.anInt2294 - 6) / 8;
            var4 = (AbstractObjectNode.anInt3606 - 6) / 8;
            var5 = (AbstractObjectNode.anInt3606 - -6) / 8;

            for (int var8 = var4 - 1; ~var8 >= ~(var5 - -1); ++var8) {
              for (int var9 = -1 + var6; ~var9 >= ~(var7 - -1); ++var9) {
                if (~var8 > ~var4 || var8 > var5 || ~var9 > ~var6 || var9 > var7) {
                  TextureSampler26.maps.method2124(-124, RenderAnimation.concat(new GameString[] {
                    GameBuffer.MAP_PREFIX, SomethingScene.toString(var8),
                    TextureSampler31.UNDERSCORE, SomethingScene.toString(var9)
                  }));
                  TextureSampler26.maps.method2124(-123, RenderAnimation.concat(new GameString[] {
                    DummyClass12.LANDSCAPE_PREFIX, SomethingScene.toString(var8),
                    TextureSampler31.UNDERSCORE, SomethingScene.toString(var9)
                  }));
                }
              }
            }
          }

          if (DummyClass15.state == 28) {
            DummyClass26.setState(10, 5);
          } else {
            DummyClass26.setState(30, 5);
            if (SomethingVolume15.gameSocket != null) {
              TextureSampler12.secureBuffer.writePacket(110);
            }
          }

          TriChromaticImageBuffer.method388((byte) 116);
          DummyClass43.method1194(-16385);
          SomethingTexture4.resetFrameRegulator();
        }
      }
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10, "gd.F(" + var0 + ')');
    }
  }

}
