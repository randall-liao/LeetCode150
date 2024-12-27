package core.datastructres.trees;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleBinaryNodeImplTest {

  @Test
  void value() {
    BinaryNode<String> node = new SimpleBinaryNodeImpl<>("A");
    assertEquals("A", node.value());
  }

  @Test
  void setValue() {
    BinaryNode<String> node = new SimpleBinaryNodeImpl<>();
    node.setValue("A");
    assertEquals("A", node.value());
  }

  @Test
  void left() {
    SimpleBinaryNodeImpl<String> node = new SimpleBinaryNodeImpl<>("A");
    node.addLeft("L");
    assertEquals("L", node.left().value());
  }

  @Test
  void right() {
    SimpleBinaryNodeImpl<String> node = new SimpleBinaryNodeImpl<>("A");
    node.addRight("R");
    assertEquals("R", node.right().value());
  }

  @Test
  void isLeaf_parentNode() {
    SimpleBinaryNodeImpl<String> node = new SimpleBinaryNodeImpl<>("A");
    node.addLeft("L");
    assertFalse(node.isLeaf());
  }

  @Test
  void isLeaf_leafNode() {
    SimpleBinaryNodeImpl<String> node = new SimpleBinaryNodeImpl<>("A");
    node.addLeft("L");
    SimpleBinaryNodeImpl<String> leftNode = node.left();
    assertTrue(leftNode.isLeaf());
  }
}
