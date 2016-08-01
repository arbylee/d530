import javax.media.opengl.GL;
import java.nio.IntBuffer;

final class GlUtils {

  private static int anInt450 = 0;
  static GlDirectColorSprite aClass3_Sub28_Sub16_Sub1_447 = null;
  static int anInt448 = 0;
  static int anInt449 = 0;
  static int anInt451 = 0;

  static final void method921() {
    aClass3_Sub28_Sub16_Sub1_447 = null;
  }

  static final void drawHorizontalLine(int x, int y, int length, int var3) {
    GlRenderer.resetState();
    float xx0 = (float) x + 0.3F;
    float xx1 = xx0 + (float) length;
    float yy0 = (float) GlRenderer.viewHeight - ((float) y + 0.3F);
    GL var7 = GlRenderer.gl;
    var7.glBegin(1);
    var7.glColor3ub((byte) (var3 >> 16), (byte) (var3 >> 8), (byte) var3);
    var7.glVertex2f(xx0, yy0);
    var7.glVertex2f(xx1, yy0);
    var7.glEnd();
  }

  public static void method923() {
    aClass3_Sub28_Sub16_Sub1_447 = null;
  }

  static final void drawVerticalLine(int var0, int var1, int var2, int var3) {
    GlRenderer.resetState();
    float var4 = (float) var0 + 0.3F;
    float var5 = (float) GlRenderer.viewHeight - ((float) var1 + 0.3F);
    float var6 = var5 - (float) var2;
    GL var7 = GlRenderer.gl;
    var7.glBegin(1);
    var7.glColor3ub((byte) (var3 >> 16), (byte) (var3 >> 8), (byte) var3);
    var7.glVertex2f(var4, var5);
    var7.glVertex2f(var4, var6);
    var7.glEnd();
  }

  static final void resetClip() {
    anInt449 = 0;
    anInt448 = 0;
    anInt450 = GlRenderer.viewWidth;
    anInt451 = GlRenderer.viewHeight;
    GL var0 = GlRenderer.gl;
    // 	GL_SCISSOR_TEST	3089
    var0.glDisable(3089);
    method921();
  }

  static final void drawImage(int[] var0, int var1, int var2, int var3, int var4) {
    GlRenderer.resetState();
    GL var5 = GlRenderer.gl;
    var5.glRasterPos2i(var1, GlRenderer.viewHeight - var2);
    var5.glPixelZoom(1.0F, -1.0F);
    var5.glDisable(3042);
    var5.glDisable(3008);
    var5.glDrawPixels(var3, var4, '\u80e1', GlRenderer.bigEndian ? '\u8367' : 5121,
      IntBuffer.wrap(var0));
    var5.glEnable(3008);
    var5.glEnable(3042);
    var5.glPixelZoom(1.0F, 1.0F);
  }

  static final void drawQuad(int var0, int var1, int var2, int var3, int var4) {
    GlRenderer.resetState();
    float var5 = (float) var0 + 0.3F;
    float var6 = var5 + (float) (var2 - 1);
    float var7 = (float) GlRenderer.viewHeight - ((float) var1 + 0.3F);
    float var8 = var7 - (float) (var3 - 1);
    GL var9 = GlRenderer.gl;
    var9.glBegin(2);
    var9.glColor3ub((byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4);
    var9.glVertex2f(var5, var7);
    var9.glVertex2f(var5, var8);
    var9.glVertex2f(var6, var8);
    var9.glVertex2f(var6, var7);
    var9.glEnd();
  }

  static final void drawQuad(int x0, int y0, int width, int height, int color, int alpha) {
    GlRenderer.resetState();
    float var6 = (float) x0 + 0.3F;
    float var7 = var6 + (float) (width - 1);
    float var8 = (float) GlRenderer.viewHeight - ((float) y0 + 0.3F);
    float var9 = var8 - (float) (height - 1);
    GL var10 = GlRenderer.gl;
    var10.glBegin(2);
    var10.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color,
      alpha > 255 ? -1 : (byte) alpha);
    var10.glVertex2f(var6, var8);
    var10.glVertex2f(var6, var9);
    var10.glVertex2f(var7, var9);
    var10.glVertex2f(var7, var8);
    var10.glEnd();
  }

  static final void method929(int var0, int var1, int var2, int var3, int color, int var5) {
    int var6 = var2 - var0;
    int var7 = var3 - var1;
    int var8 = var6 >= 0 ? var6 : -var6;
    int var9 = var7 >= 0 ? var7 : -var7;
    int var10 = var8;
    if (var8 < var9) {
      var10 = var9;
    }

    if (var10 != 0) {
      int var11 = (var6 << 16) / var10;
      int var12 = (var7 << 16) / var10;
      if (var12 <= var11) {
        var11 = -var11;
      } else {
        var12 = -var12;
      }

      int var13 = var5 * var12 >> 17;
      int var14 = var5 * var12 + 1 >> 17;
      int var15 = var5 * var11 >> 17;
      int var16 = var5 * var11 + 1 >> 17;
      int x3 = var0 + var13;
      int x2 = var0 - var14;
      int x1 = var0 + var6 - var14;
      int x0 = var0 + var6 + var13;
      int y3 = var1 + var15;
      int y2 = var1 - var16;
      int y1 = var1 + var7 - var16;
      int y0 = var1 + var7 + var15;
      GlRenderer.resetState();
      GL var25 = GlRenderer.gl;
      var25.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
      var25.glBegin(6);
      if (var12 <= var11) {
        var25.glVertex2f((float) x0, (float) (GlRenderer.viewHeight - y0));
        var25.glVertex2f((float) x1, (float) (GlRenderer.viewHeight - y1));
        var25.glVertex2f((float) x2, (float) (GlRenderer.viewHeight - y2));
        var25.glVertex2f((float) x3, (float) (GlRenderer.viewHeight - y3));
      } else {
        var25.glVertex2f((float) x3, (float) (GlRenderer.viewHeight - y3));
        var25.glVertex2f((float) x2, (float) (GlRenderer.viewHeight - y2));
        var25.glVertex2f((float) x1, (float) (GlRenderer.viewHeight - y1));
        var25.glVertex2f((float) x0, (float) (GlRenderer.viewHeight - y0));
      }

      var25.glEnd();
    }
  }

  static final void fillQuad(int x0, int y0, int x1, int y1, int color, int alpha) {
    GlRenderer.resetState();
    float xx0 = (float) x0;
    float xx1 = xx0 + (float) x1;
    float yy0 = (float) (GlRenderer.viewHeight - y0);
    float yy1 = yy0 - (float) y1;
    GL gl = GlRenderer.gl;
    gl.glBegin(6);
    gl.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color,
      alpha > 255 ? -1 : (byte) alpha);
    gl.glVertex2f(xx0, yy0);
    gl.glVertex2f(xx0, yy1);
    gl.glVertex2f(xx1, yy1);
    gl.glVertex2f(xx1, yy0);
    gl.glEnd();
  }

  static final void method931(int var0, int var1, int var2, int var3) {
    if (anInt449 < var0) {
      anInt449 = var0;
    }

    if (anInt448 < var1) {
      anInt448 = var1;
    }

    if (anInt450 > var2) {
      anInt450 = var2;
    }

    if (anInt451 > var3) {
      anInt451 = var3;
    }

    GL var4 = GlRenderer.gl;
    var4.glEnable(3089);
    if (anInt449 <= anInt450 && anInt448 <= anInt451) {
      var4.glScissor(anInt449, GlRenderer.viewHeight - anInt451, anInt450 - anInt449,
        anInt451 - anInt448);
    } else {
      var4.glScissor(0, 0, 0, 0);
    }

    method921();
  }

  static final void clear() {
    // 	GL_DEPTH_BUFFER_BIT	256
    // GL_COLOR_BUFFER_BIT	16384
    GlRenderer.gl.glClear(16640);
  }

  static final void method933(int var0, int var1, int var2, int var3, int var4) {
    GlRenderer.resetState();
    float var5 = (float) var0 + 0.3F;
    float var6 = (float) var2 + 0.3F;
    float var7 = (float) GlRenderer.viewHeight - ((float) var1 + 0.3F);
    float var8 = (float) GlRenderer.viewHeight - ((float) var3 + 0.3F);
    GL var9 = GlRenderer.gl;
    var9.glBegin(2);
    var9.glColor3ub((byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4);
    var9.glVertex2f(var5, var7);
    var9.glVertex2f(var6, var8);
    var9.glEnd();
  }

  static final void fillQuad(int x0, int y0, int x1, int y1, int color) {
    GlRenderer.resetState();
    float xx0 = (float) x0;
    float xx1 = xx0 + (float) x1;
    float yy0 = (float) (GlRenderer.viewHeight - y0);
    float yy1 = yy0 - (float) y1;
    GL var9 = GlRenderer.gl;
    var9.glBegin(6);
    var9.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
    var9.glVertex2f(xx0, yy0);
    var9.glVertex2f(xx0, yy1);
    var9.glVertex2f(xx1, yy1);
    var9.glVertex2f(xx1, yy0);
    var9.glEnd();
  }

  static final void clip(int var0, int var1, int var2, int var3) {
    if (var0 < 0) {
      var0 = 0;
    }

    if (var1 < 0) {
      var1 = 0;
    }

    if (var2 > GlRenderer.viewWidth) {
      var2 = GlRenderer.viewWidth;
    }

    if (var3 > GlRenderer.viewHeight) {
      var3 = GlRenderer.viewHeight;
    }

    anInt449 = var0;
    anInt448 = var1;
    anInt450 = var2;
    anInt451 = var3;
    GL var4 = GlRenderer.gl;
    var4.glEnable(3089);
    if (anInt449 <= anInt450 && anInt448 <= anInt451) {
      var4.glScissor(anInt449, GlRenderer.viewHeight - anInt451, anInt450 - anInt449,
        anInt451 - anInt448);
    } else {
      var4.glScissor(0, 0, 0, 0);
    }

    method921();
  }

  static final void method936(GlDirectColorSprite var0) {
    if (var0.anInt3696 != anInt451 - anInt448) {
      throw new IllegalArgumentException();
    } else {
      aClass3_Sub28_Sub16_Sub1_447 = var0;
    }
  }

}
