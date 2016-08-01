final class Projectile extends SceneNode {

  static int anInt2894;
  static int anInt2901;
  static int anInt2905 = 0;
  static FileUnpacker sprites;
  static boolean aBoolean2910 = true;
  static volatile long aLong2926 = 0L;
  int anInt2899;
  double aDouble2900;
  int anInt2903;
  int anInt2907;
  double aDouble2914;
  int targetId;
  double aDouble2920;
  int anInt2924;
  int anInt2925;
  private double aDouble2895;
  private int anInt2896 = 0;
  private int anInt2897;
  private int anInt2898 = -1;
  private int anInt2902;
  private boolean aBoolean2904 = false;
  private double aDouble2908;
  private DummyClass0 aClass127_Sub1_2909;
  private int anInt2911;
  private int anInt2912 = -32768;
  private double aDouble2913;
  private int anInt2915;
  private int anInt2916;
  private int anInt2917;
  private double aDouble2918;
  private double aDouble2921;
  private int anInt2922 = 0;
  private AnimationSequence aClass142_2923;
  private int anInt2927;


  Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
             int var9, int var10, int var11) {
    try {
      this.anInt2899 = var7;
      this.anInt2902 = var3;
      this.targetId = var10;
      this.anInt2915 = var1;
      this.anInt2907 = var2;
      this.anInt2927 = var8;
      this.anInt2916 = var4;
      this.aBoolean2904 = false;
      this.anInt2903 = var11;
      this.anInt2897 = var9;
      this.anInt2925 = var6;
      this.anInt2911 = var5;
      int var12 = RenderAnimation.method898((byte) 42, this.anInt2915).anInt542;
      if (0 != ~var12) {
        this.aClass142_2923 = GameClient.method45(var12, (byte) -20);
      } else {
        this.aClass142_2923 = null;
      }

    } catch (RuntimeException var13) {
      throw AbstractGameWorld.cascadeException(var13,
        "ra.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ','
          + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
    }
  }

  final void method1867(int var1, int var2, int var3, int var4, int var5) {
  }

  final void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
                  long var9, int var11, DummyClass0 var12) {
    try {
      AbstractModel var13 = this.method2022(-126);
      if (null != var13) {
        var13.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
          this.aClass127_Sub1_2909);
        this.anInt2912 = var13.getMinimumY();
      }
    } catch (RuntimeException var14) {
      throw AbstractGameWorld.cascadeException(var14,
        "ra.IA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ','
          + var7 + ',' + var8 + ',' + var9 + ',' + var11 + ',' + (var12 != null ? "{...}" : "null")
          + ')');
    }
  }

  final int getMinimumY() {
    try {
      return this.anInt2912;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ra.MA()");
    }
  }

  private final AbstractModel method2022(int var1) {
    try {
      if (var1 >= -6) {
        return null;
      } else {
        SpotAnimationConfig var2 = RenderAnimation.method898((byte) 42, this.anInt2915);
        AbstractModel var3 =
          var2.method966(this.anInt2898, (byte) -30, this.anInt2922, this.anInt2896);
        if (null == var3) {
          return null;
        } else {
          var3.method1896(this.anInt2917);
          return var3;
        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ra.G(" + var1 + ')');
    }
  }

  final void update(int var2) {
    try {
      this.aDouble2920 += this.aDouble2895 * (double) var2;
      this.aDouble2900 += this.aDouble2918 * (double) var2;
      this.aBoolean2904 = true;
      if (this.anInt2927 == -1) {
        this.aDouble2914 += this.aDouble2913 * (double) var2;
      } else {
        this.aDouble2914 += (double) var2 * this.aDouble2908 * 0.5D * (double) var2
          + (double) var2 * this.aDouble2913;
        this.aDouble2913 += this.aDouble2908 * (double) var2;
      }

      this.anInt2924 =
        1024 + (int) (325.949D * Math.atan2(this.aDouble2895, this.aDouble2918)) & 2047;
      this.anInt2917 = 2047 & (int) (325.949D * Math.atan2(this.aDouble2913, this.aDouble2921));


      if (this.aClass142_2923 != null) {
        this.anInt2896 += var2;

        while (this.anInt2896 > this.aClass142_2923.anIntArray1869[this.anInt2922]) {
          this.anInt2896 -= this.aClass142_2923.anIntArray1869[this.anInt2922];
          ++this.anInt2922;
          if (~this.anInt2922 <= ~this.aClass142_2923.anIntArray1851.length) {
            this.anInt2922 -= this.aClass142_2923.anInt1865;
            if (this.anInt2922 < 0 || this.aClass142_2923.anIntArray1851.length <= this.anInt2922) {
              this.anInt2922 = 0;
            }
          }

          this.anInt2898 = this.anInt2922 + 1;
          if (this.aClass142_2923.anIntArray1851.length <= this.anInt2898) {
            this.anInt2898 -= this.aClass142_2923.anInt1865;
            if (-1 < ~this.anInt2898
              || ~this.anInt2898 <= ~this.aClass142_2923.anIntArray1851.length) {
              this.anInt2898 = -1;
            }
          }
        }
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ra.D(" + var2 + ')');
    }
  }

  final void method2024(int var1, int var2, int var3, int var4, int var5) {
    try {
      double var6;
      if (!this.aBoolean2904) {
        double var8 = (double) (-this.anInt2916 + var1);
        var6 = (double) (-this.anInt2902 + var5);
        double var10 = Math.sqrt(var6 * var6 + var8 * var8);
        this.aDouble2914 = (double) this.anInt2911;
        this.aDouble2900 = var8 * (double) this.anInt2897 / var10 + (double) this.anInt2916;
        this.aDouble2920 = (double) this.anInt2897 * var6 / var10 + (double) this.anInt2902;
      }

      var6 = (double) (-var3 + var2 + this.anInt2899);
      this.aDouble2918 = ((double) var1 - this.aDouble2900) / var6;
      this.aDouble2895 = (-this.aDouble2920 + (double) var5) / var6;
      this.aDouble2921 =
        Math.sqrt(this.aDouble2918 * this.aDouble2918 + this.aDouble2895 * this.aDouble2895);
      if (0 == ~this.anInt2927) {
        this.aDouble2913 = (-this.aDouble2914 + (double) var4) / var6;
      } else {
        if (!this.aBoolean2904) {
          this.aDouble2913 = -this.aDouble2921 * Math.tan((double) this.anInt2927 * 0.02454369D);
        }

        this.aDouble2908 =
          2.0D * ((double) var4 - this.aDouble2914 - this.aDouble2913 * var6) / (var6 * var6);
      }

    } catch (RuntimeException var12) {
      throw AbstractGameWorld.cascadeException(var12,
        "ra.J(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  public static void method2019(boolean var0) {
    try {
      if (var0) {
        sprites = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ra.C(" + var0 + ')');
    }
  }

  static final void method2020(int var0, GameObjectConfig var1, byte var2, int var3, int var4) {
    try {
      AreaSoundEffect var5 = (AreaSoundEffect) Node.aClass61_78.getFirst();
      if (var2 != -73) {
        method2019(true);
      }

      while (null != var5) {
        if (var4 == var5.anInt2314 && ~var5.anInt2326 == ~(128 * var0)
          && var5.anInt2308 == 128 * var3 && ~var1.anInt1527 == ~var5.aClass111_2320.anInt1527) {
          if (null != var5.aClass3_Sub24_Sub1_2312) {
            MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(
              var5.aClass3_Sub24_Sub1_2312);
            var5.aClass3_Sub24_Sub1_2312 = null;
          }

          if (var5.aClass3_Sub24_Sub1_2315 != null) {
            MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(
              var5.aClass3_Sub24_Sub1_2315);
            var5.aClass3_Sub24_Sub1_2315 = null;
          }

          var5.unlinkNode();
          return;
        }

        var5 = (AreaSoundEffect) Node.aClass61_78.getNext();
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ra.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ','
          + var4 + ')');
    }
  }

  static final boolean isPo2(byte var0, int var1) {
    try {
      if (var0 > -63) {
        anInt2905 = 66;
      }

      return var1 == (-var1 & var1);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ra.H(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method2025(byte var0, int var1) {
    try {
      if (var0 <= -25) {
        ObjectNode.aClass93_4043.method1522(-128, var1);
        ClientScriptCall.aClass93_2442.method1522(-126, var1);
        DummyClass14.aClass93_1964.method1522(-127, var1);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ra.F(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method2026(byte var0, int var1, int var2, int var3) {
    try {
      if (var0 > 114) {
        WidgetUpdate var4 = AudioStreamEncoder3.method466(4, 9, var1);
        var4.g((byte) 33);
        var4.anInt3598 = var3;
        var4.anInt3597 = var2;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ra.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final AbstractDirectColorSprite[] method2027(int var0, byte var1, int var2,
                                                      FileUnpacker var3) {
    try {
      return !SomethingTexture4.loadSprites(var3, var0, var2, -30901) ?
        null :
        (var1 != 11 ? null : SomethingTexture3.method1347(-26802));
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ra.B(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

  static final int method2028(int var0, int var1, int var2) {
    try {
      int var3 = 96 / ((var2 - -75) / 33);

      int var4;
      for (var4 = 1; 1 < var0; var0 >>= 1) {
        if (0 != (1 & var0)) {
          var4 *= var1;
        }

        var1 *= var1;
      }

      if (var0 != 1) {
        return var4;
      } else {
        return var4 * var1;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ra.A(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

}
