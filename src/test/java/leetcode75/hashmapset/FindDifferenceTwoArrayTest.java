package leetcode75.hashmapset;

import static leetcode75.hashmapset.FindDifferenceTwoArray.findDifference;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class FindDifferenceTwoArrayTest {

  @Test
  void findDifference_exampleOne() {
    int[] inputNum1 = {1, 2, 3};
    int[] inputNum2 = {2, 4, 6};
    List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 3), Arrays.asList(4, 6));
    assertEquals(expected, findDifference(inputNum1, inputNum2));
  }

  @Test
  void findDifference_exampleTwo() {
    int[] inputNum1 = {1, 2, 3, 3};
    int[] inputNum2 = {1, 1, 2, 2};
    List<List<Integer>> expected = Arrays.asList(List.of(3), List.of());
    assertEquals(expected, findDifference(inputNum1, inputNum2));
  }
}
