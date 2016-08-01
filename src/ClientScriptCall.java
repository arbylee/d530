final class ClientScriptCall extends Node {

  static int anInt2437;
  static int anInt2440 = 0;
  static ObjectCache aClass93_2442 = new ObjectCache(50);
  static ObjectCache aClass93_2450 = new ObjectCache(64);
  static int anInt2451 = -1;
  static byte[][][] aByteArrayArrayArray2452;
  static int anInt2453 = 127;
  Widget aClass11_2438;
  GameString aClass94_2439;
  int anInt2441;
  int anInt2443;
  int anInt2444;
  int anInt2445;
  boolean aBoolean2446;
  int anInt2447;
  Object[] arguments;
  Widget aClass11_2449;

  static final void method375(int var0, FileUnpacker var1, FileUnpacker var2) {
    try {
      SomethingQuickChatK.aClass153_152 = var1;
      DummyClass2.aClass153_1680 = var2;
      SceneSomething.anInt497 = DummyClass2.aClass153_1680.getAmountChildren(var0, (byte) 95);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "jl.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  public static void method376(boolean var0) {
    try {
      aClass93_2442 = null;
      if (var0) {
        method378(97, (byte) -80);
      }

      aByteArrayArrayArray2452 = null;
      aClass93_2450 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "jl.E(" + var0 + ')');
    }
  }

  static final void method377(int var0, int var1, int var2, int var3, int var4) {
    try {
      TextureSampler12.secureBuffer.position = 0;
      TextureSampler12.secureBuffer.writeByte(147);
      TextureSampler12.secureBuffer.writeByte(var2);
      TextureSampler12.secureBuffer.writeByte(var3);
      TextureSampler12.secureBuffer.writeShort(var0);
      TextureSampler12.secureBuffer.writeShort(var1);
      DummyClass22.anInt1734 = 0;
      SpotAnimationConfig.anInt548 = 0;
      DummyCanvas.anInt23 = var4;
      HashTable.anInt1711 = -3;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "jl.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final BitVariable method378(int var0, byte var1) {
    try {
      BitVariable var2 = (BitVariable) aClass93_2450.get((long) var0);
      if (var2 == null) {
        if (var1 < 126) {
          return null;
        } else {
          byte[] var3 = DummyClass55.aClass153_1420
            .getBytes(GroundItem.method2032(var0, 5439488), Something3dRoot.method2234(var0, -127));
          var2 = new BitVariable();
          if (var3 != null) {
            var2.method1387(new Buffer(var3), -111);
          }

          aClass93_2450.get((byte) -84, var2, (long) var0);
          return var2;
        }
      } else {
        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "jl.A(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method379(int var0) {
    try {
      int var2 = AbstractMouseWheel.anInt1904 * 128 - -64;
      int var1 = 128 * ComponentCanvas.anInt30 + 64;
      int var3 = BufferData.method1736(GameWorldSomething.currentPlane, 1, var1, var2)
        - TextureSampler25.anInt3414;
      if (100 <= AbstractFileRequest.anInt3631) {
        NPC.anInt3995 = 64 + ComponentCanvas.anInt30 * 128;
        DummyClass49.anInt1111 = 64 + AbstractMouseWheel.anInt1904 * 128;
        EnumStringFetcher.anInt2162 = BufferData
          .method1736(GameWorldSomething.currentPlane, var0 + -1023, NPC.anInt3995,
            DummyClass49.anInt1111) + -TextureSampler25.anInt3414;
      } else {
        if (NPC.anInt3995 < var1) {
          NPC.anInt3995 +=
            DummyClass8.anInt4021 + AbstractFileRequest.anInt3631 * (-NPC.anInt3995 + var1) / 1000;
          if (~NPC.anInt3995 < ~var1) {
            NPC.anInt3995 = var1;
          }
        }

        if (~EnumStringFetcher.anInt2162 > ~var3) {
          EnumStringFetcher.anInt2162 +=
            (-EnumStringFetcher.anInt2162 + var3) * AbstractFileRequest.anInt3631 / 1000
              + DummyClass8.anInt4021;
          if (EnumStringFetcher.anInt2162 > var3) {
            EnumStringFetcher.anInt2162 = var3;
          }
        }

        if (~NPC.anInt3995 < ~var1) {
          NPC.anInt3995 -=
            DummyClass8.anInt4021 + (NPC.anInt3995 + -var1) * AbstractFileRequest.anInt3631 / 1000;
          if (NPC.anInt3995 < var1) {
            NPC.anInt3995 = var1;
          }
        }

        if (DummyClass49.anInt1111 < var2) {
          DummyClass49.anInt1111 += DummyClass8.anInt4021
            + AbstractFileRequest.anInt3631 * (var2 - DummyClass49.anInt1111) / 1000;
          if (~var2 > ~DummyClass49.anInt1111) {
            DummyClass49.anInt1111 = var2;
          }
        }

        if (var3 < EnumStringFetcher.anInt2162) {
          EnumStringFetcher.anInt2162 -=
            (EnumStringFetcher.anInt2162 - var3) * AbstractFileRequest.anInt3631 / 1000
              + DummyClass8.anInt4021;
          if (~var3 < ~EnumStringFetcher.anInt2162) {
            EnumStringFetcher.anInt2162 = var3;
          }
        }

        if (~DummyClass49.anInt1111 < ~var2) {
          DummyClass49.anInt1111 -= DummyClass8.anInt4021 - -(
            (-var2 + DummyClass49.anInt1111) * AbstractFileRequest.anInt3631 / 1000);
          if (~var2 < ~DummyClass49.anInt1111) {
            DummyClass49.anInt1111 = var2;
          }
        }
      }

      var2 = SomethingAudio.anInt1996 * 128 - -64;
      var1 = Mouse.anInt1923 * 128 + 64;
      var3 = BufferData.method1736(GameWorldSomething.currentPlane, 1, var1, var2)
        + -SpotAnimationConfig.anInt529;
      int var5 = var3 + -EnumStringFetcher.anInt2162;
      int var6 = -DummyClass49.anInt1111 + var2;
      int var4 = -NPC.anInt3995 + var1;
      int var7 = (int) Math.sqrt((double) (var4 * var4 + var6 * var6));
      int var8 = (int) (325.949D * Math.atan2((double) var5, (double) var7)) & 2047;
      if (128 > var8) {
        var8 = 128;
      }

      if (~var8 < -384) {
        var8 = 383;
      }

      int var9 = (int) (-325.949D * Math.atan2((double) var4, (double) var6)) & 2047;
      if (~DummyClass17.anInt1823 > ~var8) {
        DummyClass17.anInt1823 += AbstractSomethingTexture.anInt1105
          + DummyClass8.anInt4014 * (-DummyClass17.anInt1823 + var8) / 1000;
        if (DummyClass17.anInt1823 > var8) {
          DummyClass17.anInt1823 = var8;
        }
      }

      if (DummyClass17.anInt1823 > var8) {
        DummyClass17.anInt1823 -= (DummyClass17.anInt1823 - var8) * DummyClass8.anInt4014 / 1000
          + AbstractSomethingTexture.anInt1105;
        if (~DummyClass17.anInt1823 > ~var8) {
          DummyClass17.anInt1823 = var8;
        }
      }

      int var10 = -TextureSampler28.anInt3315 + var9;
      if (var10 > var0) {
        var10 -= 2048;
      }

      if (-1024 > var10) {
        var10 += 2048;
      }

      if (~var10 < -1) {
        TextureSampler28.anInt3315 +=
          var10 * DummyClass8.anInt4014 / 1000 + AbstractSomethingTexture.anInt1105;
        TextureSampler28.anInt3315 &= 2047;
      }

      if (-1 < ~var10) {
        TextureSampler28.anInt3315 -=
          DummyClass8.anInt4014 * -var10 / 1000 + AbstractSomethingTexture.anInt1105;
        TextureSampler28.anInt3315 &= 2047;
      }

      int var11 = -TextureSampler28.anInt3315 + var9;
      if (1024 < var11) {
        var11 -= 2048;
      }

      if (~var11 > 1023) {
        var11 += 2048;
      }

      if (var11 < 0 && -1 > ~var10 || var11 > 0 && ~var10 > -1) {
        TextureSampler28.anInt3315 = var9;
      }

    } catch (RuntimeException var12) {
      throw AbstractGameWorld.cascadeException(var12, "jl.B(" + var0 + ')');
    }
  }

}
