abstract class SceneNode {

  static AbstractIndexedColorSprite[] aClass109Array1831;
  static GameString COMMAND_SET_PARTICLES = SpawnedGameObject.createString("::setparticles");
  static int[] anIntArray1833 = new int[14];
  static Widget[][] aClass11ArrayArray1834;
  static int[] anIntArray1835 = new int[100];
  static Widget[] aClass11Array1836;
  static boolean aBoolean1837 = false;
  static int[] anIntArray1838;
  static SoftwareDirectColorSprite[] aClass3_Sub28_Sub16_Sub2Array1839;

  SceneNode method1861(int var1, int var2, int var3) {
    try {
      return this;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "th.JB(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  boolean method1865() {
    try {
      return false;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "th.AB()");
    }
  }

  void method1866(SceneNode var1, int var2, int var3, int var4, boolean var5) {
  }

  abstract void method1867(int var1, int var2, int var3, int var4, int var5);

  abstract void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
                     long var9, int var11, DummyClass0 var12);

  abstract int getMinimumY();

  static final void method1859(double var0, int var2) {
    try {
      if (SceneSomething2.aDouble1050 != var0) {
        for (int var3 = 0; 256 > var3; ++var3) {
          int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, var0));
          GameBuffer.anIntArray3804[var3] = ~var4 < -256 ? 255 : var4;
        }

        SceneSomething2.aDouble1050 = var0;
      }

      if (var2 != 32258) {
        aBoolean1837 = false;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "th.KC(" + var0 + ',' + var2 + ')');
    }
  }

  public static void method1860(int var0) {
    try {
      aClass109Array1831 = null;
      aClass11Array1836 = null;
      aClass11ArrayArray1834 = null;
      if (var0 != 0) {
        method1860(-87);
      }

      aClass3_Sub28_Sub16_Sub2Array1839 = null;
      anIntArray1835 = null;
      COMMAND_SET_PARTICLES = null;
      anIntArray1833 = null;
      anIntArray1838 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "th.HC(" + var0 + ')');
    }
  }

  static final void setWindowMode(boolean replaceCanvas, int windowMode, int var2, int var3,
                                  int var4) {
    try {
      DummyClass41.aLong866 = 0L;
      int currentWindowMode = MidiSomething.getWindowMode();
      if (windowMode == 3 || 3 == currentWindowMode) {
        replaceCanvas = true;
      }

      if (SignLink.formattedOsName.startsWith("mac") && -1 > ~windowMode) {
        replaceCanvas = true;
      }

      if (var2 != -8914) {
        method1864(false, (byte) 90, null, null, null);
      }

      boolean var6 = false;
      if (currentWindowMode > 0 != ~windowMode < -1) {
        var6 = true;
      }

      if (replaceCanvas && -1 > ~windowMode) {
        var6 = true;
      }

      OndemandFileRequest.setWindowMode(replaceCanvas, windowMode, var6, currentWindowMode, false,
        var3, var4);
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "th.EC(" + replaceCanvas + ',' + windowMode + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final int method1863(int var0, int var1, byte var2, int var3, int var4, int var5,
                              int var6) {
    try {
      int var7;
      if (~(1 & var5) == -2) {
        var7 = var0;
        var0 = var3;
        var3 = var7;
      }

      var7 = 121 % ((var2 - 75) / 50);
      var1 &= 3;
      return ~var1 == -1 ?
        var6 :
        (1 != var1 ? (~var1 != -3 ? var4 : -var3 + 1 + -var6 + 7) : -var4 + 7 + -var0 - -1);
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "th.JC(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ','
          + var6 + ')');
    }
  }

  static final void method1864(boolean var0, byte var1, FileUnpacker var2, SoftwareFont var3,
                               FileUnpacker var4) {
    try {
      DummyClass17.aBoolean1827 = var0;
      StringNode.aClass153_2581 = var4;
      int var6 = -127 / ((var1 - -87) / 32);
      TriChromaticImageCache.aClass153_1370 = var2;
      int var5 = TriChromaticImageCache.aClass153_1370.method2121(0) - 1;
      TextureSampler39.anInt3287 =
        TriChromaticImageCache.aClass153_1370.getAmountChildren(var5, (byte) 101) + var5 * 256;
      GameException.DEFAULT_INVENTORY_OPTIONS =
        new GameString[] {null, null, null, null, GameObject.OPTION_DROP};
      Buffer.aClass94Array2596 =
        new GameString[] {null, null, TextureSampler29.aClass94_3397, null, null};
      TextureSampler10.aClass3_Sub28_Sub17_Sub1_3440 = var3;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "th.FC(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (
          var3 != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method1869(byte var0, int var1, int var2, int var3, int var4, int var5) {
    try {
      int var6 = var2 - var3;
      int var7 = var4 + -var5;
      if (var7 == 0) {
        if (-1 != ~var6) {
          TextureSampler15.method244(2, var3, var5, var2, var1);
        }

      } else if (0 != var6) {
        if (0 > var6) {
          var6 = -var6;
        }

        if (var7 < 0) {
          var7 = -var7;
        }

        int var8 = -102 / ((-53 - var0) / 38);
        boolean var9 = ~var7 > ~var6;
        int var10;
        int var11;
        if (var9) {
          var10 = var5;
          var5 = var3;
          var11 = var4;
          var3 = var10;
          var4 = var2;
          var2 = var11;
        }

        if (var4 < var5) {
          var10 = var5;
          var5 = var4;
          var4 = var10;
          var11 = var3;
          var3 = var2;
          var2 = var11;
        }

        var10 = var3;
        var11 = var4 - var5;
        int var12 = var2 + -var3;
        int var13 = -(var11 >> 1);
        int var14 = var2 <= var3 ? -1 : 1;
        if (~var12 > -1) {
          var12 = -var12;
        }

        int var15;
        if (!var9) {
          for (var15 = var5; var15 <= var4; ++var15) {
            var13 += var12;
            DummyClass35.anIntArrayArray663[var10][var15] = var1;
            if (var13 > 0) {
              var10 += var14;
              var13 -= var11;
            }
          }
        } else {
          for (var15 = var5; var4 >= var15; ++var15) {
            DummyClass35.anIntArrayArray663[var15][var10] = var1;
            var13 += var12;
            if (-1 > ~var13) {
              var10 += var14;
              var13 -= var11;
            }
          }
        }

      } else {
        TextureSampler14.method320(var1, var3, var4, (byte) -107, var5);
      }
    } catch (RuntimeException var16) {
      throw AbstractGameWorld.cascadeException(var16,
        "th.IC(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  static final void method1870(boolean var0) {
    try {
      DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -128);
      SomethingQuickChatK.anInt154 = 1;
      if (!var0) {
        DummyClass55.aClass153_1423 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "th.GC(" + var0 + ')');
    }
  }

}
