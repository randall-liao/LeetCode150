package core.datastructres.trees;

public interface BinaryNode<E> {
  // Get and set the element value
  E value();

  void setValue(E v);

  // return the children
  BinaryNode<E> left();

  BinaryNode<E> right();

  // return TRUE if a leaf node, FALSE otherwise
  boolean isLeaf();
}
