final class DummyClass20 {

  static int anInt1781;
  static GameString aClass94_1782 = SpawnedGameObject.createString("Prendre");
  static GameString aClass94_1783 = SpawnedGameObject.createString(" de votre liste d(Wamis)3");
  static boolean aBoolean1784 = false;


  static final int method1817(byte var0) {
    try {
      if (var0 != 70) {
        method1818(true);
      }

      return !FileCacheRequester.aBoolean1084 ?
        (!NPC.method1986(var0 ^ 28) ? 1 : (AbstractObjectNode.aBoolean3604 ? 2 : 1)) :
        0;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "tc.B(" + var0 + ')');
    }
  }

  public static void method1818(boolean var0) {
    try {
      aClass94_1782 = null;
      if (var0) {
        aClass94_1783 = null;
      }

      aClass94_1783 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "tc.C(" + var0 + ')');
    }
  }

  static final void method1819(int var0, int var1, Widget var2, byte var3, int var4, int var5,
                               int var6, int var7) {
    try {
      if (var3 >= -89) {
        method1818(true);
      }

      if (!DirectImageProducer.aBoolean2981) {
        SomethingSceneI.anInt433 = 0;
      } else {
        SomethingSceneI.anInt433 = 32;
      }

      DirectImageProducer.aBoolean2981 = false;
      int var8;
      if (~TextureSampler21.anInt3069 != -1) {
        if (~var5 >= ~var4 && ~(var5 + 16) < ~var4 && var0 >= var6 && var6 - -16 > var0) {
          var2.anInt208 -= 4;
          DummyClass29.method909(113, var2);
        } else if (var4 >= var5 && ~var4 > ~(16 + var5) && ~var0 <= ~(var1 + (var6 - 16))
          && ~(var1 + var6) < ~var0) {
          var2.anInt208 += 4;
          DummyClass29.method909(112, var2);
        } else if (~var4 <= ~(var5 - SomethingSceneI.anInt433)
          && var4 < var5 + 16 + SomethingSceneI.anInt433 && var0 >= 16 + var6
          && var1 + var6 - 16 > var0) {
          var8 = var1 * (-32 + var1) / var7;
          if (8 > var8) {
            var8 = 8;
          }

          int var10 = -32 + (var1 - var8);
          int var9 = -(var8 / 2) + -16 + -var6 + var0;
          var2.anInt208 = (-var1 + var7) * var9 / var10;
          DummyClass29.method909(-48, var2);
          DirectImageProducer.aBoolean2981 = true;
        }
      }

      if (~PlayerVariable.mouseWheelOffset != -1) {
        var8 = var2.anInt168;
        if (~(-var8 + var5) >= ~var4 && ~var6 >= ~var0 && var4 < 16 + var5 && var1 + var6 >= var0) {
          var2.anInt208 += 45 * PlayerVariable.mouseWheelOffset;
          DummyClass29.method909(-116, var2);
        }
      }

    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "tc.A(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ','
          + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
    }
  }

}
