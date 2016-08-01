import java.awt.Frame;

final class FileCacheRequest extends AbstractFileRequest {

  private static GameString aClass94_4055 = SpawnedGameObject.createString(" has logged in)3");
  static int anInt4054;
  static GameString aClass94_4057 = SpawnedGameObject.createString("Mem:");
  static SceneSomething[] aClass25Array4060;
  static int anInt4062 = 0;
  static boolean aBoolean4063 = false;
  static GameString aClass94_4058 = aClass94_4055;
  FileCache aClass41_4056;
  byte[] aByteArray4059;
  int anInt4061;

  final int method586(boolean var1) {
    try {
      if (var1) {
        this.aClass41_4056 = null;
      }

      return this.aBoolean3632 ? 0 : 100;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "c.A(" + var1 + ')');
    }
  }

  final byte[] method587(boolean var1) {
    try {
      if (var1) {
        aBoolean4063 = true;
      }

      if (!this.aBoolean3632) {
        return this.aByteArray4059;
      } else {
        throw new RuntimeException();
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "c.E(" + var1 + ')');
    }
  }

  static final boolean hasKeyInput() {
    try {
      Keyboard var1 = TextureSampler33.keyboard;
      synchronized (var1) {
        if (~DummyClass21.anInt1762 != ~Parameter.anInt3620) {
          Parameter.anInt3624 = AbstractFrameRegulator.keyQueue[Parameter.anInt3620];
          TextureSampler7.anInt3342 = AbstractAudioOutputStream.otherKeyQueue[Parameter.anInt3620];
          Parameter.anInt3620 = 1 + Parameter.anInt3620 & 127;
          return true;
        } else {
          return false;
        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "c.F()");
    }
  }

  public static void method592(byte var0) {
    try {
      aClass25Array4060 = null;
      aClass94_4057 = null;
      if (var0 > 33) {
        aClass94_4058 = null;
        aClass94_4055 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "c.P(" + var0 + ')');
    }
  }

  static final void method593(Frame var0, boolean var1, SignLink var2) {
    try {
      if (!var1) {
        method594(110, 94);
      }

      while (true) {
        SignLinkRequest var3 = var2.method1436(var0, 86);

        while (-1 == ~var3.status) {
          TextureSampler25.sleep(10L);
        }

        if (1 == var3.status) {
          var0.setVisible(false);
          var0.dispose();
          return;
        }

        TextureSampler25.sleep(100L);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "c.R(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  static final void method594(int var0, int var1) {
    try {
      if (var0 < 83) {
        method592((byte) 122);
      }

      DummyHashTable.aClass93_1683.method1522(-127, var1);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "c.Q(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method595(int var0, int var1) {
    try {
      if (var1 > 108) {
        FileCache.aClass93_684.method1522(-128, var0);
        DummyClass5.aClass93_2984.method1522(-125, var0);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "c.O(" + var0 + ',' + var1 + ')');
    }
  }

}
