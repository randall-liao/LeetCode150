package leetcode75.binarytree.bfs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeRightSideViewTest {

  private BinaryTreeRightSideView rightSideViewList;

  @BeforeEach
  void setUp() {
    this.rightSideViewList = new BinaryTreeRightSideView();
  }

  @Test
  void rightSideView_exampleOne() {
    TreeNode root = new TreeNode(new Integer[] {1, 2, 3, null, 5, null, 4});
    Integer[] expected = new Integer[] {1, 3, 4};
    assertArrayEquals(expected, this.rightSideViewList.rightSideView(root).toArray());
  }

  @Test
  void rightSideView_exampleTwo() {
    TreeNode root = new TreeNode(new Integer[] {1, 2, 3, 4, null, null, null, 5});
    Integer[] expected = new Integer[] {1, 3, 4, 5};
    assertArrayEquals(expected, this.rightSideViewList.rightSideView(root).toArray());
  }

  @Test
  void rightSideView_exampleThree() {
    TreeNode root = new TreeNode(new Integer[] {1, null, 3});
    Integer[] expected = new Integer[] {1, 3};
    assertArrayEquals(expected, this.rightSideViewList.rightSideView(root).toArray());
  }

  @Test
  void rightSideView_exampleFour() {
    TreeNode root = null;
    Integer[] expected = new Integer[] {};
    assertArrayEquals(expected, this.rightSideViewList.rightSideView(root).toArray());
  }
}
