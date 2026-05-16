package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyLinkedHashMap<K, V> {

  private final Node<K, V> headDummy, tailDummy;
  private final Map<K, Node<K, V>> map = new HashMap<>();

  public MyLinkedHashMap() {
    this.headDummy = new Node<>(null, null);
    this.tailDummy = new Node<>(null, null);
    headDummy.next = tailDummy;
    tailDummy.previous = headDummy;
  }

  public V get(K key) {
    Node<K, V> node = map.get(key);
    if (node == null) {
      return null;
    }
    return node.val;
  }

  public void put(K key, V val) {
    if (containsKey(key)) {
      // when key exists, update the hashmap and then update the node value
      Node<K, V> node = this.map.get(key);
      node.val = val;
    } else {
      // when key does not exist, add to both hashmap and linkedlist
      Node<K, V> newNode = new Node<>(key, val);
      addLastNode(newNode);
      map.put(key, newNode);
    }
  }

  public void remove(K key) {
    if (map.containsKey(key)) {
      // if key exist, remove from the list then from the map
      Node<K, V> removeNode = map.get(key);
      removeNode(removeNode);
      map.remove(key);
    }
  }

  public boolean containsKey(K key) {
    return map.containsKey(key);
  }

  private void addLastNode(Node<K, V> tempNode) {
    Node<K, V> tailNode = tailDummy.previous;
    tailNode.next = tempNode;
    tempNode.previous = tailNode;
    tempNode.next = tailDummy;
    tailDummy.previous = tempNode;
  }

  public List<K> keys() {
    List<K> keyList = new ArrayList<>();
    for (Node<K, V> p = headDummy.next; p != tailDummy; p = p.next) {
      keyList.add(p.key);
    }
    return keyList;
  }

  public int size() {
    return map.size();
  }

  private void removeNode(Node<K, V> nodeRemove) {
    Node<K, V> previousNode, nextNode;
    previousNode = nodeRemove.previous;
    nextNode = nodeRemove.next;
    previousNode.next = nextNode;
    nextNode.previous = previousNode;
    // dereference the node been removed
    nodeRemove.next = null;
    nodeRemove.previous = null;
  }

  private static class Node<K, V> {

    K key;

    V val;

    Node<K, V> previous, next;

    Node(K key, V val) {
      this.key = key;
      this.val = val;
    }
  }
}
