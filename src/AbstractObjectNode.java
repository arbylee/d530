import java.io.IOException;

abstract class AbstractObjectNode extends SubNode {

  static GameString aClass94_3601 = SpawnedGameObject.createString(")3runescape)3com)4l=");
  static int anInt3602;
  static int viewportLowerZ;
  static boolean aBoolean3604 = true;
  static int[][][] othrrHeightMap;
  static int anInt3606;
  static int[] anIntArray3607 = new int[] {0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1};
  static int anInt3608;

  abstract Object getObject(boolean var1);

  abstract boolean method568(int var1);

  static final SoftwareDirectColorSprite method562(FileUnpacker var0, int var1, int var2,
                                                   byte var3) {
    try {
      return SomethingTexture4.loadSprites(var0, var1, var2, -30901) ?
        (var3 != 39 ? null : Parameter.method578(var3 ^ 84)) :
        null;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "gf.O(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  public static void method563(int var0) {
    try {
      othrrHeightMap = null;
      aClass94_3601 = null;
      anIntArray3607 = null;
      if (var0 != 3) {
        viewportLowerZ = -108;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gf.Q(" + var0 + ')');
    }
  }

  static final void loadSettings(SignLink var0, int var1) {
    try {
      AbstractFileRequest.brightnessSetting = 3;
      SceneSomething.method957(96, true);
      aBoolean3604 = true;
      TextureSampler17.aBoolean3184 = true;
      DummyHashTable.aBoolean1685 = true;
      Parameter.anInt3622 = 0;
      TextureSampler21.anInt3071 = 0;
      Keyboard.aBoolean1905 = true;
      GameWorld.aBoolean2623 = true;
      Widget.aBoolean236 = true;
      DummyClass28.anInt340 = 127;
      DummyClass35.aBoolean661 = true;
      Projectile.aBoolean2910 = true;
      AbstractTextureSampler.anInt2378 = 0;
      HashTableIterator.anInt1137 = 2;
      TextureSampler0.aBoolean3275 = true;
      DisplayMode.useBumpMaps = true;
      BZipDecompressorState.anInt120 = 255;
      SceneSomething.aBoolean488 = true;
      GroundItemNode.anInt3671 = 0;
      FileOnDisk var2 = null;
      ClientScriptCall.anInt2453 = 127;
      if (AudioStreamEncoder3.anInt3492 >= 96) {
        DummyClass0.method1758(2);
      } else {
        DummyClass0.method1758(0);
      }

      GameString.anInt2148 = var1;
      TriChromaticImageBuffer.anInt2488 = 0;
      AudioWorker.aBoolean346 = false;
      DummyClass4.aBoolean3004 = true;
      GameString.safemode = false;
      FileCacheRequester.aBoolean1080 = false;
      SubNode.anInt2577 = 0;

      try {
        SignLinkRequest var3 = var0.getSettings("runescape", 12);

        while (0 == var3.status) {
          TextureSampler25.sleep(1L);
        }

        if (-2 == ~var3.status) {
          var2 = (FileOnDisk) var3.result;
          byte[] var4 = new byte[(int) var2.length(-1)];

          int var6;
          for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
            var6 = var2.method1739(var5, var1 + 0, var4.length - var5, var4);
            if (var6 == -1) {
              throw new IOException("EOF");
            }
          }

          BitVariable.parseSettings(new Buffer(var4), -1);
        }
      } catch (Exception var8) {
      }

      try {
        if (var2 != null) {
          var2.close(1);
        }
      } catch (Exception var7) {
      }

    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "gf.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method565(byte var0, int var1, int var2) {
    try {
      ProceduralTexture.anInt1150 = -TextureSampler37.anInt3256 + var1;
      if (var0 != 86) {
        anIntArray3607 = null;
      }

      int var3 =
        -((int) ((float) SomethingWorldMapy.aClass11_3551.anInt168 / AbstractGameWorld.aFloat727))
          + ProceduralTexture.anInt1150;
      int var4 =
        ProceduralTexture.anInt1150 + (int) ((float) SomethingWorldMapy.aClass11_3551.anInt168
          / AbstractGameWorld.aFloat727);
      if (var3 < 0) {
        ProceduralTexture.anInt1150 =
          (int) ((float) SomethingWorldMapy.aClass11_3551.anInt168 / AbstractGameWorld.aFloat727);
      }

      TextureSampler13.anInt3362 = DummyClass58.anInt1460 + -1 + MapScene.anInt65 + -var2;
      int var6 =
        (int) ((float) SomethingWorldMapy.aClass11_3551.anInt193 / AbstractGameWorld.aFloat727)
          + TextureSampler13.anInt3362;
      int var5 =
        TextureSampler13.anInt3362 - (int) ((float) SomethingWorldMapy.aClass11_3551.anInt193
          / AbstractGameWorld.aFloat727);
      if (~var4 < ~DummyClass30.anInt455) {
        ProceduralTexture.anInt1150 =
          DummyClass30.anInt455 + -((int) ((float) SomethingWorldMapy.aClass11_3551.anInt168
            / AbstractGameWorld.aFloat727));
      }

      if (-1 < ~var5) {
        TextureSampler13.anInt3362 =
          (int) ((float) SomethingWorldMapy.aClass11_3551.anInt193 / AbstractGameWorld.aFloat727);
      }

      if (~DummyClass58.anInt1460 > ~var6) {
        TextureSampler13.anInt3362 =
          -((int) ((float) SomethingWorldMapy.aClass11_3551.anInt193 / AbstractGameWorld.aFloat727))
            + DummyClass58.anInt1460;
      }

    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "gf.E(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final void method566(GameString var0, int var1, int var2) {
    try {
      WidgetUpdate var3 = AudioStreamEncoder3.method466(var1 + 4, 3, var2);
      var3.g((byte) 33);
      if (var1 != 0) {
        viewportLowerZ = 112;
      }

      var3.text = var0;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "gf.P(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
    }
  }

}
