package leetcode75.binarytreedfs;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public TreeNode(Integer[] values) {
    if (values == null || values.length == 0) {
      return;
    }
    this.val = values[0];
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(this);
    int index = 1;

    while (!queue.isEmpty() && index < values.length) {
      TreeNode current = queue.poll();

      // Process left child
      if (index < values.length && values[index] != null) {
        current.left = new TreeNode(values[index]);
        queue.offer(current.left);
      }
      index++;

      // Process right child
      if (index < values.length && values[index] != null) {
        current.right = new TreeNode(values[index]);
        queue.offer(current.right);
      }
      index++;
    }
  }

  public static void main(String[] args) {
    Integer[] values = {3, 1, 4, 3, null, 1, 5};
    TreeNode root = new TreeNode(values);
  }
}
