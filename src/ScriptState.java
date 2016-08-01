final class ScriptState {

  static int amountFloors;
  static GameString HINT_HEAD_ICONS = SpawnedGameObject.createString("hint_headicons");
  static int anInt872;
  static GameString aClass94_875 = SpawnedGameObject.createString("Benutzen");
  static int anInt876;
  static FileUnpacker configs;
  int[] anIntArray870;
  GameString[] aClass94Array873;
  ClientScript aClass3_Sub28_Sub15_874;
  int anInt877 = -1;

  static final void method1175(int var0, int var1) {
    try {
      TextureSampler13.anInt3362 = -1;
      ProceduralTexture.anInt1150 = -1;
      if (var1 <= 55) {
        method1177(-67, 28L, (byte) 76, null, -45, (short) 94, null, -125);
      }

      SomethingQuickChat2.anInt3536 = var0;
      SomethingInScenePacket202.method117((byte) 87);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "hj.D(" + var0 + ',' + var1 + ')');
    }
  }

  static final boolean method1176(GameString var0, byte var1) {
    try {
      if (var0 != null) {
        for (int var2 = 0; FileSystem.anInt104 > var2; ++var2) {
          if (var0.method1531(SceneSomething2.aClass94Array1046[var2])) {
            return true;
          }
        }

        if (var1 != -82) {
          HINT_HEAD_ICONS = null;
        }

        return var0.method1531(TextureCache.localPlayer.name);
      } else {
        return false;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "hj.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method1177(int var0, long var1, byte var3, GameString var4, int var5,
                               short var6, GameString var7, int var8) {
    try {
      if (var3 > -23) {
        method1177(-45, 37L, (byte) -37, null, -16, (short) 110, null, -75);
      }

      if (!DummyClass36.aBoolean2615) {
        if (TextureSampler25.amountContextActions < 500) {
          GroundItem.aClass94Array2935[TextureSampler25.amountContextActions] = var7;
          DummyClass8.aClass94Array4016[TextureSampler25.amountContextActions] = var4;
          MonoChromaticImageCache.anIntArray1578[TextureSampler25.amountContextActions] =
            ~var0 == 0 ? AnimationSomething.anInt3590 : var0;
          TextureSampler27.aShortArray3095[TextureSampler25.amountContextActions] = var6;
          TextureSampler0.aLongArray3271[TextureSampler25.amountContextActions] = var1;
          DummyClass26.anIntArray1613[TextureSampler25.amountContextActions] = var5;
          DummyClass32.anIntArray512[TextureSampler25.amountContextActions] = var8;
          ++TextureSampler25.amountContextActions;
        }

      }
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "hj.C(" + var0 + ',' + var1 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ','
          + var5 + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ',' + var8 + ')');
    }
  }

  public static void method1178(byte var0) {
    try {
      int var1 = 103 / ((var0 - -13) / 52);
      aClass94_875 = null;
      HINT_HEAD_ICONS = null;
      configs = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "hj.B(" + var0 + ')');
    }
  }

}
