abstract class AudioStreamEncoder extends Node {

  int anInt2543;
  AbstractSomethingMusic aClass3_Sub12_2544;
  volatile boolean aBoolean2545 = true;
  AudioStreamEncoder aClass3_Sub24_2546;


  abstract int method409();

  final void method410(int[] var1, int var2, int var3) {
    if (this.aBoolean2545) {
      this.method413(var1, var2, var3);
    } else {
      this.method415(var3);
    }

  }

  abstract AudioStreamEncoder method411();

  int method412() {
    return 255;
  }

  abstract void method413(int[] var1, int var2, int var3);

  abstract AudioStreamEncoder method414();

  abstract void method415(int var1);
}
