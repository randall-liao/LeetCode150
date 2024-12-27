package core.datastructres.trees;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTraversalRecursiveImplTest {

  private SimpleBinaryNodeImpl<String> rootNode;

  @BeforeEach
  void setUp() {
    rootNode = new SimpleBinaryNodeImpl<>("A");
    rootNode.addLeft("B");
    rootNode.addRight("C");
    rootNode.left().addRight("D");
    rootNode.right().addLeft("E");
    rootNode.right().addRight("F");
    rootNode.right().left().addLeft("G");
    rootNode.right().right().addLeft("H");
    rootNode.right().right().addRight("I");
  }

  @Test
  void preorderTraversal() {
    BinaryTreeTraversalInterface<String> treeTraversal = new BinaryTreeTraversalRecursiveImpl<>();
    String[] expected = {"A", "B", "D", "C", "E", "G", "F", "H", "I"};
    List<String> expectedList = new ArrayList<>(Arrays.asList(expected));
    ArrayList<String> resultList = treeTraversal.preorderTraversal(rootNode);
    assertIterableEquals(expectedList, resultList);
  }

  @Test
  void postorderTraversal() {
    BinaryTreeTraversalInterface<String> treeTraversal = new BinaryTreeTraversalRecursiveImpl<>();
    String[] expected = {"D", "B", "G", "E", "H", "I", "F", "C", "A"};
    List<String> expectedList = new ArrayList<>(Arrays.asList(expected));
    ArrayList<String> resultList = treeTraversal.postorderTraversal(rootNode);
    assertIterableEquals(expectedList, resultList);
  }

  @Test
  void inorderTraversal() {
    BinaryTreeTraversalInterface<String> treeTraversal = new BinaryTreeTraversalRecursiveImpl<>();
    String[] expected = {"B", "D", "A", "G", "E", "C", "H", "F", "I"};
    List<String> expectedList = new ArrayList<>(Arrays.asList(expected));
    ArrayList<String> resultList = treeTraversal.inorderTraversal(rootNode);
    assertIterableEquals(expectedList, resultList);
  }
}
