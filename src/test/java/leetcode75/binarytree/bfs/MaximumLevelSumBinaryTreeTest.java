package leetcode75.binarytree.bfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumLevelSumBinaryTreeTest {

  MaximumLevelSumBinaryTree maxLevelSum;

  @BeforeEach
  void setUp() {
    this.maxLevelSum = new MaximumLevelSumBinaryTree();
  }

  @Test
  void maxLevelSum_exampleOne() {
    TreeNode root = new TreeNode(new Integer[] {1, 7, 0, 7, -8, null, null});
    Integer expected = 2;
    assertEquals(expected, this.maxLevelSum.maxLevelSum(root));
  }
}
