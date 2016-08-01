final class ClientScript extends SubNode {

  private static GameString aClass94_3692 = SpawnedGameObject.createString("Members object");
  static HashTable variableUpdates = new HashTable(16);
  static int anInt3681;
  static int loadingPercent = 10;
  static int rectangleDebugType = 0;
  static int[] anIntArray3693 = new int[1000];
  static ClanChatUser[] aClass3_Sub19Array3694;
  static int anInt3695;
  static GameString aClass94_3691 = aClass94_3692;
  int anInt3678;
  int anInt3680;
  int anInt3682;
  int[] anIntArray3683;
  HashTable[] aClass130Array3685;
  GameString aClass94_3686;
  int anInt3687;
  GameString[] aClass94Array3688;
  int[] anIntArray3690;

  static final FloorUnderlay getFloorUnderlay(int var1) {
    try {
      FloorUnderlay underlay = (FloorUnderlay) AbstractGameWorld.floorUnderlays.get((long) var1);
      if (underlay != null) {
        return underlay;
      }
      byte[] bytes = SomethingOtherWorldMap.aClass153_2536.getBytes(1, var1);
      underlay = new FloorUnderlay();
      if (bytes != null) {
        underlay.parseConfig(var1, new Buffer(bytes), 255);
      }
      AbstractGameWorld.floorUnderlays.get((byte) -104, underlay, (long) var1);
      return underlay;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "qc.B(" + var1 + ')');
    }
  }

  static final int method630(byte var0, int var1) {
    try {
      if (var0 != -34) {
        aClass94_3692 = null;
      }

      return 127 & var1 >> 11;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "qc.A(" + var0 + ',' + var1 + ')');
    }
  }

  static final void setFloorFileUnpacker(boolean var0, FileUnpacker var1) {
    try {
      if (!var0) {
        AnimationSomething.configs = var1;
        ScriptState.amountFloors = AnimationSomething.configs.getAmountChildren(4, (byte) 112);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "qc.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method632(int var0) {
    try {
      aClass94_3692 = null;
      aClass94_3691 = null;
      aClass3_Sub19Array3694 = null;
      variableUpdates = null;
      anIntArray3693 = null;
      if (var0 != -30497) {
        aClass3_Sub19Array3694 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "qc.E(" + var0 + ')');
    }
  }

  static int bitAnd(int var0, int var1) {
    try {
      return var0 & var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "qc.C(" + var0 + ',' + var1 + ')');
    }
  }

}
