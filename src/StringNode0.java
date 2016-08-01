final class StringNode0 extends Node {

  static GameString aClass94_2336 = SpawnedGameObject.createString("M");
  static int anInt2337;
  static int[] anIntArray2338 = new int[] {160, 192, 80, 96, 0, 144, 80, 48, 160};
  static byte[][][] aByteArrayArrayArray2339;
  static GameString aClass94_2340 = SpawnedGameObject.createString("Bitte warten Sie)3)3)3");
  GameString aClass94_2341;


  public StringNode0() {
  }

  StringNode0(GameString var1, int var2) {
    try {
      this.aClass94_2341 = var1;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "hb.<init>(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  static final void method138(GameString var0, int var1) {
    try {
      OndemandRequester.method1250(var1 ^ 93, false);
      AbstractSomethingTexture.method1339(var0, var1 + var1);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "hb.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method139(int var0) {
    try {
      if (var0 >= 63) {
        DummyCanvas.aClass93_21.method1524(3);
        DummyClass54.aClass93_1401.method1524(3);
        ObjectNode.aClass93_4051.method1524(3);
        DummyClass14.aClass93_1965.method1524(3);
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "hb.D(" + var0 + ')');
    }
  }

  static final boolean method140(int var0, int var1) {
    try {
      int var2 = -11 / ((-29 - var1) / 49);
      return ~var0 <= -1 && AudioStreamEncoder4.aBooleanArray3503.length > var0 ?
        AudioStreamEncoder4.aBooleanArray3503[var0] :
        false;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "hb.A(" + var0 + ',' + var1 + ')');
    }
  }

  static final RenderAnimation getRenderAnimation(boolean var0, int var1) {
    try {
      RenderAnimation var2 = (RenderAnimation) DummyClass14.aClass93_1955.get((long) var1);
      if (var2 == null) {
        byte[] var3 = TriChromaticImageCache.aClass153_1372.getBytes(32, var1);
        if (var0) {
          aByteArrayArrayArray2339 = null;
        }

        var2 = new RenderAnimation();
        if (var3 != null) {
          var2.method901(-1, new Buffer(var3));
        }

        var2.method899(96);
        DummyClass14.aClass93_1955.get((byte) -96, var2, (long) var1);
        return var2;
      } else {
        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "hb.E(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method142(boolean var0) {
    try {
      if (!var0) {
        aByteArrayArrayArray2339 = null;
      }

      DirectImageProducer.aClass93_2982.method1524(3);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "hb.C(" + var0 + ')');
    }
  }

  public static void method143(int var0) {
    try {
      aClass94_2340 = null;
      anIntArray2338 = null;
      aClass94_2336 = null;
      if (var0 <= -16) {
        aByteArrayArrayArray2339 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "hb.B(" + var0 + ')');
    }
  }

}
