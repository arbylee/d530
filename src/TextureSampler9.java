final class TextureSampler9 extends AbstractTextureSampler {

  static int anInt3101 = 0;
  static int anInt3102 = 0;
  static int anInt3103;
  static float aFloat3105;
  static GameString aClass94_3106 = SpawnedGameObject.createString("clignotant2:");
  private boolean aBoolean3100 = true;
  private boolean aBoolean3104 = true;


  public TextureSampler9() {
    super(1, false);
  }

  static final void method203(int var0) {
    try {
      int var1 = 15 / ((-11 - var0) / 63);
      if (ClientScriptEnum.anInt3660 == 2) {
        if (~NpcConfiguration.anInt1297 == ~TextureSampler8.anInt3460
          && DummyClass36.anInt2612 == FloorOverlay.anInt2099) {
          ClientScriptEnum.anInt3660 = 0;
          if (DummyClass55.aBoolean1419 && GameObjectConfig.aBooleanArray1490[81]
            && ~TextureSampler25.amountContextActions < -3) {
            GameBuffer.method806(2597, TextureSampler25.amountContextActions + -2);
          } else {
            GameBuffer.method806(2597, TextureSampler25.amountContextActions + -1);
          }
        }
      } else if (NpcConfiguration.anInt1297 == DummyClass5.anInt2993
        && ~DummyClass36.anInt2612 == ~DummyClass36.anInt2614) {
        ClientScriptEnum.anInt3660 = 0;
        if (DummyClass55.aBoolean1419 && GameObjectConfig.aBooleanArray1490[81]
          && -3 > ~TextureSampler25.amountContextActions) {
          GameBuffer.method806(2597, TextureSampler25.amountContextActions - 2);
        } else {
          GameBuffer.method806(2597, TextureSampler25.amountContextActions - 1);
        }
      } else {
        FloorOverlay.anInt2099 = DummyClass36.anInt2614;
        ClientScriptEnum.anInt3660 = 2;
        TextureSampler8.anInt3460 = DummyClass5.anInt2993;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ej.B(" + var0 + ')');
    }
  }

  static final void method204(int var0) {
    try {
      TextureSampler12.secureBuffer.writePacket(243);
      TextureSampler12.secureBuffer.writeByte(MidiSomething.getWindowMode());
      TextureSampler12.secureBuffer.writeShort(DummyClass30.viewWidth);
      if (var0 != -3) {
        anInt3103 = -41;
      }

      ++GameStub.anInt2;
      TextureSampler12.secureBuffer.writeShort(GroundItem.viewHeight);
      TextureSampler12.secureBuffer.writeByte(GroundItemNode.anInt3671);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ej.C(" + var0 + ')');
    }
  }

  static final void method205(FileUnpacker var0, int var1, FileUnpacker var2, Interface4 var3) {
    try {
      DummyClass14.aClass153_1967 = var0;
      DummyClass43.anInterface4_915 = var3;
      AudioStreamEncoder3.aClass153_3490 = var2;
      if (AudioStreamEncoder3.aClass153_3490 != null) {
        MidiSomething.anInt1156 =
          AudioStreamEncoder3.aClass153_3490.getAmountChildren(1, (byte) 100);
      }

      if (DummyClass14.aClass153_1967 != null) {
        RenderAnimation.anInt377 = DummyClass14.aClass153_1967.getAmountChildren(1, (byte) 83);
      }

      if (var1 <= 32) {
        aClass94_3106 = null;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ej.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ?
          "{...}" :
          "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method206(boolean var0) {
    try {
      aClass94_3106 = null;
      if (!var0) {
        method204(-76);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ej.O(" + var0 + ')');
    }
  }

  static final GameString method207(int var0, boolean var1, int var2, long var3) {
    try {
      if (~var0 <= -3 && var0 <= 36) {
        if (var2 <= 71) {
          aFloat3105 = 1.3008908F;
        }

        long var6 = var3 / (long) var0;

        int var5;
        for (var5 = 1; var6 != 0L; var6 /= (long) var0) {
          ++var5;
        }

        int var8 = var5;
        if (0L > var3 || var1) {
          var8 = var5 + 1;
        }

        byte[] var9 = new byte[var8];
        if (var3 >= 0L) {
          if (var1) {
            var9[0] = 43;
          }
        } else {
          var9[0] = 45;
        }

        for (int var10 = 0; ~var5 < ~var10; ++var10) {
          int var11 = (int) (var3 % (long) var0);
          var3 /= (long) var0;
          if (var11 < 0) {
            var11 = -var11;
          }

          if (var11 > 9) {
            var11 += 39;
          }

          var9[-1 + -var10 + var8] = (byte) (var11 + 48);
        }

        GameString var13 = new GameString();
        var13.bytes = var9;
        var13.length = var8;
        return var13;
      } else {
        throw new IllegalArgumentException("Invalid radix:" + var0);
      }
    } catch (RuntimeException var12) {
      throw AbstractGameWorld
        .cascadeException(var12, "ej.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (!var3) {
        method207(18, false, -19, 102L);
      }

      if (~var1 == -1) {
        this.aBoolean3100 = -2 == ~var2.readUnsignedByte();
      } else if (-2 == ~var1) {
        this.aBoolean3104 = var2.readUnsignedByte() == 1;
      } else if (-3 == ~var1) {
        this.monoChromatic = ~var2.readUnsignedByte() == -2;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ej.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final int[][] method166(int var1, int var2) {
    try {
      if (var1 != -1) {
        method207(-98, true, 95, 79L);
      }

      int[][] var3 = this.triChromaticImageCache.method1594((byte) 54, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 = this
          .method162(!this.aBoolean3104 ? var2 : -var2 + TriChromaticImageBuffer.anInt2487, 0, (byte) -105);
        int[] var5 = var4[0];
        int[] var7 = var4[2];
        int[] var6 = var4[1];
        int[] var9 = var3[1];
        int[] var10 = var3[2];
        int[] var8 = var3[0];
        int var11;
        if (this.aBoolean3100) {
          for (var11 = 0; SomethingLight0.anInt1559 > var11; ++var11) {
            var8[var11] = var5[RenderAnimation.anInt396 + -var11];
            var9[var11] = var6[-var11 + RenderAnimation.anInt396];
            var10[var11] = var7[RenderAnimation.anInt396 - var11];
          }
        } else {
          for (var11 = 0; ~SomethingLight0.anInt1559 < ~var11; ++var11) {
            var8[var11] = var5[var11];
            var9[var11] = var6[var11];
            var10[var11] = var7[var11];
          }
        }
      }

      return var3;
    } catch (RuntimeException var12) {
      throw AbstractGameWorld.cascadeException(var12, "ej.T(" + var1 + ',' + var2 + ')');
    }
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var3 = -34 / ((var2 - 30) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 =
          this.method152(0, !this.aBoolean3104 ? var1 : TriChromaticImageBuffer.anInt2487 + -var1, 32755);
        if (!this.aBoolean3100) {
          ArrayUtils.method1358(var5, 0, var4, 0, SomethingLight0.anInt1559);
        } else {
          for (int var6 = 0; var6 < SomethingLight0.anInt1559; ++var6) {
            var4[var6] = var5[-var6 + RenderAnimation.anInt396];
          }
        }
      }

      return var4;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7, "ej.D(" + var1 + ',' + var2 + ')');
    }
  }

}
