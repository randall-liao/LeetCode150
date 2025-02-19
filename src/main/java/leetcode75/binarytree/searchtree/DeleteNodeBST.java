package leetcode75.binarytree.searchtree;

public class DeleteNodeBST {

  private static TreeNode findMinNode (TreeNode node) {
    if (node == null) {
      return null;
    }
    if (node.left == null) {
      return node;
    } else {
    return findMinNode(node.left);
    }
  }

  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) return null;
    if (root.val > key) {
      root.left = deleteNode(root.left, key);
      return root;
    } else if (root.val < key) {
      root.right = deleteNode(root.right, key);
      return root;
    } else {
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      } else {
        TreeNode min = findMinNode(root.right);
        root.val = min.val;
        root.right = deleteNode(root.right,min.val);
        return root;
      }
    }
  }

}
