final class Something3dTexture1 extends Something3d2 {

  private byte[] bytes;

  public Something3dTexture1() {
    super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
  }

  final byte[] method2250(int var1, int var2, int var3) {
    this.bytes = new byte[var1 * var2 * var3 * 2];
    this.method2230(-98, var1, var3, var2);
    return this.bytes;
  }

  final void method2244(int var1, byte var2) {
    int off = var1 * 2;
    int value = var2 & 255;
    this.bytes[off++] = (byte) (3 * value >> 5);
    this.bytes[off] = (byte) (value >> 2);
  }
}
