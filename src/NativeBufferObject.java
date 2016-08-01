import java.nio.ByteBuffer;

final class NativeBufferObject extends BufferObject {

  private ByteBuffer buffer;

  final byte[] get(int var1) {
    byte[] var2 = new byte[this.buffer.capacity()];
    this.buffer.position(0);
    if (var1 != 26) {
      return null;
    } else {
      this.buffer.get(var2);
      return var2;
    }
  }

  final void put(int var1, byte[] var2) {
    this.buffer = ByteBuffer.allocateDirect(var2.length);
    this.buffer.position(0);
    if (var1 != 400) {
      this.put(44, null);
    }

    this.buffer.put(var2);
  }

}
