import java.awt.Image;

final class MilliFrameRegulator extends AbstractFrameRegulator {

  static int anInt2684;
  static Cache aClass47_2686 = new Cache(128);
  static GameString aClass94_2687 = SpawnedGameObject.createString("Fallen lassen");
  static int anInt2689;
  static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array2690;
  static int anInt2693 = 0;
  static Image anImage2695;
  static int[] anIntArray2696 = new int[2];
  static int cameraPosX;
  private long aLong2683;
  private int anInt2685;
  private int anInt2688;
  private int anInt2691;
  private int anInt2692;
  private long[] aLongArray2694 = new long[10];


  MilliFrameRegulator() {
    try {
      this.anInt2688 = 256;
      this.anInt2691 = 1;
      this.anInt2692 = 0;
      this.aLong2683 = Time.getCurrentTimeMillis();

      for (int var1 = 0; var1 < 10; ++var1) {
        this.aLongArray2694[var1] = this.aLong2683;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "lj.<init>()");
    }
  }

  public static void method1771(int var0) {
    try {
      aClass94_2687 = null;
      anIntArray2696 = null;
      anImage2695 = null;
      if (var0 != 14635) {
        aClass47_2686 = null;
      }

      aClass3_Sub28_Sub16Array2690 = null;
      aClass47_2686 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "lj.G(" + var0 + ')');
    }
  }

  final void reset(int var1) {
    try {
      int var2;
      for (var2 = 0; ~var2 > -11; ++var2) {
        this.aLongArray2694[var2] = 0L;
      }

      var2 = -114 % ((var1 - -82) / 42);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "lj.A(" + var1 + ')');
    }
  }

  final int sleep(int var1, int var2, int var3) {
    try {
      if (var1 != -1) {
        this.sleep(-14, 83, 10);
      }

      int var5 = this.anInt2691;
      int var4 = this.anInt2688;
      this.anInt2688 = 300;
      this.anInt2691 = 1;
      this.aLong2683 = Time.getCurrentTimeMillis();
      if (this.aLongArray2694[this.anInt2685] == 0L) {
        this.anInt2688 = var4;
        this.anInt2691 = var5;
      } else if (this.aLongArray2694[this.anInt2685] < this.aLong2683) {
        this.anInt2688 =
          (int) ((long) (var3 * 2560) / (this.aLong2683 + -this.aLongArray2694[this.anInt2685]));
      }

      if (this.anInt2688 < 25) {
        this.anInt2688 = 25;
      }

      if (256 < this.anInt2688) {
        this.anInt2688 = 256;
        this.anInt2691 =
          (int) (-((this.aLong2683 - this.aLongArray2694[this.anInt2685]) / 10L) + (long) var3);
      }

      if (~var3 > ~this.anInt2691) {
        this.anInt2691 = var3;
      }

      this.aLongArray2694[this.anInt2685] = this.aLong2683;
      this.anInt2685 = (1 + this.anInt2685) % 10;
      int var6;
      if (~this.anInt2691 < -2) {
        for (var6 = 0; -11 < ~var6; ++var6) {
          if (this.aLongArray2694[var6] != 0L) {
            this.aLongArray2694[var6] += (long) this.anInt2691;
          }
        }
      }

      if (var2 > this.anInt2691) {
        this.anInt2691 = var2;
      }

      TextureSampler25.sleep((long) this.anInt2691);

      for (var6 = 0; 256 > this.anInt2692; ++var6) {
        this.anInt2692 += this.anInt2688;
      }

      this.anInt2692 &= 255;
      return var6;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld
        .cascadeException(var7, "lj.B(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

}
