package leetcode75.binarytree.searchtree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteNodeBSTTest {

  DeleteNodeBST delete;

  @BeforeEach
  void setUp() {
    this.delete = new DeleteNodeBST();
  }

  @Test
  void deleteNode_nodeNotExist() {
    TreeNode needDeleteRoot = new TreeNode(new Integer[] {5,3,6,2,4,null,7});
    int key = 10;
    TreeNode expectedRoot = new TreeNode(new Integer[] {5,3,6,2,4,null,7});
    assertEquals(expectedRoot, delete.deleteNode(needDeleteRoot, key));
  }

  @Test
  void deleteNode_deleteLeafNode() {
    TreeNode needDeleteRoot = new TreeNode(new Integer[] {5,3,6,2,4,null,7});
    int key = 7;
    TreeNode expectedRoot = new TreeNode(new Integer[] {5,3,6,2,4});
    assertEquals(expectedRoot, delete.deleteNode(needDeleteRoot, key));
  }
}
