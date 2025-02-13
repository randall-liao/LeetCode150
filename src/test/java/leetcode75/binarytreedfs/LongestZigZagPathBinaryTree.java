package leetcode75.binarytreedfs;

public class LongestZigZagPathBinaryTree {

  int maxLength = 0;

  public int longestZigZag(TreeNode root) {
    maxZigZagPath(root, BinaryTreeDirection.LEFT, 0);
    maxZigZagPath(root, BinaryTreeDirection.RIGHT, 0);
    return this.maxLength;
  }

  private void maxZigZagPath(TreeNode node, BinaryTreeDirection lastDirection, int currentLength) {
    if (node == null) {
      return;
    }
    this.maxLength = Math.max(currentLength, this.maxLength);
    switch (lastDirection) {
      case LEFT:
        // Keep ZigZag
        maxZigZagPath(node.right, BinaryTreeDirection.RIGHT, currentLength + 1);
        // goes to the same direction, break zigzag pattern
        maxZigZagPath(node.left, BinaryTreeDirection.LEFT, 1);
        break;
      case RIGHT:
        maxZigZagPath(node.left, BinaryTreeDirection.LEFT, currentLength + 1);
        maxZigZagPath(node.right, BinaryTreeDirection.RIGHT, 1);
        break;
    }
  }

  private enum BinaryTreeDirection {
    LEFT,
    RIGHT
  }
}
