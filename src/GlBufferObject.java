import javax.media.opengl.GL;
import java.nio.ByteBuffer;

final class GlBufferObject {

  private int anInt1991;
  private int anInt1992;
  private int anInt1993;
  private boolean aBoolean1994;


  public GlBufferObject() {
    this(false);
  }

  GlBufferObject(boolean var1) {
    this.anInt1991 = -1;
    this.anInt1993 = 0;
    GL var2 = GlRenderer.gl;
    int[] var3 = new int[1];
    var2.glGenBuffersARB(1, var3, 0);
    this.aBoolean1994 = var1;
    this.anInt1991 = var3[0];
    this.anInt1992 = DummyClass33.anInt582;
  }

  final void method2168(ByteBuffer var1) {
    if (var1.limit() <= this.anInt1993) {
      GL var2 = GlRenderer.gl;
      var2.glBindBufferARB('\u8892', this.anInt1991);
      var2.glBufferSubDataARB('\u8892', 0, var1.limit(), var1);
    } else {
      this.setVertexBufferData(var1);
    }

  }

  protected final void finalize() throws Throwable {
    if (this.anInt1991 != -1) {
      DummyClass33.method989(this.anInt1991, this.anInt1993, this.anInt1992);
      this.anInt1991 = -1;
      this.anInt1993 = 0;
    }

    super.finalize();
  }

  final void bindVertexBuffer() {
    GL var1 = GlRenderer.gl;
    var1.glBindBufferARB('\u8892', this.anInt1991);
  }

  final void setElementBufferData(ByteBuffer var1) {
    GL var2 = GlRenderer.gl;
    var2.glBindBufferARB('\u8893', this.anInt1991);
    var2.glBufferDataARB('\u8893', var1.limit(), var1, this.aBoolean1994 ? '\u88e0' : '\u88e4');
    DummyClass33.anInt585 += var1.limit() - this.anInt1993;
    this.anInt1993 = var1.limit();
  }

  final void bindElementBuffer() {
    GL var1 = GlRenderer.gl;
    var1.glBindBufferARB('\u8893', this.anInt1991);
  }

  final void setVertexBufferData(ByteBuffer var1) {
    GL var2 = GlRenderer.gl;
    var2.glBindBufferARB('\u8892', this.anInt1991);
    var2.glBufferDataARB('\u8892', var1.limit(), var1, this.aBoolean1994 ? '\u88e0' : '\u88e4');
    DummyClass33.anInt585 += var1.limit() - this.anInt1993;
    this.anInt1993 = var1.limit();
  }
}
