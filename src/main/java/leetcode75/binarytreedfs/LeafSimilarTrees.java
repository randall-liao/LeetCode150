package leetcode75.binarytreedfs;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

  private static void getLeafs(TreeNode node, List<Integer> resultList) {
    // Base case
    if (node == null) {
      return;
    }
    getLeafs(node.left, resultList);
    getLeafs(node.right, resultList);
    if (isLeaf(node)) {
      resultList.add(node.val);
    }
  }

  private static Boolean isLeaf(TreeNode node) {
    return node.left == null && node.right == null;
  }

  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> root1LeafList = new ArrayList<>();
    getLeafs(root1, root1LeafList);
    List<Integer> root2LeafList = new ArrayList<>();
    getLeafs(root2, root2LeafList);
    return root1LeafList.equals(root2LeafList);
  }
}
