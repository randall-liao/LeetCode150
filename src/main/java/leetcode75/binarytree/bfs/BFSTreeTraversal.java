package leetcode75.binarytree.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTreeTraversal {

  List<List<TreeNode>> resultList = new LinkedList<>();

  public List<List<TreeNode>> bfsGroupByLevel(TreeNode root) {
    bfsTraversalByLevel(root);
    return resultList;
  }

  private void bfsTraversalByLevel(TreeNode root) {
    if (root == null) {
      return;
    }
    Queue<TreeNode> levelQueue = new LinkedList<>();
    levelQueue.add(root);
    while (!levelQueue.isEmpty()) {
      Integer levelSize = levelQueue.size();
      List<TreeNode> levelNodeList = new ArrayList<>();
      for (int i = 0; i < levelSize; i++) {
        TreeNode currentNode = levelQueue.poll();
        levelNodeList.add(currentNode);
        if (currentNode.left != null) {
          levelQueue.add(currentNode.left);
        }
        if (currentNode.right != null) {
          levelQueue.add(currentNode.right);
        }
      }
      this.resultList.add(levelNodeList);
    }
  }
}
