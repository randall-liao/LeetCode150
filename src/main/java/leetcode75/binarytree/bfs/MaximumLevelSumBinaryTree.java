package leetcode75.binarytree.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumLevelSumBinaryTree {

  private static List<List<TreeNode>> bfsTraversalByLevel(TreeNode root) {
    List<List<TreeNode>> listNodeGroupByLevel = new ArrayList<>();
    if (root == null) {
      return listNodeGroupByLevel;
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
      listNodeGroupByLevel.add(levelNodeList);
    }
    return listNodeGroupByLevel;
  }

  public int maxLevelSum(TreeNode root) {
    Integer currentLevel = 0;
    Integer maxLevel = -1;
    Integer maxSum = Integer.MIN_VALUE;
    List<List<TreeNode>> nodeGroupByLevel = bfsTraversalByLevel(root);
    for (List<TreeNode> levelNodeList : nodeGroupByLevel) {
      Integer currentLevelSum = 0;
      for (TreeNode node : levelNodeList) {
        currentLevelSum += node.val;
      }
      currentLevel++;
      if (currentLevelSum > maxSum) {
        maxLevel = currentLevel;
        maxSum = currentLevelSum;
      }
    }
    return maxLevel;
  }
}
