import javax.media.opengl.GL;
import java.nio.ByteBuffer;

final class GlIndexedColorSprite extends AbstractIndexedColorSprite {

  private int textureId = -1;
  private int listId = -1;
  private int anInt2677 = 0;
  private int anInt2678 = 0;
  private int anInt2679;
  private int textureHeight;
  private int textureWidth;

  GlIndexedColorSprite(int var1, int var2, int var3, int var4, int width, int height, byte[] index,
                       int[] palette) {
    this.anInt1469 = var1;
    this.anInt1467 = var2;
    this.offsetX = var3;
    this.offsetY = var4;
    this.width = width;
    this.height = height;
    this.initialize(index, palette);
    this.initializeList();
  }

  private final void initialize(byte[] index, int[] palette) {
    this.textureWidth = DummyClass53.nearestPo2((byte) 62, this.width);
    this.textureHeight = DummyClass53.nearestPo2((byte) 99, this.height);
    byte[] dest = new byte[this.textureWidth * this.textureHeight * 4];
    int destOff = 0;
    int indexOff = 0;

    for (int var6 = 0; var6 < this.height; ++var6) {
      for (int var7 = 0; var7 < this.width; ++var7) {
        byte i = index[indexOff++];
        if (i != 0) {
          int color = palette[i];
          dest[destOff++] = (byte) (color >> 16);
          dest[destOff++] = (byte) (color >> 8);
          dest[destOff++] = (byte) color;
          dest[destOff++] = -1;
        } else {
          destOff += 4;
        }
      }

      destOff += (this.textureWidth - this.width) * 4;
    }

    ByteBuffer buffer = ByteBuffer.wrap(dest);
    GL var11 = GlRenderer.gl;
    if (this.textureId == -1) {
      int[] var12 = new int[1];
      var11.glGenTextures(1, var12, 0);
      this.textureId = var12[0];
      this.anInt2679 = DummyClass33.anInt582;
    }

    GlRenderer.bindTexture(this.textureId);
    var11.glTexImage2D(3553, 0, 6408, this.textureWidth, this.textureHeight, 0, 6408, 5121, buffer);
    DummyClass33.texture2dMemory += buffer.limit() - this.anInt2678;
    this.anInt2678 = buffer.limit();
  }

  final void draw(int x, int y, int alpha) {
    GlRenderer.method1828();
    x += this.offsetX;
    y += this.offsetY;
    GL var4 = GlRenderer.gl;
    GlRenderer.bindTexture(this.textureId);
    this.initializeParameters(1);
    var4.glColor4f(1.0F, 1.0F, 1.0F, (float) alpha / 256.0F);
    var4.glTranslatef((float) x, (float) (GlRenderer.viewHeight - y), 0.0F);
    var4.glCallList(this.listId);
    var4.glLoadIdentity();
  }

  private final void initializeParameters(int var1) {
    if (this.anInt2677 != var1) {
      this.anInt2677 = var1;
      GL var2 = GlRenderer.gl;
      if (var1 == 2) {
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
      } else {
        var2.glTexParameteri(3553, 10241, 9728);
        var2.glTexParameteri(3553, 10240, 9728);
      }

    }
  }

  final void draw(int x, int y) {
    GlRenderer.method1822();
    x += this.offsetX;
    y += this.offsetY;
    GL var3 = GlRenderer.gl;
    GlRenderer.bindTexture(this.textureId);
    this.initializeParameters(1);
    var3.glTranslatef((float) x, (float) (GlRenderer.viewHeight - y), 0.0F);
    var3.glCallList(this.listId);
    var3.glLoadIdentity();
  }

  protected final void finalize() throws Throwable {
    if (this.textureId != -1) {
      DummyClass33.method991(this.textureId, this.anInt2678, this.anInt2679);
      this.textureId = -1;
      this.anInt2678 = 0;
    }

    if (this.listId != -1) {
      DummyClass33.method986(this.listId, this.anInt2679);
      this.listId = -1;
    }

    super.finalize();
  }

  private final void initializeList() {
    float u = (float) this.width / (float) this.textureWidth;
    float v = (float) this.height / (float) this.textureHeight;
    GL var3 = GlRenderer.gl;
    if (this.listId == -1) {
      this.listId = var3.glGenLists(1);
      this.anInt2679 = DummyClass33.anInt582;
    }

    var3.glNewList(this.listId, 4864);
    var3.glBegin(6);
    var3.glTexCoord2f(u, 0.0F);
    var3.glVertex2f((float) this.width, 0.0F);
    var3.glTexCoord2f(0.0F, 0.0F);
    var3.glVertex2f(0.0F, 0.0F);
    var3.glTexCoord2f(0.0F, v);
    var3.glVertex2f(0.0F, (float) (-this.height));
    var3.glTexCoord2f(u, v);
    var3.glVertex2f((float) this.width, (float) (-this.height));
    var3.glEnd();
    var3.glEndList();
  }
}
