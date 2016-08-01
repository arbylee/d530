import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

final class DummyClass41 {

  static int anInt865 = -1;
  static long aLong866 = 0L;
  static int secondaryPort;
  static GameString aClass94_868 = SpawnedGameObject.createString("Chargement de l(W-Bcran)2titre )2 ");


  public static void method1169(boolean var0) {
    try {
      aClass94_868 = null;
      if (var0) {
        method1170((byte) 25, 28);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "hi.C(" + var0 + ')');
    }
  }

  static final int method1170(byte var0, int var1) {
    try {
      int var2 = -77 / ((-34 - var0) / 52);
      return var1 >>> 8;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "hi.E(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1171(int var0, int var1, int var2, int var3, int var4, Widget var5,
                               boolean var6) {
    try {
      int var7 = var3 * var3 + var4 * var4;
      if (-360001 <= ~var7) {
        int var8 = Math.min(var5.anInt168 / 2, var5.anInt193 / 2);
        if (var6) {
          anInt865 = -79;
        }

        if (var8 * var8 >= var7) {
          DummyClass36
            .method1030(var5, MilliFrameRegulator.aClass3_Sub28_Sub16Array2690[var0], var4, var3,
              var1, (byte) 11, var2);
        } else {
          var8 -= 10;
          int var9 = 2047 & TextureSampler9.anInt3102 + SpotAnimationConfig.anInt531;
          int var11 = DummyClass40.COSINE_TABLE[var9];
          int var10 = DummyClass40.SINE_TABLE[var9];
          var10 = var10 * 256 / (256 + Something3d2.anInt3020);
          var11 = var11 * 256 / (Something3d2.anInt3020 + 256);
          int var12 = var4 * var10 - -(var11 * var3) >> 16;
          int var13 = -(var10 * var3) + var4 * var11 >> 16;
          double var14 = Math.atan2((double) var12, (double) var13);
          int var16 = (int) (Math.sin(var14) * (double) var8);
          int var17 = (int) (Math.cos(var14) * (double) var8);
          if (GlRenderer.useOpenGlRenderer) {
            ((GlDirectColorSprite) TextureSampler8.aClass3_Sub28_Sub16Array3458[var0])
              .method648(240, 240, (var5.anInt168 / 2 + var2 + var16) * 16,
                16 * (-var17 + var5.anInt193 / 2 + var1), (int) (10430.378D * var14), 4096);
          } else {
            ((SoftwareDirectColorSprite) TextureSampler8.aClass3_Sub28_Sub16Array3458[var0])
              .method660(-10 + var16 + var5.anInt168 / 2 + var2,
                -10 + var5.anInt193 / 2 + var1 + -var17, 20, 20, 15, 15, var14, 256);
          }
        }

      }
    } catch (RuntimeException var18) {
      throw AbstractGameWorld.cascadeException(var18,
        "hi.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ?
          "{...}" :
          "null") + ',' + var6 + ')');
    }
  }

  static final String method1172(int var0, Throwable var1) throws IOException {
    String var2;
    if (var1 instanceof GameException) {
      GameException var3 = (GameException) var1;
      var1 = var3.aThrowable2118;
      var2 = var3.source + " | ";
    } else {
      var2 = "";
    }

    StringWriter var13 = new StringWriter();
    PrintWriter var4 = new PrintWriter(var13);
    var1.printStackTrace(var4);
    var4.close();
    String var5 = var13.toString();
    BufferedReader var6 = new BufferedReader(new StringReader(var5));
    String var7 = var6.readLine();

    while (true) {
      String var8 = var6.readLine();
      if (var8 == null) {
        int var14 = -107 % ((var0 - 31) / 34);
        var2 = var2 + "| " + var7;
        return var2;
      }

      int var9 = var8.indexOf(40);
      int var10 = var8.indexOf(41, 1 + var9);
      String var11;
      if (0 == ~var9) {
        var11 = var8;
      } else {
        var11 = var8.substring(0, var9);
      }

      var11 = var11.trim();
      var11 = var11.substring(1 + var11.lastIndexOf(32));
      var11 = var11.substring(var11.lastIndexOf(9) + 1);
      var2 = var2 + var11;
      if (-1 != var9 && var10 != -1) {
        int var12 = var8.indexOf(".java:", var9);
        if (var12 >= 0) {
          var2 = var2 + var8.substring(5 + var12, var10);
        }
      }

      var2 = var2 + ' ';
    }
  }

  static final void method1173(Buffer var0, int var1) {
    try {
      int var2 = var0.readUnsignedSmart(true);
      DummyClass25.aClass26Array1627 = new GameWorldSomething[var2];

      int var3;
      for (var3 = 0; var3 < var2; ++var3) {
        DummyClass25.aClass26Array1627[var3] = new GameWorldSomething();
        DummyClass25.aClass26Array1627[var3].anInt507 = var0.readUnsignedSmart(true);
        DummyClass25.aClass26Array1627[var3].aClass94_508 = var0.method761(105);
      }

      if (var1 > -10) {
        method1174(null, (byte) -126);
      }

      TextureSampler34.anInt3054 = var0.readUnsignedSmart(true);
      FloorUnderlay.anInt1416 = var0.readUnsignedSmart(true);
      LightIntensity.anInt906 = var0.readUnsignedSmart(true);
      DummyClass26.aClass44_Sub1Array1609 =
        new GameWorld[-TextureSampler34.anInt3054 + FloorUnderlay.anInt1416 + 1];

      for (var3 = 0; var3 < LightIntensity.anInt906; ++var3) {
        int var4 = var0.readUnsignedSmart(true);
        GameWorld var5 = DummyClass26.aClass44_Sub1Array1609[var4] = new GameWorld();
        var5.anInt721 = var0.readUnsignedByte();
        var5.flags = var0.readInt();
        var5.anInt2621 = var4 - -TextureSampler34.anInt3054;
        var5.aClass94_2620 = var0.method761(98);
        var5.aClass94_2625 = var0.method761(79);
      }

      AbstractObjectNode.anInt3608 = var0.readInt();
      BufferedFile.aBoolean579 = true;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld
        .cascadeException(var6, "hi.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final GameString method1174(Widget var0, byte var1) {
    try {
      int var2 = 49 % ((var1 - 22) / 46);
      return ~GameClient.method44(var0).method101(-69) != -1 ?
        (null != var0.aClass94_245 && var0.aClass94_245.method1564(1).getLength() != 0 ?
          var0.aClass94_245 :
          (LinearHashTable.aBoolean1040 ? GameException.aClass94_2116 : null)) :
        null;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "hi.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

}
