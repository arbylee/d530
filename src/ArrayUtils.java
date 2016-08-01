final class ArrayUtils {

  static final void method1356(long[] var0, int var1, long[] var2, int var3, int var4) {
    if (var0 == var2) {
      if (var1 == var3) {
        return;
      }

      if (var3 > var1 && var3 < var1 + var4) {
        --var4;
        var1 += var4;
        var3 += var4;
        var4 = var1 - var4;

        for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
        }

        for (var4 -= 3; var1 >= var4; var2[var3--] = var0[var1--]) {
        }

        return;
      }
    }

    var4 += var1;

    for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
    }

    for (var4 += 3; var1 < var4; var2[var3++] = var0[var1++]) {
    }

  }

  static final void copy(byte[] src, int srcOff, byte[] dest, int destOff, int len) {
    if (src == dest) {
      if (srcOff == destOff) {
        return;
      }

      if (destOff > srcOff && destOff < srcOff + len) {
        --len;
        srcOff += len;
        destOff += len;
        len = srcOff - len;

        for (len += 7; srcOff >= len; dest[destOff--] = src[srcOff--]) {
          dest[destOff--] = src[srcOff--];
          dest[destOff--] = src[srcOff--];
          dest[destOff--] = src[srcOff--];
          dest[destOff--] = src[srcOff--];
          dest[destOff--] = src[srcOff--];
          dest[destOff--] = src[srcOff--];
          dest[destOff--] = src[srcOff--];
        }

        for (len -= 7; srcOff >= len; dest[destOff--] = src[srcOff--]) {
        }

        return;
      }
    }

    len += srcOff;

    for (len -= 7; srcOff < len; dest[destOff++] = src[srcOff++]) {
      dest[destOff++] = src[srcOff++];
      dest[destOff++] = src[srcOff++];
      dest[destOff++] = src[srcOff++];
      dest[destOff++] = src[srcOff++];
      dest[destOff++] = src[srcOff++];
      dest[destOff++] = src[srcOff++];
      dest[destOff++] = src[srcOff++];
    }

    for (len += 7; srcOff < len; dest[destOff++] = src[srcOff++]) {
    }

  }

  static final void method1358(int[] var0, int var1, int[] var2, int var3, int var4) {
    if (var0 == var2) {
      if (var1 == var3) {
        return;
      }

      if (var3 > var1 && var3 < var1 + var4) {
        --var4;
        var1 += var4;
        var3 += var4;
        var4 = var1 - var4;

        for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
        }

        for (var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
        }

        return;
      }
    }

    var4 += var1;

    for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
    }

    for (var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
    }

  }

  static final void fill(int[] dest, int destOff, int len, int value) {
    for (len = destOff + len - 7; destOff < len; dest[destOff++] = value) {
      dest[destOff++] = value;
      dest[destOff++] = value;
      dest[destOff++] = value;
      dest[destOff++] = value;
      dest[destOff++] = value;
      dest[destOff++] = value;
      dest[destOff++] = value;
    }

    for (len += 7; destOff < len; dest[destOff++] = value) {
    }

  }

  static final void method1360(float[] var0, int var1, float[] var2, int var3, int var4) {
    if (var0 == var2) {
      if (var1 == var3) {
        return;
      }

      if (var3 > var1 && var3 < var1 + var4) {
        --var4;
        var1 += var4;
        var3 += var4;
        var4 = var1 - var4;

        for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
        }

        for (var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
        }

        return;
      }
    }

    var4 += var1;

    for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
    }

    for (var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
    }

  }

  static final void method1361(short[] var0, int var1, short[] var2, int var3, int var4) {
    if (var0 == var2) {
      if (var1 == var3) {
        return;
      }

      if (var3 > var1 && var3 < var1 + var4) {
        --var4;
        var1 += var4;
        var3 += var4;
        var4 = var1 - var4;

        for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
        }

        for (var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
        }

        return;
      }
    }

    var4 += var1;

    for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
    }

    for (var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
    }

  }

  static final void copy(Object[] var0, int var1, Object[] var2, int var3, int var4) {
    if (var0 == var2) {
      if (var1 == var3) {
        return;
      }

      if (var3 > var1 && var3 < var1 + var4) {
        --var4;
        var1 += var4;
        var3 += var4;
        var4 = var1 - var4;

        for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
          var2[var3--] = var0[var1--];
        }

        for (var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
        }

        return;
      }
    }

    var4 += var1;

    for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
      var2[var3++] = var0[var1++];
    }

    for (var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
    }

  }

  static final void clear(int[] var0, int var1, int var2) {
    for (var2 = var1 + var2 - 7; var1 < var2; var0[var1++] = 0) {
      var0[var1++] = 0;
      var0[var1++] = 0;
      var0[var1++] = 0;
      var0[var1++] = 0;
      var0[var1++] = 0;
      var0[var1++] = 0;
      var0[var1++] = 0;
    }

    for (var2 += 7; var1 < var2; var0[var1++] = 0) {
    }

  }
}
