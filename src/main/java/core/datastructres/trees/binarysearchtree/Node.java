package core.datastructres.trees.binarysearchtree;

/**
 * Represents a generic node in a binary tree, with a key, value, and child nodes. The key must be
 * comparable to allow ordering.
 *
 * @param <K> The type of the key, which must implement {@link Comparable}.
 * @param <V> The type of the value stored in the node.
 */
public class Node<K extends Comparable<K>, V> {

  /** The key associated with this node. Used for ordering in the tree. */
  private K key;

  /** The value associated with this node. */
  private V value;

  /** Reference to the left child node. */
  private Node<K, V> left;

  /** Reference to the right child node. */
  private Node<K, V> right;

  /**
   * The number of sibling nodes this node has. This refers to nodes that share the same parent as
   * this node.
   */
  private final Integer numberOfSiblings;

  public Node(K key, V value, Integer numberOfSiblings) {
    this.key = key;
    this.value = value;
    this.numberOfSiblings = numberOfSiblings;
  }

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  public Node<K, V> getLeft() {
    return left;
  }

  public void setLeft(Node<K, V> left) {
    this.left = left;
  }

  public Node<K, V> getRight() {
    return right;
  }

  public void setRight(Node<K, V> right) {
    this.right = right;
  }

  public Integer getNumberOfSiblings() {
    return numberOfSiblings;
  }
}
