package leetcode75.binarytreedfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeafSimilarTreesTest {

  LeafSimilarTrees similarTree = new LeafSimilarTrees();

  @Test
  void leafSimilar_sameTree() {
    TreeNode leftNode = new TreeNode(1);
    TreeNode rightNode = new TreeNode(2);
    TreeNode root = new TreeNode(0, leftNode, rightNode);
    TreeNode leftNode1 = new TreeNode(1);
    TreeNode rightNode1 = new TreeNode(2);
    TreeNode root1 = new TreeNode(0, leftNode1, rightNode1);
    assertTrue(similarTree.leafSimilar(root, root1));
  }

  @Test
  void leafSimilar_exampleTwo() {
    TreeNode leftNode = new TreeNode(2);
    TreeNode rightNode = new TreeNode(3);
    TreeNode root = new TreeNode(1, leftNode, rightNode);
    TreeNode leftNode1 = new TreeNode(3);
    TreeNode rightNode1 = new TreeNode(2);
    TreeNode root1 = new TreeNode(1, leftNode1, rightNode1);
    assertFalse(similarTree.leafSimilar(root, root1));
  }
}
