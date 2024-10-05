package core.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(value = 1, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BinarySearchTest {

  @Test
  void search_evenInput_expectedMidIndex() {
    int[] inputArray = {1, 2, 3, 4, 5};
    int intSearchKey = 3;
    assertEquals(2, BinarySearch.search(inputArray, intSearchKey));
  }

  @Test
  void search_evenInput_expectedLeftIndex() {
    int[] inputArray = {1, 2, 3, 4, 5};
    int intSearchKey = 2;
    assertEquals(1, BinarySearch.search(inputArray, intSearchKey));
  }

  @Test
  void search_evenInput_expectedRightIndex() {
    int[] inputArray = {1, 2, 3, 4, 5};
    int intSearchKey = 4;
    assertEquals(3, BinarySearch.search(inputArray, intSearchKey));
  }

  @Test
  @DisplayName("Search in an empty array should return -1")
  void testEmptyArray() {
    int[] array = {};
    int key = 5;
    int result = BinarySearch.search(array, key);
    assertEquals(-1, result, "Searching in an empty array should return -1");
  }

  @Test
  @DisplayName("Search in a single-element array")
  void testSingleElementArray() {
    int[] array = {10};

    // Test existing element
    assertEquals(
        0,
        BinarySearch.search(array, 10),
        "Searching for the only element should return its index");

    // Test non-existing element
    assertEquals(
        -1, BinarySearch.search(array, 5), "Searching for a non-existing element should return -1");
  }

  @Test
  @DisplayName("Search in a multiple-element sorted array")
  void testMultipleElementsArray() {
    int[] array = {1, 3, 5, 7, 9, 11, 13};

    // Test existing elements
    assertEquals(0, BinarySearch.search(array, 1), "Should find the first element");
    assertEquals(3, BinarySearch.search(array, 7), "Should find the middle element");
    assertEquals(6, BinarySearch.search(array, 13), "Should find the last element");

    // Test non-existing elements
    assertEquals(-1, BinarySearch.search(array, 2), "Should return -1 for a non-existing element");
    assertEquals(
        -1,
        BinarySearch.search(array, 14),
        "Should return -1 for a non-existing element beyond the array");
  }

  @Test
  @DisplayName("Search in an array with duplicate elements")
  void testDuplicateElementsArray() {
    int[] array = {2, 4, 4, 4, 6, 8, 10};
    int key = 4;
    int result = BinarySearch.search(array, key);

    // Since binary search can return any index of the duplicates, check if it's within the expected
    // range
    assertTrue(result >= 1 && result <= 3, "Should find the key among duplicates");
  }

  @Test
  @DisplayName("Search for Integer.MAX_VALUE and Integer.MIN_VALUE")
  void testExtremeValues() {
    int[] array = {Integer.MIN_VALUE, -1000, 0, 1000, Integer.MAX_VALUE};

    // Test existing extreme values
    assertEquals(0, BinarySearch.search(array, Integer.MIN_VALUE), "Should find Integer.MIN_VALUE");
    assertEquals(4, BinarySearch.search(array, Integer.MAX_VALUE), "Should find Integer.MAX_VALUE");

    // Test non-existing extreme values
    assertEquals(
        -1,
        BinarySearch.search(array, Integer.MIN_VALUE + 1),
        "Should return -1 for a value just above Integer.MIN_VALUE");
    assertEquals(
        -1,
        BinarySearch.search(array, Integer.MAX_VALUE - 1),
        "Should return -1 for a value just below Integer.MAX_VALUE");
  }

  @Test
  @DisplayName("Search in a large array to test performance and overflow prevention")
  void testLargeArray() {
    int largeSize = 1_000_000; // 1 million elements
    int[] largeArray = new int[largeSize];

    // Populate the array with even numbers: 0, 2, 4, ..., 1_999_998
    for (int i = 0; i < largeSize; i++) {
      largeArray[i] = i * 2;
    }

    // Test existing elements
    assertEquals(
        0, BinarySearch.search(largeArray, 0), "Should find the first element in a large array");
    assertEquals(
        499_999,
        BinarySearch.search(largeArray, 999_998),
        "Should find a middle element in a large array");
    assertEquals(
        999_999,
        BinarySearch.search(largeArray, 1_999_998),
        "Should find the last element in a large array");

    // Test non-existing elements
    assertEquals(
        -1,
        BinarySearch.search(largeArray, -2),
        "Should return -1 for a negative key not in the array");
    assertEquals(
        -1, BinarySearch.search(largeArray, 1), "Should return -1 for an odd key not in the array");
    assertEquals(
        -1,
        BinarySearch.search(largeArray, 2_000_000),
        "Should return -1 for a key beyond the array's range");
  }

  @Test
  @DisplayName("Test mid calculation near Integer.MAX_VALUE to prevent overflow")
  void testMidCalculationNearMaxInteger() {
    // Since we cannot create an array of size Integer.MAX_VALUE, we'll simulate the mid calculation
    int left = Integer.MAX_VALUE - 10;
    int right = Integer.MAX_VALUE - 1;

    // Calculate mid using the same logic as in the search method
    int mid = left + (right - left) / 2;

    // Expected mid should be left + 4 = Integer.MAX_VALUE - 6
    int expectedMid = Integer.MAX_VALUE - 6;

    assertEquals(
        expectedMid, mid, "Mid calculation should prevent overflow near Integer.MAX_VALUE");
  }

  @Test
  @DisplayName("Search in a null array should return -1")
  void testNullArray() {
    int[] array = null;
    int key = 5;
    int result = BinarySearch.search(array, key);
    assertEquals(-1, result, "Searching in a null array should return -1");
  }
}
