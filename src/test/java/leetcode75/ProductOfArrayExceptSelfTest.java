package leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

  private static final ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

  @Test
  void productExceptSelf_nullInput_expectedIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class, () -> ProductOfArrayExceptSelf.productExceptSelf(null));
  }

  @Test
  void productExceptSelf_emptyArray_expectedEmptyArray() {
    int[] testArray = {};
    int[] expectedArray = {};
    assertArrayEquals(expectedArray, ProductOfArrayExceptSelf.productExceptSelf(testArray));
  }

  @Test
  void productExceptSelf_allPositiveArray_expectedArray() {
    int[] testArray = {1, 2, 3, 4};
    int[] expectedArray = {24, 12, 8, 6};
    assertArrayEquals(expectedArray, ProductOfArrayExceptSelf.productExceptSelf(testArray));
  }
}
