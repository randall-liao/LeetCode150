package core.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

  @Test
  void sort() {
    int[] inputArray = {5, 4, 3, 2, 1, 0};
    int[] expectedArray = inputArray.clone();
    Arrays.sort(expectedArray);
    assertArrayEquals(expectedArray, SelectionSort.sort(inputArray));
  }
}
