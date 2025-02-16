package leetcode75.binarytree.dfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LowestCommonAncestorBinaryTreeTest {

  LowestCommonAncestorBinaryTree lowestCommonAncestorBinaryTree;

  @BeforeEach
  void contextInit() {
    lowestCommonAncestorBinaryTree = new LowestCommonAncestorBinaryTree();
  }

  @Test
  void lowestCommonAncestor_exampleOne() {
    TreeNode root = new TreeNode(new Integer[] {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
    TreeNode pNode = new TreeNode(5);
    TreeNode qNode = new TreeNode(1);
    int expected = 3;
    assertEquals(
        expected, lowestCommonAncestorBinaryTree.lowestCommonAncestor(root, pNode, qNode).val);
  }

  @Test
  void lowestCommonAncestor_exampleTwo() {
    TreeNode root = new TreeNode(new Integer[] {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
    TreeNode pNode = new TreeNode(5);
    TreeNode qNode = new TreeNode(4);
    int expected = 5;
    assertEquals(
        expected, lowestCommonAncestorBinaryTree.lowestCommonAncestor(root, pNode, qNode).val);
  }

  @Test
  void lowestCommonAncestor_exampleThree() {
    TreeNode root = new TreeNode(new Integer[] {1, 2});
    TreeNode pNode = new TreeNode(1);
    TreeNode qNode = new TreeNode(2);
    int expected = 1;
    assertEquals(
        expected, lowestCommonAncestorBinaryTree.lowestCommonAncestor(root, pNode, qNode).val);
  }
}
