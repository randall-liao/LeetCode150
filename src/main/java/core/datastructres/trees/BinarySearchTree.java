package core.datastructres.trees;

import java.util.Queue;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

  private Node root;

  public void put(Key key, Value val) {}

  public Value get(Key key) {
    return null;
  }

  public void delete(Key key) {}

  public Key getMin() {
    return null;
  }

  public Key getMax() {
    return null;
  }

  public Key floor(Key key) {
    return null;
  }

  public Key ceiling(Key key) {
    return null;
  }

  public Integer rank(Key key) {
    return -1;
  }

  private Integer rank(Key key, Node x) {
    return -1;
  }

  public Iterable<Key> iterator() {
    return null;
  }

  private void inorder(Node node, Queue<Key> queue) {}

  private Node delete(Node node, Key key) {
    return null;
  }

  private class Node {

    private final Key key;
    private final Value val;
    private Node left, right;
    private Integer count;

    Node(Key key, Value val) {
      this.key = key;
      this.val = val;
    }
  }
}
