import javax.media.opengl.GL;
import java.nio.ByteBuffer;

final class SkyboxMaterialShader implements MaterialShader {

  private int listId = -1;
  private boolean insufficientTextureUnits = false;
  private int[] textureIds = null;


  public SkyboxMaterialShader() {
    if (GlRenderer.cubemapSupport && GlRenderer.maxTextureUnits >= 2) {
      this.initializeTextures();
      GL var1 = GlRenderer.gl;
      var1.glBindTexture('\u8513', this.textureIds[0]);
      var1.glTexParameteri('\u8513', 10241, 9729);
      var1.glTexParameteri('\u8513', 10240, 9729);
      var1.glTexParameteri('\u8513', '\u8072', '\u812f');
      var1.glTexParameteri('\u8513', 10242, '\u812f');
      var1.glTexParameteri('\u8513', 10243, '\u812f');
      var1.glBindTexture('\u8513', this.textureIds[1]);
      var1.glTexParameteri('\u8513', 10241, 9729);
      var1.glTexParameteri('\u8513', 10240, 9729);
      var1.glTexParameteri('\u8513', '\u8072', '\u812f');
      var1.glTexParameteri('\u8513', 10242, '\u812f');
      var1.glTexParameteri('\u8513', 10243, '\u812f');
      var1.glBindTexture('\u8513', this.textureIds[2]);
      var1.glTexParameteri('\u8513', 10241, 9729);
      var1.glTexParameteri('\u8513', 10240, 9729);
      var1.glTexParameteri('\u8513', '\u8072', '\u812f');
      var1.glTexParameteri('\u8513', 10242, '\u812f');
      var1.glTexParameteri('\u8513', 10243, '\u812f');
      this.insufficientTextureUnits = GlRenderer.maxTextureUnits < 3;
    }

    this.initializeCallLists();
  }

  private final void initializeCallLists() {
    GL var1 = GlRenderer.gl;
    this.listId = var1.glGenLists(2);
    var1.glNewList(this.listId, 4864);
    if (this.textureIds != null) {
      var1.glActiveTexture('\u84c1');
      var1.glTexGeni(8192, 9472, '\u8511');
      var1.glTexGeni(8193, 9472, '\u8511');
      var1.glTexGeni(8194, 9472, '\u8511');
      var1.glEnable(3168);
      var1.glEnable(3169);
      var1.glEnable(3170);
      var1.glEnable('\u8513');
      var1.glMatrixMode(5890);
      var1.glLoadIdentity();
      var1.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
      var1.glMatrixMode(5888);
      if (!this.insufficientTextureUnits) {
        var1.glTexEnvi(8960, '\u8571', 7681);
        var1.glTexEnvi(8960, '\u8580', '\u8578');
        var1.glTexEnvi(8960, '\u8572', 8448);
        var1.glActiveTexture('\u84c2');
        var1.glTexEnvi(8960, 8704, '\u8570');
        var1.glTexEnvi(8960, '\u8571', 260);
        var1.glTexEnvi(8960, '\u8580', '\u8578');
        var1.glTexEnvi(8960, '\u8581', '\u8578');
        var1.glTexEnvi(8960, '\u8591', 770);
        var1.glTexEnvi(8960, '\u8572', 7681);
        var1.glTexEnvi(8960, '\u8588', '\u8577');
        var1.glBindTexture(3553, GlRenderer.anInt1810);
        var1.glEnable(3553);
      } else {
        var1.glTexEnvi(8960, '\u8571', 260);
        var1.glTexEnvi(8960, '\u8590', 770);
        var1.glTexEnvi(8960, '\u8572', 7681);
        var1.glTexEnvi(8960, '\u8588', '\u8577');
      }

      var1.glActiveTexture('\u84c0');
    } else {
      var1.glTexEnvi(8960, '\u8588', '\u8577');
    }

    var1.glEndList();
    var1.glNewList(this.listId + 1, 4864);
    if (this.textureIds != null) {
      var1.glActiveTexture('\u84c1');
      var1.glDisable(3168);
      var1.glDisable(3169);
      var1.glDisable(3170);
      var1.glDisable('\u8513');
      var1.glMatrixMode(5890);
      var1.glLoadIdentity();
      var1.glMatrixMode(5888);
      if (!this.insufficientTextureUnits) {
        var1.glTexEnvi(8960, '\u8571', 8448);
        var1.glTexEnvi(8960, '\u8580', 5890);
        var1.glActiveTexture('\u84c2');
        var1.glTexEnvi(8960, 8704, 8448);
        var1.glTexEnvi(8960, '\u8571', 8448);
        var1.glTexEnvi(8960, '\u8580', 5890);
        var1.glTexEnvi(8960, '\u8591', 768);
        var1.glTexEnvi(8960, '\u8572', 8448);
        var1.glTexEnvi(8960, '\u8588', 5890);
        var1.glDisable(3553);
      } else {
        var1.glTexEnvi(8960, '\u8571', 8448);
        var1.glTexEnvi(8960, '\u8590', 768);
        var1.glTexEnvi(8960, '\u8572', 8448);
        var1.glTexEnvi(8960, '\u8588', 5890);
      }

      var1.glActiveTexture('\u84c0');
    } else {
      var1.glTexEnvi(8960, '\u8588', 5890);
    }

    var1.glEndList();
  }

  public final void disable() {
    GL var1 = GlRenderer.gl;
    if (DisplayMode.useBumpMaps) {
      var1.glCallList(this.listId + 1);
    } else {
      var1.glTexEnvi(8960, '\u8588', 5890);
    }

  }

  public final int method24() {
    return 4;
  }

  public final void enable() {
    GL var1 = GlRenderer.gl;
    GlRenderer.method1847(1);
    if (DisplayMode.useBumpMaps) {
      var1.glCallList(this.listId);
    } else {
      var1.glTexEnvi(8960, '\u8588', '\u8577');
    }

  }

  public final void set(int tex) {
    GL var2 = GlRenderer.gl;
    if (DisplayMode.useBumpMaps && this.textureIds != null) {
      var2.glActiveTexture('\u84c1');
      var2.glBindTexture('\u8513', this.textureIds[tex - 1]);
      var2.glActiveTexture('\u84c0');
    }

  }

  private final void initializeTextures() {
    GL var8 = GlRenderer.gl;
    if (this.textureIds == null) {
      this.textureIds = new int[3];
      var8.glGenTextures(3, this.textureIds, 0);
    }

    short var9 = 4096;
    byte[] var10 = new byte[var9];
    byte[] var11 = new byte[var9];
    byte[] var12 = new byte[var9];

    for (int side = 0; side < 6; ++side) {
      int var14 = 0;

      for (int y = 0; y < 64; y++) {
        for (int x = 0; x < 64; x++) {
          float var5 = 2.0F * (float) x / 64.0F - 1.0F;
          float var6 = 2.0F * (float) y / 64.0F - 1.0F;
          float var7 = (float) (1.0D / Math.sqrt((double) (var5 * var5 + 1.0F + var6 * var6)));
          var5 *= var7;
          var6 *= var7;
          float var4;
          if (side == 0) {
            var4 = -var5;
          } else if (side == 1) {
            var4 = var5;
          } else if (side == 2) {
            var4 = var6;
          } else if (side == 3) {
            var4 = -var6;
          } else if (side == 4) {
            var4 = var7;
          } else {
            var4 = -var7;
          }

          int var1;
          int var2;
          int var3;
          if (var4 > 0.0F) {
            var1 = (int) (Math.pow((double) var4, 96.0D) * 255.0D);
            var2 = (int) (Math.pow((double) var4, 36.0D) * 255.0D);
            var3 = (int) (Math.pow((double) var4, 12.0D) * 255.0D);
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
          }

          if (GlRenderer.maxTextureUnits < 3) {
            var1 /= 5;
            var2 /= 5;
            var3 /= 5;
          } else {
            var1 /= 2;
            var2 /= 2;
            var3 /= 2;
          }

          var11[var14] = (byte) var1;
          var12[var14] = (byte) var2;
          var10[var14] = (byte) var3;
          ++var14;
        }
      }

      // GL_TEXTURE_CUBE_MAP
      var8.glBindTexture('\u8513', this.textureIds[0]);
      var8.glTexImage2D('\u8515' + side, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var11));
      var8.glBindTexture('\u8513', this.textureIds[1]);
      var8.glTexImage2D('\u8515' + side, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var12));
      var8.glBindTexture('\u8513', this.textureIds[2]);
      var8.glTexImage2D('\u8515' + side, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var10));
      DummyClass33.textureMemory += var9 * 3;
    }

  }
}
