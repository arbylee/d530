import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;

final class BufferData {

  static boolean aBoolean1641 = false;
  static int anInt1642 = 0;
  static GameString aClass94_1645 = SpawnedGameObject.createString("Hidden)2");
  static GameString COMMAND_WM2 = SpawnedGameObject.createString("::wm2");
  static GameString aClass94_1647 = SpawnedGameObject.createString("gleiten:");
  int pointer = 0;
  boolean updated = false;
  GlBufferObject buffer;
  ByteBuffer byteBuffer;
  int stride = 0;


  public static void method1733(int var0) {
    try {
      aClass94_1647 = null;
      COMMAND_WM2 = null;
      aClass94_1645 = null;
      if (var0 != -17148) {
        anInt1642 = 54;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ql.C(" + var0 + ')');
    }
  }

  static final int method1734(int var0, float var1, int var2, int var3, int[][] var4, int[][] var5,
                              int var6, float[][] var7, int var8, byte var9, int var10,
                              boolean var11, SomethingGl0 var12, float[][] var13, int var14,
                              int var15, float[][] var16, int var17) {
    try {
      int var18;
      if (~var10 != -2) {
        if (var10 != 2) {
          if (~var10 == -4) {
            var18 = var15;
            var15 = 128 + -var17;
            var17 = var18;
          }
        } else {
          var17 = -var17 + 128;
          var15 = -var15 + 128;
        }
      } else {
        var18 = var15;
        var15 = var17;
        var17 = -var18 + 128;
      }

      float var19;
      int var21;
      float var20;
      float var30;
      if (~var15 == -1 && -1 == ~var17) {
        var19 = var16[var6][var14];
        var20 = var7[var6][var14];
        var30 = var13[var6][var14];
        var21 = var2;
      } else if (-129 == ~var15 && ~var17 == -1) {
        var21 = var3;
        var19 = var16[var6 + 1][var14];
        var20 = var7[1 + var6][var14];
        var30 = var13[var6 + 1][var14];
      } else if (-129 == ~var15 && ~var17 == -129) {
        var20 = var7[1 + var6][var14 - -1];
        var30 = var13[var6 + 1][1 + var14];
        var19 = var16[1 + var6][var14 - -1];
        var21 = var8;
      } else if (~var15 == -1 && -129 == ~var17) {
        var20 = var7[var6][1 + var14];
        var19 = var16[var6][1 + var14];
        var30 = var13[var6][var14 - -1];
        var21 = var0;
      } else {
        var30 = var13[var6][var14];
        var19 = var16[var6][var14];
        float var23 = (float) var17 / 128.0F;
        float var22 = (float) var15 / 128.0F;
        var30 += (var13[var6 - -1][var14] - var30) * var22;
        var19 += (-var19 + var16[var6 + 1][var14]) * var22;
        float var24 = var13[var6][var14 + 1];
        float var25 = var16[var6][var14 - -1];
        var25 += (-var25 + var16[var6 + 1][var14 - -1]) * var22;
        var20 = var7[var6][var14];
        var19 += var23 * (-var19 + var25);
        float var26 = var7[var6][1 + var14];
        var24 += (-var24 + var13[var6 - -1][var14 + 1]) * var22;
        var30 += var23 * (-var30 + var24);
        var26 += (-var26 + var7[1 + var6][var14 - -1]) * var22;
        var20 += (-var20 + var7[var6 - -1][var14]) * var22;
        var20 += (-var20 + var26) * var23;
        int var27 = TextureSampler30.method210(18348, var15, var2, var3);
        int var28 = TextureSampler30.method210(18348, var15, var0, var8);
        var21 = TextureSampler30.method210(18348, var17, var27, var28);
      }

      if (var9 > -111) {
        return -54;
      } else {
        int var32 = var17 + (var14 << 7);
        int var33 = SomethingOtherWorldMap.method408(var15, (byte) -51, var14, var5, var6, var17);
        int var31 = (var6 << 7) - -var15;
        return var12
          .method146(var31, var33, var32, var30, var19, var20, !var11 ? var21 : -256 & var21,
            var4 != null ?
              (float) (var33 + -SomethingOtherWorldMap
                .method408(var15, (byte) 103, var14, var4, var6, var17))
                / var1 :
              0.0F);
      }
    } catch (RuntimeException var29) {
      throw AbstractGameWorld.cascadeException(var29,
        "ql.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ?
          "{...}" :
          "null") + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + (var7 != null ?
          "{...}" :
          "null") + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ',' + (var12 != null ?
          "{...}" :
          "null") + ',' + (var13 != null ? "{...}" : "null") + ',' + var14 + ',' + var15 + ',' + (
          var16 != null ?
            "{...}" :
            "null") + ',' + var17 + ')');
    }
  }

  static final int method1735(int var0) {
    try {
      try {
        if (~Light.anInt692 == -1) {
          if (~(Time.getCurrentTimeMillis() + -5000L) > ~TextureSampler25.aLong3411) {
            return 0;
          }

          AreaSoundEffect.socketRequest = DummyClass35.signLink
            .method1441((byte) 8, GameException.serverHost, DummyClass24.anInt1658);
          Widget.aLong261 = Time.getCurrentTimeMillis();
          Light.anInt692 = 1;
        }

        if (30000L + Widget.aLong261 < Time.getCurrentTimeMillis()) {
          return TextureSampler33.method179((byte) 92, 1000);
        }

        int var1;
        int var2;
        if (1 == Light.anInt692) {
          if (-3 == ~AreaSoundEffect.socketRequest.status) {
            return TextureSampler33.method179((byte) 92, 1001);
          }

          if (1 != AreaSoundEffect.socketRequest.status) {
            return -1;
          }

          SomethingVolume15.gameSocket =
            new SocketStream((Socket) AreaSoundEffect.socketRequest.result, DummyClass35.signLink);
          TextureSampler12.secureBuffer.position = 0;
          AreaSoundEffect.socketRequest = null;
          var1 = 0;
          if (BufferedFile.aBoolean579) {
            var1 = AbstractObjectNode.anInt3608;
          }

          TextureSampler12.secureBuffer.writeByte(255);
          TextureSampler12.secureBuffer.writeInt(var1);
          SomethingVolume15.gameSocket
            .write(TextureSampler12.secureBuffer.bytes, 0, TextureSampler12.secureBuffer.position);
          if (null != GameWorld.audioOutputStream0) {
            GameWorld.audioOutputStream0.pause();
          }

          if (null != SomethingWorldMappy.audioOutputStream1) {
            SomethingWorldMappy.audioOutputStream1.pause();
          }

          var2 = SomethingVolume15.gameSocket.read();
          if (GameWorld.audioOutputStream0 != null) {
            GameWorld.audioOutputStream0.pause();
          }

          if (null != SomethingWorldMappy.audioOutputStream1) {
            SomethingWorldMappy.audioOutputStream1.pause();
          }

          if (var2 != 0) {
            return TextureSampler33.method179((byte) 92, var2);
          }

          Light.anInt692 = 2;
        }

        if (-3 == ~Light.anInt692) {
          if (2 > SomethingVolume15.gameSocket.available()) {
            return -1;
          }

          OndemandRequester.anInt1002 = SomethingVolume15.gameSocket.read();
          OndemandRequester.anInt1002 <<= 8;
          OndemandRequester.anInt1002 += SomethingVolume15.gameSocket.read();
          Light.anInt692 = 3;
          TriChromaticImageBuffer.anInt2484 = 0;
          TextureSampler29.aByteArray3396 = new byte[OndemandRequester.anInt1002];
        }

        if (-4 == ~Light.anInt692) {
          var1 = SomethingVolume15.gameSocket.available();
          if (1 > var1) {
            return -1;
          }

          if (var1 > -TriChromaticImageBuffer.anInt2484 + OndemandRequester.anInt1002) {
            var1 = OndemandRequester.anInt1002 + -TriChromaticImageBuffer.anInt2484;
          }

          SomethingVolume15.gameSocket
            .read(TextureSampler29.aByteArray3396, TriChromaticImageBuffer.anInt2484, var1);
          TriChromaticImageBuffer.anInt2484 += var1;
          if (TriChromaticImageBuffer.anInt2484 >= OndemandRequester.anInt1002) {
            if (TextureSampler39.method278(4, TextureSampler29.aByteArray3396)) {
              TextureSampler15.aClass44_Sub1Array3201 = new GameWorld[LightIntensity.anInt906];
              var2 = 0;

              for (int var3 = TextureSampler34.anInt3054; var3 <= FloorUnderlay.anInt1416; ++var3) {
                GameWorld var4 = ClassCheckRequest.method130(91, var3);
                if (null != var4) {
                  TextureSampler15.aClass44_Sub1Array3201[var2++] = var4;
                }
              }

              SomethingVolume15.gameSocket.destroy();
              SomethingVolume15.gameSocket = null;
              FileCacheRequester.anInt1088 = 0;
              Light.anInt692 = 0;
              TextureSampler29.aByteArray3396 = null;
              TextureSampler25.aLong3411 = Time.getCurrentTimeMillis();
              return 0;
            }

            return TextureSampler33.method179((byte) 92, 1002);
          }

          return -1;
        }
      } catch (IOException var5) {
        return TextureSampler33.method179((byte) 92, 1003);
      }

      if (var0 != 29984) {
        method1734(13, 0.10791027F, 20, 124, null, null, -85, null, -119, (byte) -105, -5, false,
          null, null, 5, -100, null, -36);
      }

      return -1;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "ql.D(" + var0 + ')');
    }
  }

  static final int method1736(int var0, int var1, int var2, int var3) {
    try {
      if (null == AbstractGameWorld.heightMap) {
        return 0;
      } else {
        int var4 = var2 >> 7;
        int var5 = var3 >> 7;
        if (-1 >= ~var4 && 0 <= var5 && var4 <= 103 && 103 >= var5) {
          int var7 = 127 & var2;
          int var8 = var3 & 127;
          int var6 = var0;
          if (3 > var0 && ~(2 & BZipDecompressorState.tileFlags[1][var4][var5]) == -3) {
            var6 = var0 + 1;
          }

          int var10 = var7 * AbstractGameWorld.heightMap[var6][var1 + var4][1 + var5]
            + AbstractGameWorld.heightMap[var6][var4][var5 + 1] * (-var7 + 128) >> 7;
          int var9 = var7 * AbstractGameWorld.heightMap[var6][var4 + 1][var5]
            + (-var7 + 128) * AbstractGameWorld.heightMap[var6][var4][var5] >> 7;
          return var8 * var10 + (128 - var8) * var9 >> 7;
        } else {
          return 0;
        }
      }
    } catch (RuntimeException var11) {
      throw AbstractGameWorld
        .cascadeException(var11, "ql.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

}
