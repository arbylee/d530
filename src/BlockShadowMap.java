import javax.media.opengl.GL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class BlockShadowMap {

  private static byte[] aByteArray2111 = new byte[16384];
  boolean needsUpdate = true;
  private GlBufferObject elementBufferObject;
  private ByteBuffer elementBuffer;
  private int textureId;
  private ByteBuffer vertexBuffer;
  private GlBufferObject vertexBufferObject;
  private int anInt2112 = -1;


  public BlockShadowMap() {
    GL var1 = GlRenderer.gl;
    int[] var2 = new int[1];
    var1.glGenTextures(1, var2, 0);
    this.textureId = var2[0];
    DummyClass33.textureMemory += 16384;
    GlRenderer.bindTexture(this.textureId);
    var1.glTexParameteri(3553, 10241, 9729);
    var1.glTexParameteri(3553, 10240, 9729);
    var1.glTexParameteri(3553, 10242, '\u812f');
    var1.glTexParameteri(3553, 10243, '\u812f');
  }

  final void update(int[][] heights, int x, int y) {
    Buffer vertexBuffers = new Buffer(1620);

    int offsetX;
    for (int offsetY = 0; offsetY <= 8; ++offsetY) {
      for (offsetX = 0; offsetX <= 8; ++offsetX) {
        if (GlRenderer.bigEndian) {
          vertexBuffers.writeFloat((float) offsetX / 8.0F);
          vertexBuffers.writeFloat((float) offsetY / 8.0F);
          vertexBuffers.writeFloat((float) (offsetX * 128));
          vertexBuffers.writeFloat((float) heights[offsetX + x][offsetY + y]);
          vertexBuffers.writeFloat((float) (offsetY * 128));
        } else {
          vertexBuffers.writeFloatLE((float) offsetX / 8.0F);
          vertexBuffers.writeFloatLE((float) offsetY / 8.0F);
          vertexBuffers.writeFloatLE((float) (offsetX * 128));
          vertexBuffers.writeFloatLE((float) heights[offsetX + x][offsetY + y]);
          vertexBuffers.writeFloatLE((float) (offsetY * 128));
        }
      }
    }

    if (GlRenderer.vertexBufferSupport) {
      ByteBuffer buffer = ByteBuffer.wrap(vertexBuffers.bytes, 0, vertexBuffers.position);
      this.vertexBufferObject = new GlBufferObject();
      this.vertexBufferObject.setVertexBufferData(buffer);
    } else {
      this.vertexBuffer =
        ByteBuffer.allocateDirect(vertexBuffers.position).order(ByteOrder.nativeOrder());
      this.vertexBuffer.put(vertexBuffers.bytes, 0, vertexBuffers.position);
      this.vertexBuffer.flip();
    }

    Buffer var8 = new Buffer(1536);

    for (offsetX = 0; offsetX < 8; ++offsetX) {
      for (int var7 = 0; var7 < 8; ++var7) {
        if (GlRenderer.bigEndian) {
          var8.writeInt(var7 + (offsetX + 1) * 9);
          var8.writeInt(var7 + offsetX * 9);
          var8.writeInt(var7 + 1 + offsetX * 9);
          var8.writeInt(var7 + (offsetX + 1) * 9);
          var8.writeInt(var7 + 1 + offsetX * 9);
          var8.writeInt(var7 + 1 + (offsetX + 1) * 9);
        } else {
          var8.writeIntLE(var7 + (offsetX + 1) * 9, 109);
          var8.writeIntLE(var7 + offsetX * 9, 122);
          var8.writeIntLE(var7 + 1 + offsetX * 9, 67);
          var8.writeIntLE(var7 + (offsetX + 1) * 9, 116);
          var8.writeIntLE(var7 + 1 + offsetX * 9, 90);
          var8.writeIntLE(var7 + 1 + (offsetX + 1) * 9, 93);
        }
      }
    }

    if (GlRenderer.vertexBufferSupport) {
      ByteBuffer var10 = ByteBuffer.wrap(var8.bytes, 0, var8.position);
      this.elementBufferObject = new GlBufferObject();
      this.elementBufferObject.setElementBufferData(var10);
    } else {
      this.elementBuffer = ByteBuffer.allocateDirect(var8.position).order(ByteOrder.nativeOrder());
      this.elementBuffer.put(var8.bytes, 0, var8.position);
      this.elementBuffer.flip();
    }

  }

  final boolean update(SoftwareIndexedColorSprite var1, int var2, int var3) {
    byte[] var4 = var1.aByteArray2674;
    int var5 = var1.width;
    int var6 = var2 * 128 + 1 + (var3 * 128 + 1) * var5;
    int var7 = 0;

    int var8;
    int var9;
    for (var8 = -128; var8 < 0; ++var8) {
      var7 = (var7 << 8) - var7;

      for (var9 = -128; var9 < 0; ++var9) {
        if (var4[var6++] != 0) {
          ++var7;
        }
      }

      var6 += var5 - 128;
    }

    if (var7 == this.anInt2112) {
      return false;
    } else {
      this.anInt2112 = var7;
      var6 = var2 * 128 + 1 + (var3 * 128 + 1) * var5;
      var8 = 0;

      for (var9 = -128; var9 < 0; ++var9) {
        for (int var10 = -128; var10 < 0; ++var10) {
          if (var4[var6] != 0) {
            aByteArray2111[var8++] = 68;
          } else {
            int var11 = 0;
            if (var4[var6 - 1] != 0) {
              ++var11;
            }

            if (var4[var6 + 1] != 0) {
              ++var11;
            }

            if (var4[var6 - var5] != 0) {
              ++var11;
            }

            if (var4[var6 + var5] != 0) {
              ++var11;
            }

            aByteArray2111[var8++] = (byte) (17 * var11);
          }

          ++var6;
        }

        var6 += var5 - 128;
      }

      GL var12 = GlRenderer.gl;
      ByteBuffer var13 = ByteBuffer.wrap(aByteArray2111);
      var13.limit(16384);
      GlRenderer.bindTexture(this.textureId);
      var12.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var13);
      return true;
    }
  }

  final void draw() {
    GL var1 = GlRenderer.gl;
    GlRenderer.bindTexture(this.textureId);
    if (this.vertexBufferObject != null) {
      this.vertexBufferObject.bindVertexBuffer();
      var1.glInterleavedArrays(10791, 20, 0L);
      GlRenderer.aBoolean1798 = false;
    } else {
      if (GlRenderer.vertexBufferSupport) {
        var1.glBindBufferARB('\u8892', 0);
      }

      var1.glInterleavedArrays(10791, 20, this.vertexBuffer);
      GlRenderer.aBoolean1798 = false;
    }

    if (this.elementBufferObject != null) {
      this.elementBufferObject.bindElementBuffer();
      var1.glDrawElements(4, 384, 5125, 0L);
    } else {
      if (GlRenderer.vertexBufferSupport) {
        var1.glBindBufferARB('\u8893', 0);
      }

      var1.glDrawElements(4, 384, 5125, this.elementBuffer);
    }
  }

  public static void clear() {
    aByteArray2111 = null;
  }
}
