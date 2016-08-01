import java.awt.Component;

final class DummyClass43 {

  static int anInt909 = -1;
  static GameString COMMAND_FPS_ON = SpawnedGameObject.createString("::fpson");
  static int[][][] anIntArrayArrayArray911 = new int[2][][];
  static int[] anIntArray912 = new int[14];
  static boolean aBoolean913 = false;
  static int[][][] somethingHeightMap;
  static Interface4 anInterface4_915 = null;
  static int anInt916;
  static OndemandRequester ondemandRequester;


  public static void method1193(int var0) {
    try {
      anInterface4_915 = null;
      anIntArrayArrayArray911 = null;
      somethingHeightMap = null;
      ondemandRequester = null;
      anIntArray912 = null;
      if (var0 != -26723) {
        somethingHeightMap = null;
      }

      COMMAND_FPS_ON = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "id.C(" + var0 + ')');
    }
  }

  static final void method1194(int var0) {
    try {
      if (var0 == -16385) {
        if (null != SomethingWorldMappy.audioOutputStream1) {
          SomethingWorldMappy.audioOutputStream1.process((byte) -34);
        }

        if (null != GameWorld.audioOutputStream0) {
          GameWorld.audioOutputStream0.process((byte) -34);
        }

      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "id.A(" + var0 + ')');
    }
  }

  static final AbstractAudioOutputStream createAudioOutputStream(int var0, SignLink var1,
                                                                 Component var2, int var3,
                                                                 int var4) {
    try {
      if (DummyClass60.sampleRate == 0) {
        throw new IllegalStateException();
      } else if (0 <= var3 && 2 > var3) {
        if (-257 < ~var0) {
          var0 = 256;
        }

        try {
          AbstractAudioOutputStream var9 =
            (AbstractAudioOutputStream) Class.forName("BufferedAudioOutputStream").newInstance();
          var9.sampleRate = var0;
          var9.samples = new int[(!GameString.stereo ? 1 : 2) * 256];
          var9.bind(var2);
          var9.sampleBufferSize = (var0 & 0xfffffc00) + 1024;
          if (-16385 > ~var9.sampleBufferSize) {
            var9.sampleBufferSize = 16384;
          }

          var9.setBufferSize(var9.sampleBufferSize);
          if (AudioStreamEncoder4.anInt3507 > 0 && null == DummyClass36.aClass15_2613) {
            DummyClass36.aClass15_2613 = new AudioWorker();
            DummyClass36.aClass15_2613.aClass87_350 = var1;
            var1.createThread(0, AudioStreamEncoder4.anInt3507, DummyClass36.aClass15_2613);
          }

          if (DummyClass36.aClass15_2613 != null) {
            if (null != DummyClass36.aClass15_2613.aClass155Array352[var3]) {
              throw new IllegalArgumentException();
            }

            DummyClass36.aClass15_2613.aClass155Array352[var3] = var9;
          }

          return var9;
        } catch (Throwable var7) {
          if (var4 != 14) {
            anInt909 = 124;
          }

          try {
            SignLinkAudioOutputStream var5 = new SignLinkAudioOutputStream(var1, var3);
            var5.samples = new int[256 * (GameString.stereo ? 2 : 1)];
            var5.sampleRate = var0;
            var5.bind(var2);
            var5.sampleBufferSize = 16384;
            var5.setBufferSize(var5.sampleBufferSize);
            if (~AudioStreamEncoder4.anInt3507 < -1 && null == DummyClass36.aClass15_2613) {
              DummyClass36.aClass15_2613 = new AudioWorker();
              DummyClass36.aClass15_2613.aClass87_350 = var1;
              var1
                .createThread(var4 ^ 14, AudioStreamEncoder4.anInt3507, DummyClass36.aClass15_2613);
            }

            if (DummyClass36.aClass15_2613 != null) {
              if (DummyClass36.aClass15_2613.aClass155Array352[var3] != null) {
                throw new IllegalArgumentException();
              }

              DummyClass36.aClass15_2613.aClass155Array352[var3] = var5;
            }

            return var5;
          } catch (Throwable var6) {
            return new AbstractAudioOutputStream();
          }
        }
      } else {
        throw new IllegalArgumentException();
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "id.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ?
          "{...}" :
          "null") + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void method1196(int var0, int var1, byte var2, int var3, int var4) {
    try {
      GlTexture2d.anInt3765 = var4;
      if (var2 != 111) {
        aBoolean913 = true;
      }

      DummyClass55.anInt1425 = var1;
      DummyClass13.anInt2020 = var0;
      LightIntensity.anInt902 = var3;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "id.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void method1197(FileUnpacker var0, byte var1) {
    try {
      if (var1 != 69) {
        createAudioOutputStream(-53, null, null, 79, 12);
      }

      DummyClass39.aClass153_737 = var0;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "id.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

}
