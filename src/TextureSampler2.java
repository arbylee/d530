final class TextureSampler2 extends AbstractTextureSampler {

  private static GameString aClass94_3371 = SpawnedGameObject.createString("Sat");
  private static GameString aClass94_3372 = SpawnedGameObject.createString("Mon");
  private static GameString aClass94_3374 = SpawnedGameObject.createString("Fri");
  private static GameString aClass94_3378 = SpawnedGameObject.createString("Wed");
  private static GameString aClass94_3379 = SpawnedGameObject.createString("Thu");
  private static GameString aClass94_3380 = SpawnedGameObject.createString("Tue");
  private static GameString aClass94_3381 = SpawnedGameObject.createString("Sun");
  static ObjectCache aClass93_3369 = new ObjectCache(64);
  static GameString aClass94_3370 = SpawnedGameObject.createString("hitmarks");
  static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array3373;
  static int anInt3375 = 0;
  static int anInt3377 = 7759444;
  static GameString aClass94_3382 = SpawnedGameObject.createString("(U0a )2 in: ");
  static GameString[] aClass94Array3376 = new GameString[] {
    aClass94_3381, aClass94_3372, aClass94_3380, aClass94_3378, aClass94_3379, aClass94_3374,
    aClass94_3371
  };

  public TextureSampler2() {
    super(0, true);
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var3 = -96 / ((var2 - 30) / 36);
      return TextureCache.anIntArray2125;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "rl.D(" + var1 + ',' + var2 + ')');
    }
  }

  public static void method317(int var0) {
    try {
      aClass94Array3376 = null;
      aClass94_3378 = null;
      aClass94_3374 = null;
      aClass94_3382 = null;
      aClass94_3381 = null;
      aClass94_3372 = null;
      aClass94_3380 = null;
      if (var0 != 7759444) {
        method317(72);
      }

      aClass93_3369 = null;
      aClass94_3379 = null;
      aClass3_Sub28_Sub16Array3373 = null;
      aClass94_3370 = null;
      aClass94_3371 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rl.C(" + var0 + ')');
    }
  }

  static final void method318(int var0) {
    try {
      SpawnedGameObject var1 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getFirst();
      if (var0 != 7759444) {
        aClass94_3379 = null;
      }

      for (; null != var1; var1 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getNext()) {
        if (var1.aliveTime != -1) {
          var1.unlinkNode();
        } else {
          var1.anInt2261 = 0;
          DummyClass22.method1798(56, var1);
        }
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rl.B(" + var0 + ')');
    }
  }

}
