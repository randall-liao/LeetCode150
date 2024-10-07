package leetcode75.arrayandstring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class KidsWithTheGreatestNumberOfCandiesTest {

  private final KidsWithTheGreatestNumberOfCandies defaultTestClass =
      new KidsWithTheGreatestNumberOfCandies();

  @Test
  void kidWithCandies_nullInput_expectedIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> defaultTestClass.kidWithCandies(null, 0));
  }

  @Test
  void kidWithCandies_emptyArrayInput_expectedIllegalArgumentException() {
    int[] intArray = {};
    assertThrows(
        IllegalArgumentException.class, () -> defaultTestClass.kidWithCandies(intArray, 0));
  }

  @Test
  void kidWithCandies_negativeExtraCandiesInput_expectedIllegalArgumentException() {
    int[] intArray = {0, 0, 0};
    assertThrows(
        IllegalArgumentException.class, () -> defaultTestClass.kidWithCandies(intArray, -20));
  }

  @Test
  void kidWithCandies_mixedInputArrayExampleOne_expectedBothTrueAndFalse() {
    List<Boolean> expectedResultList =
        new ArrayList<>(Arrays.asList(true, true, true, false, true));
    int[] candies = {2, 3, 5, 1, 3};
    int extraCandies = 3;
    assertEquals(defaultTestClass.kidWithCandies(candies, extraCandies), expectedResultList);
  }

  @Test
  void kidWithCandies_mixedInputArrayExampleTwo_expectedBothTrueAndFalse() {
    List<Boolean> expectedResultList =
        new ArrayList<>(Arrays.asList(true, false, false, false, false));
    int[] candies = {4, 2, 1, 1, 2};
    int extraCandies = 1;
    assertEquals(defaultTestClass.kidWithCandies(candies, extraCandies), expectedResultList);
  }

  @Test
  void kidWithCandies_mixedInputArrayExampleThree_expectedBothTrueAndFalse() {
    List<Boolean> expectedResultList = new ArrayList<>(Arrays.asList(true, false, true));
    int[] candies = {12, 1, 12};
    int extraCandies = 10;
    assertEquals(defaultTestClass.kidWithCandies(candies, extraCandies), expectedResultList);
  }
}
