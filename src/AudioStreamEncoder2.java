final class AudioStreamEncoder2 extends AudioStreamEncoder {

  private Deque aClass61_3485 = new Deque();
  private Deque aClass61_3486 = new Deque();
  private int anInt3487 = 0;
  private int anInt3488 = -1;


  private final void method456(DummyClass57 var1) {
    var1.unlinkNode();
    var1.method106();
    Node var2 = this.aClass61_3486.root.nextNode;
    if (var2 == this.aClass61_3486.root) {
      this.anInt3488 = -1;
    } else {
      this.anInt3488 = ((DummyClass57) var2).anInt2247;
    }

  }

  final synchronized void method457(AudioStreamEncoder var1) {
    this.aClass61_3485.method1216(64, var1);
  }

  private final void method458() {
    if (this.anInt3487 > 0) {
      for (DummyClass57 var1 = (DummyClass57) this.aClass61_3486.getFirst();
           var1 != null; var1 = (DummyClass57) this.aClass61_3486.getNext()) {
        var1.anInt2247 -= this.anInt3487;
      }

      this.anInt3488 -= this.anInt3487;
      this.anInt3487 = 0;
    }

  }

  private final void method459(int var1) {
    for (AudioStreamEncoder var2 = (AudioStreamEncoder) this.aClass61_3485.getFirst();
         var2 != null; var2 = (AudioStreamEncoder) this.aClass61_3485.getNext()) {
      var2.method415(var1);
    }

  }

  private final void method460(int[] var1, int var2, int var3) {
    for (AudioStreamEncoder var4 = (AudioStreamEncoder) this.aClass61_3485.getFirst();
         var4 != null; var4 = (AudioStreamEncoder) this.aClass61_3485.getNext()) {
      var4.method410(var1, var2, var3);
    }

  }

  final synchronized void method461(AudioStreamEncoder var1) {
    var1.unlinkNode();
  }

  final int method409() {
    return 0;
  }

  final AudioStreamEncoder method411() {
    return (AudioStreamEncoder) this.aClass61_3485.getFirst();
  }

  final synchronized void method413(int[] samples, int off, int len) {
    do {
      if (this.anInt3488 < 0) {
        this.method460(samples, off, len);
        return;
      }

      if (this.anInt3487 + len < this.anInt3488) {
        this.anInt3487 += len;
        this.method460(samples, off, len);
        return;
      }

      int var4 = this.anInt3488 - this.anInt3487;
      this.method460(samples, off, var4);
      off += var4;
      len -= var4;
      this.anInt3487 += var4;
      this.method458();
      DummyClass57 var5 = (DummyClass57) this.aClass61_3486.getFirst();
      synchronized (var5) {
        int var7 = var5.method105(this);
        if (var7 < 0) {
          var5.anInt2247 = 0;
          this.method456(var5);
        } else {
          var5.anInt2247 = var7;
          this.method462(var5.nextNode, var5);
        }
      }
    } while (len != 0);

  }

  final AudioStreamEncoder method414() {
    return (AudioStreamEncoder) this.aClass61_3485.getNext();
  }

  final synchronized void method415(int var1) {
    do {
      if (this.anInt3488 < 0) {
        this.method459(var1);
        return;
      }

      if (this.anInt3487 + var1 < this.anInt3488) {
        this.anInt3487 += var1;
        this.method459(var1);
        return;
      }

      int var2 = this.anInt3488 - this.anInt3487;
      this.method459(var2);
      var1 -= var2;
      this.anInt3487 += var2;
      this.method458();
      DummyClass57 var3 = (DummyClass57) this.aClass61_3486.getFirst();
      synchronized (var3) {
        int var5 = var3.method105(this);
        if (var5 < 0) {
          var3.anInt2247 = 0;
          this.method456(var3);
        } else {
          var3.anInt2247 = var5;
          this.method462(var3.nextNode, var3);
        }
      }
    } while (var1 != 0);

  }

  private final void method462(Node var1, DummyClass57 var2) {
    while (var1 != this.aClass61_3486.root && ((DummyClass57) var1).anInt2247 <= var2.anInt2247) {
      var1 = var1.nextNode;
    }

    AbstractIndexedColorSprite.addLast(var2, var1);
    this.anInt3488 = ((DummyClass57) this.aClass61_3486.root.nextNode).anInt2247;
  }

}
