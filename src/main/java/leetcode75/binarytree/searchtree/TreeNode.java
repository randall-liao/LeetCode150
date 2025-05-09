package leetcode75.binarytree.searchtree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TreeNode treeNode = (TreeNode) obj;
    return val == treeNode.val
        && Objects.equals(left, treeNode.left)
        && Objects.equals(right, treeNode.right);
  }

  @Override
  public int hashCode() {
    int result = Objects.hashCode(val); // Start with the hash of the value
    result = 31 * result + (left == null ? 0 : left.hashCode()); // Combine with left subtree's hash
    result =
        31 * result + (right == null ? 0 : right.hashCode()); // Combine with right subtree's hash
    return result;
  }

  public static void main(String[] args) {
    Integer[] values = {3, 1, 4, 3, null, 1, 5};
    TreeNode root = new TreeNode(values);
  }
}
