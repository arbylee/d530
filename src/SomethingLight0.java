final class SomethingLight0 {

  static int interfaceCounter = 0;
  static GameString aClass94_1546 = SpawnedGameObject.createString("welle:");
  static int anInt1552 = 0;
  static GameString aClass94_1556 = SpawnedGameObject.createString("hint_mapmarkers");
  static GameString aClass94_1558 = SpawnedGameObject.createString(": ");
  static int anInt1559;
  static GameString aClass94_1567 = SpawnedGameObject.createString("mapdots");
  int anInt1544;
  int anInt1545;
  int anInt1547;
  int anInt1548;
  int anInt1549;
  int anInt1550;
  int anInt1551;
  int anInt1553;
  int anInt1554;
  int anInt1555;
  int anInt1557;
  int anInt1560;
  int anInt1561;
  int anInt1562;
  int anInt1563;
  int anInt1564;
  int anInt1565;
  int anInt1566;

  static final void method1702(byte var0, boolean var1) {
    try {
      if (!var1 != !DummyClass28.aBoolean337) {
        DummyClass28.aBoolean337 = var1;
        if (var0 > -117) {
          aClass94_1546 = null;
        }

        StringNode0.method139(76);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "pe.B(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1703(int var0) {
    try {
      aClass94_1558 = null;
      if (var0 != 10967) {
        method1703(-117);
      }

      aClass94_1546 = null;
      aClass94_1556 = null;
      aClass94_1567 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "pe.A(" + var0 + ')');
    }
  }

}
