package leetcode75.binarytree.dfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PathSumTest {

  PathSum pathSum = new PathSum();

  @Test
  void pathSum_exampleOne() {
    TreeNode treeRoot =
        new TreeNode(new Integer[] {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1});
    Integer targetSum = 22;
    assertTrue(pathSum.hasPathSum(treeRoot, targetSum));
  }
}
