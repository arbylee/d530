import javax.media.opengl.GL;
import java.nio.ByteBuffer;

final class GlDirectFullColorSprite extends GlDirectColorSprite {

  GlDirectFullColorSprite(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
    super(var1, var2, var3, var4, var5, var6, var7);
  }

  GlDirectFullColorSprite(SoftwareDirectColorSprite var1) {
    super(var1);
  }

  final void initialize(int[] var1) {
    this.anInt4075 = DummyClass53.nearestPo2((byte) 111, this.anInt3707);
    this.anInt4079 = DummyClass53.nearestPo2((byte) 76, this.anInt3696);
    byte[] var2 = new byte[this.anInt4075 * this.anInt4079 * 4];
    int var3 = 0;
    int var4 = 0;
    int var5 = (this.anInt4075 - this.anInt3707) * 4;

    for (int var6 = 0; var6 < this.anInt3696; ++var6) {
      for (int var7 = 0; var7 < this.anInt3707; ++var7) {
        int var8 = var1[var4++];
        if (var8 != 0) {
          var2[var3++] = (byte) (var8 >> 16);
          var2[var3++] = (byte) (var8 >> 8);
          var2[var3++] = (byte) var8;
          var2[var3++] = (byte) (var8 >> 24);
        } else {
          var3 += 4;
        }
      }

      var3 += var5;
    }

    ByteBuffer var9 = ByteBuffer.wrap(var2);
    GL var10 = GlRenderer.gl;
    if (this.textureId == -1) {
      int[] var11 = new int[1];
      var10.glGenTextures(1, var11, 0);
      this.textureId = var11[0];
    }

    GlRenderer.bindTexture(this.textureId);
    var10.glTexImage2D(3553, 0, 6408, this.anInt4075, this.anInt4079, 0, 6408, 5121, var9);
    DummyClass33.texture2dMemory += var9.limit() - this.anInt4074;
    this.anInt4074 = var9.limit();
  }
}
