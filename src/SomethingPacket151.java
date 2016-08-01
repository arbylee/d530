final class SomethingPacket151 extends Node {

  static ObjectCache aClass93_2604 = new ObjectCache(64);
  static GameString COMMAND_DROP_JS5 = SpawnedGameObject.createString("::clientjs5drop");
  static int[] anIntArray2606;
  static int anInt2607;
  static GameString aClass94_2608 = SpawnedGameObject.createString(")4l=");
  int anInt2602;
  int anInt2603;

  static final void method820(int var0, int var1) {
    try {
      Keyboard.aClass93_1911.method1522(-127, var0);
      if (var1 == 64) {
        HashTableIterator.aClass93_1131.method1522(-126, var0);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "wk.C(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method821(int var0) {
    try {
      aClass93_2604 = null;
      anIntArray2606 = null;
      COMMAND_DROP_JS5 = null;
      aClass94_2608 = null;
      if (var0 != 26971) {
        method820(-51, -76);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "wk.B(" + var0 + ')');
    }
  }

  static final GameString[] method822(int var0, GameString[] var1) {
    try {
      GameString[] var2 = new GameString[5];
      if (var0 != 19406) {
        method821(-26);
      }

      for (int var3 = 0; ~var3 > -6; ++var3) {
        var2[var3] = RenderAnimation.concat(
          new GameString[] {SomethingScene.toString(var3), SomethingQuickChat.aClass94_3577});
        if (var1 != null && null != var1[var3]) {
          var2[var3] = RenderAnimation.concat(new GameString[] {var2[var3], var1[var3]});
        }
      }

      return var2;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "wk.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

}
