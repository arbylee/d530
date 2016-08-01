abstract class AbstractSomethingTexture {

  static long aLong1102 = 0L;
  static AnimationSomething[] aClass3_Sub28_Sub5Array1103 = new AnimationSomething[14];
  static int anInt1105;
  static int[] OBJECT_TYPES =
    new int[] {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
  static int anInt1108 = 0;
  static int anInt1109 = 0;
  int anInt1101;
  int anInt1104;
  int anInt1106;


  AbstractSomethingTexture(int var1, int var2, int var3) {
    try {
      this.anInt1104 = var2;
      this.anInt1106 = var3;
      this.anInt1101 = var1;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "kf.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  abstract void method1335(int var1, int var2, int var3);

  abstract void method1337(int var1, boolean var2, int var3);

  abstract void method1341(int var1, int var2, int var3);

  public static void method1334(byte var0) {
    try {
      OBJECT_TYPES = null;
      aClass3_Sub28_Sub5Array1103 = null;
      if (var0 != -115) {
        OBJECT_TYPES = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "kf.J(" + var0 + ')');
    }
  }

  static final SceneSomething method1336(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      for (int var4 = 0; var4 < var3.anInt2223; ++var4) {
        SceneSomething var5 = var3.sceneGraphNodes[var4];
        if ((var5.aLong498 >> 29 & 3L) == 2L && var5.anInt483 == var1 && var5.anInt478 == var2) {
          return var5;
        }
      }

      return null;
    }
  }

  static final int method1338(int var0, int var1) {
    try {
      if (var1 <= 13) {
        OBJECT_TYPES = null;
      }

      return 255 & var0;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "kf.H(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1339(GameString var0, int var1) {
    try {
      if (var1 == 0) {
        for (SomethingWorldMapy var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getFirst();
             var2 != null; var2 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getNext()) {
          if (var2.aClass94_3561.method1528((byte) -42, var0)) {
            Buffer.aClass3_Sub28_Sub3_2600 = var2;
            return;
          }
        }

      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "kf.G(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method1340(int var0, int var1, byte var2, int var3, int var4) {
    try {
      if (var2 != -40) {
        anInt1105 = 43;
      }

      for (int var5 = 0; ~SomethingWorldMapy.widgetQuads < ~var5; ++var5) {
        if (~(GlTexture2d.quadx1[var5] + AbstractAudioOutputStream.quadx0[var5]) < ~var0
          && ~(var1 + var0) < ~AbstractAudioOutputStream.quadx0[var5] && ~var3 > ~(
          Mobile.quady1[var5] + Player.quady0[var5]) && Player.quady0[var5] < var3 - -var4) {
          GroundItemNode.aBooleanArray3674[var5] = true;
        }
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "kf.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

}
