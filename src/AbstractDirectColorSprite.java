abstract class AbstractDirectColorSprite extends SubNode {

  static int anInt3699 = 0;
  static GameString COMMAND_CARD_MEMORY = SpawnedGameObject.createString("::cardmem");
  static GameString aClass94_3702 = SpawnedGameObject.createString(" )2> <col=ffff00>");
  static GameString aClass94_3703 = SpawnedGameObject.createString(" )2> ");
  static int anInt3704;
  static GameString aClass94_3705 = SpawnedGameObject.createString("W-=hlen Sie eine Option");
  static Widget aClass11_3708 = null;
  int anInt3696;
  int anInt3697;
  int anInt3698;
  int anInt3701;
  int anInt3706;
  int anInt3707;

  public static void method634(byte var0) {
    try {
      aClass11_3708 = null;
      aClass94_3702 = null;
      aClass94_3705 = null;
      if (var0 == 108) {
        aClass94_3703 = null;
        COMMAND_CARD_MEMORY = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "qf.R(" + var0 + ')');
    }
  }

  static final Widget method638(byte var0, int var1, int var2) {
    try {
      Widget var3 = EnumStringFetcher.getWidget((byte) 109, var1);
      return 0 == ~var2 ?
        var3 :
        (var0 != -19 ?
          null :
          (var3 != null && var3.aClass11Array262 != null && ~var3.aClass11Array262.length < ~var2 ?
            var3.aClass11Array262[var2] :
            null));
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "qf.P(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  abstract void method635(int var1, int var2);

  abstract void method636(int var1, int var2, int var3, int var4, int var5, int var6);

  abstract void method637(int var1, int var2, int var3);

  abstract void draw(int var1, int var2, int var3, int var4);

  final void method640(int var1, int var2, int var3, int var4, int var5) {
    try {
      if (var5 == -1470985020) {
        int var6 = this.anInt3697 << 3;
        int var7 = this.anInt3706 << 3;
        var4 = (var4 << 4) + (var6 & 15);
        var1 = (var1 << 4) + (15 & var7);
        this.method636(var6, var7, var4, var1, var2, var3);
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "qf.F(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  abstract void method641(int var1, int var2);

  abstract void method642(int var1, int var2, int var3, int var4, int var5);

  abstract void method643(int var1, int var2);

}
