package leetcode75.binarytree.dfs;

public class PathSum {
  public boolean hasPathSum(TreeNode root, int targetSum) {
    return sum(root, 0, targetSum);
  }

  private boolean sum(TreeNode node, int currentSum, int targetSum) {
    if (node == null) {
      return false;
    }
    currentSum += node.val;
    // when DFS reach leaf node, compare
    if (node.left == null && node.right == null) {
      return currentSum == targetSum;
    }
    return (sum(node.left, currentSum, targetSum) || sum(node.right, currentSum, targetSum));
  }
}
