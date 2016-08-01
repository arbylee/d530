final class MonoChromaticImageCache {

  static ObjectCache aClass93_1569 = new ObjectCache(200);
  static BufferedFile tableIndexFile;
  static long[] aLongArray1574 = new long[100];
  static GameString aClass94_1575 = SpawnedGameObject.createString(" weitere Optionen");
  static int[] anIntArray1578 = new int[500];
  boolean aBoolean1580 = false;
  private int anInt1568;
  private int anInt1570 = 0;
  private MonoChromaticImageBuffer[] aClass3_Sub26Array1571;
  private int[][] anIntArrayArray1573;
  private int anInt1576 = -1;
  private Deque aClass61_1577 = new Deque();
  private int anInt1579;


  MonoChromaticImageCache(int var1, int var2, int var3) {
    try {
      this.anInt1568 = var2;
      this.aClass3_Sub26Array1571 = new MonoChromaticImageBuffer[this.anInt1568];
      this.anInt1579 = var1;
      this.anIntArrayArray1573 = new int[this.anInt1579][var3];
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "pf.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void method1706(int var1) {
    try {
      for (int var2 = 0; var2 < this.anInt1579; ++var2) {
        this.anIntArrayArray1573[var2] = null;
      }

      if (var1 != 1127165736) {
        method1711(118, 75);
      }

      this.anIntArrayArray1573 = null;
      this.aClass3_Sub26Array1571 = null;
      this.aClass61_1577.clear(-85);
      this.aClass61_1577 = null;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "pf.A(" + var1 + ')');
    }
  }

  final int[] method1709(int var1, int var2) {
    try {
      if (var1 != -16409) {
        this.aBoolean1580 = false;
      }

      if (~this.anInt1568 != ~this.anInt1579) {
        if (this.anInt1579 != 1) {
          MonoChromaticImageBuffer var3 = this.aClass3_Sub26Array1571[var2];
          if (null != var3) {
            this.aBoolean1580 = false;
          } else {
            this.aBoolean1580 = true;
            if (this.anInt1570 < this.anInt1579) {
              var3 = new MonoChromaticImageBuffer(var2, this.anInt1570);
              ++this.anInt1570;
            } else {
              MonoChromaticImageBuffer var4 =
                (MonoChromaticImageBuffer) this.aClass61_1577.method1212(2);
              var3 = new MonoChromaticImageBuffer(var2, var4.anInt2555);
              this.aClass3_Sub26Array1571[var4.anInt2553] = null;
              var4.unlinkNode();
            }

            this.aClass3_Sub26Array1571[var2] = var3;
          }

          this.aClass61_1577.method1216(64, var3);
          return this.anIntArrayArray1573[var3.anInt2555];
        } else {
          this.aBoolean1580 = this.anInt1576 != var2;
          this.anInt1576 = var2;
          return this.anIntArrayArray1573[0];
        }
      } else {
        this.aBoolean1580 = this.aClass3_Sub26Array1571[var2] == null;
        this.aClass3_Sub26Array1571[var2] = DummyClass42.aClass3_Sub26_884;
        return this.anIntArrayArray1573[var2];
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "pf.C(" + var1 + ',' + var2 + ')');
    }
  }

  final int[][] method1710(byte var1) {
    try {
      if (var1 <= 67) {
        return null;
      } else if (this.anInt1579 != this.anInt1568) {
        throw new RuntimeException("Can only retrieve a full image cache");
      } else {
        for (int var2 = 0; this.anInt1579 > var2; ++var2) {
          this.aClass3_Sub26Array1571[var2] = DummyClass42.aClass3_Sub26_884;
        }

        return this.anIntArrayArray1573;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "pf.H(" + var1 + ')');
    }
  }

  public static void method1704(int var0) {
    try {
      aClass93_1569 = null;
      if (var0 != 65536) {
        method1705(-109, -68);
      }

      anIntArray1578 = null;
      aLongArray1574 = null;
      aClass94_1575 = null;
      tableIndexFile = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "pf.G(" + var0 + ')');
    }
  }

  static final float[] method1705(int var0, int var1) {
    try {
      float var2 = GlEnvironment.method1514() + GlEnvironment.method1505();
      int var3 = GlEnvironment.method1510();
      float var7 = 0.58823526F;
      Mouse.aFloatArray1919[3] = 1.0F;
      float var4 = (float) (var3 >> 16 & 255) / 255.0F;
      float var5 = (float) (('\uff1e' & var3) >> 8) / 255.0F;
      Mouse.aFloatArray1919[1] =
        var2 * (float) ClientScript.bitAnd(var0 >> 8, 255) / 255.0F * var5 * var7;
      Mouse.aFloatArray1919[var1] =
        var2 * var7 * var4 * ((float) (ClientScript.bitAnd(16754958, var0) >> 16) / 255.0F);
      float var6 = (float) (var3 & 255) / 255.0F;
      Mouse.aFloatArray1919[2] =
        (float) ClientScript.bitAnd(255, var0) / 255.0F * var6 * var7 * var2;
      return Mouse.aFloatArray1919;
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8, "pf.F(" + var0 + ',' + var1 + ')');
    }
  }

  static final AbstractDirectColorSprite method1707(int var0, int var1, boolean var2, int var3,
                                                    int var4, int var5) {
    try {
      if (var5 != 65536) {
        return null;
      } else {
        int var7 = (!var2 ? 0 : 65536) + var1 + (var0 << 17) + (var4 << 19);
        long var8 = (long) var7 * 3849834839L + 3147483667L * (long) var3;
        AbstractDirectColorSprite var10 =
          (AbstractDirectColorSprite) MouseRecorder.aClass93_1013.get(var8);
        if (var10 == null) {
          DummyClass40.aBoolean837 = false;
          var10 = GameString.method1570(var4, (byte) 13, false, var1, var2, var0, var3, false);
          if (var10 != null && !DummyClass40.aBoolean837) {
            MouseRecorder.aClass93_1013.get((byte) -79, var10, var8);
          }

          return var10;
        } else {
          return var10;
        }
      }
    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "pf.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  static final void method1708(int var0, int var1, int var2) {
    try {
      if (var2 == -2553) {
        WidgetUpdate var3 = AudioStreamEncoder3.method466(var2 ^ -2557, 13, var1);
        var3.g((byte) 33);
        var3.anInt3598 = var0;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "pf.E(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final void method1711(int var0, int var1) {
    try {
      SomethingQuickChat.aClass93_3572.method1522(-127, var0);
      DummyClass15.aClass93_1874.method1522(var1 + -383, var0);
      MouseRecorder.aClass93_1013.method1522(var1 ^ -132, var0);
      if (var1 != 255) {
        method1711(20, 87);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "pf.D(" + var0 + ',' + var1 + ')');
    }
  }

}
