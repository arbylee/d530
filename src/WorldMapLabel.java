final class WorldMapLabel {

  private static GameString aClass94_1717 = SpawnedGameObject.createString("Prepared sound engine");
  private static GameString aClass94_1726 = SpawnedGameObject.createString("Select");
  static int anInt1716;
  static int anInt1719 = -1;
  static FileUnpacker animationBases;
  static GameString aClass94_1724 = SpawnedGameObject.createString(" )2>");
  static GameString aClass94_1728 = SpawnedGameObject.createString("Eingabeprozedur geladen)3");
  static int[] anIntArray1729 = new int[] {12543016, 15504954, 15914854, 16773818};
  static GameString aClass94_1731 = aClass94_1717;
  static GameString aClass94_1722 = aClass94_1726;
  short[] aShortArray1718;
  int anInt1720;
  GameString[] aClass94Array1721;
  int[] anIntArray1725;
  short[] aShortArray1727;
  byte[] aByteArray1730;

  WorldMapLabel(int var1) {
    try {
      this.anInt1720 = var1;
      this.aClass94Array1721 = new GameString[this.anInt1720];
      this.aShortArray1718 = new short[this.anInt1720];
      this.anIntArray1725 = new int[this.anInt1720];
      this.aByteArray1730 = new byte[this.anInt1720];
      this.aShortArray1727 = new short[this.anInt1720];
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "se.<init>(" + var1 + ')');
    }
  }

  final boolean method1787(int var1, byte var2) {
    try {
      if (var2 != -124) {
        method1793(null, null, -17, (byte) 94);
      }

      return (this.aByteArray1730[var1] & 8) != 0;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "se.G(" + var1 + ',' + var2 + ')');
    }
  }

  final boolean method1789(int var1, int var2) {
    try {
      if (var2 != 530) {
        this.method1794(-111, 26);
      }

      return ~(4 & this.aByteArray1730[var1]) != -1;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "se.A(" + var1 + ',' + var2 + ')');
    }
  }

  final int method1791(int var1, int var2) {
    try {
      return var2 != 8 ? 35 : this.aByteArray1730[var1] & 3;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "se.I(" + var1 + ',' + var2 + ')');
    }
  }

  final boolean method1794(int var1, int var2) {
    try {
      if (var2 != -20138) {
        method1788(122, 38, -120, -29, false);
      }

      return 0 == (this.aByteArray1730[var1] & 16);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "se.E(" + var1 + ',' + var2 + ')');
    }
  }

  static final void method1786(int var0) {
    try {
      while (true) {
        if (~SpotAnimationConfig.gameBuffer.method815(HashTable.packetLength, 32666) <= -12) {
          int var1 = SpotAnimationConfig.gameBuffer.readBits(11);
          if (var1 != 2047) {
            boolean var2 = false;
            if (null == TextureSampler0.players[var1]) {
              TextureSampler0.players[var1] = new Player();
              var2 = true;
              if (null != DummyClass45.configs[var1]) {
                TextureSampler0.players[var1].parseConfig(DummyClass45.configs[var1]);
              }
            }

            DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var1;
            Player var3 = TextureSampler0.players[var1];
            var3.anInt2838 = AbstractGameWorld.updateCycle;
            int var4 = SpotAnimationConfig.gameBuffer.readBits(1);
            if (~var4 == -2) {
              DummyClass60.anIntArray441[OndemandRequester.anInt997++] = var1;
            }

            int var5 = SpotAnimationConfig.gameBuffer.readBits(5);
            int var6 = DummyClass32.anIntArray510[SpotAnimationConfig.gameBuffer.readBits(3)];
            if (var5 > 15) {
              var5 -= 32;
            }

            if (var2) {
              var3.anInt2806 = var3.rotationY = var6;
            }

            int var7 = SpotAnimationConfig.gameBuffer.readBits(1);
            int var8 = SpotAnimationConfig.gameBuffer.readBits(5);
            if (var8 > 15) {
              var8 -= 32;
            }

            var3.setPosition((byte) 126, var5 + TextureCache.localPlayer.waypointsX[0], ~var7 == -2,
              TextureCache.localPlayer.waypointsY[0] + var8);
            continue;
          }
        }

        if (var0 >= -46) {
          return;
        }

        SpotAnimationConfig.gameBuffer.method818(false);
        return;
      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9, "se.D(" + var0 + ')');
    }
  }

  static final int method1788(int var0, int var1, int var2, int var3, boolean var4) {
    try {
      if (!var4) {
        return 127;
      } else {
        int var5 = 15 & var3;
        int var7 = -5 >= ~var5 ? (~var5 != -13 && -15 != ~var5 ? var1 : var0) : var2;
        int var6 = ~var5 > -9 ? var0 : var2;
        return (-1 != ~(var5 & 1) ? -var6 : var6) - -(~(2 & var5) != -1 ? -var7 : var7);
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "se.H(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void method1790(int var0, int var1, int var2) {
    try {
      if (var2 < 90) {
        aClass94_1731 = null;
      }

      WidgetUpdate var3 = AudioStreamEncoder3.method466(4, 5, var0);
      var3.g((byte) 33);
      var3.anInt3598 = var1;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "se.B(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  public static void method1792(int var0) {
    try {
      anIntArray1729 = null;
      if (var0 == 0) {
        animationBases = null;
        aClass94_1726 = null;
        aClass94_1731 = null;
        aClass94_1717 = null;
        aClass94_1722 = null;
        aClass94_1728 = null;
        aClass94_1724 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "se.F(" + var0 + ')');
    }
  }

  static final void method1793(GameString var0, GameString var1, int var2, byte var3) {
    try {
      GroundItemNode.password = var1;
      EnumStringFetcher.anInt2161 = var2;
      GroundItemNode.username = var0;
      if (!GroundItemNode.username.method1528((byte) -42, GroundItemNode.EMPTY_STRING)
        && !GroundItemNode.password.method1528((byte) -42, GroundItemNode.EMPTY_STRING)) {
        if (0 != ~ClientScriptCall.anInt2451) {
          IdentityKit.method951(0);
        } else {
          SceneGraphTile.anInt2246 = 0;
          DummyClass26.anInt1616 = 0;
          AbstractImageProducer.loginResponse = -3;
          TextureSampler2.anInt3375 = 1;
          Buffer var4 = new Buffer(128);
          var4.writeByte(10);
          var4.writeShort((int) (Math.random() * 99999.0D));
          var4.writeShort(530);
          var4.writeLong(GroundItemNode.username.toBase37());
          var4.writeInt((int) (Math.random() * 9.9999999E7D));
          var4.writeString(GroundItemNode.password);
          var4.writeInt((int) (Math.random() * 9.9999999E7D));
          int var5 = 9 / ((var3 - 29) / 60);
          var4.encipherRSA(TextureSampler31.PUBLIC_EXPONENT, TextureSampler10.MODULUS);
          TextureSampler12.secureBuffer.position = 0;
          TextureSampler12.secureBuffer.writeByte(210);
          TextureSampler12.secureBuffer.writeByte(var4.position);
          TextureSampler12.secureBuffer.write(var4.bytes, 0, var4.position);
        }
      } else {
        AbstractImageProducer.loginResponse = 3;
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "se.C(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ','
          + var2 + ',' + var3 + ')');
    }
  }

}
