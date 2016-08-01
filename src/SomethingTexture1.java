final class SomethingTexture1 extends AbstractSomethingTexture {

  static SomethingFont aClass33_2637;
  static SceneGraphTile[][][] sceneGraphTiles;
  static int[] anIntArray2639;
  static int anInt2640;
  static GameString aClass94_2641 = SpawnedGameObject.createString("K");
  static int[] anIntArray2642 = new int[] {
    1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0,
    1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5
  };
  static int p12FontFileId;
  static FileUnpacker fileUnpacker6;
  static SomethingFont aClass33_2648;
  private int anInt2636;
  private int anInt2644;
  private int anInt2646;
  private int anInt2647;


  SomethingTexture1(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
    super(var5, var6, var7);

    try {
      this.anInt2647 = var4;
      this.anInt2646 = var1;
      this.anInt2644 = var2;
      this.anInt2636 = var3;
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "kc.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ','
          + var7 + ')');
    }
  }

  final void method1335(int var1, int var2, int var3) {
    try {
      int var4 = var2 * this.anInt2646 >> 12;
      if (var3 != 4898) {
        this.anInt2644 = -39;
      }

      int var7 = this.anInt2647 * var1 >> 12;
      int var6 = this.anInt2644 * var1 >> 12;
      int var5 = this.anInt2636 * var2 >> 12;
      TextureSampler24.method223(true, this.anInt1106, var4, var6, var7, this.anInt1104,
        this.anInt1101, var5);
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "kc.D(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void method1337(int var1, boolean var2, int var3) {
    try {
      if (!var2) {
        this.method1337(-7, false, 66);
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "kc.E(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void method1341(int var1, int var2, int var3) {
    try {
      int var4 = this.anInt2646 * var2 >> 12;
      int var5 = var2 * this.anInt2636 >> 12;
      int var6 = this.anInt2644 * var3 >> 12;
      int var7 = this.anInt2647 * var3 >> 12;
      if (var1 == 2) {
        DummyClass53.method1584(this.anInt1101, var7, var4, var6, -26571, var5);
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "kc.A(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final AbstractDirectColorSprite method1344(int var0, FileUnpacker var1, int var2) {
    try {
      if (var0 < 29) {
        sceneGraphTiles = null;
      }

      return !GroundItem.loadSprites(var1, var2) ? null : Light.method1062(99);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "kc.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  public static void method1345(int var0) {
    try {
      aClass94_2641 = null;
      if (var0 >= -38) {
        method1344(93, null, -70);
      }

      anIntArray2642 = null;
      sceneGraphTiles = null;
      aClass33_2648 = null;
      aClass33_2637 = null;
      fileUnpacker6 = null;
      anIntArray2639 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "kc.B(" + var0 + ')');
    }
  }

}
