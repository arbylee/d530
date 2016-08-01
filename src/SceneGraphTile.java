final class SceneGraphTile extends Node {

  private static GameString aClass94_2224 = SpawnedGameObject.createString("Please wait)3)3)3");
  static GameString aClass94_2215 = SpawnedGameObject.createString("Konfig geladen)3");
  static int anInt2217 = 2;
  static int anInt2218 = -1;
  static short[] aShortArray2219 =
    new short[] {(short) -4160, (short) -4163, (short) -8256, (short) -8259, (short) 22461};
  static HashTable aClass130_2220 = new HashTable(32);
  static GameString aClass94_2242 = SpawnedGameObject.createString("welle2:");
  static int anInt2243 = 3353893;
  static int anInt2246 = 0;
  static GameString aClass94_2216 = aClass94_2224;
  SceneSomething[] sceneGraphNodes = new SceneSomething[5];
  boolean aBoolean2222;
  int anInt2223;
  boolean aBoolean2225;
  SomethingSceneTile aClass35_2226;
  int anInt2227;
  int flags = 0;
  int anInt2229;
  SomethingSceneJ aClass12_2230;
  int anInt2231;
  int anInt2232;
  SomethingSceneI aClass19_2233;
  SceneSomething2 aClass70_2234;
  SceneGraphTile aClass3_Sub2_2235;
  boolean aBoolean2236;
  int[] anIntArray2237 = new int[5];
  int anInt2238;
  int anInt2239;
  SomethingTilek aClass126_2240;
  int anInt2241;
  int anInt2244;
  SomethingScene aClass72_2245;

  SceneGraphTile(int var1, int var2, int var3) {
    try {
      this.anInt2231 = var3;
      this.anInt2238 = this.anInt2244 = var1;
      this.anInt2239 = var2;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "bj.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  public static void method102(int var0) {
    try {
      aClass130_2220 = null;
      if (var0 != 3353893) {
        aClass94_2216 = null;
      }

      aShortArray2219 = null;
      aClass94_2242 = null;
      aClass94_2215 = null;
      aClass94_2224 = null;
      aClass94_2216 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bj.A(" + var0 + ')');
    }
  }

  static final void method103(byte var0) {
    try {
      GameClient.aClass130_2194.clear(122);
      if (var0 <= 18) {
        aClass94_2224 = null;
      }

      DummyClass50.aClass13_1139.clear();
      SomethingTilek.aClass13_1666.clear();
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bj.B(" + var0 + ')');
    }
  }

  static final long method104(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    return var3 != null && var3.aClass12_2230 != null ? var3.aClass12_2230.aLong328 : 0L;
  }

}
