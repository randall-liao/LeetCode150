package leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CanPlaceFlowersTest {

  private final CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

  @Test
  void canPlaceFlowers_nullInput_expectedIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> canPlaceFlowers.canPlaceFlowers(null, 0));
  }

  @Test
  void canPlaceFlowers_emptyInput_expectedFalse() {
    int[] inputArray = {};
    assertFalse(canPlaceFlowers.canPlaceFlowers(inputArray, 0));
  }

  @Test
  void canPlaceFlowers_oneOccupiedInputWithOneRequired_expectedFalse() {
    int[] inputArray = {1};
    assertFalse(canPlaceFlowers.canPlaceFlowers(inputArray, 1));
  }

  @Test
  void canPlaceFlowers_oneOccupiedInputNoneRequired_expectedFalse() {
    int[] inputArray = {1};
    assertTrue(canPlaceFlowers.canPlaceFlowers(inputArray, 0));
  }

  @Test
  void canPlaceFlowers_oneOccupiedInputOneRequired_expectedTrue() {
    int[] inputArray = {0};
    assertTrue(canPlaceFlowers.canPlaceFlowers(inputArray, 1));
  }

  @Test
  void canPlaceFlowers_twoEmptyPlotsOneRequired_expectedTrue() {
    int[] inputArray = {0, 0};
    assertTrue(canPlaceFlowers.canPlaceFlowers(inputArray, 1));
  }

  @Test
  void canPlaceFlowers_twoEmptyPlotsTwoRequired_expectedFalse() {
    int[] inputArray = {0, 0};
    assertFalse(canPlaceFlowers.canPlaceFlowers(inputArray, 2));
  }

  @Test
  void canPlaceFlowers_sizeThreePlotWithTwoPlacementTwoRequired_expectedTrue() {
    int[] inputArray = {0, 0, 0};
    assertTrue(canPlaceFlowers.canPlaceFlowers(inputArray, 2));
  }

  @Test
  void canPlaceFlowers_sizeFourPlotWithTwoPlacementTwoRequired_expectedTrue() {
    int[] inputArray = {0, 0, 0, 0};
    assertTrue(canPlaceFlowers.canPlaceFlowers(inputArray, 2));
  }

  @Test
  void canPlaceFlowers_sizeFourPlotWithTwoPlacementThreeRequired_expectedFalse() {
    int[] inputArray = {0, 0, 0, 0};
    assertFalse(canPlaceFlowers.canPlaceFlowers(inputArray, 3));
  }

  @Test
  void canPlaceFlowers_sizeFourPlotsWithOnePlacementTwoRequired_expectedFalse() {
    int[] inputArray = {0, 0, 1, 0};
    assertFalse(canPlaceFlowers.canPlaceFlowers(inputArray, 2));
  }

  @Test
  void canPlaceFlowers_sizeFourPlotsWithOnePlacementOneRequired_expectedTrue() {
    int[] inputArray = {0, 0, 1, 0};
    assertTrue(canPlaceFlowers.canPlaceFlowers(inputArray, 1));
  }

  @Test
  void canPlaceFlowers_sizeFivePlotsWithOnePlacementOneRequired_expectedTrue() {
    int[] inputArray = {1, 0, 0, 0, 1};
    assertTrue(canPlaceFlowers.canPlaceFlowers(inputArray, 1));
  }

  @Test
  void canPlaceFlowers_sizeFivePlotsWithOnePlacementTwoRequired_expectedFalse() {
    int[] inputArray = {1, 0, 0, 0, 1};
    assertFalse(canPlaceFlowers.canPlaceFlowers(inputArray, 2));
  }

  @Test
  void canPlaceFlowers_sizeSixPlotsWithOnePlacementTwoRequired_expectedFalse() {
    int[] inputArray = {1, 0, 0, 0, 0, 1};
    assertFalse(canPlaceFlowers.canPlaceFlowers(inputArray, 2));
  }

  @Test
  void canPlaceFlowers_sizeSixPlotsWithOnePlacementOneRequired_expectedTrue() {
    int[] inputArray = {1, 0, 0, 0, 0, 1};
    assertTrue(canPlaceFlowers.canPlaceFlowers(inputArray, 1));
  }
}
