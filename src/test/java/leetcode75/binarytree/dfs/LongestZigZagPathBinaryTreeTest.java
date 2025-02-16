package leetcode75.binarytree.dfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestZigZagPathBinaryTreeTest {

  LongestZigZagPathBinaryTree longestZigZag;

  @BeforeEach
  void createTestContext() {
    longestZigZag = new LongestZigZagPathBinaryTree();
  }

  @Test
  void longestZigZag_exampleOne() {
    TreeNode root =
        new TreeNode(
            new Integer[] {1, null, 1, 1, 1, null, null, 1, 1, null, 1, null, null, null, 1});
    int expected = 3;
    assertEquals(expected, longestZigZag.longestZigZag(root));
  }

  @Test
  void longestZigZag_exampleTwo() {
    TreeNode root = new TreeNode(new Integer[] {1, 1, 1, null, 1, null, null, 1, 1, null, 1});
    int expected = 4;
    assertEquals(expected, longestZigZag.longestZigZag(root));
  }

  @Test
  void longestZigZag_exampleThree() {
    TreeNode root = new TreeNode(new Integer[] {1});
    int expected = 0;
    assertEquals(expected, longestZigZag.longestZigZag(root));
  }
}
