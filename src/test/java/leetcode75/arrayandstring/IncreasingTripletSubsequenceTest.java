package leetcode75.arrayandstring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IncreasingTripletSubsequenceTest {

  @Test
  void increasingTriplet_nullSequence_expectFalse() {
    int[] inputArray = null;
    assertFalse(IncreasingTripletSubsequence.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_emptySequence_expectFalse() {
    int[] inputArray = {};
    assertFalse(IncreasingTripletSubsequence.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_insufficientLengthSequence_expectFalse() {
    int[] inputArray = {1, 2};
    assertFalse(IncreasingTripletSubsequence.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_increasingSequence_expectTrue() {
    int[] inputArray = {1, 2, 3};
    assertTrue(IncreasingTripletSubsequence.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_increasingSequenceOfTwoWithLastTwoEqual_expectFalse() {
    int[] inputArray = {1, 2, 2};
    assertFalse(IncreasingTripletSubsequence.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_exampleOne_expectTrue() {
    int[] inputArray = {1, 2, 3, 4, 5};
    assertTrue(IncreasingTripletSubsequence.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_exampleTwo_expectFalse() {
    int[] inputArray = {5, 4, 3, 2, 1};
    assertFalse(IncreasingTripletSubsequence.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_exampleThree_expectTrue() {
    int[] inputArray = {2, 1, 5, 0, 4, 6};
    assertTrue(IncreasingTripletSubsequence.increasingTriplet(inputArray));
  }

  @Test
  void increasingTriplet_exampleFour_expectFalse() {
    int[] inputArray = {0, 4, 2, 1, 0, -1, -3};
    assertFalse(IncreasingTripletSubsequence.increasingTriplet(inputArray));
  }
}
