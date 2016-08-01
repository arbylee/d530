import java.io.IOException;
import java.io.OutputStream;

final class DummyOutputStream extends OutputStream {

  static GameString[] titleSuffixes;
  static short aShort46 = 256;
  static boolean aBoolean47 = false;
  static int anInt48 = 2;
  static int[] anIntArray49;
  static GameString aClass94_50 = SpawnedGameObject.createString("<col=80ff00>");
  static GameString aClass94_51 = SpawnedGameObject.createString("; Expires=");


  static final short[] copy(int var0, short[] var1) {
    try {
      if (var0 != 23032) {
        return null;
      } else if (null != var1) {
        short[] var2 = new short[var1.length];
        ArrayUtils.method1361(var1, 0, var2, 0, var1.length);
        return var2;
      } else {
        return null;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "vg.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method66(GameString var0, int var1, int var2, byte var3, int var4) {
    try {
      Widget var5 = AbstractDirectColorSprite.method638((byte) -19, var4, var1);
      if (null != var5) {
        if (var5.anObjectArray314 != null) {
          ClientScriptCall var6 = new ClientScriptCall();
          var6.arguments = var5.anObjectArray314;
          var6.aClass11_2449 = var5;
          var6.aClass94_2439 = var0;
          var6.anInt2445 = var2;
          Light.executeScript(var6);
        }

        boolean var8 = true;
        if (0 < var5.anInt189) {
          var8 = ProjectileNode.method715(205, var5);
        }

        if (var8) {
          if (GameClient.method44(var5).method92(var2 - 1, (byte) -108)) {
            if (1 == var2) {
              TextureSampler12.secureBuffer.writePacket(155);
              TextureSampler12.secureBuffer.writeInt(var4);
              ++Deque.anInt937;
              TextureSampler12.secureBuffer.writeShort(var1);
            }

            if (var3 < -7) {
              if (-3 == ~var2) {
                ++TextureSampler30.anInt3122;
                TextureSampler12.secureBuffer.writePacket(196);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (~var2 == -4) {
                ++DummyClass42.anInt889;
                TextureSampler12.secureBuffer.writePacket(124);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (var2 == 4) {
                TextureSampler12.secureBuffer.writePacket(199);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
                ++Keyboard.anInt1909;
              }

              if (~var2 == -6) {
                TextureSampler12.secureBuffer.writePacket(234);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
                ++SomethingIndex150.anInt2081;
              }

              if (6 == var2) {
                TextureSampler12.secureBuffer.writePacket(168);
                ++DummyClass52.anInt1172;
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (-8 == ~var2) {
                ++DummyClass59.anInt674;
                TextureSampler12.secureBuffer.writePacket(166);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (-9 == ~var2) {
                TextureSampler12.secureBuffer.writePacket(64);
                ++LightIntensity.anInt903;
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (-10 == ~var2) {
                ++DummyClass52.anInt1166;
                TextureSampler12.secureBuffer.writePacket(53);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

              if (~var2 == -11) {
                ++CollisionMap.anInt1307;
                TextureSampler12.secureBuffer.writePacket(9);
                TextureSampler12.secureBuffer.writeInt(var4);
                TextureSampler12.secureBuffer.writeShort(var1);
              }

            }
          }
        }
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "vg.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ','
          + var4 + ')');
    }
  }

  public static void method67(boolean var0) {
    try {
      aClass94_50 = null;
      titleSuffixes = null;
      if (!var0) {
        aBoolean47 = true;
      }

      anIntArray49 = null;
      aClass94_51 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "vg.B(" + var0 + ')');
    }
  }

  static final void method68(int var0, int var1, Mobile var2) {
    try {
      if (~AbstractGameWorld.updateCycle <= ~var2.anInt2800) {
        if (var2.anInt2790 >= AbstractGameWorld.updateCycle) {
          FloorOverlay.method2270(var2, (byte) -56);
        } else {
          Cursor.method1180((byte) -22, var2);
        }
      } else {
        StillGraphic.method1950(var2, true);
      }

      if (-129 < ~var2.anInt2819 || var2.anInt2829 < 128 || var2.anInt2819 >= 13184
        || var2.anInt2829 >= 13184) {
        var2.animationId = -1;
        var2.anInt2842 = -1;
        var2.anInt2800 = 0;
        var2.anInt2790 = 0;
        var2.anInt2819 = 128 * var2.waypointsX[0] - -(64 * var2.getSize());
        var2.anInt2829 = var2.waypointsY[0] * 128 + var2.getSize() * 64;
        var2.method1973(var1 + -2395);
      }

      if (var1 == 2279) {
        if (var2 == TextureCache.localPlayer && (var2.anInt2819 < 1536 || -1537 < ~var2.anInt2829
          || -11777 >= ~var2.anInt2819 || var2.anInt2829 >= 11776)) {
          var2.anInt2842 = -1;
          var2.anInt2800 = 0;
          var2.anInt2790 = 0;
          var2.animationId = -1;
          var2.anInt2819 = var2.waypointsX[0] * 128 + var2.getSize() * 64;
          var2.anInt2829 = 128 * var2.waypointsY[0] + 64 * var2.getSize();
          var2.method1973(-98);
        }

        DummyClass1.method904(65536, var2);
        RenderAnimation.method900(var2, -11973);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "vg.C(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  public final void write(int var1) throws IOException {
    try {
      throw new IOException();
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "vg.writeByte(" + var1 + ')');
    }
  }

}
