package core.datastructres;


public class BinarySearchTree<Key extends Comparable<Key>, Value> {

  private Node root;

  public void put (Key key, Value val) {

  }

  public Value get(Key key) {
      return null;
  }

  public void delete(Key key) {

  }

  public Iterable<Key> iterator() {
      return null;
  }

  private static class Node<Key, Value>{

    Key key;
    Value val;
    Node<Key, Value> left, right;

    Node(Key key, Value val) {
      this.key = key;
      this.val = val;
    }
  }

}
