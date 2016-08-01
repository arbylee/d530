import java.lang.ref.SoftReference;

final class SoftReferenceObjectNode extends AbstractObjectNode {

  private SoftReference reference;


  SoftReferenceObjectNode(Object var1) {
    this.reference = new SoftReference(var1);
  }

  final Object getObject(boolean var1) {
    if (!var1) {
      this.getObject(true);
    }

    return this.reference.get();
  }

  final boolean method568(int var1) {
    return true;
  }
}
