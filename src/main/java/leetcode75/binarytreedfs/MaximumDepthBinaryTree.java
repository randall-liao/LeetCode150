package leetcode75.binarytreedfs;


public class MaximumDepthBinaryTree {
  public int maxDepth(TreeNode root) {
    return depth(root, 0);
  }

  private Integer depth(TreeNode node, Integer currentDepth) {
    if (node == null) {
      return currentDepth;
    }
    Integer currentLeftDepth = depth(node.left, currentDepth + 1);
    Integer currentRightDepth = depth(node.right, currentDepth + 1);
    return Math.max(currentLeftDepth, currentRightDepth);
  }
}
