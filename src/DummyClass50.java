import java.awt.event.ActionEvent;
import java.io.IOException;

final class DummyClass50 {

  static Queue aClass13_1139 = new Queue();
  static GameString aClass94_1140 =
    SpawnedGameObject.createString(" steht bereits auf Ihrer Ignorieren)2Liste(Q");
  static int anInt1141;
  static int[][][] anIntArrayArrayArray1142;
  static GameString aClass94_1143 =
    SpawnedGameObject.createString("Chargement du module texte )2 ");


  static final void writeUUID(Buffer var0, boolean var1) {
    try {
      if (!var1) {
        anIntArrayArrayArray1142 = null;
      }

      byte[] var2 = new byte[24];
      if (null != LinearHashTable.uidFile) {
        try {
          LinearHashTable.uidFile.seek(-41, 0L);
          LinearHashTable.uidFile.method982(false, var2);

          int var3;
          for (var3 = 0; -25 < ~var3 && ~var2[var3] == -1; ++var3) {
          }

          if (-25 >= ~var3) {
            throw new IOException();
          }
        } catch (Exception var5) {
          for (int var4 = 0; 24 > var4; ++var4) {
            var2[var4] = -1;
          }
        }
      }

      var0.write(var2, 0, 24);
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "la.G(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final int method1398(int var0, Player var1) {
    try {
      if (var0 != 0) {
        writeUUID(null, false);
      }

      int var2 = var1.anInt3963;
      RenderAnimation var3 = var1.getRenderAnimationId(false);
      if (~var3.anInt368 == ~var1.anInt2764) {
        var2 = var1.anInt3952;
      } else if (var3.anInt393 != var1.anInt2764 && var1.anInt2764 != var3.anInt386
        && var1.anInt2764 != var3.anInt375 && var3.anInt373 != var1.anInt2764) {
        if (~var1.anInt2764 == ~var3.anInt398 || ~var1.anInt2764 == ~var3.anInt372
          || var1.anInt2764 == var3.anInt379 || ~var1.anInt2764 == ~var3.anInt406) {
          var2 = var1.anInt3966;
        }
      } else {
        var2 = var1.anInt3973;
      }

      return var2;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "la.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method1399(int var0, long var1) {
    try {
      if (var1 != 0L) {
        if (AnimationSomething.anInt3591 < 100) {
          int var3 = -103 / ((var0 - -20) / 41);
          GameString var4 = FileCache.stringFromBase37(-29664, var1).formatName((byte) -50);

          int var5;
          for (var5 = 0; ~AnimationSomething.anInt3591 < ~var5; ++var5) {
            if (MonoChromaticImageCache.aLongArray1574[var5] == var1) {
              GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 0,
                RenderAnimation.concat(new GameString[] {var4, TextureSampler28.aClass94_3311}),
                -1);
              return;
            }
          }

          for (var5 = 0; FileSystem.anInt104 > var5; ++var5) {
            if (~VertexNormal.aLongArray826[var5] == ~var1) {
              GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 0,
                RenderAnimation.concat(new GameString[] {
                  DummyClass35.aClass94_666, var4, OndemandFileRequest.aClass94_4071
                }), -1);
              return;
            }
          }

          if (var4.method1528((byte) -42, TextureCache.localPlayer.name)) {
            GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 0, DummyClass53.aClass94_1335, -1);
          } else {
            ++TextureSampler0.anInt3267;
            MonoChromaticImageCache.aLongArray1574[AnimationSomething.anInt3591] = var1;
            TextureSampler7.aClass94Array3341[AnimationSomething.anInt3591++] =
              FileCache.stringFromBase37(-29664, var1);
            DummyClass31.anInt1472 = TextureSampler23.anInt3213;
            TextureSampler12.secureBuffer.writePacket(34);
            TextureSampler12.secureBuffer.writeLong(var1);
          }
        } else {
          GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 0, BufferObject.aClass94_1884, -1);
        }
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "la.B(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1400(SignLink var0, Object var1) {
    try {

      if (null != var0.eventQueue) {
        for (int var3 = 0; var3 < 50 && null != var0.eventQueue.peekEvent(); ++var3) {
          TextureSampler25.sleep(1L);
        }

        if (var1 != null) {
          var0.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
        }

      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "la.E(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null")
          + ')');
    }
  }

  static final LightIntensity method1401(int var0, int var1) {
    try {
      LightIntensity var2 = (LightIntensity) DummyHashTable.aClass93_1683.get((long) var1);
      if (var2 != null) {
        return var2;
      } else {
        if (var0 != 1001) {
          aClass94_1143 = null;
        }

        byte[] var3 = DummyClass39.aClass153_737.getBytes(31, var1);
        var2 = new LightIntensity();
        if (var3 != null) {
          var2.method1190(2, new Buffer(var3), var1);
        }

        DummyHashTable.aClass93_1683.get((byte) -75, var2, (long) var1);
        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "la.D(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1402(byte var0) {
    try {
      aClass13_1139 = null;
      anIntArrayArrayArray1142 = null;
      aClass94_1143 = null;
      aClass94_1140 = null;
      if (var0 <= 56) {
        aClass94_1140 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "la.F(" + var0 + ')');
    }
  }

  static final WorldMapLabel method1403(int var0, GameString var1, FileUnpacker var2) {
    try {
      int var3 = var2.getFileId(var1);
      if (var3 == -1) {
        return new WorldMapLabel(0);
      } else if (var0 > -38) {
        return null;
      } else {
        int[] var4 = var2.getChildIds((byte) -128, var3);
        WorldMapLabel var5 = new WorldMapLabel(var4.length);

        for (int var6 = 0; ~var6 > ~var5.anInt1720; ++var6) {
          Buffer var7 = new Buffer(var2.getBytes(var3, var4[var6]));
          var5.aClass94Array1721[var6] = var7.readString();
          var5.aByteArray1730[var6] = var7.readByte();
          var5.aShortArray1727[var6] = (short) var7.readUnsignedShort();
          var5.aShortArray1718[var6] = (short) var7.readUnsignedShort();
          var5.anIntArray1725[var6] = var7.readInt();
        }

        return var5;
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "la.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ?
          "{...}" :
          "null") + ')');
    }
  }

}
