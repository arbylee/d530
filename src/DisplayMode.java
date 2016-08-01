final class DisplayMode {

  private static GameString aClass94_1440 =
    SpawnedGameObject.createString("Connected to update server");
  static int anInt1439;
  static boolean useBumpMaps = true;
  static int viewY = 0;
  static MouseRecorder aClass67_1443;
  static short aShort1444 = 256;
  static int loopCycle = 0;
  static boolean aBoolean1451 = false;
  static GameString CONNECTED_TO_UPDATE_SERVER = aClass94_1440;
  int anInt1447;
  int anInt1448;
  int anInt1449;
  int anInt1450;

  static final void method1642(int var0, GameString var1) {
    try {
      if (null != ClientScript.aClass3_Sub19Array3694) {
        if (var0 != 3803) {
          aClass67_1443 = null;
        }

        long var3 = var1.toBase37();
        int var2 = 0;
        if (var3 != 0L) {
          while (ClientScript.aClass3_Sub19Array3694.length > var2
            && ~ClientScript.aClass3_Sub19Array3694[var2].key != ~var3) {
            ++var2;
          }

          if (var2 < ClientScript.aClass3_Sub19Array3694.length
            && null != ClientScript.aClass3_Sub19Array3694[var2]) {
            ++DummyClass37.anInt671;
            TextureSampler12.secureBuffer.writePacket(162);
            TextureSampler12.secureBuffer.writeLong(ClientScript.aClass3_Sub19Array3694[var2].key);
          }
        }
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "od.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final int method1643(int var0, boolean var1, int var2, int var3) {
    try {
      if (var0 != 10131) {
        method1644((byte) 95);
      }

      Inventory var4 = (Inventory) SceneGraphTile.aClass130_2220.get((long) var2);
      if (null != var4) {
        int var5 = 0;

        for (int var6 = 0; ~var4.ids.length < ~var6; ++var6) {
          if (var4.ids[var6] >= 0 && TextureSampler39.anInt3287 > var4.ids[var6]) {
            ItemConfig var7 = DummyClass35.getItemConfig(var4.ids[var6], (byte) 79);
            if (null != var7.aClass130_798) {
              IntegerNode var8 = (IntegerNode) var7.aClass130_798.get((long) var3);
              if (null != var8) {
                if (var1) {
                  var5 += var4.counts[var6] * var8.anInt2467;
                } else {
                  var5 += var8.anInt2467;
                }
              }
            }
          }
        }

        return var5;
      } else {
        return 0;
      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "od.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  public static void method1644(byte var0) {
    try {
      aClass67_1443 = null;
      if (var0 != 121) {
        aClass67_1443 = null;
      }

      CONNECTED_TO_UPDATE_SERVER = null;
      aClass94_1440 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "od.A(" + var0 + ')');
    }
  }

}
