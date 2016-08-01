import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class MouseWheel extends AbstractMouseWheel implements MouseWheelListener {

  private int offset = 0;


  final void unbind(boolean var1, Component var2) {
    if (var1) {
      this.mouseWheelMoved(null);
    }

    var2.removeMouseWheelListener(this);
  }

  final synchronized int pollOffset(int var1) {
    int var2 = this.offset;
    this.offset = 0;

    return var2;
  }

  public final synchronized void mouseWheelMoved(MouseWheelEvent var1) {
    this.offset += var1.getWheelRotation();
  }

  final void bind(Component var1, int var2) {
    if (var2 < -70) {
      var1.addMouseWheelListener(this);
    }
  }

}
