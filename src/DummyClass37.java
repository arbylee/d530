final class DummyClass37 {

  static GameString aClass94_669 = SpawnedGameObject.createString(
    "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");
  static int anInt670 = 0;
  static int anInt671;


  static final void parseSceneRebuild(boolean var1) {
    try {
      StringNode.dynamicScene = var1;
      int var2;
      int count;
      int var4;
      int var5;
      int var6;
      int var7;
      int regionX;
      int regionY;
      int regionHash;
      if (!StringNode.dynamicScene) {
        var2 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        count = (HashTable.packetLength - SpotAnimationConfig.gameBuffer.position) / 16;
        AreaSoundEffect.landscapeEncryptionKeys = new int[count][4];

        for (var4 = 0; count > var4; ++var4) {
          for (var5 = 0; var5 < 4; ++var5) {
            AreaSoundEffect.landscapeEncryptionKeys[var4][var5] =
              SpotAnimationConfig.gameBuffer.readInt((byte) 123);
          }
        }

        var4 = SpotAnimationConfig.gameBuffer.method754(true);
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var6 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        var7 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        AudioStreamEncoder3.regionHashes = new int[count];
        Something3d2.aByteArrayArray3027 = new byte[count][];
        TextureSampler35.aByteArrayArray3335 = null;
        TextureSampler17.updatedMapIds = new int[count];
        AudioSomethingSomething.landscapesData = new byte[count][];
        TextureSampler34.updatedLandscapesData = new byte[count][];
        TextureSampler5.anIntArray3290 = null;
        GameClient.mapFileIds = new int[count];
        GroundItemNode.updatedMapsData = new byte[count][];
        DummyClass55.landscapeFileIds = new int[count];
        AnimationSomething.updatedLandscapeIds = new int[count];
        count = 0;
        boolean var8 = false;
        if ((var5 / 8 == 48 || -50 == ~(var5 / 8)) && var6 / 8 == 48) {
          var8 = true;
        }

        if (var5 / 8 == 48 && var6 / 8 == 148) {
          var8 = true;
        }

        for (regionX = (var5 - 6) / 8; (6 + var5) / 8 >= regionX; ++regionX) {
          for (regionY = (-6 + var6) / 8; ~((6 + var6) / 8) <= ~regionY; ++regionY) {
            regionHash = (regionX << 8) + regionY;
            if (var8 && (regionY == 49 || regionY == 149 || 147 == regionY || -51 == ~regionX
              || -50 == ~regionX && ~regionY == -48)) {
              AudioStreamEncoder3.regionHashes[count] = regionHash;
              GameClient.mapFileIds[count] = -1;
              DummyClass55.landscapeFileIds[count] = -1;
              TextureSampler17.updatedMapIds[count] = -1;
              AnimationSomething.updatedLandscapeIds[count] = -1;
            } else {
              AudioStreamEncoder3.regionHashes[count] = regionHash;
              GameClient.mapFileIds[count] =
                TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                  GameBuffer.MAP_PREFIX, SomethingScene.toString(regionX),
                  TextureSampler31.UNDERSCORE, SomethingScene.toString(regionY)
                }));
              DummyClass55.landscapeFileIds[count] =
                TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                  DummyClass12.LANDSCAPE_PREFIX, SomethingScene.toString(regionX),
                  TextureSampler31.UNDERSCORE, SomethingScene.toString(regionY)
                }));
              TextureSampler17.updatedMapIds[count] =
                TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                  DummyClass53.UM_PREFIX, SomethingScene.toString(regionX),
                  TextureSampler31.UNDERSCORE, SomethingScene.toString(regionY)
                }));
              AnimationSomething.updatedLandscapeIds[count] =
                TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                  DummyClass10.UL_PREFIX, SomethingScene.toString(regionX),
                  TextureSampler31.UNDERSCORE, SomethingScene.toString(regionY)
                }));
            }

            count++;
          }
        }

        FileCacheRequester.rebuildScene(var4, var6, var5, var7, false, var2, true);
      } else {
        var2 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        count = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        var4 = SpotAnimationConfig.gameBuffer.method754(true);
        var5 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        SpotAnimationConfig.gameBuffer.method807((byte) 112);

        int var18;
        for (var6 = 0; ~var6 > -5; ++var6) {
          for (var7 = 0; var7 < 13; ++var7) {
            for (var18 = 0; 13 > var18; ++var18) {
              regionX = SpotAnimationConfig.gameBuffer.readBits(1);
              if (~regionX != -2) {
                GameObjectConfig.anIntArrayArrayArray1497[var6][var7][var18] = -1;
              } else {
                GameObjectConfig.anIntArrayArrayArray1497[var6][var7][var18] =
                  SpotAnimationConfig.gameBuffer.readBits(26);
              }
            }
          }
        }

        SpotAnimationConfig.gameBuffer.method818(false);
        var6 = (-SpotAnimationConfig.gameBuffer.position + HashTable.packetLength) / 16;
        AreaSoundEffect.landscapeEncryptionKeys = new int[var6][4];

        for (var7 = 0; ~var7 > ~var6; ++var7) {
          for (var18 = 0; ~var18 > -5; ++var18) {
            AreaSoundEffect.landscapeEncryptionKeys[var7][var18] =
              SpotAnimationConfig.gameBuffer.readInt((byte) -124);
          }
        }

        var7 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        AnimationSomething.updatedLandscapeIds = new int[var6];
        DummyClass55.landscapeFileIds = new int[var6];
        GameClient.mapFileIds = new int[var6];
        TextureSampler34.updatedLandscapesData = new byte[var6][];
        TextureSampler5.anIntArray3290 = null;
        TextureSampler17.updatedMapIds = new int[var6];
        AudioSomethingSomething.landscapesData = new byte[var6][];
        Something3d2.aByteArrayArray3027 = new byte[var6][];
        AudioStreamEncoder3.regionHashes = new int[var6];
        TextureSampler35.aByteArrayArray3335 = null;
        GroundItemNode.updatedMapsData = new byte[var6][];
        var6 = 0;

        for (var18 = 0; -5 < ~var18; ++var18) {
          for (regionX = 0; regionX < 13; ++regionX) {
            for (regionY = 0; ~regionY > -14; ++regionY) {
              regionHash = GameObjectConfig.anIntArrayArrayArray1497[var18][regionX][regionY];
              if (0 != ~regionHash) {
                int var12 = regionHash >> 14 & 1023;
                int var13 = (regionHash & 16378) >> 3;
                int var14 = var13 / 8 + (var12 / 8 << 8);

                int var15;
                for (var15 = 0; ~var15 > ~var6; ++var15) {
                  if (~var14 == ~AudioStreamEncoder3.regionHashes[var15]) {
                    var14 = -1;
                    break;
                  }
                }

                if (var14 != -1) {
                  AudioStreamEncoder3.regionHashes[var6] = var14;
                  int var16 = var14 & 255;
                  var15 = ('\uff6c' & var14) >> 8;
                  GameClient.mapFileIds[var6] =
                    TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                      GameBuffer.MAP_PREFIX, SomethingScene.toString(var15),
                      TextureSampler31.UNDERSCORE, SomethingScene.toString(var16)
                    }));
                  DummyClass55.landscapeFileIds[var6] =
                    TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                      DummyClass12.LANDSCAPE_PREFIX, SomethingScene.toString(var15),
                      TextureSampler31.UNDERSCORE, SomethingScene.toString(var16)
                    }));
                  TextureSampler17.updatedMapIds[var6] =
                    TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                      DummyClass53.UM_PREFIX, SomethingScene.toString(var15),
                      TextureSampler31.UNDERSCORE, SomethingScene.toString(var16)
                    }));
                  AnimationSomething.updatedLandscapeIds[var6] =
                    TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                      DummyClass10.UL_PREFIX, SomethingScene.toString(var15),
                      TextureSampler31.UNDERSCORE, SomethingScene.toString(var16)
                    }));
                  ++var6;
                }
              }
            }
          }
        }

        FileCacheRequester.rebuildScene(var4, var7, count, var5, false, var2, true);
      }

    } catch (RuntimeException var17) {
      throw AbstractGameWorld.cascadeException(var17, "g.F(" + var1 + ')');
    }
  }

  public static void method1034(int var0) {
    try {
      if (var0 != 8642) {
        aClass94_669 = null;
      }

      aClass94_669 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "g.B(" + var0 + ')');
    }
  }

  static final void method1035(byte var0) {
    try {
      GroundItem.anIntArray2931 = null;
      Buffer.anIntArray2591 = null;
      if (var0 <= 103) {
        method1037(46, 44, 46);
      }

      TextureSampler26.anIntArray3076 = null;
      DummyClass5.aByteArrayArray2987 = null;
      Something3dRoot.anIntArray2048 = null;
      TextureSampler38.anIntArray3446 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "g.E(" + var0 + ')');
    }
  }

  static final void method1036(int var0) {
    try {
      BlockConfig var1 = new BlockConfig();
      if (var0 <= 101) {
        method1039(22, null);
      }

      for (int var2 = 0; -14 < ~var2; ++var2) {
        for (int var3 = 0; -14 < ~var3; ++var3) {
          DummyClass27.blockConfigs[var2][var3] = var1;
        }
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "g.D(" + var0 + ')');
    }
  }

  static final SomethingSceneI method1037(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      SomethingSceneI var4 = var3.aClass19_2233;
      var3.aClass19_2233 = null;
      return var4;
    }
  }

  static final void parseEntityUpdate(byte var0) {
    try {
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if (~GameString.packetId == -196) {
        var1 = SpotAnimationConfig.gameBuffer.method786(true);
        var3 = var1 & 3;
        var2 = var1 >> 2;
        var4 = AbstractSomethingTexture.OBJECT_TYPES[var2];
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var6 = ((125 & var5) >> 4) + DummyClass45.spawnSceneX;
        var7 = (7 & var5) + DummyClass56.spawnSceneY;
        if (0 <= var6 && var7 >= 0 && ~var6 > -105 && 104 > var7) {
          Queue
            .method881(GameWorldSomething.currentPlane, var7, -101, var3, var6, -1, -1, var4, var2,
              0);
        }

      } else if (~GameString.packetId == -34) {
        var1 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        var2 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var4 = (7 & var2) + DummyClass56.spawnSceneY;
        var3 = ((120 & var2) >> 4) + DummyClass45.spawnSceneX;
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        if (~var3 <= -1 && ~var4 <= -1 && 104 > var3 && var4 < 104) {
          GroundItem var31 = new GroundItem();
          var31.anInt2930 = var5;
          var31.anInt2936 = var1;
          if (TextureSampler0.groundItems[GameWorldSomething.currentPlane][var3][var4] == null) {
            TextureSampler0.groundItems[GameWorldSomething.currentPlane][var3][var4] = new Deque();
          }

          TextureSampler0.groundItems[GameWorldSomething.currentPlane][var3][var4]
            .addLast(new GroundItemNode(var31));
          DummyHashTable.method1760(var4, (byte) 65, var3);
        }

      } else {
        int var8;
        int var10;
        int var11;
        int var13;
        int var28;
        int var35;
        Projectile var36;
        if (-122 == ~GameString.packetId) {
          var1 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
          var2 = 2 * DummyClass45.spawnSceneX + (15 & var1 >> 4);
          var3 = (15 & var1) + 2 * DummyClass56.spawnSceneY;
          var4 = var2 - -SpotAnimationConfig.gameBuffer.readByte();
          var5 = SpotAnimationConfig.gameBuffer.readByte() + var3;
          var6 = SpotAnimationConfig.gameBuffer.method787((byte) 73);
          var7 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
          var8 = SpotAnimationConfig.gameBuffer.readUnsignedByte() * 4;
          var28 = SpotAnimationConfig.gameBuffer.readUnsignedByte() * 4;
          var10 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
          var11 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
          var35 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
          if (-256 == ~var35) {
            var35 = -1;
          }

          var13 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
          if (0 <= var2 && 0 <= var3 && 208 > var2 && 208 > var3 && var4 >= 0 && 0 <= var5
            && var4 < 208 && -209 < ~var5 && var7 != '\uffff') {
            var5 *= 64;
            var4 = 64 * var4;
            var3 = 64 * var3;
            var2 = 64 * var2;
            var36 = new Projectile(var7, GameWorldSomething.currentPlane, var2, var3,
              BufferData.method1736(GameWorldSomething.currentPlane, 1, var2, var3) + -var8,
              AbstractGameWorld.updateCycle + var10, var11 + AbstractGameWorld.updateCycle, var35,
              var13, var6, var28);
            var36.method2024(var5, 1, AbstractGameWorld.updateCycle + var10,
              -var28 + BufferData.method1736(GameWorldSomething.currentPlane, 1, var4, var5), var4);
            TextureSampler13.projectiles.addLast(new ProjectileNode(var36));
          }

        } else if (~GameString.packetId == -18) {
          var1 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
          var2 = DummyClass45.spawnSceneX + (var1 >> 4 & 7);
          var3 = DummyClass56.spawnSceneY - -(var1 & 7);
          var4 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
          var5 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
          var6 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
          if (-1 >= ~var2 && ~var3 <= -1 && ~var2 > -105 && -105 < ~var3) {
            var2 = var2 * 128 - -64;
            var3 = var3 * 128 - -64;
            StillGraphic var32 = new StillGraphic(var4, GameWorldSomething.currentPlane, var2, var3,
              -var5 + BufferData.method1736(GameWorldSomething.currentPlane, 1, var2, var3), var6,
              AbstractGameWorld.updateCycle);
            TextureSampler17.stillGraphics.addLast(new StillGraphicNode(var32));
          }

        } else if (~GameString.packetId == -180) {
          var1 = SpotAnimationConfig.gameBuffer.method751((byte) -111);
          var2 = var1 >> 2;
          var3 = 3 & var1;
          var4 = AbstractSomethingTexture.OBJECT_TYPES[var2];
          var5 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
          var6 = DummyClass45.spawnSceneX - -((var5 & 125) >> 4);
          var7 = (7 & var5) + DummyClass56.spawnSceneY;
          var8 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
          if (~var6 <= -1 && var7 >= 0 && var6 < 104 && ~var7 > -105) {
            Queue.method881(GameWorldSomething.currentPlane, var7, -91, var3, var6, -1, var8, var4,
              var2, 0);
          }

        } else if (~GameString.packetId != -21) {
          int var14;
          if (202 == GameString.packetId) {
            var1 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
            var2 = var1 >> 2;
            var3 = var1 & 3;
            var4 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
            var5 = (var4 >> 4 & 7) + DummyClass45.spawnSceneX;
            var6 = (7 & var4) + DummyClass56.spawnSceneY;
            byte var25 = SpotAnimationConfig.gameBuffer.method789(0);
            byte var30 = SpotAnimationConfig.gameBuffer.method789(0);
            byte var9 = SpotAnimationConfig.gameBuffer.method749(false);
            var10 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
            var11 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
            byte var12 = SpotAnimationConfig.gameBuffer.readByte();
            var13 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
            var14 = SpotAnimationConfig.gameBuffer.method788(-1741292848);
            if (!GlRenderer.useOpenGlRenderer) {
              TextureSampler39
                .method280(var12, var13, var14, var11, var6, var9, var3, var25, var5, var2,
                  -745213428, var30, var10);
            }
          }

          if (-15 == ~GameString.packetId) {
            var1 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
            var3 = DummyClass56.spawnSceneY + (var1 & 7);
            var2 = ((var1 & 119) >> 4) + DummyClass45.spawnSceneX;
            var4 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
            var5 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
            var6 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
            if (0 <= var2 && ~var3 <= -1 && var2 < 104 && ~var3 > -105) {
              Deque var29 =
                TextureSampler0.groundItems[GameWorldSomething.currentPlane][var2][var3];
              if (var29 != null) {
                for (GroundItemNode var34 = (GroundItemNode) var29.getFirst();
                     var34 != null; var34 = (GroundItemNode) var29.getNext()) {
                  GroundItem var33 = var34.aClass140_Sub7_3676;
                  if (~(var4 & 32767) == ~var33.anInt2936 && var5 == var33.anInt2930) {
                    var33.anInt2930 = var6;
                    break;
                  }
                }

                DummyHashTable.method1760(var3, (byte) 65, var2);
              }
            }

          } else if (135 == GameString.packetId) {
            var1 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
            var2 = SpotAnimationConfig.gameBuffer.method786(true);
            var4 = DummyClass56.spawnSceneY + (7 & var2);
            var3 = (7 & var2 >> 4) + DummyClass45.spawnSceneX;
            var5 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
            var6 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
            if (0 <= var3 && ~var4 <= -1 && var3 < 104 && -105 < ~var4
              && WidgetAccess.localPlayerId != var1) {
              GroundItem var27 = new GroundItem();
              var27.anInt2930 = var5;
              var27.anInt2936 = var6;
              if (null
                == TextureSampler0.groundItems[GameWorldSomething.currentPlane][var3][var4]) {
                TextureSampler0.groundItems[GameWorldSomething.currentPlane][var3][var4] =
                  new Deque();
              }

              TextureSampler0.groundItems[GameWorldSomething.currentPlane][var3][var4]
                .addLast(new GroundItemNode(var27));
              DummyHashTable.method1760(var4, (byte) 65, var3);
            }

          } else if (var0 <= -67) {
            if (16 != GameString.packetId) {
              if (GameString.packetId == 104) {
                var1 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
                var3 = 2 * DummyClass56.spawnSceneY + (var1 & 15);
                var2 = 2 * DummyClass45.spawnSceneX - -(var1 >> 4 & 15);
                var4 = SpotAnimationConfig.gameBuffer.readByte() + var2;
                var5 = SpotAnimationConfig.gameBuffer.readByte() + var3;
                var6 = SpotAnimationConfig.gameBuffer.method787((byte) 93);
                var7 = SpotAnimationConfig.gameBuffer.method787((byte) 12);
                var8 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
                var28 = SpotAnimationConfig.gameBuffer.readByte();
                var10 = 4 * SpotAnimationConfig.gameBuffer.readUnsignedByte();
                var11 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
                var35 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
                var13 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
                var14 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
                if (255 == var13) {
                  var13 = -1;
                }

                if (var2 >= 0 && -1 >= ~var3 && 208 > var2 && var3 < 208 && 0 <= var4 && ~var5 <= -1
                  && 208 > var4 && 208 > var5 && var8 != '\uffff') {
                  var4 = 64 * var4;
                  var2 *= 64;
                  var5 *= 64;
                  var3 *= 64;
                  if (~var6 != -1) {
                    int var15;
                    int var17;
                    Object var16;
                    int var18;
                    if (0 <= var6) {
                      var17 = var6 - 1;
                      var18 = 2047 & var17;
                      var15 = 15 & var17 >> 11;
                      var16 = TextureSampler5.npcs[var18];
                    } else {
                      var17 = -1 + -var6;
                      var15 = (31085 & var17) >> 11;
                      var18 = 2047 & var17;
                      if (WidgetAccess.localPlayerId != var18) {
                        var16 = TextureSampler0.players[var18];
                      } else {
                        var16 = TextureCache.localPlayer;
                      }
                    }

                    if (var16 != null) {
                      RenderAnimation var38 = ((Mobile) var16).getRenderAnimationId(false);
                      if (var38.anIntArrayArray359 != null
                        && null != var38.anIntArrayArray359[var15]) {
                        var18 = var38.anIntArrayArray359[var15][0];
                        var28 -= var38.anIntArrayArray359[var15][1];
                        int var19 = var38.anIntArrayArray359[var15][2];
                        int var20 = DummyClass40.SINE_TABLE[((Mobile) var16).rotationY];
                        int var21 = DummyClass40.COSINE_TABLE[((Mobile) var16).rotationY];
                        int var22 = var18 * var21 + var19 * var20 >> 16;
                        var19 = -(var18 * var20) + var21 * var19 >> 16;
                        var3 += var19;
                        var2 += var22;
                      }
                    }
                  }

                  Projectile var37 =
                    new Projectile(var8, GameWorldSomething.currentPlane, var2, var3,
                      -var28 + BufferData
                        .method1736(GameWorldSomething.currentPlane, 1, var2, var3),
                      var11 + AbstractGameWorld.updateCycle, var35 + AbstractGameWorld.updateCycle,
                      var13, var14, var7, var10);
                  var37.method2024(var5, 1, var11 + AbstractGameWorld.updateCycle,
                    -var10 + BufferData.method1736(GameWorldSomething.currentPlane, 1, var4, var5),
                    var4);
                  TextureSampler13.projectiles.addLast(new ProjectileNode(var37));
                }

              } else if (97 == GameString.packetId) {
                var1 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
                var2 = DummyClass45.spawnSceneX + (7 & var1 >> 4);
                var3 = DummyClass56.spawnSceneY + (var1 & 7);
                var4 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
                if (~var4 == -65536) {
                  var4 = -1;
                }

                var5 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
                var6 = (242 & var5) >> 4;
                var8 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
                var7 = 7 & var5;
                if (-1 >= ~var2 && -1 >= ~var3 && var2 < 104 && var3 < 104) {
                  var28 = 1 + var6;
                  if (~TextureCache.localPlayer.waypointsX[0] <= ~(var2 + -var28)
                    && ~(var28 + var2) <= ~TextureCache.localPlayer.waypointsX[0]
                    && TextureCache.localPlayer.waypointsY[0] >= -var28 + var3
                    && TextureCache.localPlayer.waypointsY[0] <= var28 + var3
                    && 0 != DummyClass28.anInt340 && var7 > 0 && 50 > SomethingLight0.anInt1552
                    && ~var4 != 0) {
                    Inventory.anIntArray2550[SomethingLight0.anInt1552] = var4;
                    SomethingIndex150.anIntArray2068[SomethingLight0.anInt1552] = var7;
                    GameString.anIntArray2157[SomethingLight0.anInt1552] = var8;
                    TextureCache.aClass135Array2131[SomethingLight0.anInt1552] = null;
                    TextureSampler26.anIntArray3083[SomethingLight0.anInt1552] =
                      var6 + ((var2 << 16) - -(var3 << 8));
                    ++SomethingLight0.anInt1552;
                  }
                }

              } else if (~GameString.packetId == -241) {
                var1 = SpotAnimationConfig.gameBuffer.method754(true);
                var3 = DummyClass56.spawnSceneY + (var1 & 7);
                var2 = ((113 & var1) >> 4) + DummyClass45.spawnSceneX;
                var4 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
                if (-1 >= ~var2 && var3 >= 0 && 104 > var2 && 104 > var3) {
                  Deque var24 =
                    TextureSampler0.groundItems[GameWorldSomething.currentPlane][var2][var3];
                  if (var24 != null) {
                    for (GroundItemNode var26 = (GroundItemNode) var24.getFirst();
                         var26 != null; var26 = (GroundItemNode) var24.getNext()) {
                      if (var26.aClass140_Sub7_3676.anInt2936 == (var4 & 32767)) {
                        var26.unlinkNode();
                        break;
                      }
                    }

                    if (var24.getFirst() == null) {
                      TextureSampler0.groundItems[GameWorldSomething.currentPlane][var2][var3] =
                        null;
                    }

                    DummyHashTable.method1760(var3, (byte) 65, var2);
                  }
                }

              }
            } else {
              var1 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
              var2 = DummyClass45.spawnSceneX - -(var1 >> 4 & 7);
              var3 = (var1 & 7) + DummyClass56.spawnSceneY;
              var4 = var2 + SpotAnimationConfig.gameBuffer.readByte();
              var5 = SpotAnimationConfig.gameBuffer.readByte() + var3;
              var6 = SpotAnimationConfig.gameBuffer.method787((byte) 67);
              var7 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
              var8 = 4 * SpotAnimationConfig.gameBuffer.readUnsignedByte();
              var28 = SpotAnimationConfig.gameBuffer.readUnsignedByte() * 4;
              var10 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
              var11 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
              var35 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
              var13 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
              if (255 == var35) {
                var35 = -1;
              }

              if (~var2 <= -1 && var3 >= 0 && -105 < ~var2 && 104 > var3 && ~var4 <= -1 && var5 >= 0
                && -105 < ~var4 && 104 > var5 && -65536 != ~var7) {
                var5 = var5 * 128 + 64;
                var3 = 128 * var3 + 64;
                var2 = 128 * var2 + 64;
                var4 = 128 * var4 + 64;
                var36 = new Projectile(var7, GameWorldSomething.currentPlane, var2, var3,
                  BufferData.method1736(GameWorldSomething.currentPlane, 1, var2, var3) + -var8,
                  var10 + AbstractGameWorld.updateCycle, var11 + AbstractGameWorld.updateCycle,
                  var35, var13, var6, var28);
                var36.method2024(var5, 1, AbstractGameWorld.updateCycle + var10,
                  BufferData.method1736(GameWorldSomething.currentPlane, 1, var4, var5) - var28,
                  var4);
                TextureSampler13.projectiles.addLast(new ProjectileNode(var36));
              }

            }
          }
        } else {
          var1 = SpotAnimationConfig.gameBuffer.method754(true);
          var2 = ((var1 & 125) >> 4) + DummyClass45.spawnSceneX;
          var3 = DummyClass56.spawnSceneY + (7 & var1);
          var4 = SpotAnimationConfig.gameBuffer.method754(true);
          var5 = var4 >> 2;
          var6 = 3 & var4;
          var7 = AbstractSomethingTexture.OBJECT_TYPES[var5];
          var8 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
          if ('\uffff' == var8) {
            var8 = -1;
          }

          VertexNormal
            .method1131(GameWorldSomething.currentPlane, 125, var6, var5, var3, var7, var2, var8);
        }
      }
    } catch (RuntimeException var23) {
      throw AbstractGameWorld.cascadeException(var23, "g.G(" + var0 + ')');
    }
  }

  static final void method1039(int var0, FileUnpacker var1) {
    try {
      HintMarker.p11FontFileId = var1.getFileId(StillGraphic.FONT_P11);
      SomethingTexture1.p12FontFileId = var1.getFileId(GameWorldSomething.FONT_P12);
      TextureSampler1.b12FontFileId = var1.getFileId(TextureSampler1.FONT_B12);
      FloorOverlay.anInt2104 = var1.getFileId(FileRequester.aClass94_2959);
      TextureSampler18.anInt4042 = var1.getFileId(TextureSampler2.aClass94_3370);
      GameClient.anInt2195 = var1.getFileId(Something3d.aClass94_3008);
      SubNode.anInt2575 = var1.getFileId(SomethingScene.aClass94_1070);
      if (var0 != 208) {
        anInt670 = 0;
      }

      RenderAnimation.headIconsPrayerFileId = var1.getFileId(DummyClass21.HEAD_ICONS_PRAYER);
      TextureSampler3.hintHeadIconsFileId = var1.getFileId(ScriptState.HINT_HEAD_ICONS);
      MilliFrameRegulator.anInt2689 = var1.getFileId(SomethingLight0.aClass94_1556);
      TextureSampler34.anInt3061 = var1.getFileId(TextureSampler38.aClass94_3452);
      SomethingTexture.anInt2633 = var1.getFileId(TextureSampler31.aClass94_3168);
      DummyClass59.anInt678 = var1.getFileId(SomethingLight0.aClass94_1567);
      SomethingVolume15.anInt2436 = var1.getFileId(Keyboard.aClass94_1913);
      GlTexture2d.anInt3757 = var1.getFileId(SomethingQuickChat.aClass94_3576);
      DummyClass38.floorShadowsFileId = var1.getFileId(StillGraphic.FLOOR_SHADOWS);
      ObjectCache.anInt1325 = var1.getFileId(FloorOverlay.aClass94_2089);
      IntegerNode.anInt2471 = var1.getFileId(EnumStringFetcher.aClass94_2164);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "g.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

}
