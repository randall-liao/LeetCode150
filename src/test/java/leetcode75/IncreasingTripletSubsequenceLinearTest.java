package leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IncreasingTripletSubsequenceLinearTest {

  @Test
  void increasingTriplet_nullSequence_expectFalse() {
    int[] inputArray = null;
    assertFalse(IncreasingTripletSubsequenceLinear.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_emptySequence_expectFalse() {
    int[] inputArray = {};
    assertFalse(IncreasingTripletSubsequenceLinear.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_insufficientLengthSequence_expectFalse() {
    int[] inputArray = {1, 2};
    assertFalse(IncreasingTripletSubsequenceLinear.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_increasingSequence_expectTrue() {
    int[] inputArray = {1, 2, 3};
    assertTrue(IncreasingTripletSubsequenceLinear.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_increasingSequenceOfTwoWithLastTwoEqual_expectFalse() {
    int[] inputArray = {1, 2, 2};
    assertFalse(IncreasingTripletSubsequenceLinear.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_exampleOne_expectTrue() {
    int[] inputArray = {1, 2, 3, 4, 5};
    assertTrue(IncreasingTripletSubsequenceLinear.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_exampleTwo_expectFalse() {
    int[] inputArray = {5, 4, 3, 2, 1};
    assertFalse(IncreasingTripletSubsequenceLinear.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_exampleThree_expectTrue() {
    int[] inputArray = {2, 1, 5, 0, 4, 6};
    assertTrue(IncreasingTripletSubsequenceLinear.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_exampleFour_expectFalse() {
    int[] inputArray = {0, 4, 2, 1, 0, -1, -3};
    assertFalse(IncreasingTripletSubsequenceLinear.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_exampleFive_expectFalse() {
    int[] inputArray = {1, 1, -2, 6};
    assertFalse(IncreasingTripletSubsequenceLinear.increasingTriplet(inputArray));
  }
}
