final class SomethingTilek {

  static int[] anIntArray1662;
  static int viewportUpperZ;
  static Queue aClass13_1666 = new Queue();
  static int anInt1668 = -1;
  static AbstractFont p12Font;
  static GameClient client;
  static int anInt1672 = 0;
  static int anInt1676 = 0;
  static int anInt1677;
  static GameString OK = SpawnedGameObject.createString("OK");
  int anInt1663;
  int anInt1664;
  int anInt1667;
  int anInt1670;
  int anInt1673;
  boolean aBoolean1674 = true;
  int anInt1675;


  SomethingTilek(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
    try {
      this.anInt1667 = var2;
      this.anInt1664 = var3;
      this.anInt1675 = var1;
      this.anInt1673 = var6;
      this.aBoolean1674 = var7;
      this.anInt1663 = var4;
      this.anInt1670 = var5;
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "rh.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ','
          + var7 + ')');
    }
  }

  public static void method1751(byte var0) {
    try {
      aClass13_1666 = null;
      client = null;
      OK = null;
      anIntArray1662 = null;
      p12Font = null;
      if (var0 != -58) {
        aClass13_1666 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rh.A(" + var0 + ')');
    }
  }

}
