final class TextureSampler23 extends AbstractTextureSampler {

  static boolean aBoolean3207 = false;
  static HashTable aClass130_3208 = new HashTable(8);
  static GameString aClass94_3209 = SpawnedGameObject.createString("showingVideoAd");
  static FileUnpacker worldMaps;
  static GameString aClass94_3211 = SpawnedGameObject.createString(" <col=ffffff>");
  static int[] anIntArray3212;
  static int anInt3213 = 1;


  public TextureSampler23() {
    super(1, false);
  }

  private final void method248(int var1, byte var2, int var3) {
    try {
      if (var2 > 80) {
        int var4 = TextureCache.anIntArray2125[var3];
        int var5 = DummyClass4.anIntArray2999[var1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && -2.356194490192345D >= (double) var6) {
          VertexNormal.anInt828 = var1;
          DummyClass13.anInt2024 = var3;
        } else if ((double) var6 <= -1.5707963267948966D && -2.356194490192345D <= (double) var6) {
          DummyClass13.anInt2024 = var1;
          VertexNormal.anInt828 = var3;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
          DummyClass13.anInt2024 = -var1 + SomethingLight0.anInt1559;
          VertexNormal.anInt828 = var3;
        } else if (0.0F >= var6 && (double) var6 >= -0.7853981633974483D) {
          DummyClass13.anInt2024 = var3;
          VertexNormal.anInt828 = DummyClass55.anInt1427 - var1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
          DummyClass13.anInt2024 = -var3 + SomethingLight0.anInt1559;
          VertexNormal.anInt828 = -var1 + DummyClass55.anInt1427;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
          DummyClass13.anInt2024 = -var1 + SomethingLight0.anInt1559;
          VertexNormal.anInt828 = -var3 + DummyClass55.anInt1427;
        } else if ((double) var6 >= 1.5707963267948966D && 2.356194490192345D >= (double) var6) {
          VertexNormal.anInt828 = -var3 + DummyClass55.anInt1427;
          DummyClass13.anInt2024 = var1;
        } else if (2.356194490192345D <= (double) var6 && (double) var6 <= 3.141592653589793D) {
          DummyClass13.anInt2024 = -var3 + SomethingLight0.anInt1559;
          VertexNormal.anInt828 = var1;
        }

        DummyClass13.anInt2024 &= RenderAnimation.anInt396;
        VertexNormal.anInt828 &= TriChromaticImageBuffer.anInt2487;
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "je.Q(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var3 = -113 % ((30 - var2) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        for (int var5 = 0; var5 < SomethingLight0.anInt1559; ++var5) {
          this.method248(var1, (byte) 105, var5);
          int[] var6 = this.method152(0, VertexNormal.anInt828, 32755);
          var4[var5] = var6[DummyClass13.anInt2024];
        }
      }

      return var4;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7, "je.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (~var1 == -1) {
        this.monoChromatic = ~var2.readUnsignedByte() == -2;
      }

      if (!var3) {
        worldMaps = null;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "je.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final int[][] method166(int var1, int var2) {
    try {
      if (var1 != -1) {
        this.method166(-38, 67);
      }

      int[][] var3 = this.triChromaticImageCache.method1594((byte) -125, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[] var4 = var3[0];
        int[] var6 = var3[2];
        int[] var5 = var3[1];

        for (int var7 = 0; SomethingLight0.anInt1559 > var7; ++var7) {
          this.method248(var2, (byte) 107, var7);
          int[][] var8 = this.method162(VertexNormal.anInt828, 0, (byte) -49);
          var4[var7] = var8[0][DummyClass13.anInt2024];
          var5[var7] = var8[1][DummyClass13.anInt2024];
          var6[var7] = var8[2][DummyClass13.anInt2024];
        }
      }

      return var3;
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9, "je.T(" + var1 + ',' + var2 + ')');
    }
  }

  static final void method246(int var0) {
    try {
      Texture.method724(-109);
      GlTexture2d.method710((byte) 126);
      DummyClass58.method1654(var0 ^ -15455);
      DummyCanvas.method55(22683);
      DummyClass8.method2222((byte) 127);
      GameBuffer.method813(1974);
      SomethingPacket116.method1803((byte) 22);
      DummyClass35.method1025((byte) -93);
      DummyClass59.method1044(-3782);
      Node.method85((byte) -114);
      DirectImageProducer.method2192(-68);
      DummyClass13.method2196(128);
      VertexNormal.method1132(103);
      TextureSampler26.method196(false);
      if (var0 != 8) {
        method246(-120);
      }

      DummyClass27.method1714((byte) -6);
      WidgetUpdate.h((byte) 3);
      DummyClass56.method1650(21);
      Mouse.method2089((byte) 115);
      TextureSampler1.aClass93_3130.method1523((byte) -103);
      HashTableIterator.aClass93_1135.method1523((byte) -122);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "je.O(" + var0 + ')');
    }
  }

  static final void method247(byte var0) {
    try {
      int var1 = 105 % ((var0 - -39) / 41);
      if (StillGraphic.aBoolean2713) {
        AnimationSequence.logoSprite = null;
        StillGraphic.aBoolean2713 = false;
        DummyClass59.titlebackground = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "je.F(" + var0 + ')');
    }
  }

  public static void method249(int var0) {
    try {
      anIntArray3212 = null;
      aClass94_3211 = null;
      aClass130_3208 = null;
      worldMaps = null;
      aClass94_3209 = null;
      if (var0 >= -100) {
        aClass94_3209 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "je.R(" + var0 + ')');
    }
  }

  static final void method250(int var0, FileUnpacker var1) {
    try {
      if (var0 == 2048) {
        FileSystem.aClass153_105 = var1;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "je.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final int method251(int var0) {
    try {
      if (var0 != -1) {
        return 18;
      } else if (DummyClass25.aClass131_1624 == null) {
        return -1;
      } else {
        while (~SceneShadowMap.anInt1780 > ~DummyClass25.aClass131_1624.anInt1720) {
          if (DummyClass25.aClass131_1624.method1794(SceneShadowMap.anInt1780, -20138)) {
            return SceneShadowMap.anInt1780++;
          }

          ++SceneShadowMap.anInt1780;
        }

        return -1;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "je.B(" + var0 + ')');
    }
  }

  static final void method252(int var0) {
    try {
      AreaSoundEffect var1;
      for (
        var1 = (AreaSoundEffect) Node.aClass61_78.getFirst();
        null != var1; var1 = (AreaSoundEffect) Node.aClass61_78.getNext()) {
        if (var1.aBoolean2329) {
          var1.method134(1);
        }
      }

      for (
        var1 = (AreaSoundEffect) SocketStream.aClass61_1242.getFirst();
        null != var1; var1 = (AreaSoundEffect) SocketStream.aClass61_1242.getNext()) {
        if (var1.aBoolean2329) {
          var1.method134(1);
        }
      }

      if (var0 != 8) {
        anInt3213 = 122;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "je.S(" + var0 + ')');
    }
  }

  static final void method253(int var0, int var1, int var2, int var3, int var4) {
    try {
      if (var0 != -22611) {
        method246(83);
      }

      SomethingQuickChat2.anInt3536 = DummyClass30.anInt455 * var3 / var1;
      SpawnedGameObject.anInt2251 = DummyClass58.anInt1460 * var2 / var4;
      ProceduralTexture.anInt1150 = -1;
      TextureSampler13.anInt3362 = -1;
      SomethingInScenePacket202.method117((byte) 87);
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "je.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

}
