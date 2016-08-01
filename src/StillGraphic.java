final class StillGraphic extends SceneNode {

  static GameString FONT_P11 = SpawnedGameObject.createString("p11_full");
  static int anInt2701 = 0;
  static GameString FLOOR_SHADOWS = SpawnedGameObject.createString("floorshadows");
  static boolean aBoolean2705 = true;
  static GameString aClass94_2707 = SpawnedGameObject.createString("<br>(X100(U(Y");
  static int[] BIT_MASKS = new int[] {
    0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071,
    262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
    268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1
  };
  static boolean aBoolean2713;
  int anInt2703;
  int anInt2710;
  int anInt2712;
  int anInt2716;
  int anInt2717;
  boolean aBoolean2718 = false;
  private DummyClass0 aClass127_Sub1_2704;
  private int anInt2706 = 0;
  private int anInt2708;
  private AnimationSequence aClass142_2711;
  private int anInt2714 = -1;
  private int anInt2715 = -32768;
  private int anInt2719 = 0;


  StillGraphic(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
    try {
      this.anInt2710 = var4;
      this.anInt2716 = var3;
      this.anInt2717 = var2;
      this.anInt2703 = var7 + var6;
      this.anInt2708 = var1;
      this.anInt2712 = var5;
      int var8 = RenderAnimation.method898((byte) 42, this.anInt2708).anInt542;
      if (-1 == var8) {
        this.aBoolean2718 = true;
      } else {
        this.aBoolean2718 = false;
        this.aClass142_2711 = GameClient.method45(var8, (byte) -20);
      }

    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "bh.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ','
          + var7 + ')');
    }
  }

  private final AbstractModel getModel(boolean var1) {
    try {
      SpotAnimationConfig var2 = RenderAnimation.method898((byte) 42, this.anInt2708);
      if (var1) {
        aClass94_2707 = null;
      }

      AbstractModel var3;
      if (!this.aBoolean2718) {
        var3 = var2.method966(this.anInt2714, (byte) -30, this.anInt2706, this.anInt2719);
      } else {
        var3 = var2.method966(-1, (byte) -30, -1, 0);
      }

      return var3 == null ? null : var3;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "bh.E(" + var1 + ')');
    }
  }

  final void method1955(boolean var1, int var2) {
    try {
      if (!this.aBoolean2718) {
        if (!var1) {
          this.method1955(true, -72);
        }

        this.anInt2719 += var2;

        while (~this.anInt2719 < ~this.aClass142_2711.anIntArray1869[this.anInt2706]) {
          this.anInt2719 -= this.aClass142_2711.anIntArray1869[this.anInt2706];
          ++this.anInt2706;
          if (~this.aClass142_2711.anIntArray1851.length >= ~this.anInt2706) {
            this.aBoolean2718 = true;
            break;
          }
        }

      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "bh.A(" + var1 + ',' + var2 + ')');
    }
  }

  final void method1867(int var1, int var2, int var3, int var4, int var5) {
  }

  final void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
                  long var9, int var11, DummyClass0 var12) {
    try {
      AbstractModel var13 = this.getModel(false);
      if (var13 != null) {
        var13.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
          this.aClass127_Sub1_2704);
        this.anInt2715 = var13.getMinimumY();
      }
    } catch (RuntimeException var14) {
      throw AbstractGameWorld.cascadeException(var14,
        "bh.IA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ','
          + var7 + ',' + var8 + ',' + var9 + ',' + var11 + ',' + (var12 != null ? "{...}" : "null")
          + ')');
    }
  }

  final int getMinimumY() {
    try {
      return this.anInt2715;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bh.MA()");
    }
  }

  static final void method1950(Mobile var0, boolean var1) {
    try {
      int var2 = var0.anInt2800 - AbstractGameWorld.updateCycle;
      int var3 = 128 * var0.anInt2784 - -(64 * var0.getSize());
      if (var1) {
        int var4 = 128 * var0.anInt2835 - -(var0.getSize() * 64);
        if (0 == var0.anInt2840) {
          var0.anInt2806 = 1024;
        }

        var0.anInt2819 += (-var0.anInt2819 + var3) / var2;
        var0.anInt2829 += (var4 + -var0.anInt2829) / var2;
        if (var0.anInt2840 == 1) {
          var0.anInt2806 = 1536;
        }

        var0.anInt2824 = 0;
        if (~var0.anInt2840 == -3) {
          var0.anInt2806 = 0;
        }

        if (~var0.anInt2840 == -4) {
          var0.anInt2806 = 512;
        }

      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "bh.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final int method1951(int var0, byte var1) {
    try {
      if (var1 > -67) {
        aBoolean2713 = false;
      }

      return var0 >>> 8;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bh.D(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1952(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               int var7) {
    try {
      int var8;
      int var9;
      if (GlRenderer.useOpenGlRenderer) {
        var8 = -334 + var2;
        if (var8 >= 0) {
          if (-101 > ~var8) {
            var8 = 100;
          }
        } else {
          var8 = 0;
        }

        var9 = var8 * (-DummyOutputStream.aShort46 + GameObjectConfig.aShort1535) / 100
          + DummyOutputStream.aShort46;
        var4 = var9 * var4 >> 8;
      }

      var8 = -var7 + 2048 & 2047;
      var9 = 2047 & -var5 + 2048;
      int var10 = 0;
      int var12 = var4;
      int var11 = 0;
      int var13;
      int var14;
      if (~var8 != -1) {
        var14 = DummyClass40.COSINE_TABLE[var8];
        var13 = DummyClass40.SINE_TABLE[var8];
        var11 = var13 * -var4 >> 16;
        var12 = var14 * var4 >> 16;
      }

      if (0 != var9) {
        var13 = DummyClass40.SINE_TABLE[var9];
        var14 = DummyClass40.COSINE_TABLE[var9];
        var10 = var13 * var12 >> 16;
        var12 = var12 * var14 >> 16;
      }

      if (var1 != -1907397104) {
        method1950(null, false);
      }

      DummyClass17.anInt1823 = var7;
      TextureSampler28.anInt3315 = var5;
      DummyClass49.anInt1111 = var6 + -var12;
      NPC.anInt3995 = var0 + -var10;
      EnumStringFetcher.anInt2162 = -var11 + var3;
    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15,
        "bh.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ')');
    }
  }

  static final GameWorld method1953(byte var0) {
    try {
      if (var0 <= 97) {
        BIT_MASKS = null;
      }

      SomethingMidiFile.anInt2291 = 0;
      return ItemConfig.method1107(5422);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bh.H(" + var0 + ')');
    }
  }

  public static void method1954(int var0) {
    try {
      if (var0 == 0) {
        FLOOR_SHADOWS = null;
        FONT_P11 = null;
        BIT_MASKS = null;
        aClass94_2707 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bh.B(" + var0 + ')');
    }
  }

  static final void method1956(int var0, int var1, int var2, int var3) {
    SceneGraphTile var4 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var4 != null) {
      SomethingSceneI var5 = var4.aClass19_2233;
      if (var5 != null) {
        var5.anInt430 = var5.anInt430 * var3 / 16;
        var5.anInt426 = var5.anInt426 * var3 / 16;
      }
    }
  }

}
