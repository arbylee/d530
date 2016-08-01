final class GameWorld extends AbstractGameWorld {

  private static GameString aClass94_2619 = SpawnedGameObject.createString("Loaded update list");
  static int anInt2622 = 0;
  static boolean aBoolean2623 = true;
  static int deltaTime = 20;
  static AbstractAudioOutputStream audioOutputStream0;
  static GameString aClass94_2628 = SpawnedGameObject.createString("Stufe: ");
  static GameString aClass94_2624 = aClass94_2619;
  GameString aClass94_2620;
  int anInt2621;
  GameString aClass94_2625;

  final GameWorldSomething method1078(int var1) {
    try {
      int var2 = -35 / ((var1 - 0) / 56);
      return DummyClass25.aClass26Array1627[this.anInt721];
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ba.B(" + var1 + ')');
    }
  }

  static final void method1076(int var0) {
    try {
      DummyClass14.aClass93_1964.method1524(3);
      int var1 = -86 % ((var0 - -55) / 41);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ba.C(" + var0 + ')');
    }
  }

  public static void method1077(int var0) {
    try {
      aClass94_2619 = null;
      aClass94_2624 = null;
      audioOutputStream0 = null;
      if (var0 != 0) {
        deltaTime = 89;
      }

      aClass94_2628 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ba.A(" + var0 + ')');
    }
  }

  static final int getInventoryFreeSpace(int var0, byte var1) {
    try {
      if (0 > var0) {
        return 0;
      } else {
        Inventory var2 = (Inventory) SceneGraphTile.aClass130_2220.get((long) var0);
        if (var2 == null) {
          return BufferObject.method2069(var0, -126).size;
        } else if (var1 > -56) {
          return -13;
        } else {
          int var3 = 0;

          for (int var4 = 0; var4 < var2.ids.length; ++var4) {
            if (0 == ~var2.ids[var4]) {
              ++var3;
            }
          }

          var3 += BufferObject.method2069(var0, -100).size + -var2.ids.length;
          return var3;
        }
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "ba.D(" + var0 + ',' + var1 + ')');
    }
  }

}
