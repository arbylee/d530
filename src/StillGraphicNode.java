final class StillGraphicNode extends SubNode {

  private static GameString aClass94_3541 = SpawnedGameObject.createString("yellow:");
  private static GameString aClass94_3543 = SpawnedGameObject.createString("Loading config )2 ");
  static int anInt3542;
  static GameString aClass94_3547 = SpawnedGameObject.createString("Speicher wird zugewiesen)3");
  static GameString aClass94_3544 = aClass94_3541;
  static GameString aClass94_3548 = aClass94_3541;
  static GameString aClass94_3546 = aClass94_3543;
  StillGraphic aClass140_Sub2_3545;


  StillGraphicNode(StillGraphic var1) {
    try {
      this.aClass140_Sub2_3545 = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "bk.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method534(int var0) {
    try {
      aClass94_3546 = null;
      aClass94_3548 = null;
      aClass94_3543 = null;
      int var1 = 101 % ((-29 - var0) / 45);
      aClass94_3544 = null;
      aClass94_3547 = null;
      aClass94_3541 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bk.B(" + var0 + ')');
    }
  }

  static final void method535(byte var0, int var1) {
    try {
      AbstractFileRequester.aFloatArray1934[0] =
        (float) ClientScript.bitAnd(255, var1 >> 16) / 255.0F;
      AbstractFileRequester.aFloatArray1934[1] =
        (float) ClientScript.bitAnd(var1 >> 8, 255) / 255.0F;
      AbstractFileRequester.aFloatArray1934[2] = (float) ClientScript.bitAnd(255, var1) / 255.0F;
      IntegerNode.method383(-32584, 3);
      IntegerNode.method383(-32584, 4);
      if (var0 != 56) {
        method535((byte) 127, 99);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bk.A(" + var0 + ',' + var1 + ')');
    }
  }

  static final SomethingTexture3 method536(byte var0, Buffer var1) {
    try {
      if (var0 != 54) {
        method534(117);
      }

      return new SomethingTexture3(var1.method787((byte) 25), var1.method787((byte) 73),
        var1.method787((byte) 114), var1.method787((byte) 33), var1.method787((byte) 78),
        var1.method787((byte) 91), var1.method787((byte) 120), var1.method787((byte) 113),
        var1.readUnsignedMedium((byte) 115), var1.readUnsignedByte());
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "bk.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

}
