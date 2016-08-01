import java.util.Random;

final class FloorUnderlay {

  static int anInt1405;
  static int anInt1407;
  static FileUnpacker fileUnpacker19;
  static SceneShadowMap aClass136_1413 = new SceneShadowMap();
  static int anInt1416;
  private static GameString aClass94_1415 = SpawnedGameObject.createString("Loaded input handler");
  static GameString aClass94_1409 = aClass94_1415;
  int anInt1406;
  int anInt1408;
  boolean aBoolean1411 = true;
  int anInt1412 = -1;
  int anInt1414 = 128;
  int anInt1417;
  int anInt1418;
  private int anInt1404 = 0;

  static final int method1602(int var0, GameString var1) {
    try {
      if (DummyClass25.aClass131_1624 != null && ~var1.getLength() != -1) {
        for (int var2 = var0; ~DummyClass25.aClass131_1624.anInt1720 < ~var2; ++var2) {
          if (DummyClass25.aClass131_1624.aClass94Array1721[var2]
            .method1560(TextureSampler15.aClass94_3192, true, OndemandFileRequest.aClass94_4066)
            .method1562((byte) -32, var1)) {
            return var2;
          }
        }

        return -1;
      } else {
        return -1;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "ni.G(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final int method1603(byte var0, int var1, Random var2) {
    try {
      if (~var1 >= -1) {
        throw new IllegalArgumentException();
      } else if (Projectile.isPo2((byte) -115, var1)) {
        return (int) (((long) var2.nextInt() & 4294967295L) * (long) var1 >> 32);
      } else {
        int var3 = -((int) (4294967296L % (long) var1)) + Integer.MIN_VALUE;

        int var4;
        do {
          var4 = var2.nextInt();
        } while (var3 <= var4);

        int var5 = -101 % ((var0 - -52) / 33);
        return TextureSampler27.method201(var4, var1, -58);
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ni.C(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method1605(int var0, GameString var1, int var2) {
    try {
      ++SomethingSceneI.anInt421;
      TextureSampler12.secureBuffer.writePacket(188);
      TextureSampler12.secureBuffer.method790(var2, var0 + -13326);
      if (var0 == 255) {
        TextureSampler12.secureBuffer.writeLong(var1.toBase37());
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ni.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  public static void method1606(byte var0) {
    try {
      aClass94_1415 = null;
      aClass94_1409 = null;
      int var1 = 86 % ((49 - var0) / 48);
      fileUnpacker19 = null;
      aClass136_1413 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ni.A(" + var0 + ')');
    }
  }

  private final void setHSL(int var1, byte var2) {
    try {
      double red = (double) (255 & var1 >> 16) / 256.0D;
      double green = (double) (255 & var1 >> 8) / 256.0D;
      double min = red;
      double blue = (double) (var1 & 255) / 256.0D;
      if (green < red) {
        min = green;
      }

      if (blue < min) {
        min = blue;
      }

      double max = red;
      int var13 = 77 % ((var2 - 21) / 57);
      double var14 = 0.0D;
      if (green > red) {
        max = green;
      }

      if (blue > max) {
        max = blue;
      }

      double var16 = 0.0D;
      double var18 = (max + min) / 2.0D;
      if (min != max) {
        if (0.5D > var18) {
          var16 = (max - min) / (max + min);
        }

        if (max != red) {
          if (green != max) {
            if (blue == max) {
              var14 = 4.0D + (-green + red) / (-min + max);
            }
          } else {
            var14 = (blue - red) / (max - min) + 2.0D;
          }
        } else {
          var14 = (-blue + green) / (-min + max);
        }

        if (0.5D <= var18) {
          var16 = (max - min) / (-min + (2.0D - max));
        }
      }

      if (var18 > 0.5D) {
        this.anInt1418 = (int) (var16 * (-var18 + 1.0D) * 512.0D);
      } else {
        this.anInt1418 = (int) (var16 * var18 * 512.0D);
      }

      if (1 > this.anInt1418) {
        this.anInt1418 = 1;
      }

      this.anInt1406 = (int) (var16 * 256.0D);
      this.anInt1417 = (int) (256.0D * var18);
      if (~this.anInt1417 <= -1) {
        if (255 < this.anInt1417) {
          this.anInt1417 = 255;
        }
      } else {
        this.anInt1417 = 0;
      }

      var14 /= 6.0D;
      this.anInt1408 = (int) ((double) this.anInt1418 * var14);
      if (-1 >= ~this.anInt1406) {
        if (this.anInt1406 > 255) {
          this.anInt1406 = 255;
        }
      } else {
        this.anInt1406 = 0;
      }

    } catch (RuntimeException var20) {
      throw AbstractGameWorld.cascadeException(var20, "ni.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, int var3) {
    try {
      while (true) {
        int opcode = var2.readUnsignedByte();
        if (opcode == 0) {
          return;
        }

        this.method1604(opcode, var2, var1);
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ni.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  private final void method1604(int var2, Buffer var3, int var4) {
    try {
      if (-2 != ~var2) {
        if (var2 != 2) {
          if (3 == var2) {
            this.anInt1414 = var3.readUnsignedShort();
          } else if (~var2 == -5) {
            this.aBoolean1411 = false;
          }
        } else {
          this.anInt1412 = var3.readUnsignedShort();
          if (-65536 == ~this.anInt1412) {
            this.anInt1412 = -1;
          }
        }
      } else {
        this.anInt1404 = var3.readUnsignedMedium((byte) 93);
        this.setHSL(this.anInt1404, (byte) 81);
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ni.E(" + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
    }
  }

}
