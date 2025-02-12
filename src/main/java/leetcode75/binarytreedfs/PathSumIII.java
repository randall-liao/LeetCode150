package leetcode75.binarytreedfs;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII {

  private int resultCounter = 0;

  private long targetSum;

  private final Map<Long, Integer> prefixSumMap = new HashMap<>();

  public int pathSum(TreeNode root, int targetSum) {
    this.targetSum = targetSum;
    this.prefixSumMap.put(0L, 0);
    subTreeSum(root, 0L);
    return resultCounter;
  }

  private void subTreeSum(TreeNode node, long currentSum) {
    if (node == null) {
      return;
    }
    currentSum += node.val;
    if (currentSum == this.targetSum) {
      resultCounter++;
    }
    // Check if the solution exists in current path by using prefix sum table.
    resultCounter += prefixSumMap.getOrDefault(currentSum - this.targetSum, 0);
    prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
    subTreeSum(node.left, currentSum);
    subTreeSum(node.right, currentSum);
    // Backtracking to remove nodes that are not in path anymore.
    prefixSumMap.put(currentSum, prefixSumMap.get(currentSum) - 1);
  }

}
