final class SomethingIndex150 {

  static SceneGraphTile[][][] aClass3_Sub2ArrayArrayArray2065;
  static int[] anIntArray2068 = new int[50];
  static AnimationSomething[] aClass3_Sub28_Sub5Array2070 = new AnimationSomething[14];
  static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array2072;
  static int[] anIntArray2073 = new int[5];
  static GameString aClass94_2074 = SpawnedGameObject.createString("; version=1; path=)4; domain=");
  static GameString RECTANGLE_DEBUG_EQ = SpawnedGameObject.createString("rect_debug=");
  static int anInt2079 = 0;
  static GameString aClass94_2080 = SpawnedGameObject.createString("(U2");
  static int anInt2081;
  int anInt2063;
  byte[] aByteArray2064;
  int anInt2066;
  int anInt2067;
  int anInt2069;
  int anInt2071;
  byte[] aByteArray2076;
  int anInt2077;
  int anInt2078;

  public static void method2255(byte var0) {
    try {
      anIntArray2073 = null;
      aClass3_Sub2ArrayArrayArray2065 = null;
      aClass94_2080 = null;
      RECTANGLE_DEBUG_EQ = null;
      if (var0 >= -126) {
        aClass94_2080 = null;
      }

      anIntArray2068 = null;
      aClass3_Sub28_Sub5Array2070 = null;
      aClass3_Sub28_Sub16Array2072 = null;
      aClass94_2074 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "wh.B(" + var0 + ')');
    }
  }

  static final boolean method2256(int var0, int var1, int var2, int var3) {
    if (!FileSystem.method846(var0, var1, var2)) {
      return false;
    } else {
      int var4 = var1 << 7;
      int var5 = var2 << 7;
      return TextureSampler10
        .method349(var4 + 1, AbstractGameWorld.heightMap[var0][var1][var2] + var3, var5 + 1)
        && TextureSampler10
        .method349(var4 + 128 - 1, AbstractGameWorld.heightMap[var0][var1 + 1][var2] + var3,
          var5 + 1) && TextureSampler10
        .method349(var4 + 128 - 1, AbstractGameWorld.heightMap[var0][var1 + 1][var2 + 1] + var3,
          var5 + 128 - 1) && TextureSampler10
        .method349(var4 + 1, AbstractGameWorld.heightMap[var0][var1][var2 + 1] + var3,
          var5 + 128 - 1);
    }
  }

  static final void method2257(int var0) {
    try {
      if (var0 < 60) {
        aClass3_Sub28_Sub16Array2072 = null;
      }

      DummyClass8.aClass93_4015.method1524(3);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "wh.F(" + var0 + ')');
    }
  }

  static final void method2258(int var0, int var1, GameString var2) {
    try {
      GameString var3 = var2.method1579(-17).formatName((byte) -50);
      boolean var4 = false;

      for (int var5 = var1; ~var5 > ~DummyClass13.anInt2022; ++var5) {
        Player var6 = TextureSampler0.players[DummyClass42.anIntArray887[var5]];
        if (null != var6 && null != var6.name && var6.name.method1531(var3)) {
          var4 = true;
          Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false, 0, 2,
            var6.waypointsX[0], 1, 0, 2, var6.waypointsY[0],
            TextureCache.localPlayer.waypointsX[0]);
          if (1 == var0) {
            ++ItemConfig.anInt759;
            TextureSampler12.secureBuffer.writePacket(68);
            TextureSampler12.secureBuffer.method765(DummyClass42.anIntArray887[var5], (byte) 3);
          } else if (4 != var0) {
            if (5 != var0) {
              if (~var0 != -7) {
                if (~var0 == -8) {
                  ++DummyClass29.anInt437;
                  TextureSampler12.secureBuffer.writePacket(114);
                  TextureSampler12.secureBuffer
                    .method765(DummyClass42.anIntArray887[var5], (byte) 3);
                }
              } else {
                TextureSampler12.secureBuffer.writePacket(133);
                TextureSampler12.secureBuffer.writeShortLE(-1, DummyClass42.anIntArray887[var5]);
                ++AudioStreamEncoder4.anInt3517;
              }
            } else {
              TextureSampler12.secureBuffer.writePacket(4);
              TextureSampler12.secureBuffer
                .writeShortLE(var1 + -1, DummyClass42.anIntArray887[var5]);
              ++SocketStream.anInt1240;
            }
          } else {
            ++Keyboard.anInt1910;
            TextureSampler12.secureBuffer.writePacket(180);
            TextureSampler12.secureBuffer.method765(DummyClass42.anIntArray887[var5], (byte) 3);
          }
          break;
        }
      }

      if (!var4) {
        GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 0,
          RenderAnimation.concat(new GameString[] {Light.aClass94_691, var3}), -1);
      }

    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "wh.D(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  static final AbstractIndexedColorSprite createIndexedColorSprite() {
    try {
      Object var1;
      if (GlRenderer.useOpenGlRenderer) {
        var1 = new GlIndexedColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
          Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0], GroundItem.anIntArray2931[0],
          TextureSampler26.anIntArray3076[0], DummyClass5.aByteArrayArray2987[0],
          TextureSampler38.anIntArray3446);
      } else {
        var1 = new SoftwareIndexedColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
          Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0], GroundItem.anIntArray2931[0],
          TextureSampler26.anIntArray3076[0], DummyClass5.aByteArrayArray2987[0],
          TextureSampler38.anIntArray3446);
      }
      DummyClass37.method1035((byte) 116);
      return (AbstractIndexedColorSprite) var1;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "wh.A()");
    }
  }

  static final void method2260(int var0, int var1) {
    try {
      TextureSampler25.aClass93_3412.method1522(var0 + 919, var1);
      if (var0 == -1045) {
        TextureSampler2.aClass93_3369.method1522(var0 ^ 1130, var1);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "wh.E(" + var0 + ',' + var1 + ')');
    }
  }

}
