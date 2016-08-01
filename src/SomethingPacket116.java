final class SomethingPacket116 {

  static int[] anIntArray1743 = new int[25];
  static int anInt1744 = 0;
  static GameString aClass94_1745 = SpawnedGameObject.createString("settings");
  static int anInt1748;
  static Widget aClass11_1749;
  static FileUnpacker worldMapData;
  static int anInt1753;
  static int cycles;
  static int[] anIntArray1755 = new int[128];
  static int anInt1756;
  int anInt1746;
  int anInt1747;
  int anInt1750;
  int anInt1752;
  int anInt1757;
  private byte aByte1742;


  public SomethingPacket116() {
  }

  SomethingPacket116(Buffer var1) {
    try {
      this.aByte1742 = var1.readByte();
      this.anInt1752 = var1.readUnsignedShort();
      this.anInt1757 = var1.readInt();
      this.anInt1747 = var1.readInt();
      this.anInt1746 = var1.readInt();
      this.anInt1750 = var1.readInt();
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "sg.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final int method1804(boolean var1) {
    try {
      if (var1) {
        anInt1753 = -21;
      }

      return this.aByte1742 & 7;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sg.B(" + var1 + ')');
    }
  }

  final int method1805(byte var1) {
    try {
      int var2 = -74 % ((var1 - 73) / 35);
      return 8 != (this.aByte1742 & 8) ? 0 : 1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sg.C(" + var1 + ')');
    }
  }

  public static void method1802(int var0) {
    try {
      aClass94_1745 = null;
      anIntArray1743 = null;
      anIntArray1755 = null;
      worldMapData = null;
      aClass11_1749 = null;
      if (var0 != 25) {
        worldMapData = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sg.A(" + var0 + ')');
    }
  }

  static final void method1803(byte var0) {
    try {
      if (var0 >= 4) {
        ProceduralTexture.aClass93_1146.method1523((byte) -119);
        DummyClass13.aClass93_2016.method1523((byte) -103);
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sg.D(" + var0 + ')');
    }
  }

}
