import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;
import javax.media.opengl.glu.GLU;
import java.awt.Canvas;
import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

final class GlRenderer {

  static int maxTextureUnits;
  static boolean bigEndian;
  static int anInt1791 = 0;
  static boolean aBoolean1798 = true;
  static boolean texture3dSupport;
  static GL gl;
  static boolean useOpenGlRenderer = false;
  static boolean multiSampleSupport;
  static int anInt1810;
  static int viewHeight;
  static boolean vertexBufferSupport;
  static boolean aBoolean1817;
  static boolean vertexProgramSupport;
  static int viewWidth;
  static boolean cubemapSupport;
  private static String aString1785;
  private static String aString1786;
  private static float aFloat1787;
  private static boolean textureMatrixSetup = false;
  private static int anInt1792 = 0;
  private static int anInt1793 = 0;
  private static float aFloat1794 = 0.0F;
  private static float aFloat1795;
  private static boolean lightingEnabled = true;
  private static float aFloat1797 = 0.0F;
  private static boolean viewportSetup = false;
  private static GLContext glContext;
  private static float aFloat1801 = 0.09765625F;
  private static int textureId = -1;
  private static boolean depthTestEnabled = true;
  private static int anInt1806;
  private static float[] projectionMatrix = new float[16];
  private static int anInt1812;
  private static int anInt1814;
  private static GLDrawable glDrawable;
  private static boolean fogEnabled = true;
  private static GameString aClass94_1819 = SpawnedGameObject.createString("radeon");

  private static final GameString method1820(String var0) {
    byte[] var1;
    try {
      var1 = var0.getBytes("ISO-8859-1");
    } catch (UnsupportedEncodingException var3) {
      var1 = var0.getBytes();
    }

    return TextureSampler33.createString(var1, 0, var1.length);
  }

  static final void method1821(int var0, int var1, int var2, int var3) {
    method1844(0, 0, viewWidth, viewHeight, var0, var1, 0.0F, 0.0F, var2, var3);
  }

  static final void method1822() {
    SomethingQuickChat.method551(0, 0, 0);
    setupViewport();
    method1856(1);
    method1847(1);
    setLightingEnabled(false);
    setDepthTestEnabled(false);
    setFogEnabled(false);
    loadIdentityTextureMatrix();
  }

  static final void loadIdentityTextureMatrix() {
    if (textureMatrixSetup) {
      gl.glMatrixMode(5890);
      gl.glLoadIdentity();
      gl.glMatrixMode(5888);
      textureMatrixSetup = false;
    }

  }

  static final void method1824() {
    SomethingQuickChat.method551(0, 0, 0);
    setupViewport();
    method1856(0);
    method1847(0);
    setLightingEnabled(false);
    setDepthTestEnabled(false);
    setFogEnabled(false);
    loadIdentityTextureMatrix();
  }

  static final void method1825(float var0, float var1) {
    if (!viewportSetup) {
      if (var0 != aFloat1797 || var1 != aFloat1794) {
        aFloat1797 = var0;
        aFloat1794 = var1;
        if (var1 != 0.0F) {
          float var2 = var0 / (var1 + var0);
          float var3 = var2 * var2;
          float var4 = -aFloat1795 * (1.0F - var2) * (1.0F - var2) / var1;
          projectionMatrix[10] = aFloat1787 + var4;
          projectionMatrix[14] = aFloat1795 * var3;
        } else {
          projectionMatrix[10] = aFloat1787;
          projectionMatrix[14] = aFloat1795;
        }

        gl.glMatrixMode(5889);
        gl.glLoadMatrixf(projectionMatrix, 0);
        gl.glMatrixMode(5888);
      }
    }
  }

  static final void swapBuffers() {
    try {
      glDrawable.swapBuffers();
    } catch (Exception var1) {
    }

  }

  static final void setFogEnabled(boolean var0) {
    if (var0 != fogEnabled) {
      if (var0) {
        gl.glEnable(2912);
      } else {
        gl.glDisable(2912);
      }

      fogEnabled = var0;
    }
  }

  static final void method1828() {
    SomethingQuickChat.method551(0, 0, 0);
    setupViewport();
    method1856(0);
    method1847(0);
    setLightingEnabled(false);
    setDepthTestEnabled(false);
    setFogEnabled(false);
    loadIdentityTextureMatrix();
  }

  private static final void method1829() {
    viewportSetup = false;
    gl.glDisable(3553);
    textureId = -1;
    gl.glTexEnvi(8960, 8704, '\u8570');
    gl.glTexEnvi(8960, '\u8571', 8448);
    anInt1793 = 0;
    gl.glTexEnvi(8960, '\u8572', 8448);
    anInt1792 = 0;
    gl.glEnable(2896);
    gl.glEnable(2912);
    gl.glEnable(2929);
    lightingEnabled = true;
    depthTestEnabled = true;
    fogEnabled = true;
    AbstractGameWorld.method1073(97);
    gl.glActiveTexture('\u84c1');
    gl.glTexEnvi(8960, 8704, '\u8570');
    gl.glTexEnvi(8960, '\u8571', 8448);
    gl.glTexEnvi(8960, '\u8572', 8448);
    gl.glActiveTexture('\u84c0');
    gl.setSwapInterval(0);
    gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    gl.glShadeModel(7425);
    gl.glClearDepth(1.0D);
    gl.glDepthFunc(515);
    method1830();
    gl.glMatrixMode(5890);
    gl.glLoadIdentity();
    gl.glPolygonMode(1028, 6914);
    gl.glEnable(2884);
    gl.glCullFace(1029);
    gl.glEnable(3042);
    gl.glBlendFunc(770, 771);
    gl.glEnable(3008);
    gl.glAlphaFunc(516, 0.0F);
    gl.glEnableClientState('\u8074');
    gl.glEnableClientState('\u8075');
    aBoolean1798 = true;
    gl.glEnableClientState('\u8076');
    gl.glEnableClientState('\u8078');
    gl.glMatrixMode(5888);
    gl.glLoadIdentity();
    GlEnvironment.method1511();
    DummyClass46.method1275();
  }

  static final void method1830() {
    gl.glDepthMask(true);
  }

  static final void setDepthTestEnabled(boolean var0) {
    if (var0 != depthTestEnabled) {
      if (var0) {
        gl.glEnable(2929);
      } else {
        gl.glDisable(2929);
      }

      depthTestEnabled = var0;
    }
  }

  static final void method1832(float var0) {
    method1825(3000.0F, var0 * 1.5F);
  }

  static final void method1833() {
    int[] var0 = new int[2];
    gl.glGetIntegerv(3073, var0, 0);
    gl.glGetIntegerv(3074, var0, 1);
    gl.glDrawBuffer(1026);
    gl.glReadBuffer(1024);
    bindTexture(-1);
    gl.glPushAttrib(8192);
    gl.glDisable(2912);
    gl.glDisable(3042);
    gl.glDisable(2929);
    gl.glDisable(3008);
    gl.glRasterPos2i(0, 0);
    gl.glCopyPixels(0, 0, viewWidth, viewHeight, 6144);
    gl.glPopAttrib();
    gl.glDrawBuffer(var0[0]);
    gl.glReadBuffer(var0[1]);
  }

  static final void method1834(Canvas var0) {
    try {
      if (!var0.isDisplayable()) {
        return;
      }

      GLDrawableFactory var1 = GLDrawableFactory.getFactory();
      GLDrawable var2 = var1.getGLDrawable(var0, null, null);
      var2.setRealized(true);
      GLContext var3 = var2.createContext(null);
      var3.makeCurrent();
      var3.release();
      var3.destroy();
      var2.setRealized(false);
    } catch (Throwable var4) {
    }

  }

  static final void resetState() {
    SomethingQuickChat.method551(0, 0, 0);
    setupViewport();
    bindTexture(-1);
    setLightingEnabled(false);
    setDepthTestEnabled(false);
    setFogEnabled(false);
    loadIdentityTextureMatrix();
  }

  private static final void setupViewport() {
    if (!viewportSetup) {
      gl.glMatrixMode(5889);
      gl.glLoadIdentity();
      gl.glOrtho(0.0D, (double) viewWidth, 0.0D, (double) viewHeight, -1.0D, 1.0D);
      gl.glViewport(0, 0, viewWidth, viewHeight);
      gl.glMatrixMode(5888);
      gl.glLoadIdentity();
      viewportSetup = true;
    }
  }

  static final void setLightingEnabled(boolean var0) {
    if (var0 != lightingEnabled) {
      if (var0) {
        gl.glEnable(2896);
      } else {
        gl.glDisable(2896);
      }

      lightingEnabled = var0;
    }
  }

  public static void method1838() {
    aClass94_1819 = null;
    aString1786 = null;
    aString1785 = null;
    gl = null;
    glDrawable = null;
    glContext = null;
    projectionMatrix = null;
  }

  static final float method1839() {
    return aFloat1794;
  }

  private static final int getComptability() {
    int var0 = 0;
    aString1785 = gl.glGetString(7936);
    aString1786 = gl.glGetString(7937);
    String var1 = aString1785.toLowerCase();
    if (var1.indexOf("microsoft") != -1) {
      var0 |= 1;
    }

    if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
      var0 |= 1;
    }

    String var2 = gl.glGetString(7938);
    String[] var3 = var2.split("[. ]");
    if (var3.length >= 2) {
      try {
        int var4 = Integer.parseInt(var3[0]);
        int var5 = Integer.parseInt(var3[1]);
        anInt1812 = var4 * 10 + var5;
      } catch (NumberFormatException var11) {
        var0 |= 4;
      }
    } else {
      var0 |= 4;
    }

    if (anInt1812 < 12) {
      var0 |= 2;
    }

    if (!gl.isExtensionAvailable("GL_ARB_multitexture")) {
      var0 |= 8;
    }

    if (!gl.isExtensionAvailable("GL_ARB_texture_env_combine")) {
      var0 |= 32;
    }

    int[] var12 = new int[1];
    gl.glGetIntegerv('\u84e2', var12, 0);
    maxTextureUnits = var12[0];
    gl.glGetIntegerv('\u8871', var12, 0);
    anInt1814 = var12[0];
    gl.glGetIntegerv('\u8872', var12, 0);
    anInt1806 = var12[0];
    if (maxTextureUnits < 2 || anInt1814 < 2 || anInt1806 < 2) {
      var0 |= 16;
    }

    if (var0 != 0) {
      return var0;
    } else {
      bigEndian = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
      vertexBufferSupport = gl.isExtensionAvailable("GL_ARB_vertex_buffer_object");
      multiSampleSupport = gl.isExtensionAvailable("GL_ARB_multisample");
      cubemapSupport = gl.isExtensionAvailable("GL_ARB_texture_cube_map");
      vertexProgramSupport = gl.isExtensionAvailable("GL_ARB_vertex_program");
      texture3dSupport = gl.isExtensionAvailable("GL_EXT_texture3D");
      GameString var13 = method1820(aString1786).method1534();
      if (var13.indexOf(aClass94_1819) != -1) {
        int var6 = 0;
        GameString[] var7 = var13.method1565(32, 40, 47).split(32);

        for (int var8 = 0; var8 < var7.length; ++var8) {
          GameString var9 = var7[var8];
          if (var9.getLength() >= 4 && var9.substring(4, 0, 0).method1543(106)) {
            var6 = var9.substring(4, 0, 0).toInteger();
            break;
          }
        }

        if (var6 >= 7000 && var6 <= 7999) {
          vertexBufferSupport = false;
        }

        if (var6 >= 7000 && var6 <= 9250) {
          texture3dSupport = false;
        }

        aBoolean1817 = vertexBufferSupport;
      }

      if (vertexBufferSupport) {
        try {
          int[] var14 = new int[1];
          gl.glGenBuffersARB(1, var14, 0);
        } catch (Throwable var10) {
          return -4;
        }
      }

      return 0;
    }
  }

  static final void method1841() {
    gl.glClear(256);
  }

  static final void releaseGlResources() {
    if (gl != null) {
      try {
        DummyClass55.method1609(90);
      } catch (Throwable var4) {
      }

      gl = null;
    }

    if (glContext != null) {
      DummyClass33.method988();

      try {
        if (GLContext.getCurrent() == glContext) {
          glContext.release();
        }
      } catch (Throwable var3) {
      }

      try {
        glContext.destroy();
      } catch (Throwable var2) {
      }

      glContext = null;
    }

    if (glDrawable != null) {
      try {
        glDrawable.setRealized(false);
      } catch (Throwable var1) {
      }

      glDrawable = null;
    }

    DummyClass46.method1273();
    useOpenGlRenderer = false;
  }

  static final void translateTexture(float var0, float var1, float var2) {
    gl.glMatrixMode(5890);
    if (textureMatrixSetup) {
      gl.glLoadIdentity();
    }

    gl.glTranslatef(var0, var1, var2);
    gl.glMatrixMode(5888);
    textureMatrixSetup = true;
  }

  static final void method1844(int x, int y, int width, int height, int offX, int offY,
                               float rotationX, float rotationY, int ratioWidth, int ratioHeight) {
    int left = (x - offX << 8) / ratioWidth;
    int right = (x + width - offX << 8) / ratioWidth;
    int top = (y - offY << 8) / ratioHeight;
    int bottom = (y + height - offY << 8) / ratioHeight;
    gl.glMatrixMode(5889);
    gl.glLoadIdentity();
    setProjectionMatrix((float) left * aFloat1801, (float) right * aFloat1801,
      (float) (-bottom) * aFloat1801, (float) (-top) * aFloat1801, 50.0F, 3584F);
    gl.glViewport(x, viewHeight - y - height, width, height);
    gl.glMatrixMode(5888);
    gl.glLoadIdentity();
    gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    if (rotationX != 0.0F) {
      gl.glRotatef(rotationX, 1.0F, 0.0F, 0.0F);
    }

    if (rotationY != 0.0F) {
      gl.glRotatef(rotationY, 0.0F, 1.0F, 0.0F);
    }

    viewportSetup = false;
    DummyClass17.screenLowerX = left;
    Unsure.screenUpperX = right;
    DummyClass3.screenUpperY = top;
    BlockConfig.screenLowerY = bottom;
  }

  private static final void method1845(boolean var0) {
    if (var0 != aBoolean1798) {
      if (var0) {
        gl.glEnableClientState('\u8075');
      } else {
        gl.glDisableClientState('\u8075');
      }

      aBoolean1798 = var0;
    }
  }

  static final void method1846() {
    if (DisplayMode.useBumpMaps) {
      setLightingEnabled(true);
      method1845(true);
    } else {
      setLightingEnabled(false);
      method1845(false);
    }

  }

  static final void method1847(int var0) {
    if (var0 != anInt1792) {
      if (var0 == 0) {
        gl.glTexEnvi(8960, '\u8572', 8448);
      }

      if (var0 == 1) {
        gl.glTexEnvi(8960, '\u8572', 7681);
      }

      if (var0 == 2) {
        gl.glTexEnvi(8960, '\u8572', 260);
      }

      anInt1792 = var0;
    }
  }

  private static final void setProjectionMatrix(float left, float right, float bot, float top,
                                                float near, float far) {
    float n2 = near * 2.0F;
    projectionMatrix[0] = n2 / (right - left);
    projectionMatrix[1] = 0.0F;
    projectionMatrix[2] = 0.0F;
    projectionMatrix[3] = 0.0F;
    projectionMatrix[4] = 0.0F;
    projectionMatrix[5] = n2 / (top - bot);
    projectionMatrix[6] = 0.0F;
    projectionMatrix[7] = 0.0F;
    projectionMatrix[8] = (right + left) / (right - left);
    projectionMatrix[9] = (top + bot) / (top - bot);
    projectionMatrix[10] = aFloat1787 = -(far + near) / (far - near);
    projectionMatrix[11] = -1.0F;
    projectionMatrix[12] = 0.0F;
    projectionMatrix[13] = 0.0F;
    projectionMatrix[14] = aFloat1795 = -(n2 * far) / (far - near);
    projectionMatrix[15] = 0.0F;
    gl.glLoadMatrixf(projectionMatrix, 0);
    aFloat1797 = 0.0F;
    aFloat1794 = 0.0F;
  }

  static final void clearBuffers(int clearColor) {
    gl.glClearColor((float) (clearColor >> 16 & 255) / 255.0F,
      (float) (clearColor >> 8 & 255) / 255.0F, (float) (clearColor & 255) / 255.0F, 0.0F);
    gl.glClear(16640);
    gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
  }

  static final void bindTexture(int var0) {
    if (var0 != textureId) {
      if (var0 != -1) {
        if (textureId == -1) {
          gl.glEnable(3553);
        }

        gl.glBindTexture(3553, var0);
      } else {
        gl.glDisable(3553);
      }

      textureId = var0;
    }
  }

  static final void method1851() {
    gl.glDepthMask(false);
  }

  static final float method1852() {
    return aFloat1797;
  }

  static final int bindCanvas(Canvas var0, int var1) {
    try {
      if (!var0.isDisplayable()) {
        return -1;
      } else {
        GLCapabilities var2 = new GLCapabilities();
        if (var1 > 0) {
          var2.setSampleBuffers(true);
          var2.setNumSamples(var1);
        }

        GLDrawableFactory var3 = GLDrawableFactory.getFactory();
        glDrawable = var3.getGLDrawable(var0, var2, null);
        glDrawable.setRealized(true);
        int var4 = 0;

        int var5;
        while (true) {
          glContext = glDrawable.createContext(null);

          try {
            var5 = glContext.makeCurrent();
            if (var5 != 0) {
              break;
            }
          } catch (Exception var8) {
          }

          if (var4++ > 5) {
            return -2;
          }

          TextureSampler25.sleep(1000L);
        }

        gl = glContext.getGL();
        new GLU();
        useOpenGlRenderer = true;
        viewWidth = var0.getSize().width;
        viewHeight = var0.getSize().height;
        var5 = getComptability();
        if (var5 != 0) {
          releaseGlResources();
          return var5;
        } else {
          method1857();
          method1829();
          gl.glClear(16384);
          var4 = 0;

          while (true) {
            try {
              glDrawable.swapBuffers();
              break;
            } catch (Exception var7) {
              if (var4++ > 5) {
                releaseGlResources();
                return -3;
              }

              TextureSampler25.sleep(100L);
            }
          }

          gl.glClear(16384);
          return 0;
        }
      }
    } catch (Throwable var9) {
      releaseGlResources();
      return -5;
    }
  }

  static final void setViewportDimensions(int var0, int var1) {
    viewWidth = var0;
    viewHeight = var1;
    viewportSetup = false;
  }

  static final void ortho(int var0, int var1, int var2, int far, int var4, int var5) {
    int var6 = -var0;
    int var7 = viewWidth - var0;
    int var8 = -var1;
    int var9 = viewHeight - var1;
    gl.glMatrixMode(5889);
    gl.glLoadIdentity();
    float var10 = (float) var2 / 512.0F;
    float var11 = var10 * (256.0F / (float) var4);
    float var12 = var10 * (256.0F / (float) var5);
    gl.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11),
      (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - far),
      (double) (3584 - far));
    gl.glViewport(0, 0, viewWidth, viewHeight);
    gl.glMatrixMode(5888);
    gl.glLoadIdentity();
    gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    viewportSetup = false;
  }

  static final void method1856(int var0) {
    // Combine RGB modulate
    if (var0 != anInt1793) {
      if (var0 == 0) {
        gl.glTexEnvi(8960, '\u8571', 8448);
      }

      if (var0 == 1) {
        gl.glTexEnvi(8960, '\u8571', 7681);
      }

      if (var0 == 2) {
        gl.glTexEnvi(8960, '\u8571', 260);
      }

      if (var0 == 3) {
        gl.glTexEnvi(8960, '\u8571', '\u84e7');
      }

      if (var0 == 4) {
        gl.glTexEnvi(8960, '\u8571', '\u8574');
      }

      if (var0 == 5) {
        gl.glTexEnvi(8960, '\u8571', '\u8575');
      }

      anInt1793 = var0;
    }
  }

  private static final void method1857() {
    int[] var0 = new int[1];
    gl.glGenTextures(1, var0, 0);
    anInt1810 = var0[0];
    gl.glBindTexture(3553, anInt1810);
    gl.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] {-1}));
    DummyClass46.setupSceneGl();
    AudioStreamEncoder3.method468(6);
  }

}
