final class SoftReferenceObjectNodeWrapper extends AbstractObjectNodeWrapper {

  final AbstractObjectNode wrap(AbstractObjectNode var1, int var2) {
    return new SoftReferenceObjectNode(var1.getObject(true));
  }
}
