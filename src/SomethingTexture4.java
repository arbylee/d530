final class SomethingTexture4 extends AbstractSomethingTexture {

  static GameString aClass94_2662 = SpawnedGameObject.createString("Zugewiesener Speicher)3");
  static int[] anIntArray2663;
  static int[] anIntArray2664;
  static int[] PACKET_LENGTHS = new int[] {
    -1, 0, 8, 0, 2, 0, 0, 0, 0, 12, 0, 1, 0, 3, 7, 0, 15, 6, 0, 0, 4, 7, -2, -1, 2, 0, 2, 8, 0, 0,
    0, 0, -2, 5, 0, 0, 8, 3, 6, 0, 0, 0, -1, 0, -1, 0, 0, 6, -2, 0, 12, 0, 0, 0, -1, -2, 10, 0, 0,
    0, 3, 0, -1, 0, 0, 5, 6, 0, 0, 8, -1, -1, 0, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 6, 2, 0, 0, 0, 0,
    1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 12, 2, 0, -2, -2, 20, 0, 0, 10,
    0, 15, 0, -1, 0, 8, -2, 0, 0, 0, 8, 0, 12, 0, 0, 7, 0, 0, 0, 0, 0, -1, -1, 0, 4, 5, 0, 0, 0, 6,
    0, 0, 0, 0, 8, 9, 0, 0, 0, 2, -1, 0, -2, 0, 4, 14, 0, 0, 0, 24, 0, -2, 5, 0, 0, 0, 10, 0, 0, 4,
    0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 2, 1, 0, 0, 2, -1, 1, 0, 0, 0, 0, 14, 0, 0, 0, 0, 10, 5, 0, 0,
    0, 0, 0, -2, 0, 0, 9, 0, 0, 8, 0, 0, 0, 0, -2, 6, 0, 0, 0, -2, 0, 3, 0, 1, 7, 0, 0, 0, 0, 3, 0,
    0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0
  };
  static int anInt2670 = 0;
  private static GameString aClass94_2665 = SpawnedGameObject.createString("Choose Option");
  static GameString aClass94_2667 = aClass94_2665;
  private int anInt2666;
  private int anInt2669;
  private int anInt2671;
  private int anInt2672;


  SomethingTexture4(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
    super(var5, var6, var7);

    try {
      this.anInt2672 = var2;
      this.anInt2666 = var3;
      this.anInt2671 = var1;
      this.anInt2669 = var4;
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "ta.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ','
          + var7 + ')');
    }
  }

  static final void method1349() {
    try {
      int var1;
      for (var1 = 0; OndemandRequester.anInt997 > var1; ++var1) {
        int var2 = DummyClass60.anIntArray441[var1];
        NPC var3 = TextureSampler5.npcs[var2];
        int var4 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        if ((var4 & 8) != 0) {
          var4 += SpotAnimationConfig.gameBuffer.readUnsignedByte() << 8;
        }

        int var5;
        int var6;
        if (-1 != ~(64 & var4)) {
          var5 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
          var6 = SpotAnimationConfig.gameBuffer.method786(true);
          var3.method1970(var6, -8, AbstractGameWorld.updateCycle, var5);
          var3.anInt2781 = 300 + AbstractGameWorld.updateCycle;
          var3.anInt2775 = SpotAnimationConfig.gameBuffer.method754(true);
        }

        if ((var4 & 2) != 0) {
          var5 = SpotAnimationConfig.gameBuffer.method786(true);
          var6 = SpotAnimationConfig.gameBuffer.method754(true);
          var3.method1970(var6, -8, AbstractGameWorld.updateCycle, var5);
        }

        if ((var4 & 16) != 0) {
          var5 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
          var6 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
          if ('\uffff' == var5) {
            var5 = -1;
          }

          HashTable.method1772(var6, var5, 39, var3);
        }

        if (-1 != ~(var4 & 4)) {
          var3.anInt2772 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
          if (-65536 == ~var3.anInt2772) {
            var3.anInt2772 = -1;
          }
        }

        if (0 != (var4 & 128)) {
          var5 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
          if (var5 == '\uffff') {
            var5 = -1;
          }

          var6 = SpotAnimationConfig.gameBuffer.method782(-46);
          boolean var7 = true;
          if (0 != ~var5 && 0 != ~var3.anInt2842 &&
            GameClient
              .method45(RenderAnimation.method898((byte) 42, var5).anInt542, (byte) -20).anInt1857
              < GameClient.method45(RenderAnimation.method898((byte) 42, var3.anInt2842).anInt542,
              (byte) -20).anInt1857) {
            var7 = false;
          }

          if (var7) {
            var3.anInt2842 = var5;
            var3.anInt2759 = ('\uffff' & var6) + AbstractGameWorld.updateCycle;
            var3.anInt2761 = 0;
            var3.anInt2805 = 0;
            var3.anInt2799 = var6 >> 16;
            var3.anInt2826 = 1;
            if (var3.anInt2759 > AbstractGameWorld.updateCycle) {
              var3.anInt2805 = -1;
            }

            if (var3.anInt2842 != -1 && ~var3.anInt2759 == ~AbstractGameWorld.updateCycle) {
              int var8 = RenderAnimation.method898((byte) 42, var3.anInt2842).anInt542;
              if (0 != ~var8) {
                AnimationSequence var9 = GameClient.method45(var8, (byte) -20);
                if (null != var9 && var9.anIntArray1851 != null) {
                  SocketStream
                    .method1470(var3.anInt2829, var9, 183921384, var3.anInt2819, false, 0);
                }
              }
            }
          }
        }

        if ((1 & var4) != 0) {
          if (var3.config.method1474(-1)) {
            ByteArrayNode.method574(var3, false);
          }

          var3.setConfiguration(-1,
            SubNode.getNpcConfiguration(SpotAnimationConfig.gameBuffer.readUnsignedShortLE()));
          var3.method1976(var3.config.size, 2);
          var3.renderAnimationId = var3.config.renderAnimationId;
          if (var3.config.method1474(-1)) {
            SceneSomething2.method1286(var3.waypointsY[0], false, null, 0, var3, var3.waypointsX[0],
              GameWorldSomething.currentPlane, null);
          }
        }

        if (-1 != ~(var4 & 32)) {
          var3.aClass94_2825 = SpotAnimationConfig.gameBuffer.readString();
          var3.anInt2814 = 100;
        }

        if ((256 & var4) != 0) {
          var5 = SpotAnimationConfig.gameBuffer.method786(true);
          int[] var12 = new int[var5];
          int[] var13 = new int[var5];
          int[] var14 = new int[var5];

          for (int var15 = 0; ~var15 > ~var5; ++var15) {
            int var10 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
            if (var10 == '\uffff') {
              var10 = -1;
            }

            var12[var15] = var10;
            var13[var15] = SpotAnimationConfig.gameBuffer.method754(true);
            var14[var15] = SpotAnimationConfig.gameBuffer.readUnsignedShort();
          }

          TextureSampler0.method273(var14, (byte) 92, var3, var13, var12);
        }

        if ((var4 & 512) != 0) {
          var3.anInt2786 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
          var3.anInt2762 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        }
      }

    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11, "ta.M()");
    }
  }

  public static void method1350(byte var0) {
    try {
      anIntArray2664 = null;
      aClass94_2662 = null;
      aClass94_2665 = null;
      if (var0 != 75) {
        method1350((byte) -116);
      }

      aClass94_2667 = null;
      PACKET_LENGTHS = null;
      anIntArray2663 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ta.C(" + var0 + ')');
    }
  }

  static final boolean loadSprites(FileUnpacker var0, int var1, int var2, int var3) {
    try {
      byte[] var4 = var0.getBytes(var2, var1);
      if (var3 != -30901) {
        aClass94_2662 = null;
      }

      if (var4 != null) {
        DummyClass38.loadSprites(var4, 98);
        return true;
      } else {
        return false;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ta.N(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final void method1352(int var0, boolean var1, int var2, int var3, int var4) {
    try {
      if (ComponentCanvas.method57(var3, 104)) {
        AbstractImageProducer
          .method2183(var2, var1, var4, 235, var0, SceneNode.aClass11ArrayArray1834[var3]);
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ta.K(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void method1353(SoftwareDirectColorSprite[] var0, int var1, FileUnpacker var2) {
    try {
      TextureSampler23.worldMaps = var2;
      SceneNode.aClass3_Sub28_Sub16_Sub2Array1839 = var0;
      if (var1 == -11931) {
        AudioStreamEncoder4.aBooleanArray3503 =
          new boolean[SceneNode.aClass3_Sub28_Sub16_Sub2Array1839.length];
        DummyClass21.aClass61_1758.clear(-68);
        int var3 = TextureSampler23.worldMaps.getFileId(ClassCheckRequest.DETAILS);
        int[] var4 = TextureSampler23.worldMaps.getChildIds((byte) -128, var3);

        for (int var5 = 0; ~var4.length < ~var5; ++var5) {
          DummyClass21.aClass61_1758.addLast(DummyClass23
            .method1747(new Buffer(TextureSampler23.worldMaps.getBytes(var3, var4[var5])), true));
        }

      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ta.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  static final void method1354(int var0, int var1, boolean var2, int var3, int var4) {
    try {
      if (var4 >= DummyClass13.anInt2020 && var4 <= LightIntensity.anInt902) {
        var0 =
          DummyClass59.method1040(GlTexture2d.anInt3765, var0, (byte) 0, DummyClass55.anInt1425);
        var3 =
          DummyClass59.method1040(GlTexture2d.anInt3765, var3, (byte) 0, DummyClass55.anInt1425);
        TextureSampler14.method320(var1, var4, var3, (byte) -123, var0);
      }

      if (!var2) {
        aClass94_2665 = null;
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ta.L(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void resetFrameRegulator() {
    try {
      Inventory.frameRateRegulator.reset(-124);
      int var1;
      for (var1 = 0; var1 < 32; ++var1) {
        DummyClass5.drawMemory[var1] = 0L;
      }
      for (var1 = 0; var1 < 32; ++var1) {
        DummyClass21.updateMemory[var1] = 0L;
      }
      SomethingPacket116.cycles = 0;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ta.O()");
    }
  }

  final void method1337(int var1, boolean var2, int var3) {
    try {
      int var5 = var3 * this.anInt2666 >> 12;
      int var7 = this.anInt2669 * var1 >> 12;
      int var4 = this.anInt2671 * var3 >> 12;
      int var6 = this.anInt2672 * var1 >> 12;
      if (var2) {
        Unsure.method2072(this.anInt1104, var4, var6, var5, var7, this.anInt1106, -2);
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld
        .cascadeException(var8, "ta.E(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void method1341(int var1, int var2, int var3) {
    try {
      int var4 = this.anInt2671 * var2 >> 12;
      int var5 = var2 * this.anInt2666 >> 12;
      int var6 = var3 * this.anInt2672 >> 12;
      int var7 = var3 * this.anInt2669 >> 12;
      StringNode.method730(var4, this.anInt1101, (byte) 121, var7, var5, var6);
      if (var1 != 2) {
        aClass94_2665 = null;
      }

    } catch (RuntimeException var8) {
      throw AbstractGameWorld
        .cascadeException(var8, "ta.A(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void method1335(int var1, int var2, int var3) {
    try {
      if (var3 == 4898) {
        int var4 = var2 * this.anInt2671 >> 12;
        int var6 = this.anInt2672 * var1 >> 12;
        int var5 = var2 * this.anInt2666 >> 12;
        int var7 = this.anInt2669 * var1 >> 12;
        TextureSampler21
          .method194(this.anInt1106, var7, this.anInt1101, this.anInt1104, var6, 4096, var5, var4);
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld
        .cascadeException(var8, "ta.D(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

}
