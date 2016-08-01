abstract class AbstractGameWorld {

  static int usageLocation = 0;
  static int updateCycle = 0;
  static int[][][] anIntArrayArrayArray720;
  static int[][][] heightMap;
  static ObjectCache floorUnderlays = new ObjectCache(64);
  static int[] anIntArray726 = new int[32];
  static float aFloat727;
  int anInt721;
  int anInt722;
  int flags;

  final boolean method1070(int var1) {
    try {
      if (var1 != 8) {
        this.method1070(15);
      }

      return 0 != (1 & this.flags);
    } catch (RuntimeException var3) {
      throw cascadeException(var3, "gj.E(" + var1 + ')');
    }
  }

  final boolean method1072(boolean var1) {
    try {
      return var1 ? false : (this.flags & 4) != 0;
    } catch (RuntimeException var3) {
      throw cascadeException(var3, "gj.G(" + var1 + ')');
    }
  }

  final boolean method1074(int var1) {
    try {
      if (var1 >= -106) {
        aFloat727 = -0.6283864F;
      }

      return ~(this.flags & 8) != -1;
    } catch (RuntimeException var3) {
      throw cascadeException(var3, "gj.I(" + var1 + ')');
    }
  }

  final boolean method1075(int var1) {
    try {
      if (var1 != 64) {
        this.flags = 51;
      }

      return ~(2 & this.flags) != -1;
    } catch (RuntimeException var3) {
      throw cascadeException(var3, "gj.H(" + var1 + ')');
    }
  }

  static final boolean method1066(int var0, int var1) {
    try {
      if (97 <= var0 && ~var0 >= -123) {
        return true;
      } else {
        int var2 = 52 % ((56 - var1) / 43);
        return -66 >= ~var0 && 90 >= var0 ? true : 48 <= var0 && 57 >= var0;
      }
    } catch (RuntimeException var3) {
      throw cascadeException(var3, "gj.K(" + var0 + ',' + var1 + ')');
    }
  }

  static final GameException cascadeException(Throwable throwable, String source) {
    GameException ex;
    if (!(throwable instanceof GameException)) {
      ex = new GameException(throwable, source);
    } else {
      ex = (GameException) throwable;
      ex.source = ex.source + ' ' + source;
    }
    return ex;
  }

  static final SomethingSceneI method1068(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    return var3 == null ? null : var3.aClass19_2233;
  }

  static final void method1069(long[] var0, int var1, int var2, int[] var3, int var4) {
    try {
      if (var4 != -24337) {
        cascadeException(null, null);
      }

      if (~var1 > ~var2) {
        int var6 = var1;
        int var5 = (var2 + var1) / 2;
        long var7 = var0[var5];
        var0[var5] = var0[var2];
        var0[var2] = var7;
        int var9 = var3[var5];
        var3[var5] = var3[var2];
        var3[var2] = var9;

        for (int var10 = var1; var2 > var10; ++var10) {
          if (var0[var10] < var7 - -((long) (1 & var10))) {
            long var11 = var0[var10];
            var0[var10] = var0[var6];
            var0[var6] = var11;
            int var13 = var3[var10];
            var3[var10] = var3[var6];
            var3[var6++] = var13;
          }
        }

        var0[var2] = var0[var6];
        var0[var6] = var7;
        var3[var2] = var3[var6];
        var3[var6] = var9;
        method1069(var0, var1, -1 + var6, var3, -24337);
        method1069(var0, 1 + var6, var2, var3, -24337);
      }

    } catch (RuntimeException var14) {
      throw cascadeException(var14,
        "gj.N(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + (
          var3 != null ? "{...}" : "null") + ',' + var4 + ')');
    }
  }

  public static void method1071(byte var0) {
    try {
      anIntArray726 = null;
      floorUnderlays = null;
      heightMap = null;
      if (var0 >= -82) {
        method1071((byte) 3);
      }

      anIntArrayArrayArray720 = null;
    } catch (RuntimeException var2) {
      throw cascadeException(var2, "gj.M(" + var0 + ')');
    }
  }

  static final void method1073(int var0) {
    try {
      SomethingQuickChat.method551(0, 0, 0);
      if (var0 != 97) {
        method1068(-108, 80, 18);
      }

    } catch (RuntimeException var2) {
      throw cascadeException(var2, "gj.L(" + var0 + ')');
    }
  }

}
