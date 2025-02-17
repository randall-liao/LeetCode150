package leetcode75.binarytree.bfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BFSTreeTraversalTest {

  BFSTreeTraversal bfs;

  @BeforeEach
  void setUp() {
    this.bfs = new BFSTreeTraversal();
  }

  @Test
  void bfsGroupByLevel() {
    TreeNode root = new TreeNode(new Integer[] {0, 1, 2, 3, null, 5, 6});
    this.bfs.bfsGroupByLevel(root);
  }
}
