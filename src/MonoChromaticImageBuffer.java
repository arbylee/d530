final class MonoChromaticImageBuffer extends Node {

  static int affiliateId = 0;
  static int anInt2556 = 0;
  static Deque aClass61_2557 = new Deque();
  static boolean tweening = false;
  static int[] anIntArray2559 = new int[] {0, 1, 2, 3, 4, 5, 6, 14};
  static AbstractDirectColorSprite aClass3_Sub28_Sub16_2560;
  static int anInt2561 = -1;
  static GameString aClass94_2562 = SpawnedGameObject.createString("<col=ffffff>");
  static AudioStreamEncoder2 aClass3_Sub24_Sub2_2563;
  int anInt2553;
  int anInt2555;


  MonoChromaticImageBuffer(int var1, int var2) {
    try {
      this.anInt2555 = var2;
      this.anInt2553 = var1;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "qi.<init>(" + var1 + ',' + var2 + ')');
    }
  }

  public static void method511(byte var0) {
    try {
      int var1 = -59 / ((var0 - 67) / 36);
      aClass3_Sub28_Sub16_2560 = null;
      anIntArray2559 = null;
      aClass94_2562 = null;
      aClass61_2557 = null;
      aClass3_Sub24_Sub2_2563 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "qi.A(" + var0 + ')');
    }
  }

  static final void method512(byte var0) {
    try {
      ObjectNode.aClass93_4043.method1524(3);
      ClientScriptCall.aClass93_2442.method1524(3);
      DummyClass14.aClass93_1964.method1524(3);
      if (var0 != -108) {
        aClass3_Sub24_Sub2_2563 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "qi.D(" + var0 + ')');
    }
  }

  static final int method513(int var0, int var1) {
    try {
      int var2 = 0;
      if (~var0 > -1 || ~var0 <= -65537) {
        var2 += 16;
        var0 >>>= 16;
      }

      if (var0 >= 256) {
        var2 += 8;
        var0 >>>= 8;
      }

      if (var0 >= 16) {
        var2 += 4;
        var0 >>>= 4;
      }

      if (var1 <= var0) {
        var0 >>>= 2;
        var2 += 2;
      }

      if (-2 >= ~var0) {
        var0 >>>= 1;
        ++var2;
      }

      return var0 + var2;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "qi.B(" + var0 + ',' + var1 + ')');
    }
  }

  static final int method514(int var0, int var1, byte var2, int var3) {
    try {
      var0 &= 3;
      if (var2 >= -66) {
        method513(-92, 76);
      }

      return ~var0 == -1 ? var1 : (1 == var0 ? var3 : (2 != var0 ? -var3 + 1023 : 1023 + -var1));
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "qi.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

}
