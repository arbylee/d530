abstract class AbstractFileRequest extends SubNode {

  private static GameString aClass94_3626 = SpawnedGameObject.createString("Created gameworld");
  static int brightnessSetting = 3;
  static int anInt3627;
  static int anInt3630;
  static int anInt3631;
  static GameString aClass94_3633 = SpawnedGameObject.createString("Textures charg-Bes");
  static GameString aClass94_3634 = SpawnedGameObject.createString("Liste des serveurs charg-Be");
  static GameString aClass94_3629 = aClass94_3626;
  boolean aBoolean3628;
  volatile boolean aBoolean3632 = true;
  boolean aBoolean3635;

  abstract int method586(boolean var1);

  abstract byte[] method587(boolean var1);

  public static void method588(byte var0) {
    try {
      aClass94_3626 = null;
      aClass94_3634 = null;
      if (var0 != 120) {
        aClass94_3633 = null;
      }

      aClass94_3633 = null;
      aClass94_3629 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "il.C(" + var0 + ')');
    }
  }

  static final void method589(int var0, int var1, int var2) {
    TextureSampler37.aBoolean3261 = true;
    CollisionMap.anInt1302 = var0;
    GZipDecompressor.anInt819 = var1;
    TextureSampler18.anInt4039 = var2;
    DummyClass32.anInt515 = -1;
    OndemandRequester.anInt999 = -1;
  }

  static final boolean method590(byte var0, int var1, int var2) {
    try {
      if (11 == var2) {
        var2 = 10;
      }

      int var3 = -59 % ((var0 - 26) / 55);
      if (-6 >= ~var2 && var2 <= 8) {
        var2 = 4;
      }

      GameObjectConfig var4 = DummyClass11.method2207(4, var1);
      return var4.method1684(115, var2);
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "il.D(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

}
