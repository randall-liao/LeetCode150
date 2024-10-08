package core.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

  @Test
  void sort() {
    int[] inputArray = {5, 4, 3, 2, 1, 0};
    int[] expectedArray = inputArray.clone();
    Arrays.sort(expectedArray);
    assertArrayEquals(expectedArray, SelectionSort.sort(inputArray));
  }

  @Test
  void sort_nullArray() {
    int[] inputArray = null;
    int[] expectedArray = null;
    assertArrayEquals(expectedArray, SelectionSort.sort(inputArray));
  }

  @Test
  void sort_emptyArray() {
    int[] inputArray = {};
    int[] expectedArray = {};
    assertArrayEquals(expectedArray, SelectionSort.sort(inputArray));
  }

  @Test
  void sort_repeatArray() {
    int[] inputArray = {3, 3, 3, 3, 3, 3, 3, 3, 3};
    int[] expectedArray = inputArray.clone();
    Arrays.sort(expectedArray);
    assertArrayEquals(expectedArray, SelectionSort.sort(inputArray));
  }

  @Test
  void sort_repeatDecreasingArray() {
    int[] inputArray = {9, 9, 8, 8, 8, 7, 6, 6, 6, 5, 5, 4, 4, 4, 3, 3, 2, 1, 0};
    int[] expectedArray = inputArray.clone();
    Arrays.sort(expectedArray);
    assertArrayEquals(expectedArray, SelectionSort.sort(inputArray));
  }

  @Test
  void sort_extremeValueArray() {
    int[] inputArray = {
      Integer.MAX_VALUE,
      Integer.MIN_VALUE,
      Integer.MIN_VALUE,
      8,
      Integer.MAX_VALUE,
      Integer.MAX_VALUE,
      6,
      6,
      6,
      5,
      5,
      4,
      4,
      4,
      3,
      3,
      0,
      0,
      Integer.MIN_VALUE
    };
    int[] expectedArray = inputArray.clone();
    Arrays.sort(expectedArray);
    assertArrayEquals(expectedArray, SelectionSort.sort(inputArray));
  }

  @Test
  void sort_reversedArray() {
    int[] inputArray = {5, 4, 3, 2, 1, 0};
    int[] expectedArray = inputArray.clone();
    Arrays.sort(expectedArray);
    assertArrayEquals(expectedArray, SelectionSort.sort(inputArray));
  }
}
