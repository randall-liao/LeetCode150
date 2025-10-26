package leetcode75.priorityqueue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmallestInfiniteSetTest {

  private SmallestInfiniteSet smallestInfiniteset;

  @BeforeEach
  void test_init() {
    smallestInfiniteset = new SmallestInfiniteSet();
  }

  @Test
  void popSmallest_smallestPossibleValue() {
    int expected = 1;
    int result = smallestInfiniteset.popSmallest();
    assertEquals(expected, result);
  }

  @Test
  void addBack_addAfterRemove() {
    int expected = 1;
    assertEquals(expected, smallestInfiniteset.popSmallest());
    assertNotEquals(expected, smallestInfiniteset.popSmallest());
    smallestInfiniteset.addBack(1);
    assertEquals(expected, smallestInfiniteset.popSmallest());
  }

  @Test
  void mixTest_exampleOne() {
    smallestInfiniteset.addBack(2);
    assertEquals(1, smallestInfiniteset.popSmallest());
    assertEquals(2, smallestInfiniteset.popSmallest());
    assertEquals(3, smallestInfiniteset.popSmallest());
    smallestInfiniteset.addBack(1);
    assertEquals(1, smallestInfiniteset.popSmallest());
    assertEquals(4, smallestInfiniteset.popSmallest());
    assertEquals(5, smallestInfiniteset.popSmallest());
  }
}
