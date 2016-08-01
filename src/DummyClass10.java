final class DummyClass10 {

  static GameString aClass94_2082 = SpawnedGameObject.createString(" <col=ffff00>");
  static GameString aClass94_2083 = null;
  static GameString UL_PREFIX = SpawnedGameObject.createString("ul");
  static int anInt2085;
  static GameString aClass94_2086 = SpawnedGameObject.createString("Continuer");
  static int anInt2087 = 0;


  static final void method2261(int var0) {
    try {
      while (true) {
        if (SpotAnimationConfig.gameBuffer.method815(HashTable.packetLength, 32666) >= 27) {
          int var1 = SpotAnimationConfig.gameBuffer.readBits(15);
          if (32767 != var1) {
            boolean var2 = false;
            if (null == TextureSampler5.npcs[var1]) {
              var2 = true;
              TextureSampler5.npcs[var1] = new NPC();
            }

            NPC var3 = TextureSampler5.npcs[var1];
            AudioWorker.anIntArray347[DummyClass6.anInt2046++] = var1;
            var3.anInt2838 = AbstractGameWorld.updateCycle;
            if (null != var3.config && var3.config.method1474(-1)) {
              ByteArrayNode.method574(var3, false);
            }

            int var4 = SpotAnimationConfig.gameBuffer.readBits(1);
            int var5 = DummyClass32.anIntArray510[SpotAnimationConfig.gameBuffer.readBits(3)];
            if (var2) {
              var3.anInt2806 = var3.rotationY = var5;
            }

            int var6 = SpotAnimationConfig.gameBuffer.readBits(1);
            if (~var6 == -2) {
              DummyClass60.anIntArray441[OndemandRequester.anInt997++] = var1;
            }

            int var7 = SpotAnimationConfig.gameBuffer.readBits(5);
            var3.setConfiguration(-1,
              SubNode.getNpcConfiguration(SpotAnimationConfig.gameBuffer.readBits(14)));
            if (15 < var7) {
              var7 -= 32;
            }

            int var8 = SpotAnimationConfig.gameBuffer.readBits(5);
            if (15 < var8) {
              var8 -= 32;
            }

            var3.method1976(var3.config.size, 2);
            var3.renderAnimationId = var3.config.renderAnimationId;
            var3.anInt2779 = var3.config.anInt1274;
            if (~var3.anInt2779 == -1) {
              var3.rotationY = 0;
            }

            var3.setPosition(var3.getSize(), TextureCache.localPlayer.waypointsX[0] + var8,
              var7 + TextureCache.localPlayer.waypointsY[0], ~var4 == -2);
            if (var3.config.method1474(-1)) {
              SceneSomething2.method1286(var3.waypointsY[0], false, null, 0, var3,
                var3.waypointsX[0], GameWorldSomething.currentPlane, null);
            }
            continue;
          }
        }

        SpotAnimationConfig.gameBuffer.method818(false);
        if (var0 <= 0) {
          method2265(-16);
        }

        return;
      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9, "wj.E(" + var0 + ')');
    }
  }

  public static void method2262(byte var0) {
    try {
      aClass94_2083 = null;
      if (var0 > 0) {
        aClass94_2086 = null;
        aClass94_2082 = null;
        UL_PREFIX = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "wj.F(" + var0 + ')');
    }
  }

  static final void method2263(int var0, int var1, int var2, int var3, int var4, int var5,
                               int var6) {
    SomethingLight0 var7 = new SomethingLight0();
    var7.anInt1553 = var1 / 128;
    var7.anInt1547 = var2 / 128;
    var7.anInt1563 = var3 / 128;
    var7.anInt1566 = var4 / 128;
    var7.anInt1554 = var0;
    var7.anInt1562 = var1;
    var7.anInt1545 = var2;
    var7.anInt1560 = var3;
    var7.anInt1550 = var4;
    var7.anInt1544 = var5;
    var7.anInt1548 = var6;
    ByteArrayNode.aClass113Array3610[SpawnedGameObject.anInt2249++] = var7;
  }

  static final void method2264(boolean var0) {
    if (var0) {
      SomethingTexture1.sceneGraphTiles = SomethingIndex150.aClass3_Sub2ArrayArrayArray2065;
      AbstractGameWorld.heightMap = AbstractObjectNode.othrrHeightMap;
      SomethingOtherWorldMap.aClass3_Sub11ArrayArray2542 =
        TextureSampler32.aClass3_Sub11ArrayArray3346;
    } else {
      SomethingTexture1.sceneGraphTiles = OndemandFileRequest.tiles;
      AbstractGameWorld.heightMap = DummyClass43.somethingHeightMap;
      SomethingOtherWorldMap.aClass3_Sub11ArrayArray2542 = GameClient.aClass3_Sub11ArrayArray2199;
    }

    AnimationFrame.anInt2456 = SomethingTexture1.sceneGraphTiles.length;
  }

  static final void method2265(int var0) {
    try {
      ClientScriptCall.aClass93_2442.method1524(3);
      if (var0 != 0) {
        UL_PREFIX = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "wj.B(" + var0 + ')');
    }
  }

  static final void method2266(int var0, int var1, byte var2) {
    try {
      if (BZipDecompressorState.anInt120 != 0 && var1 != -1) {
        SceneSomething2.method1285(SubNode.fileUnpacker11, false, var1, 0, false,
          BZipDecompressorState.anInt120);
        MidiSomething.aBoolean1158 = true;
      }

      if (var2 != -1) {
        UL_PREFIX = null;
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "wj.D(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final void readTileData(int var0, int var1, boolean var2, Buffer var3, int y, int x,
                                 byte var6, int var7, int var8) {
    try {
      int opcode;
      if (-1 >= ~x && ~x > -105 && y >= 0 && -105 < ~y) {
        if (!var2) {
          BZipDecompressorState.tileFlags[var8][x][y] = 0;
        }

        while (true) {
          opcode = var3.readUnsignedByte();
          if (-1 == ~opcode) {
            if (!var2) {
              if (~var8 != -1) {
                AbstractGameWorld.heightMap[var8][x][y] =
                  -240 + AbstractGameWorld.heightMap[var8 - 1][x][y];
              } else {
                AbstractGameWorld.heightMap[0][x][y] =
                  8 * -DummyClass34.perlinNoise(y + 556238 + var1, var0 + x + 932731);
              }
            } else {
              AbstractGameWorld.heightMap[0][x][y] = DummyClass43.somethingHeightMap[0][x][y];
            }
            break;
          }

          if (opcode == 1) {
            int var10 = var3.readUnsignedByte();
            if (!var2) {
              if (~var10 == -2) {
                var10 = 0;
              }

              if (-1 == ~var8) {
                AbstractGameWorld.heightMap[0][x][y] = 8 * -var10;
              } else {
                AbstractGameWorld.heightMap[var8][x][y] =
                  -(var10 * 8) + AbstractGameWorld.heightMap[-1 + var8][x][y];
              }
            } else {
              AbstractGameWorld.heightMap[0][x][y] =
                DummyClass43.somethingHeightMap[0][x][y] - -(var10 * 8);
            }
            break;
          }

          if (49 >= opcode) {
            DummyClass17.tileFloors[var8][x][y] = var3.readByte();
            ObjectCache.tileOrientation[var8][x][y] = (byte) ((-2 + opcode) / 4);
            DummyClass18.aByteArrayArrayArray81[var8][x][y] =
              (byte) ClientScript.bitAnd(-2 + opcode + var7, 3);
          } else if (opcode > 81) {
            TextureSampler36.floorUnderlayIds[var8][x][y] = (byte) (-81 + opcode);
          } else if (!var2) {
            BZipDecompressorState.tileFlags[var8][x][y] = (byte) (opcode - 49);
          }
        }
      } else {
        while (true) {
          opcode = var3.readUnsignedByte();
          if (~opcode == -1) {
            break;
          }

          if (~opcode == -2) {
            var3.readUnsignedByte();
            break;
          }

          if (-50 <= ~opcode) {
            var3.readUnsignedByte();
          }
        }
      }

      if (var6 < 58) {
        anInt2087 = 87;
      }

    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "wj.A(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + y
          + ',' + x + ',' + var6 + ',' + var7 + ',' + var8 + ')');
    }
  }

  static final int method2268(byte var0, int var1, int var2) {
    try {
      Inventory var3 = (Inventory) SceneGraphTile.aClass130_2220.get((long) var1);
      if (var3 != null) {
        if (var2 != -1) {
          int var4 = 0;

          for (int var5 = 0; ~var5 > ~var3.counts.length; ++var5) {
            if (~var2 == ~var3.ids[var5]) {
              var4 += var3.counts[var5];
            }
          }

          if (var0 > -45) {
            aClass94_2086 = null;
          }

          return var4;
        } else {
          return 0;
        }
      } else {
        return 0;
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "wj.H(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final void destroyGame(byte var0) {
    try {
      if (null != SomethingVolume15.gameSocket) {
        SomethingVolume15.gameSocket.destroy();
        SomethingVolume15.gameSocket = null;
      }

      TextureSampler13.method313((byte) 110);
      DummyClass34.method995();

      int var1;
      for (var1 = 0; ~var1 > -5; ++var1) {
        BlockConfig.collisionMaps[var1].method1496(0);
      }

      OndemandRequester.method1250(62, false);
      System.gc();
      Queue.method882(-1, 2);
      MidiSomething.aBoolean1158 = false;
      AbstractFrameRegulator.anInt1691 = -1;
      Something3d.method2241((byte) -77, true);
      StringNode.dynamicScene = false;
      ProceduralTexture.anInt1152 = 0;
      AbstractObjectNode.anInt3606 = 0;
      VariableUpdate.anInt2294 = 0;
      WorldMapLabel.anInt1716 = 0;

      for (var1 = 0; GameException.aClass96Array2114.length > var1; ++var1) {
        GameException.aClass96Array2114[var1] = null;
      }

      DummyClass13.anInt2022 = 0;
      DummyClass6.anInt2046 = 0;
      if (var0 != 46) {
        destroyGame((byte) 43);
      }

      for (var1 = 0; var1 < 2048; ++var1) {
        TextureSampler0.players[var1] = null;
        DummyClass45.configs[var1] = null;
      }

      for (var1 = 0; -32769 < ~var1; ++var1) {
        TextureSampler5.npcs[var1] = null;
      }

      for (var1 = 0; 4 > var1; ++var1) {
        for (int var2 = 0; -105 < ~var2; ++var2) {
          for (int var3 = 0; ~var3 > -105; ++var3) {
            TextureSampler0.groundItems[var1][var2][var3] = null;
          }
        }
      }

      AnimationSomething.method560(-21556);
      SomethingLight0.interfaceCounter = 0;
      TextureSampler6.resetVariables(var0 + -161);
      TextureSampler1.method219(true, 3000);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "wj.C(" + var0 + ')');
    }
  }

}
