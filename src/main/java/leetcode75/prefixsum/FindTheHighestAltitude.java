package leetcode75.prefixsum;

public class FindTheHighestAltitude {

  public static int largestAltitude(int[] gain) {
    int currentAltitude = 0;
    int highestAltitude = 0;

    for (int g : gain) {
      currentAltitude += g;
      if (currentAltitude > highestAltitude) {
        highestAltitude = currentAltitude;
      }
    }

    return highestAltitude;
  }

  public static void main(String[] args) {
    try {
      testNegativeAndPositiveGains();
      testAllNegativeGains();
      testAllPositiveGains();
      testStrictlyDecreasingGains();
      testMixedGainsWithZeroResult();
      testSinglePositiveGain();
      testSingleNegativeGain();
      testZeroGains();
      testAlternatingPositiveNegativeGains();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private static void testNegativeAndPositiveGains() throws Exception {
    int[] gain = {-5, 1, 5, 0, -7};
    int expected = 1;
    int result = largestAltitude(gain);
    assertResult(result, expected, "Test Negative and Positive Gains");
  }

  private static void testAllNegativeGains() throws Exception {
    int[] gain = {-4, -3, -2, -1, 4, 3, 2};
    int expected = 0;
    int result = largestAltitude(gain);
    assertResult(result, expected, "Test All Negative Gains");
  }

  private static void testAllPositiveGains() throws Exception {
    int[] gain = {1, 2, 3, 4, 5};
    int expected = 15;
    int result = largestAltitude(gain);
    assertResult(result, expected, "Test All Positive Gains");
  }

  private static void testStrictlyDecreasingGains() throws Exception {
    int[] gain = {-1, -2, -3, -4, -5};
    int expected = 0;
    int result = largestAltitude(gain);
    assertResult(result, expected, "Test Strictly Decreasing Gains");
  }

  private static void testMixedGainsWithZeroResult() throws Exception {
    int[] gain = {10, -5, -5, 10, -10, 5};
    int expected = 10;
    int result = largestAltitude(gain);
    assertResult(result, expected, "Test Mixed Gains with Zero Result");
  }

  private static void testSinglePositiveGain() throws Exception {
    int[] gain = {5};
    int expected = 5;
    int result = largestAltitude(gain);
    assertResult(result, expected, "Test Single Positive Gain");
  }

  private static void testSingleNegativeGain() throws Exception {
    int[] gain = {-5};
    int expected = 0;
    int result = largestAltitude(gain);
    assertResult(result, expected, "Test Single Negative Gain");
  }

  private static void testZeroGains() throws Exception {
    int[] gain = {0, 0, 0, 0};
    int expected = 0;
    int result = largestAltitude(gain);
    assertResult(result, expected, "Test Zero Gains");
  }

  private static void testAlternatingPositiveNegativeGains() throws Exception {
    int[] gain = {5, -5, 5, -5, 5, -5};
    int expected = 5;
    int result = largestAltitude(gain);
    assertResult(result, expected, "Test Alternating Positive and Negative Gains");
  }

  private static void assertResult(int result, int expected, String exampleName) throws Exception {
    if (result == expected) {
      System.out.println(exampleName + " passed.");
    } else {
      Exception e =
          new Exception(exampleName + " failed: expected " + expected + " but got " + result);
      e.printStackTrace();
    }
  }
}
