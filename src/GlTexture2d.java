import javax.media.opengl.GL;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

final class GlTexture2d extends SubNode {

  static int anInt3757;
  static GameString aClass94_3758 =
    SpawnedGameObject.createString("Veuillez patienter )2 tentative de r-Btablissement)3");
  static GameString aClass94_3763 = SpawnedGameObject.createString("Liste der Welten geladen");
  static int anInt3764;
  static int anInt3765 = 100;
  static int anInt3766 = 0;
  static int[] quadx1 = new int[100];
  static boolean aBoolean3769 = false;
  private static GameString aClass94_3761 = SpawnedGameObject.createString("Face here");
  static GameString aClass94_3762 = aClass94_3761;
  private int anInt3759 = -1;
  private int anInt3760;
  private int anInt3767 = 0;


  GlTexture2d(int color) {
    try {
      GL var2 = GlRenderer.gl;
      int[] var3 = new int[1];
      var2.glGenTextures(1, var3, 0);
      this.anInt3759 = var3[0];
      this.anInt3760 = DummyClass33.anInt582;
      GlRenderer.bindTexture(this.anInt3759);
      int rgbColor = DummyClass40.hslTable[color];
      byte[] var5 =
        new byte[] {(byte) (rgbColor >> 16), (byte) (rgbColor >> 8), (byte) rgbColor, (byte) -1};
      ByteBuffer var6 = ByteBuffer.wrap(var5);
      var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
      var2.glTexParameteri(3553, 10241, 9729);
      var2.glTexParameteri(3553, 10240, 9729);
      DummyClass33.textureMemory += var6.limit() - this.anInt3767;
      this.anInt3767 = var6.limit();
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7, "sd.<init>(" + color + ')');
    }
  }

  static final void method709(int var0, int var1) {
    SceneGraphTile var2 = SomethingTexture1.sceneGraphTiles[0][var0][var1];

    for (int var3 = 0; var3 < 3; ++var3) {
      SceneGraphTile var4 = SomethingTexture1.sceneGraphTiles[var3][var0][var1] =
        SomethingTexture1.sceneGraphTiles[var3 + 1][var0][var1];
      if (var4 != null) {
        --var4.anInt2244;

        for (int var5 = 0; var5 < var4.anInt2223; ++var5) {
          SceneSomething var6 = var4.sceneGraphNodes[var5];
          if ((var6.aLong498 >> 29 & 3L) == 2L && var6.anInt483 == var0 && var6.anInt478 == var1) {
            --var6.anInt493;
          }
        }
      }
    }

    if (SomethingTexture1.sceneGraphTiles[0][var0][var1] == null) {
      SomethingTexture1.sceneGraphTiles[0][var0][var1] = new SceneGraphTile(0, var0, var1);
    }

    SomethingTexture1.sceneGraphTiles[0][var0][var1].aClass3_Sub2_2235 = var2;
    SomethingTexture1.sceneGraphTiles[3][var0][var1] = null;
  }

  static final void method710(byte var0) {
    try {
      if (var0 >= 122) {
        AbstractGameWorld.floorUnderlays.method1523((byte) -104);
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sd.C(" + var0 + ')');
    }
  }

  public static void method711(int var0) {
    try {
      aClass94_3762 = null;
      aClass94_3758 = null;
      quadx1 = null;
      if (var0 != 1) {
        aClass94_3761 = null;
      }

      aClass94_3763 = null;
      aClass94_3761 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sd.B(" + var0 + ')');
    }
  }

  static final void method713(int var0) {
    try {
      try {
        Method var1 = Runtime.class.getMethod("maxMemory", new Class[var0]);
        if (null != var1) {
          try {
            Runtime var2 = Runtime.getRuntime();
            Long var3 = (Long) var1.invoke(var2, (Object[]) null);
            AudioStreamEncoder3.anInt3492 = (int) (var3.longValue() / 1048576L) - -1;
          } catch (Throwable var4) {
          }
        }
      } catch (Exception var5) {
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "sd.A(" + var0 + ')');
    }
  }

  protected final void finalize() throws Throwable {
    try {
      if (this.anInt3759 != -1) {
        DummyClass33.method985(this.anInt3759, this.anInt3767, this.anInt3760);
        this.anInt3759 = -1;
        this.anInt3767 = 0;
      }

      super.finalize();
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sd.finalize()");
    }
  }

  final void initialize(byte var1) {
    try {
      int var2 = DummyClass32.method961(var1 + 1530);
      if (-1 == ~(1 & var2)) {
        GlRenderer.bindTexture(this.anInt3759);
      }

      if (0 == (var2 & 2)) {
        GlRenderer.method1856(0);
      }

      if (~(var2 & 4) == -1) {
        GlRenderer.method1847(0);
      }

      if (var1 != 6) {
        aClass94_3763 = null;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sd.E(" + var1 + ')');
    }
  }

}
