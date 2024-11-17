package leetcode75.prefixsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindTheHighestAltitudeTest {

  @Test
  public void testNegativeAndPositiveGains() {
    int[] gain = {-5, 1, 5, 0, -7};
    int expected = 1;
    int result = FindTheHighestAltitude.largestAltitude(gain);
    assertEquals(expected, result, "Test Negative and Positive Gains");
  }

  @Test
  public void testAllNegativeGains() {
    int[] gain = {-4, -3, -2, -1, 4, 3, 2};
    int expected = 0;
    int result = FindTheHighestAltitude.largestAltitude(gain);
    assertEquals(expected, result, "Test All Negative Gains");
  }

  @Test
  public void testAllPositiveGains() {
    int[] gain = {1, 2, 3, 4, 5};
    int expected = 15;
    int result = FindTheHighestAltitude.largestAltitude(gain);
    assertEquals(expected, result, "Test All Positive Gains");
  }

  @Test
  public void testStrictlyDecreasingGains() {
    int[] gain = {-1, -2, -3, -4, -5};
    int expected = 0;
    int result = FindTheHighestAltitude.largestAltitude(gain);
    assertEquals(expected, result, "Test Strictly Decreasing Gains");
  }

  @Test
  public void testMixedGainsWithZeroResult() {
    int[] gain = {10, -5, -5, 10, -10, 5};
    int expected = 10;
    int result = FindTheHighestAltitude.largestAltitude(gain);
    assertEquals(expected, result, "Test Mixed Gains with Zero Result");
  }

  @Test
  public void testSinglePositiveGain() {
    int[] gain = {5};
    int expected = 5;
    int result = FindTheHighestAltitude.largestAltitude(gain);
    assertEquals(expected, result, "Test Single Positive Gain");
  }

  @Test
  public void testSingleNegativeGain() {
    int[] gain = {-5};
    int expected = 0;
    int result = FindTheHighestAltitude.largestAltitude(gain);
    assertEquals(expected, result, "Test Single Negative Gain");
  }

  @Test
  public void testZeroGains() {
    int[] gain = {0, 0, 0, 0};
    int expected = 0;
    int result = FindTheHighestAltitude.largestAltitude(gain);
    assertEquals(expected, result, "Test Zero Gains");
  }

  @Test
  public void testAlternatingPositiveNegativeGains() {
    int[] gain = {5, -5, 5, -5, 5, -5};
    int expected = 5;
    int result = FindTheHighestAltitude.largestAltitude(gain);
    assertEquals(expected, result, "Test Alternating Positive and Negative Gains");
  }
}
