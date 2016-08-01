final class LightIntensity {

  static AbstractDirectColorSprite aClass3_Sub28_Sub16_895;
  static GameString aClass94_897 = SpawnedGameObject.createString("Liste des mises -9 jour charg-Be");
  static int[] variables = new int[2500];
  static int anInt900;
  static GameString aClass94_901 = SpawnedGameObject.createString(
    "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");
  static int anInt902 = 100;
  static int anInt903;
  static int[] anIntArray904 = new int[200];
  static GameString aClass94_905 = SpawnedGameObject.createString("Sprites charg-Bs");
  static int anInt906;
  int anInt896 = 0;
  int anInt899 = 2048;
  int anInt907 = 0;
  int anInt908 = 2048;

  public static void method1192(byte var0) {
    try {
      aClass94_897 = null;
      variables = null;
      aClass94_901 = null;
      anIntArray904 = null;
      aClass94_905 = null;
      if (var0 == -86) {
        aClass3_Sub28_Sub16_895 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ic.B(" + var0 + ')');
    }
  }

  final void method1190(int var1, Buffer var2, int var3) {
    try {
      while (true) {
        int var4 = var2.readUnsignedByte();
        if (var4 == 0) {
          if (var1 != 2) {
            aClass94_905 = null;
          }

          return;
        }

        this.method1191(var4, var2, var3, true);
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ic.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  private final void method1191(int var1, Buffer var2, int var3, boolean var4) {
    try {
      if (1 != var1) {
        if (var1 == 2) {
          this.anInt908 = var2.readUnsignedShort();
        } else if (-4 == ~var1) {
          this.anInt899 = var2.readUnsignedShort();
        } else if (4 == var1) {
          this.anInt907 = var2.method787((byte) 46);
        }
      } else {
        this.anInt896 = var2.readUnsignedByte();
      }

      if (!var4) {
        method1192((byte) 123);
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ic.C(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
    }
  }

}
