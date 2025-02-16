package leetcode75.binarytree.dfs;

import java.util.Objects;

public class LowestCommonAncestorBinaryTree {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root.val == p.val || root.val == q.val) {
      return root;
    }
    TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
    TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
    if (leftNode == null && rightNode == null) {
      return null;
    } else if (leftNode != null && rightNode != null) {
      return root;
    } else return Objects.requireNonNullElse(leftNode, rightNode);
  }
}
