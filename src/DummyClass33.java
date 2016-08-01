import javax.media.opengl.GL;

final class DummyClass33 {

  private static Deque aClass61_581 = new Deque();
  private static long aLong583 = 0L;
  private static Deque aClass61_586 = new Deque();
  private static Deque aClass61_587 = new Deque();
  private static Deque aClass61_588 = new Deque();
  private static int[] anIntArray589 = new int[1000];
  static int textureMemory = 0;
  static int anInt582 = 0;
  static int texture2dMemory = 0;
  static int anInt585 = 0;

  static final synchronized void method985(int var0, int var1, int var2) {
    if (var2 == anInt582) {
      IntegerNode var3 = new IntegerNode(var1);
      var3.key = (long) var0;
      aClass61_587.addLast(var3);
    }
  }

  static final synchronized void method986(int var0, int var1) {
    if (var1 == anInt582) {
      IntegerNode var2 = new IntegerNode();
      var2.key = (long) var0;
      aClass61_588.addLast(var2);
    }
  }

  public static void method987() {
    aClass61_581 = null;
    aClass61_586 = null;
    aClass61_587 = null;
    aClass61_588 = null;
    anIntArray589 = null;
  }

  static final synchronized void method988() {
    ++anInt582;
    aClass61_581.clear(-110);
    aClass61_586.clear(-88);
    aClass61_587.clear(-123);
    aClass61_588.clear(-115);
    anInt585 = 0;
    texture2dMemory = 0;
    textureMemory = 0;
  }

  static final synchronized void method989(int var0, int var1, int var2) {
    if (var2 == anInt582) {
      IntegerNode var3 = new IntegerNode(var1);
      var3.key = (long) var0;
      aClass61_581.addLast(var3);
    }
  }

  static final synchronized void clearGlResources() {
    GL var0 = GlRenderer.gl;
    int var1 = 0;

    while (true) {
      IntegerNode var2 = (IntegerNode) aClass61_581.method1220((byte) -3);
      if (var2 == null) {
        if (var1 > 0) {
          var0.glDeleteBuffersARB(var1, anIntArray589, 0);
          var1 = 0;
        }

        while (true) {
          var2 = (IntegerNode) aClass61_586.method1220((byte) -3);
          if (var2 == null) {
            while (true) {
              var2 = (IntegerNode) aClass61_587.method1220((byte) -3);
              if (var2 == null) {
                if (var1 > 0) {
                  var0.glDeleteTextures(var1, anIntArray589, 0);
                  boolean var4 = false;
                }

                while (true) {
                  var2 = (IntegerNode) aClass61_588.method1220((byte) -3);
                  if (var2 == null) {
                    if (anInt585 + texture2dMemory + textureMemory > 100663296
                      && Time.getCurrentTimeMillis() > aLong583 + 60000L) {
                      System.gc();
                      aLong583 = Time.getCurrentTimeMillis();
                    }

                    return;
                  }

                  int var3 = (int) var2.key;
                  var0.glDeleteLists(var3, 1);
                }
              }

              anIntArray589[var1++] = (int) var2.key;
              textureMemory -= var2.anInt2467;
              if (var1 == 1000) {
                var0.glDeleteTextures(var1, anIntArray589, 0);
                var1 = 0;
              }
            }
          }

          anIntArray589[var1++] = (int) var2.key;
          texture2dMemory -= var2.anInt2467;
          if (var1 == 1000) {
            var0.glDeleteTextures(var1, anIntArray589, 0);
            var1 = 0;
          }
        }
      }

      anIntArray589[var1++] = (int) var2.key;
      anInt585 -= var2.anInt2467;
      if (var1 == 1000) {
        var0.glDeleteBuffersARB(var1, anIntArray589, 0);
        var1 = 0;
      }
    }
  }

  static final synchronized void method991(int var0, int var1, int var2) {
    if (var2 == anInt582) {
      IntegerNode var3 = new IntegerNode(var1);
      var3.key = (long) var0;
      aClass61_586.addLast(var3);
    }
  }

}
