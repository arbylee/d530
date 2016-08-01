final class TextureSampler22 extends AbstractTextureSampler {

  static GameString aClass94_3418 = SpawnedGameObject.createString("(U5");
  static int anInt3419 = 0;
  static int anInt3420;
  static WorldMapLabel aClass131_3421;


  public TextureSampler22() {
    super(1, false);
  }

  final int[] method154(int var1, byte var2) {
    try {
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var4 = this.method152(0, var1, 32755);

        for (int var5 = 0; var5 < SomethingLight0.anInt1559; ++var5) {
          var3[var5] = 4096 - var4[var5];
        }
      }

      int var7 = 59 % ((30 - var2) / 36);
      return var3;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "tb.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (var3) {
        if (var1 == 0) {
          this.monoChromatic = -2 == ~var2.readUnsignedByte();
        }

      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "tb.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final int[][] method166(int var1, int var2) {
    try {
      if (var1 != -1) {
        return null;
      } else {
        int[][] var3 = this.triChromaticImageCache.method1594((byte) -128, var2);
        if (this.triChromaticImageCache.aBoolean1379) {
          int[][] var4 = this.method162(var2, 0, (byte) -51);
          int[] var7 = var4[2];
          int[] var5 = var4[0];
          int[] var6 = var4[1];
          int[] var8 = var3[0];
          int[] var9 = var3[1];
          int[] var10 = var3[2];

          for (int var11 = 0; ~SomethingLight0.anInt1559 < ~var11; ++var11) {
            var8[var11] = -var5[var11] + 4096;
            var9[var11] = 4096 - var6[var11];
            var10[var11] = 4096 - var7[var11];
          }
        }

        return var3;
      }
    } catch (RuntimeException var12) {
      throw AbstractGameWorld.cascadeException(var12, "tb.T(" + var1 + ',' + var2 + ')');
    }
  }

  static final int method335(int var0) {
    try {
      if (var0 != 16859) {
        aClass131_3421 = null;
      }

      return DummyClass55.aBoolean1419 && GameObjectConfig.aBooleanArray1490[81]
        && 2 < TextureSampler25.amountContextActions ?
        MonoChromaticImageCache.anIntArray1578[-2 + TextureSampler25.amountContextActions] :
        MonoChromaticImageCache.anIntArray1578[TextureSampler25.amountContextActions - 1];
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "tb.C(" + var0 + ')');
    }
  }

  static final SomethingQuickChat2 method336(int var0, byte var1) {
    try {
      SomethingQuickChat2 var2 =
        (SomethingQuickChat2) TextureSampler1.aClass47_3137.get((long) var0, 1400);
      if (null != var2) {
        return var2;
      } else {
        byte[] var3;
        if (var0 < '\u8000') {
          var3 = Cache.quickchats.getBytes(0, var0);
        } else {
          var3 = Queue.globalQuickchats.getBytes(0, var0 & 32767);
        }

        var2 = new SomethingQuickChat2();
        if (null != var3) {
          var2.method530(new Buffer(var3), (byte) 116);
        }

        if (var1 != -54) {
          method337(19);
        }

        if (-32769 >= ~var0) {
          var2.method525(-85);
        }

        TextureSampler1.aClass47_3137.put((long) var0, var2);
        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "tb.B(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method337(int var0) {
    try {
      aClass94_3418 = null;
      if (var0 != 2) {
        anInt3419 = -53;
      }

      aClass131_3421 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "tb.E(" + var0 + ')');
    }
  }

}
