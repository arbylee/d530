final class Something2SounfEffect {

  int anInt601;
  int anInt603;
  int anInt605;
  private int anInt600 = 2;
  private int[] anIntArray602 = new int[2];
  private int[] anIntArray604 = new int[2];
  private int anInt606;
  private int anInt607;
  private int anInt608;
  private int anInt609;
  private int anInt610;


  public Something2SounfEffect() {
    this.anIntArray604[0] = 0;
    this.anIntArray604[1] = '\uffff';
    this.anIntArray602[0] = 0;
    this.anIntArray602[1] = '\uffff';
  }

  final int method1007(int var1) {
    if (this.anInt610 >= this.anInt609) {
      this.anInt607 = this.anIntArray602[this.anInt606++] << 15;
      if (this.anInt606 >= this.anInt600) {
        this.anInt606 = this.anInt600 - 1;
      }

      this.anInt609 = (int) ((double) this.anIntArray604[this.anInt606] / 65536.0D * (double) var1);
      if (this.anInt609 > this.anInt610) {
        this.anInt608 = ((this.anIntArray602[this.anInt606] << 15) - this.anInt607) / (this.anInt609
          - this.anInt610);
      }
    }

    this.anInt607 += this.anInt608;
    ++this.anInt610;
    return this.anInt607 - this.anInt608 >> 15;
  }

  final void method1008() {
    this.anInt609 = 0;
    this.anInt606 = 0;
    this.anInt608 = 0;
    this.anInt607 = 0;
    this.anInt610 = 0;
  }

  final void method1009(Buffer var1) {
    this.anInt600 = var1.readUnsignedByte();
    this.anIntArray604 = new int[this.anInt600];
    this.anIntArray602 = new int[this.anInt600];

    for (int var2 = 0; var2 < this.anInt600; ++var2) {
      this.anIntArray604[var2] = var1.readUnsignedShort();
      this.anIntArray602[var2] = var1.readUnsignedShort();
    }

  }

  final void method1010(Buffer var1) {
    this.anInt601 = var1.readUnsignedByte();
    this.anInt603 = var1.readInt();
    this.anInt605 = var1.readInt();
    this.method1009(var1);
  }
}
