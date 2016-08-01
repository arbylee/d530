import javax.media.opengl.GL;

final class GlEnvironment {

  private static int color = -1;
  private static float diffuseIntensity = -1.0F;
  private static float secondaryIntensity = -1.0F;
  private static float ambientIntensity;
  private static float[] diffuseLight1 = new float[4];
  private static int fogOffset = -1;
  private static int fogColor = -1;
  static float[] diffuseLight0 = new float[4];
  static int anInt1314;
  static int anInt1315;
  static int defaultFogColor = 13156520;
  static float[] fogColorRgb = new float[4];
  static int defaultSunColor = 16777215;

  static final void updateSunPosition() {
    GL var0 = GlRenderer.gl;
    var0.glLightfv(16384, 4611, diffuseLight0, 0);
    var0.glLightfv(16385, 4611, diffuseLight1, 0);
  }

  static final float method1505() {
    return diffuseIntensity;
  }

  static final void setSunColor(int color, float ambientIntensity, float diffuseIntensity,
                                float secondaryIntensity) {
    if (GlEnvironment.color != color || GlEnvironment.ambientIntensity != ambientIntensity
      || GlEnvironment.diffuseIntensity != diffuseIntensity
      || GlEnvironment.secondaryIntensity != secondaryIntensity) {
      GlEnvironment.color = color;
      GlEnvironment.ambientIntensity = ambientIntensity;
      GlEnvironment.diffuseIntensity = diffuseIntensity;
      GlEnvironment.secondaryIntensity = secondaryIntensity;
      GL var4 = GlRenderer.gl;
      float red = (float) (color >> 16 & 255) / 255.0F;
      float green = (float) (color >> 8 & 255) / 255.0F;
      float blue = (float) (color & 255) / 255.0F;
      float[] colors = new float[] {
        ambientIntensity * red, ambientIntensity * green, ambientIntensity * blue, 1.0F
      };
      // GL_LIGHT_AMBIENT
      var4.glLightModelfv(2899, colors, 0);
      // GL_LIGHT_0, DIFFUSE
      float[] var9 = new float[] {
        diffuseIntensity * red, diffuseIntensity * green, diffuseIntensity * blue, 1.0F
      };
      var4.glLightfv(16384, 4609, var9, 0);

      // GL_LIGHT_1
      float[] var10 = new float[] {
        -secondaryIntensity * red, -secondaryIntensity * green, -secondaryIntensity * blue, 1.0F
      };
      var4.glLightfv(16385, 4609, var10, 0);
    }
  }

  public static void method1507() {
    diffuseLight0 = null;
    diffuseLight1 = null;
    fogColorRgb = null;
  }

  static final void setFogColor(int color, int offset) {
    if (fogColor != color || fogOffset != offset) {
      fogColor = color;
      fogOffset = offset;
      GL var2 = GlRenderer.gl;
      byte minimumStart = 50;
      // 7 tiles
      short fogEnd = 3584; /*3584*/
      ;
      fogColorRgb[0] = (float) (color >> 16 & 255) / 255.0F;
      fogColorRgb[1] = (float) (color >> 8 & 255) / 255.0F;
      fogColorRgb[2] = (float) (color & 255) / 255.0F;
      // GL_FOG_MODE, GL_LINEAR
      var2.glFogi(2917, 9729);
      var2.glFogf(2914, 0.95F);
      // GL_FOG_HINT, GL_FASTEST
      var2.glHint(3156, 4354);
      int fogStart = fogEnd - 512 - offset;
      if (fogStart < minimumStart) {
        fogStart = minimumStart;
      }
      var2.glFogf(2915, (float) fogStart);
      var2.glFogf(2916, (float) (fogEnd - 256));
      var2.glFogfv(2918, fogColorRgb, 0);
    }
  }

  static final void setSunPosition(float var0, float var1, float var2) {
    if (diffuseLight0[0] != var0 || diffuseLight0[1] != var1 || diffuseLight0[2] != var2) {
      diffuseLight0[0] = var0;
      diffuseLight0[1] = var1;
      diffuseLight0[2] = var2;
      diffuseLight1[0] = -var0;
      diffuseLight1[1] = -var1;
      diffuseLight1[2] = -var2;
      anInt1314 = (int) (var0 * 256.0F / var1);
      anInt1315 = (int) (var2 * 256.0F / var1);
    }
  }

  static final int method1510() {
    return color;
  }

  static final void method1511() {
    GL var0 = GlRenderer.gl;
    var0.glColorMaterial(1028, 5634);
    var0.glEnable(2903);
    float[] var1 = new float[] {0.0F, 0.0F, 0.0F, 1.0F};
    var0.glLightfv(16384, 4608, var1, 0);
    var0.glEnable(16384);
    float[] var2 = new float[] {0.0F, 0.0F, 0.0F, 1.0F};
    var0.glLightfv(16385, 4608, var2, 0);
    var0.glEnable(16385);
    color = -1;
    fogColor = -1;
    method1513();
  }

  static final void setFogColor(float[] var0) {
    if (var0 == null) {
      var0 = fogColorRgb;
    }

    GL var1 = GlRenderer.gl;
    var1.glFogfv(2918, var0, 0);
  }

  private static final void method1513() {
    setSunColor(defaultSunColor, 1.1523438F, 0.69921875F, 1.2F);
    setSunPosition(-50.0F, -60.0F, -50.0F);
    setFogColor(defaultFogColor, 0);
  }

  static final float method1514() {
    return ambientIntensity;
  }

}
