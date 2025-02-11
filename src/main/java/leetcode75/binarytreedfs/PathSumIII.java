package leetcode75.binarytreedfs;

import java.math.BigInteger;

public class PathSumIII {

  private int resultCounter = 0;

  private BigInteger targetSum;

  public int pathSum(TreeNode root, int targetSum) {
    this.targetSum = BigInteger.valueOf(targetSum);
    inorder(root);
    return resultCounter;
  }

  private void subTreeSum(TreeNode node, BigInteger currentSum) {
    if (node == null) {
      return;
    }
    currentSum = currentSum.add(BigInteger.valueOf(node.val));
    if (currentSum.equals(this.targetSum)) {
      this.resultCounter += 1;
    }
    subTreeSum(node.left, currentSum);
    subTreeSum(node.right, currentSum);
  }

  private void inorder(TreeNode node) {
    if (node == null) {
      return;
    }
    subTreeSum(node, BigInteger.valueOf(0));
    inorder(node.left);
    inorder(node.right);
  }
}
