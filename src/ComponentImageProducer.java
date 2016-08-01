import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class ComponentImageProducer extends AbstractImageProducer {

  private Component aComponent2983;


  final void draw(int x, int y, Graphics var3, int var4) {
    var3.drawImage(this.anImage2009, x, y, this.aComponent2983);
  }

  final void setDimensions(int var1, boolean var2, int var3, Component var4) {
    this.anIntArray2007 = new int[var3 * var1 + 1];
    this.anInt2011 = var1;
    this.anInt2012 = var3;
    DataBufferInt var5 = new DataBufferInt(this.anIntArray2007, this.anIntArray2007.length);
    DirectColorModel var6 = new DirectColorModel(32, 16711680, '\uff00', 255);
    WritableRaster var7 = Raster
      .createWritableRaster(var6.createCompatibleSampleModel(this.anInt2012, this.anInt2011), var5,
        null);
    this.anImage2009 = new BufferedImage(var6, var7, var2, new Hashtable());
    this.aComponent2983 = var4;
    this.method2182(0);
  }

  final void draw(Graphics var5, int width, int clipX, int height, int clipY, int var3) {
    Shape var7 = var5.getClip();
    var5.clipRect(clipX, clipY, width, height);
    var5.drawImage(this.anImage2009, 0, 0, this.aComponent2983);
    var5.setClip(var7);
  }
}
