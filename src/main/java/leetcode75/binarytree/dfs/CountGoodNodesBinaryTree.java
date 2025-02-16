package leetcode75.binarytree.dfs;

public class CountGoodNodesBinaryTree {
  public int goodNodes(TreeNode root) {
    return getNumberOfGoodNodes(root, Integer.MIN_VALUE);
  }

  private Integer getNumberOfGoodNodes(TreeNode node, Integer currentMaxValue) {
    if (node == null) {
      return 0;
    }
    Integer goodNodesDetected = 0;
    if (node.val >= currentMaxValue) {
      currentMaxValue = node.val;
      goodNodesDetected++;
    }
    Integer leftGoodNodeCount = getNumberOfGoodNodes(node.left, currentMaxValue);
    Integer rightGoodNodeCount = getNumberOfGoodNodes(node.right, currentMaxValue);
    return leftGoodNodeCount + rightGoodNodeCount + goodNodesDetected;
  }
}
