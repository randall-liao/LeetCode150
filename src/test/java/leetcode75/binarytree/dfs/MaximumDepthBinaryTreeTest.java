package leetcode75.binarytree.dfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumDepthBinaryTreeTest {

  MaximumDepthBinaryTree maxDepth = new MaximumDepthBinaryTree();

  @Test
  void maxDepth_rootNodeOnly() {
    TreeNode root = new TreeNode(0);
    Integer expected = 1;
    assertEquals(expected, maxDepth.maxDepth(root));
  }

  @Test
  void maxDepth_depthTwoTree() {
    TreeNode leftNode = new TreeNode(1);
    TreeNode root = new TreeNode(0, leftNode, null);
    Integer expected = 2;
    assertEquals(expected, maxDepth.maxDepth(root));
  }

  @Test
  void maxDepth_depthTwoFullTree() {
    TreeNode leftNode = new TreeNode(9);
    TreeNode rightLeftNode = new TreeNode(15);
    TreeNode rightRightNode = new TreeNode(7);
    TreeNode rightNode = new TreeNode(20, rightLeftNode, rightRightNode);
    TreeNode root = new TreeNode(3, leftNode, rightNode);
    Integer expected = 3;
    assertEquals(expected, maxDepth.maxDepth(root));
  }

  @Test
  void maxDepth_exampleTwo() {
    TreeNode rightNode = new TreeNode(2);
    TreeNode root = new TreeNode(1, null, rightNode);
    Integer expected = 2;
    assertEquals(expected, maxDepth.maxDepth(root));
  }
}
