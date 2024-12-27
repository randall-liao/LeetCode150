package core.datastructres.trees;


public class SimpleBinaryNodeImpl<E> implements BinaryNode<E> {

  private E node;

  private SimpleBinaryNodeImpl<E> leftNode;

  private SimpleBinaryNodeImpl<E> rightNode;

  public SimpleBinaryNodeImpl(E v) {
    this.node = v;
  }

  public SimpleBinaryNodeImpl() {
    this.node = null;
  }

  @Override
  public E value() {
    return node;
  }

  @Override
  public void setValue(E v) {
    this.node = v;
  }

  @Override
  public SimpleBinaryNodeImpl<E> left() {
    return leftNode;
  }

  @Override
  public SimpleBinaryNodeImpl<E> right() {
    return rightNode;
  }

  public void addLeft(E value) {
    if (this.node == null) {
      throw new NullPointerException("parent node is null");
    }
    this.leftNode = new SimpleBinaryNodeImpl<>(value);
  }

  public void addRight(E value) {
    if (this.node == null) {
      throw new NullPointerException("parent node is null");
    }
    this.rightNode = new SimpleBinaryNodeImpl<>(value);
  }

  @Override
  public boolean isLeaf() {
    return this.leftNode == null && this.rightNode == null;
  }
}
