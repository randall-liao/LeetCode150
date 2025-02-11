package leetcode75.binarytreedfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PathSumIIITest {

  PathSumIII pathSum = new PathSumIII();

  @Test
  void pathSum_exampleOne() {
    TreeNode treeRoot = new TreeNode(new Integer[] {10, 5, -3, 3, 2, null, 11, 3, -2, null, 1});
    int expected = 3;
    int targetSum = 8;
    assertEquals(expected, pathSum.pathSum(treeRoot, targetSum));
  }

  @Test
  void pathSum_exampleTwo() {
    TreeNode treeRoot =
        new TreeNode(new Integer[] {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});
    int expected = 3;
    int targetSum = 22;
    assertEquals(expected, pathSum.pathSum(treeRoot, targetSum));
  }

  @Test
  void pathSum_exampleThree() {
    TreeNode treeRoot = new TreeNode(new Integer[] {1, -2, -3, 1, 3, -2, null, -1});
    int expected = 1;
    int targetSum = 3;
    assertEquals(expected, pathSum.pathSum(treeRoot, targetSum));
  }

  @Test
  void pathSum_exampleFour() {
    TreeNode treeRoot =
        new TreeNode(
            new Integer[] {
              1000000000,
              1000000000,
              null,
              294967296,
              null,
              1000000000,
              null,
              1000000000,
              null,
              1000000000
            });
    int expected = 0;
    int targetSum = 0;
    assertEquals(expected, pathSum.pathSum(treeRoot, targetSum));
  }
}
