package leetcode75.hashmapset;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniqueNumberOccurrencesTest {
  @Test
  void testUniqueOccurrences_Example1() {
    int[] arr = {1, 2, 2, 1, 1, 3};
    assertTrue(UniqueNumberOccurrences.uniqueOccurrences(arr));
  }

  @Test
  void testUniqueOccurrences_Example2() {
    int[] arr = {1, 2};
    assertFalse(UniqueNumberOccurrences.uniqueOccurrences(arr));
  }

  @Test
  void testUniqueOccurrences_Example3() {
    int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
    assertTrue(UniqueNumberOccurrences.uniqueOccurrences(arr));
  }

  @Test
  void testUniqueOccurrences_SingleElement() {
    int[] arr = {42};
    assertTrue(UniqueNumberOccurrences.uniqueOccurrences(arr));
  }

  @Test
  void testUniqueOccurrences_AllSame() {
    int[] arr = {5, 5, 5, 5};
    assertTrue(UniqueNumberOccurrences.uniqueOccurrences(arr));
  }

  @Test
  void testUniqueOccurrences_MixedPositiveAndNegative() {
    int[] arr = {-1, -1, 0, 0, 0, 1, 1, 1, 1};
    assertTrue(UniqueNumberOccurrences.uniqueOccurrences(arr));
  }

  @Test
  void testUniqueOccurrences_EmptyArray() {
    int[] arr = {};
    assertTrue(UniqueNumberOccurrences.uniqueOccurrences(arr));
  }

  @Test
  void testUniqueOccurrences_DuplicateCounts() {
    int[] arr = {3, 3, 3, 4, 4, 5, 5};
    assertFalse(UniqueNumberOccurrences.uniqueOccurrences(arr));
  }
}
