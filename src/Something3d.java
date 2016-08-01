class Something3d extends Something3dRoot {

  static GameString aClass94_3008 = SpawnedGameObject.createString("hitbar_default");
  static AbstractImageProducer viewImageProducer;
  static short[] aShortArray3011 =
    new short[] {(short) 6798, (short) 8741, (short) 25238, (short) 4626, (short) 4550};
  static int anInt3012 = 0;
  static GameString ZERO = SpawnedGameObject.createString("0");
  static int anInt3017;
  private int anInt3010;
  private int[] anIntArray3014;
  private byte[] aByteArray3015;
  private int anInt3016;


  Something3d(int var1, int var2, int var3, int var4, int var5, float var6) {
    super(var1, var2, var3, var4, var5);

    try {
      this.anIntArray3014 = new int[this.anInt2062];

      for (int var7 = 0; ~this.anInt2062 < ~var7; ++var7) {
        this.anIntArray3014[var7] =
          (short) ((int) (Math.pow((double) var6, (double) var7) * 4096.0D));
      }

    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "vd.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
    }
  }

  void method2242(int var1, byte var2) {
    try {
      this.aByteArray3015[this.anInt3016++] = (byte) (127 + (ClientScript.bitAnd(var2, 255) >> 1));
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "vd.B(" + var1 + ',' + var2 + ')');
    }
  }

  final void method2231(byte var1) {
    try {
      this.anInt3010 = Math.abs(this.anInt3010);
      if (var1 != -92) {
        this.method2231((byte) -112);
      }

      if (this.anInt3010 >= 4096) {
        this.anInt3010 = 4095;
      }

      this.method2242(this.anInt3016++, (byte) (this.anInt3010 >> 4));
      this.anInt3010 = 0;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "vd.A(" + var1 + ')');
    }
  }

  final void method2233(int var1) {
    try {
      if (var1 == -949697716) {
        this.anInt3016 = 0;
        this.anInt3010 = 0;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "vd.C(" + var1 + ')');
    }
  }

  final void method2237(int var1, int var2, int var3) {
    try {
      this.anInt3010 += var1 * this.anIntArray3014[var2] >> 12;
      if (var3 != -20975) {
        method2239(-22, -68, -14, 89);
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "vd.H(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final void method2238(int var0, int var1, int var2, int var3, byte var4, int var5) {
    try {
      AbstractSomethingTexture.anInt1105 = var2;
      SomethingAudio.anInt1996 = var1;
      DummyClass8.anInt4014 = var5;
      Mouse.anInt1923 = var3;
      SpotAnimationConfig.anInt529 = var0;
      if (var4 != -21) {
        ZERO = null;
      }

      if (-101 >= ~DummyClass8.anInt4014) {
        int var6 = 64 + 128 * Mouse.anInt1923;
        int var7 = 64 + SomethingAudio.anInt1996 * 128;
        int var8 = BufferData.method1736(GameWorldSomething.currentPlane, 1, var6, var7)
          - SpotAnimationConfig.anInt529;
        int var10 = var8 + -EnumStringFetcher.anInt2162;
        int var9 = var6 + -NPC.anInt3995;
        int var11 = -DummyClass49.anInt1111 + var7;
        int var12 = (int) Math.sqrt((double) (var11 * var11 + var9 * var9));
        DummyClass17.anInt1823 =
          2047 & (int) (Math.atan2((double) var10, (double) var12) * 325.949D);
        TextureSampler28.anInt3315 =
          2047 & (int) (Math.atan2((double) var9, (double) var11) * -325.949D);
        if (128 > DummyClass17.anInt1823) {
          DummyClass17.anInt1823 = 128;
        }

        if (383 < DummyClass17.anInt1823) {
          DummyClass17.anInt1823 = 383;
        }
      }

      SomethingPacket116.anInt1753 = 2;
    } catch (RuntimeException var13) {
      throw AbstractGameWorld.cascadeException(var13,
        "vd.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  static final boolean method2239(int var0, int var1, int var2, int var3) {
    if (!FileSystem.method846(var0, var1, var2)) {
      return false;
    } else {
      int var4 = var1 << 7;
      int var5 = var2 << 7;
      int var6 = AbstractGameWorld.heightMap[var0][var1][var2] - 1;
      int var7 = var6 - 120;
      int var8 = var6 - 230;
      int var9 = var6 - 238;
      if (var3 < 16) {
        if (var3 == 1) {
          if (var4 > MilliFrameRegulator.cameraPosX) {
            if (!TextureSampler10.method349(var4, var6, var5)) {
              return false;
            }

            if (!TextureSampler10.method349(var4, var6, var5 + 128)) {
              return false;
            }
          }

          if (var0 > 0) {
            if (!TextureSampler10.method349(var4, var7, var5)) {
              return false;
            }

            if (!TextureSampler10.method349(var4, var7, var5 + 128)) {
              return false;
            }
          }

          if (!TextureSampler10.method349(var4, var8, var5)) {
            return false;
          }

          return TextureSampler10.method349(var4, var8, var5 + 128);

        }

        if (var3 == 2) {
          if (var5 < TextureSampler13.cameraZ) {
            if (!TextureSampler10.method349(var4, var6, var5 + 128)) {
              return false;
            }

            if (!TextureSampler10.method349(var4 + 128, var6, var5 + 128)) {
              return false;
            }
          }

          if (var0 > 0) {
            if (!TextureSampler10.method349(var4, var7, var5 + 128)) {
              return false;
            }

            if (!TextureSampler10.method349(var4 + 128, var7, var5 + 128)) {
              return false;
            }
          }

          if (!TextureSampler10.method349(var4, var8, var5 + 128)) {
            return false;
          }

          return TextureSampler10.method349(var4 + 128, var8, var5 + 128);

        }

        if (var3 == 4) {
          if (var4 < MilliFrameRegulator.cameraPosX) {
            if (!TextureSampler10.method349(var4 + 128, var6, var5)) {
              return false;
            }

            if (!TextureSampler10.method349(var4 + 128, var6, var5 + 128)) {
              return false;
            }
          }

          if (var0 > 0) {
            if (!TextureSampler10.method349(var4 + 128, var7, var5)) {
              return false;
            }

            if (!TextureSampler10.method349(var4 + 128, var7, var5 + 128)) {
              return false;
            }
          }

          if (!TextureSampler10.method349(var4 + 128, var8, var5)) {
            return false;
          }

          return TextureSampler10.method349(var4 + 128, var8, var5 + 128);

        }

        if (var3 == 8) {
          if (var5 > TextureSampler13.cameraZ) {
            if (!TextureSampler10.method349(var4, var6, var5)) {
              return false;
            }

            if (!TextureSampler10.method349(var4 + 128, var6, var5)) {
              return false;
            }
          }

          if (var0 > 0) {
            if (!TextureSampler10.method349(var4, var7, var5)) {
              return false;
            }

            if (!TextureSampler10.method349(var4 + 128, var7, var5)) {
              return false;
            }
          }

          if (!TextureSampler10.method349(var4, var8, var5)) {
            return false;
          }

          return TextureSampler10.method349(var4 + 128, var8, var5);

        }
      }

      return !TextureSampler10.method349(var4 + 64, var9, var5 + 64) ?
        false :
        (var3 == 16 ?
          TextureSampler10.method349(var4, var8, var5 + 128) :
          (var3 == 32 ?
            TextureSampler10.method349(var4 + 128, var8, var5 + 128) :
            (var3 == 64 ?
              TextureSampler10.method349(var4 + 128, var8, var5) :
              (var3 == 128 ? TextureSampler10.method349(var4, var8, var5) : true))));
    }
  }

  public static void method2240(int var0) {
    try {
      aClass94_3008 = null;
      aShortArray3011 = null;
      ZERO = null;
      if (var0 == 128) {
        viewImageProducer = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "vd.I(" + var0 + ')');
    }
  }

  static final void method2241(byte var0, boolean var1) {
    try {
      int var2 = -47 / ((var0 - 5) / 49);

      AreaSoundEffect var3;
      for (
        var3 = (AreaSoundEffect) Node.aClass61_78.getFirst();
        var3 != null; var3 = (AreaSoundEffect) Node.aClass61_78.getNext()) {
        if (null != var3.aClass3_Sub24_Sub1_2312) {
          MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(var3.aClass3_Sub24_Sub1_2312);
          var3.aClass3_Sub24_Sub1_2312 = null;
        }

        if (var3.aClass3_Sub24_Sub1_2315 != null) {
          MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(var3.aClass3_Sub24_Sub1_2315);
          var3.aClass3_Sub24_Sub1_2315 = null;
        }

        var3.unlinkNode();
      }

      if (var1) {
        for (
          var3 = (AreaSoundEffect) SocketStream.aClass61_1242.getFirst();
          null != var3; var3 = (AreaSoundEffect) SocketStream.aClass61_1242.getNext()) {
          if (null != var3.aClass3_Sub24_Sub1_2312) {
            MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(
              var3.aClass3_Sub24_Sub1_2312);
            var3.aClass3_Sub24_Sub1_2312 = null;
          }

          var3.unlinkNode();
        }

        for (
          var3 = (AreaSoundEffect) ObjectNode.aClass130_4046.getFirst(68);
          null != var3; var3 = (AreaSoundEffect) ObjectNode.aClass130_4046.getNext(-66)) {
          if (null != var3.aClass3_Sub24_Sub1_2312) {
            MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(
              var3.aClass3_Sub24_Sub1_2312);
            var3.aClass3_Sub24_Sub1_2312 = null;
          }

          var3.unlinkNode();
        }
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "vd.G(" + var0 + ',' + var1 + ')');
    }
  }

}
