import javax.media.opengl.GL;
import java.nio.ByteBuffer;

final class MaterialShader4 implements MaterialShader {

  private static float[] aFloatArray2178 = new float[] {0.1F, 0.1F, 0.15F, 0.1F};
  private int anInt2177 = -1;
  private float[] aFloatArray2179 = new float[4];
  private int anInt2180 = -1;
  private int anInt2181 = -1;


  public MaterialShader4() {
    this.method1699();
    this.method1701();
  }

  public static void method1700() {
    aFloatArray2178 = null;
  }

  private final void method1699() {
    byte[] var1 = new byte[] {(byte) 0, (byte) -1};
    GL var2 = GlRenderer.gl;
    int[] var3 = new int[1];
    var2.glGenTextures(1, var3, 0);
    var2.glBindTexture(3552, var3[0]);
    var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
    var2.glTexParameteri(3552, 10241, 9729);
    var2.glTexParameteri(3552, 10240, 9729);
    var2.glTexParameteri(3552, 10242, '\u812f');
    this.anInt2180 = var3[0];
  }

  private final void method1701() {
    GL var1 = GlRenderer.gl;
    this.anInt2177 = var1.glGenLists(2);
    var1.glNewList(this.anInt2177, 4864);
    var1.glTexEnvi(8960, '\u8590', 768);
    var1.glTexEnvi(8960, '\u8581', '\u8576');
    var1.glTexEnvf(8960, '\u8573', 2.0F);
    var1.glTexEnvi(8960, '\u8589', '\u8576');
    var1.glTexGeni(8192, 9472, 9217);
    var1.glTexGeni(8193, 9472, 9217);
    var1.glTexGenfv(8192, 9473, new float[] {9.765625E-4F, 0.0F, 0.0F, 0.0F}, 0);
    var1.glTexGenfv(8193, 9473, new float[] {0.0F, 0.0F, 9.765625E-4F, 0.0F}, 0);
    var1.glEnable(3168);
    var1.glEnable(3169);
    if (SomethingGl.aBoolean1227) {
      var1.glBindTexture('\u806f', SomethingGl.anInt1228);
      var1.glTexGeni(8194, 9472, 9217);
      var1.glTexGeni(8195, 9472, 9217);
      var1.glTexGenfv(8195, 9473, new float[] {0.0F, 0.0F, 0.0F, 1.0F}, 0);
      var1.glEnable(3170);
      var1.glEnable(3171);
      var1.glEnable('\u806f');
    }

    var1.glActiveTexture('\u84c1');
    var1.glEnable(3552);
    var1.glBindTexture(3552, this.anInt2180);
    var1.glTexEnvi(8960, '\u8571', '\u8575');
    var1.glTexEnvi(8960, '\u8580', '\u8576');
    var1.glTexEnvi(8960, '\u8582', 5890);
    var1.glTexEnvi(8960, '\u8572', '\u8575');
    var1.glTexEnvi(8960, '\u8588', '\u8576');
    var1.glTexEnvi(8960, '\u858a', 5890);
    var1.glEnable(3168);
    var1.glTexGeni(8192, 9472, 9216);
    var1.glPushMatrix();
    var1.glLoadIdentity();
    var1.glEndList();
    var1.glNewList(this.anInt2177 + 1, 4864);
    var1.glActiveTexture('\u84c1');
    var1.glDisable(3552);
    var1.glDisable(3168);
    var1.glTexEnvi(8960, '\u8571', 8448);
    var1.glTexEnvi(8960, '\u8580', 5890);
    var1.glTexEnvi(8960, '\u8582', '\u8576');
    var1.glTexEnvi(8960, '\u8572', 8448);
    var1.glTexEnvi(8960, '\u8588', 5890);
    var1.glTexEnvi(8960, '\u858a', '\u8576');
    var1.glActiveTexture('\u84c0');
    var1.glTexEnvi(8960, '\u8590', 768);
    var1.glTexEnvi(8960, '\u8581', '\u8578');
    var1.glTexEnvf(8960, '\u8573', 1.0F);
    var1.glTexEnvi(8960, '\u8589', '\u8578');
    var1.glDisable(3168);
    var1.glDisable(3169);
    if (SomethingGl.aBoolean1227) {
      var1.glDisable(3170);
      var1.glDisable(3171);
      var1.glDisable('\u806f');
    }

    var1.glEndList();
  }

  public final void disable() {
    GlRenderer.gl.glCallList(this.anInt2177 + 1);
  }

  public final void set(int var1) {
    GL var2 = GlRenderer.gl;
    var2.glActiveTexture('\u84c1');
    var2.glTexEnvfv(8960, 8705, AbstractFileRequester.aFloatArray1934, 0);
    var2.glActiveTexture('\u84c0');
    if ((var1 & 1) == 1) {
      if (SomethingGl.aBoolean1227) {
        if (this.anInt2181 != GlRenderer.anInt1791) {
          this.aFloatArray2179[0] = 0.0F;
          this.aFloatArray2179[1] = 0.0F;
          this.aFloatArray2179[2] = 0.0F;
          this.aFloatArray2179[3] = (float) GlRenderer.anInt1791 * 0.0050F;
          var2.glTexGenfv(8194, 9473, this.aFloatArray2179, 0);
          this.anInt2181 = GlRenderer.anInt1791;
        }
      } else {
        GlRenderer.bindTexture(SomethingGl.anIntArray1224[GlRenderer.anInt1791 * 64 / 100 % 64]);
      }
    } else if (SomethingGl.aBoolean1227) {
      this.aFloatArray2179[0] = 0.0F;
      this.aFloatArray2179[1] = 0.0F;
      this.aFloatArray2179[2] = 0.0F;
      this.aFloatArray2179[3] = 0.0F;
      var2.glTexGenfv(8194, 9473, this.aFloatArray2179, 0);
    } else {
      GlRenderer.bindTexture(SomethingGl.anIntArray1224[0]);
    }

  }

  public final void enable() {
    GL var1 = GlRenderer.gl;
    GlRenderer.method1856(2);
    GlRenderer.method1847(2);
    GlRenderer.loadIdentityTextureMatrix();
    var1.glCallList(this.anInt2177);
    float var2 = 2662.4001F;
    var2 += (float) (GroundItem.anInt2938 - 128) * 0.5F;
    if (var2 >= 3328.0F) {
      var2 = 3327.0F;
    }

    this.aFloatArray2179[0] = 0.0F;
    this.aFloatArray2179[1] = 0.0F;
    this.aFloatArray2179[2] = 1.0F / (var2 - 3328.0F);
    this.aFloatArray2179[3] = var2 / (var2 - 3328.0F);
    var1.glTexGenfv(8192, 9474, this.aFloatArray2179, 0);
    var1.glPopMatrix();
    var1.glActiveTexture('\u84c0');
    var1.glTexEnvfv(8960, 8705, aFloatArray2178, 0);
  }

  public final int method24() {
    return 15;
  }

}
