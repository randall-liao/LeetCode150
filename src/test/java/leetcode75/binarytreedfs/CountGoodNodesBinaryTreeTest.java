package leetcode75.binarytreedfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountGoodNodesBinaryTreeTest {

  CountGoodNodesBinaryTree countGoodNodesBinaryTree;

  @BeforeEach
  void CountGoodNodesBinaryTree() {
    countGoodNodesBinaryTree = new CountGoodNodesBinaryTree();
  }

  @Test
  void countGoodNodesBinaryTree_exampleOne() {
    TreeNode treeRoot = new TreeNode(new Integer[] {3, 1, 4, 3, null, 1, 5});
    Integer expected = 4;
    assertEquals(expected, countGoodNodesBinaryTree.goodNodes(treeRoot));
  }

  @Test
  void countGoodNodesBinaryTree_exampleTwo() {
    TreeNode treeRoot = new TreeNode(new Integer[] {3, 3, null, 4, 2});
    Integer expected = 3;
    assertEquals(expected, countGoodNodesBinaryTree.goodNodes(treeRoot));
  }

  @Test
  void countGoodNodesBinaryTree_exampleThree() {
    TreeNode treeRoot = new TreeNode(new Integer[] {1});
    Integer expected = 1;
    assertEquals(expected, countGoodNodesBinaryTree.goodNodes(treeRoot));
  }
}
