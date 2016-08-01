import javax.media.opengl.GL;
import java.nio.ByteBuffer;

final class SomethingGl {

  static int[] anIntArray1223 = null;
  static int[] anIntArray1224 = null;
  static boolean aBoolean1227;
  static int anInt1228 = -1;
  static int anInt1229 = -1;
  private static ByteBuffer aByteBuffer1225;
  private static ByteBuffer aByteBuffer1226;

  static final void method1454() {
    byte[] var1;
    if (aByteBuffer1226 == null) {
      Something3dTexture1 var0 = new Something3dTexture1();
      var1 = var0.method2250(64, 64, 64);
      aByteBuffer1226 = ByteBuffer.allocateDirect(var1.length);
      aByteBuffer1226.position(0);
      aByteBuffer1226.put(var1);
      aByteBuffer1226.flip();
    }

    if (aByteBuffer1225 == null) {
      Something3dTexture var2 = new Something3dTexture();
      var1 = var2.method2243(64, 64, 64);
      aByteBuffer1225 = ByteBuffer.allocateDirect(var1.length);
      aByteBuffer1225.position(0);
      aByteBuffer1225.put(var1);
      aByteBuffer1225.flip();
    }

  }

  static final void method1455() {
    GL var0;
    int[] var1;
    if (anInt1228 != -1) {
      var0 = GlRenderer.gl;
      var1 = new int[] {anInt1228};
      var0.glDeleteTextures(1, var1, 0);
      anInt1228 = -1;
      DummyClass33.textureMemory -= aByteBuffer1226.limit() * 2;
    }

    if (anIntArray1224 != null) {
      var0 = GlRenderer.gl;
      var0.glDeleteTextures(64, anIntArray1224, 0);
      anIntArray1224 = null;
      DummyClass33.textureMemory -= aByteBuffer1226.limit() * 2;
    }

    if (anInt1229 != -1) {
      var0 = GlRenderer.gl;
      var1 = new int[] {anInt1229};
      var0.glDeleteTextures(1, var1, 0);
      anInt1229 = -1;
      DummyClass33.textureMemory -= aByteBuffer1225.limit() * 2;
    }

    if (anIntArray1223 != null) {
      var0 = GlRenderer.gl;
      var0.glDeleteTextures(64, anIntArray1223, 0);
      anIntArray1223 = null;
      DummyClass33.textureMemory -= aByteBuffer1225.limit() * 2;
    }

  }

  static final void method1456() {
    aBoolean1227 = GlRenderer.texture3dSupport;
    method1454();
    method1458();
    method1459();
  }

  public static void method1457() {
    anIntArray1224 = null;
    anIntArray1223 = null;
    aByteBuffer1226 = null;
    aByteBuffer1225 = null;
  }

  private static final void method1458() {
    GL var0 = GlRenderer.gl;
    if (aBoolean1227) {
      int[] var1 = new int[1];
      var0.glGenTextures(1, var1, 0);
      var0.glBindTexture('\u806f', var1[0]);
      aByteBuffer1226.position(0);
      var0.glTexImage3D('\u806f', 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer1226);
      var0.glTexParameteri('\u806f', 10241, 9729);
      var0.glTexParameteri('\u806f', 10240, 9729);
      anInt1228 = var1[0];
      DummyClass33.textureMemory += aByteBuffer1226.limit() * 2;
    } else {
      anIntArray1224 = new int[64];
      var0.glGenTextures(64, anIntArray1224, 0);

      for (int var2 = 0; var2 < 64; ++var2) {
        GlRenderer.bindTexture(anIntArray1224[var2]);
        aByteBuffer1226.position(var2 * 64 * 64 * 2);
        var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer1226);
        var0.glTexParameteri(3553, 10241, 9729);
        var0.glTexParameteri(3553, 10240, 9729);
      }

      DummyClass33.textureMemory += aByteBuffer1226.limit() * 2;
    }

  }

  private static final void method1459() {
    GL var0 = GlRenderer.gl;
    if (aBoolean1227) {
      int[] var1 = new int[1];
      var0.glGenTextures(1, var1, 0);
      var0.glBindTexture('\u806f', var1[0]);
      aByteBuffer1225.position(0);
      var0.glTexImage3D('\u806f', 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer1225);
      var0.glTexParameteri('\u806f', 10241, 9729);
      var0.glTexParameteri('\u806f', 10240, 9729);
      anInt1229 = var1[0];
      DummyClass33.textureMemory += aByteBuffer1225.limit() * 2;
    } else {
      anIntArray1223 = new int[64];
      var0.glGenTextures(64, anIntArray1223, 0);

      for (int var2 = 0; var2 < 64; ++var2) {
        GlRenderer.bindTexture(anIntArray1223[var2]);
        aByteBuffer1225.position(var2 * 64 * 64 * 2);
        var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer1225);
        var0.glTexParameteri(3553, 10241, 9729);
        var0.glTexParameteri(3553, 10240, 9729);
      }

      DummyClass33.textureMemory += aByteBuffer1225.limit() * 2;
    }

  }

}
