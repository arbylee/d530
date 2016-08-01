final class ProjectileNode extends SubNode {

  static GameString aClass94_3771 = SpawnedGameObject.createString("Chargement en cours)3)3)3");
  static FileUnpacker animationBases;
  static int primaryPort;
  static GameString aClass94_3774 = SpawnedGameObject.createString("clignotant1:");
  static int anInt3775 = 0;
  static Cache aClass47_3776 = new Cache(64);
  static GameString aClass94_3777 = SpawnedGameObject.createString(" x ");
  static boolean aBoolean3779 = false;
  static int[] anIntArray3780 = new int[32];
  Projectile projectile;


  ProjectileNode(Projectile var1) {
    try {
      this.projectile = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "ud.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final boolean method715(int var0, Widget var1) {
    try {
      if (var0 == var1.anInt189) {
        DummyClass13.anInt2023 = 250;
        return true;
      } else {
        return false;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "ud.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method716(int var0) {
    try {
      SceneShadowMap.aClass93_1772.method1524(3);
      if (var0 != 14073) {
        method717(9);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ud.A(" + var0 + ')');
    }
  }

  public static void method717(int var0) {
    try {
      aClass94_3777 = null;
      aClass94_3774 = null;
      int var1 = 54 % ((48 - var0) / 56);
      anIntArray3780 = null;
      animationBases = null;
      aClass47_3776 = null;
      aClass94_3771 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ud.C(" + var0 + ')');
    }
  }

}
