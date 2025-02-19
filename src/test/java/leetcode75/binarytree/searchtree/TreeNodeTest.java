package leetcode75.binarytree.searchtree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Optional, but can be useful for @BeforeAll etc.
public class TreeNodeTest {

  @Test
  void testReflexivityEquals() {
    TreeNode tree = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    assertEquals(tree, tree, "Reflexivity - Same object should be equal");
  }

  @Test
  void testReflexivityHashCode() {
    TreeNode tree = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    assertEquals(tree.hashCode(), tree.hashCode(), "Reflexivity - HashCode should be consistent");
  }

  @Test
  void testSymmetryEqualsEqualTrees() {
    TreeNode tree1 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    TreeNode tree2 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    assertEquals(tree1, tree2, "Symmetry - tree1.equals(tree2)");
    assertEquals(tree2, tree1, "Symmetry - tree2.equals(tree1)");
  }

  @Test
  void testSymmetryHashCodeEqualTrees() {
    TreeNode tree1 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    TreeNode tree2 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    assertEquals(
        tree1.hashCode(),
        tree2.hashCode(),
        "Symmetry - HashCode should be consistent for equal trees");
  }

  @Test
  void testTransitivityEqualsEqualTrees() {
    TreeNode tree1 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    TreeNode tree2 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    TreeNode tree3 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    assertTrue(
        tree1.equals(tree2) && tree2.equals(tree3), "Transitivity - tree1=tree2, tree2=tree3");
    assertEquals(tree1, tree3, "Transitivity - then tree1=tree3");
  }

  @Test
  void testTransitivityHashCodeEqualTrees() {
    TreeNode tree1 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    TreeNode tree2 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    TreeNode tree3 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    if (tree1.equals(tree2) && tree2.equals(tree3)) {
      assertEquals(
          tree1.hashCode(), tree3.hashCode(), "Transitivity - HashCode should be consistent");
    }
  }

  @Test
  void testConsistencyEqualsEqualTrees() {
    TreeNode tree1 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    TreeNode tree2 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    boolean firstCall = tree1.equals(tree2);
    boolean secondCall = tree1.equals(tree2);
    assertTrue(firstCall && secondCall, "Consistency - Multiple equals calls should be consistent");
    assertEquals(firstCall, secondCall, "Consistency - equals results should be the same");
  }

  @Test
  void testConsistencyHashCodeEqualTrees() {
    TreeNode tree1 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    TreeNode tree2 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    int firstHash = tree1.hashCode();
    int secondHash = tree1.hashCode();
    assertEquals(
        firstHash, secondHash, "Consistency - Multiple hashCode calls should be consistent");
    assertEquals(
        tree1.hashCode(), tree2.hashCode(), "Consistency - HashCode consistency for equal trees");
  }

  @Test
  void testInequalityDifferentValuesEquals() {
    TreeNode tree1 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    TreeNode tree2 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 8}); // 7 changed to 8
    assertNotEquals(tree1, tree2, "Inequality - Different Values should not be equal");
  }

  @Test
  void testInequalityDifferentStructureLeftSubtreeEquals() {
    TreeNode tree1 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    TreeNode tree2 =
        new TreeNode(new Integer[] {5, 2, 6, 1, 4, null, 7}); // 3 and 2 swapped, 2's left changed
    assertNotEquals(tree1, tree2, "Inequality - Different Left Subtree should not be equal");
  }

  @Test
  void testInequalityDifferentStructureRightSubtreeEquals() {
    TreeNode tree1 = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, 7});
    TreeNode tree2 =
        new TreeNode(new Integer[] {5, 3, 7, 2, 4, null, 8}); // 6 and 7 swapped, 7's right changed
    assertNotEquals(tree1, tree2, "Inequality - Different Right Subtree should not be equal");
  }

  @Test
  void testInequalityVsNullEquals() {
    TreeNode tree = new TreeNode(new Integer[] {5, 3, 6});
    assertNotEquals(tree, null, "Inequality - Tree vs Null should not be equal");
  }

  @Test
  void testInequalityNullVsTreeEquals() {
    TreeNode tree = new TreeNode(new Integer[] {5, 3, 6});
    assertNotEquals(null, tree, "Inequality - Null vs Tree should not be equal");
  }

  @Test
  void testEqualityEmptyTreesEquals() {
    TreeNode tree1 = new TreeNode(new Integer[] {});
    TreeNode tree2 = new TreeNode(new Integer[] {});
    assertEquals(tree1, tree2, "Equality - Empty Trees should be equal");
  }

  @Test
  void testEqualityEmptyTreesHashCode() {
    TreeNode tree1 = new TreeNode(new Integer[] {});
    TreeNode tree2 = new TreeNode(new Integer[] {});
    assertEquals(
        tree1.hashCode(),
        tree2.hashCode(),
        "Equality - HashCode for Empty Trees should be consistent");
  }

  @Test
  void testInequalityEmptyVsNonEmptyEquals() {
    TreeNode tree1 = new TreeNode(new Integer[] {});
    TreeNode tree2 = new TreeNode(new Integer[] {5});
    assertNotEquals(tree1, tree2, "Inequality - Empty vs Non-empty should not be equal");
  }

  @Test
  void testEqualityDeeperTreesEquals() {
    TreeNode tree1 = new TreeNode(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    TreeNode tree2 = new TreeNode(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    assertEquals(tree1, tree2, "Equality - Deeper Trees should be equal");
  }

  @Test
  void testEqualityDeeperTreesHashCode() {
    TreeNode tree1 = new TreeNode(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    TreeNode tree2 = new TreeNode(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    assertEquals(
        tree1.hashCode(),
        tree2.hashCode(),
        "Equality - HashCode for Deeper Trees should be consistent");
  }

  @Test
  void testInequalityDeeperTreesValueChangeEquals() {
    TreeNode tree1 = new TreeNode(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    TreeNode tree2 =
        new TreeNode(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 11}); // 10 changed to 11
    assertNotEquals(
        tree1, tree2, "Inequality - Deeper Trees with value change should not be equal");
  }
}
