final class DummyClass21 {

  static Deque aClass61_1758 = new Deque();
  static int anInt1759 = 0;
  static GameString aClass94_1760 = SpawnedGameObject.createString("");
  static int anInt1761 = -1;
  static int anInt1762 = 0;
  static int[][] anIntArrayArray1763 = new int[][] {
    {0, 128, 0, 0, 128, 0, 128, 128}, {0, 128, 0, 0, 128, 0}, {0, 0, 64, 128, 0, 128},
    {128, 128, 64, 128, 128, 0}, {0, 0, 128, 0, 128, 128, 64, 128}, {0, 128, 0, 0, 128, 0, 64, 128},
    {64, 128, 0, 128, 0, 0, 64, 0}, {0, 0, 64, 0, 0, 64}, {128, 0, 128, 128, 0, 128, 0, 64, 64, 0},
    {0, 128, 0, 0, 32, 64, 64, 96, 128, 128}, {0, 0, 128, 0, 128, 128, 64, 96, 32, 64},
    {0, 0, 128, 0, 96, 32, 32, 32}
  };
  static GameString HEAD_ICONS_PRAYER = SpawnedGameObject.createString("headicons_prayer");
  static boolean aBoolean1765 = false;
  static long[] updateMemory = new long[32];


  public static void method1806(int var0) {
    try {
      HEAD_ICONS_PRAYER = null;
      aClass61_1758 = null;
      if (var0 != 3846) {
        anInt1762 = 60;
      }

      anIntArrayArray1763 = null;
      updateMemory = null;
      aClass94_1760 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sh.D(" + var0 + ')');
    }
  }

  static final synchronized byte[] method1807(int var0, int var1) {
    try {
      byte[] var2;
      if (~var1 == -101 && -1 > ~DummyClass45.anInt984) {
        var2 = TextureSampler8.aByteArrayArray3461[--DummyClass45.anInt984];
        TextureSampler8.aByteArrayArray3461[DummyClass45.anInt984] = null;
        return var2;
      } else {
        if (var0 < 55) {
          method1806(-79);
        }

        if (~var1 == -5001 && Mouse.anInt1927 > 0) {
          var2 = BZipDecompressorState.aByteArrayArray125[--Mouse.anInt1927];
          BZipDecompressorState.aByteArrayArray125[Mouse.anInt1927] = null;
          return var2;
        } else if (-30001 == ~var1 && 0 < GlTexture2d.anInt3766) {
          var2 = GameObject.aByteArrayArray2747[--GlTexture2d.anInt3766];
          GameObject.aByteArrayArray2747[GlTexture2d.anInt3766] = null;
          return var2;
        } else {
          return new byte[var1];
        }
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sh.A(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1808(int var0, boolean var1, byte var2, int var3, boolean var4) {
    try {
      FileCache.method1047(var0, var3, TextureSampler15.aClass44_Sub1Array3201.length - 1, var4, 0,
        var1, false);
      if (var2 != 30) {
        aClass94_1760 = null;
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "sh.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void method1809(int var0, long[] var1, int var2, int var3, Object[] var4) {
    try {
      if (var2 < 85) {
        aClass61_1758 = null;
      }

      if (~var3 > ~var0) {
        int var6 = var3;
        int var5 = (var3 - -var0) / 2;
        long var7 = var1[var5];
        var1[var5] = var1[var0];
        var1[var0] = var7;
        Object var9 = var4[var5];
        var4[var5] = var4[var0];
        var4[var0] = var9;

        for (int var10 = var3; var0 > var10; ++var10) {
          if (var7 + (long) (1 & var10) > var1[var10]) {
            long var11 = var1[var10];
            var1[var10] = var1[var6];
            var1[var6] = var11;
            Object var13 = var4[var10];
            var4[var10] = var4[var6];
            var4[var6++] = var13;
          }
        }

        var1[var0] = var1[var6];
        var1[var6] = var7;
        var4[var0] = var4[var6];
        var4[var6] = var9;
        method1809(-1 + var6, var1, 107, var3, var4);
        method1809(var0, var1, 89, var6 - -1, var4);
      }

    } catch (RuntimeException var14) {
      throw AbstractGameWorld.cascadeException(var14,
        "sh.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + (
          var4 != null ?
            "{...}" :
            "null") + ')');
    }
  }

}
