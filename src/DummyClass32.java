final class DummyClass32 {

  static int[] anIntArray510 = new int[] {768, 1024, 1280, 512, 1536, 256, 0, 1792};
  static ObjectCache aClass93_511 = new ObjectCache(30);
  static int[] anIntArray512 = new int[500];
  static int anInt513;
  static GameString aClass94_514 = SpawnedGameObject.createString(":duelstake:");
  static int anInt515 = -1;
  static GameString aClass94_516 = SpawnedGameObject.createString("unzap");
  static int anInt517 = 0;
  static SoftwareDirectColorSprite aClass3_Sub28_Sub16_Sub2_518;
  static GameString aClass94_520 = SpawnedGameObject.createString("Chargement des interfaces )2 ");
  static SomethingAudio aClass157_524;
  static Widget aClass11_526 = null;
  private static GameString aClass94_519 = SpawnedGameObject.createString("skill: ");
  static GameString SKILL = aClass94_519;
  private static GameString aClass94_521 = SpawnedGameObject.createString("scroll:");
  static GameString aClass94_523 = aClass94_521;
  static GameString aClass94_528 = aClass94_521;
  private static GameString aClass94_527 = SpawnedGameObject.createString("level: ");
  static GameString aClass94_525 = aClass94_527;

  static final int method961(int var0) {
    try {
      return var0 != 1536 ?
        96 :
        (DummyClass30.anInt453 == 0 ?
          0 :
          MapScene.anInterface5Array70[DummyClass30.anInt453].method24());
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ef.B(" + var0 + ')');
    }
  }

  public static void method962(byte var0) {
    try {
      aClass94_528 = null;
      aClass94_523 = null;
      aClass94_525 = null;
      anIntArray512 = null;
      aClass94_527 = null;
      aClass94_520 = null;
      aClass3_Sub28_Sub16_Sub2_518 = null;
      if (var0 > -44) {
        SKILL = null;
      }

      aClass11_526 = null;
      anIntArray510 = null;
      SKILL = null;
      aClass94_521 = null;
      aClass94_514 = null;
      aClass94_516 = null;
      aClass94_519 = null;
      aClass157_524 = null;
      aClass93_511 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ef.A(" + var0 + ')');
    }
  }

}