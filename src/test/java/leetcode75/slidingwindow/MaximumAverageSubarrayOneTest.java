package leetcode75.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumAverageSubarrayOneTest {

  private static final double DELTA = 1e-5;
  private final MaximumAverageSubarrayOne maxAvg = new MaximumAverageSubarrayOne();

  @Test
  void findMaxAverage_exampleOne() {
    int[] inputNumsArray = {1, 12, -5, -6, 50, 3};
    int inputWindowSize = 4;
    double expected = Double.parseDouble("12.75000");
    assertEquals(expected, maxAvg.findMaxAverage(inputNumsArray, inputWindowSize), DELTA);
  }

  @Test
  void findMaxAverage_exampleTwo() {
    int[] inputNumsArray = {5};
    int inputWindowSize = 1;
    double expected = Double.parseDouble("5.00000");
    assertEquals(expected, maxAvg.findMaxAverage(inputNumsArray, inputWindowSize), DELTA);
  }

  @Test
  void findMaxAverage_exampleThree() {
    int[] inputNumsArray = {-1};
    int inputWindowSize = 1;
    double expected = Double.parseDouble("-1.0000");
    assertEquals(expected, maxAvg.findMaxAverage(inputNumsArray, inputWindowSize), DELTA);
  }

  @Test
  void findMaxAverage_exampleFour() {
    int[] inputNumsArray = {0, 1, 1, 3, 3};
    int inputWindowSize = 4;
    double expected = Double.parseDouble("2.00000");
    assertEquals(expected, maxAvg.findMaxAverage(inputNumsArray, inputWindowSize), DELTA);
  }

  @Test
  public void testEntireArrayWindow() {
    MaximumAverageSubarrayOne solver = new MaximumAverageSubarrayOne();
    int[] nums = {5, 6, 7, 8};
    int k = 4;
    double expected = Double.parseDouble("6.5");
    assertEquals(expected, solver.findMaxAverage(nums, k), DELTA);
  }
}
