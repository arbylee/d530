import java.awt.Component;

final class SignLinkAudioOutputStream extends AbstractAudioOutputStream {

  private static UnusedInterface0 anInterface1_2970;
  private int anInt2969;


  SignLinkAudioOutputStream(SignLink var1, int var2) {
    anInterface1_2970 = var1.method1446((byte) 99);
    this.anInt2969 = var2;
  }

  public static void method2166() {
    anInterface1_2970 = null;
  }

  final int getAmountBufferedSamples() {
    return anInterface1_2970.method2((byte) 118, this.anInt2969);
  }

  final void write() {
    anInterface1_2970.method6(this.anInt2969, this.samples);
  }

  final void bind(Component var1) throws Exception {
    anInterface1_2970.method5(DummyClass60.sampleRate, (byte) -39, var1, GameString.stereo);
  }

  final void flush() {
    anInterface1_2970.method1(this.anInt2969, 28544);
  }

  final void setBufferSize(int var1) throws Exception {
    if (var1 > '\u8000') {
      throw new IllegalArgumentException();
    } else {
      anInterface1_2970.method3(this.anInt2969, 25349, var1);
    }
  }

  final void close() {
    anInterface1_2970.method4((byte) 20, this.anInt2969);
  }
}
