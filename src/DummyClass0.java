import javax.media.opengl.GL;
import java.nio.FloatBuffer;

final class DummyClass0 extends DummyClass2 {

  private static int anInt2682;

  static {
    new DummyHashTable(8);
    anInt2682 = 2;
    new Buffer(131056);
  }

  DummyClass0() {
    new DummyClass1();
    new Deque();
  }

  final void method1759() {
  }

  static final void method1755() {
    GL var0 = GlRenderer.gl;
    if (var0.isExtensionAvailable("GL_ARB_point_parameters")) {
      float[] var1 = new float[] {1.0F, 0.0F, 5.0E-4F};
      var0.glPointParameterfvARB('\u8129', var1, 0);
      FloatBuffer var2 = FloatBuffer.allocate(1);
      var0.glGetFloatv('\u8127', var2);
      float var3 = var2.get(0);
      if (var3 > 1024.0F) {
        var3 = 1024.0F;
      }

      var0.glPointParameterfARB('\u8126', 1.0F);
      var0.glPointParameterfARB('\u8127', var3);
    }

    if (var0.isExtensionAvailable("GL_ARB_point_sprite")) {
    }

  }

  static final void method1756() {
  }

  static final int method1757() {
    return anInt2682;
  }

  static final void method1758(int var0) {
    anInt2682 = var0;
  }
}
