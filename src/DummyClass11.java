final class DummyClass11 {

  static int anInt2036;
  static int anInt2037;
  static int anInt2038 = 0;
  static int[][] anIntArrayArray2039 = new int[][] {
    {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
    {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3},
    {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
    {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}
  };
  static byte[] aByteArray2040 = new byte[520];


  static final void method2203(Player var0, int var1) {
    try {
      AreaSoundEffect var2 =
        (AreaSoundEffect) ObjectNode.aClass130_4046.get(var0.name.toBase37());
      if (var1 != 8) {
        writeUID(null, -44);
      }

      if (null != var2) {
        if (var2.aClass3_Sub24_Sub1_2312 != null) {
          MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(var2.aClass3_Sub24_Sub1_2312);
          var2.aClass3_Sub24_Sub1_2312 = null;
        }

        var2.unlinkNode();
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "wc.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void writeUID(Buffer var0, int var1) {
    try {
      if (null != LinearHashTable.uidFile) {
        try {
          LinearHashTable.uidFile.seek(-117, 0L);
          LinearHashTable.uidFile.write(var0.bytes, var0.position, -903171152, 24);
        } catch (Exception var3) {
        }
      }

      if (var1 >= 45) {
        var0.position += 24;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "wc.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  public static void method2205(int var0) {
    try {
      anIntArrayArray2039 = null;
      aByteArray2040 = null;
      if (var0 != -17413) {
        anInt2036 = 77;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "wc.C(" + var0 + ')');
    }
  }

  static final void method2206(boolean var0, int var1) {
    try {
      WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 4, var1);
      var2.createIndexedColorSprite(var0);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "wc.A(" + var0 + ',' + var1 + ')');
    }
  }

  static final GameObjectConfig method2207(int var0, int var1) {
    try {
      if (var0 != 4) {
        method2205(95);
      }

      GameObjectConfig var2 = (GameObjectConfig) DummyCanvas.aClass93_21.get((long) var1);
      if (var2 == null) {
        byte[] var3 = DummyClass52.aClass153_1171
          .getBytes(TextureSampler36.method340(var1, -51), AudioWorker.method893(var1, (byte) 110));
        var2 = new GameObjectConfig();
        var2.anInt1527 = var1;
        if (null != var3) {
          var2.method1692(6219, new Buffer(var3));
        }

        var2.method1689(var0 + -2120);
        if (!DummyClass28.aBoolean337 && var2.aBoolean1491) {
          var2.aClass94Array1499 = null;
        }

        if (var2.aBoolean1498) {
          var2.anInt1538 = 0;
          var2.aBoolean1486 = false;
        }

        DummyCanvas.aClass93_21.get((byte) -114, var2, (long) var1);
        return var2;
      } else {
        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "wc.D(" + var0 + ',' + var1 + ')');
    }
  }

}
