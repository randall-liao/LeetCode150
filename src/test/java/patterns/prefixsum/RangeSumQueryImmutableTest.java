package patterns.prefixsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RangeSumQueryImmutableTest {
  private RangeSumQueryImmutable numArray;

  @BeforeEach
  void setUp() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    numArray = new RangeSumQueryImmutable(nums);
  }

  @Test
  void testSumRange_Example1_0_2() {
    assertEquals(1, numArray.sumRange(0, 2));
  }

  @Test
  void testSumRange_Example1_2_5() {
    assertEquals(-1, numArray.sumRange(2, 5));
  }

  @Test
  void testSumRange_Example1_0_5() {
    assertEquals(-3, numArray.sumRange(0, 5));
  }

  @Test
  void testSumRange_SingleElement() {
    int[] nums = {5};
    RangeSumQueryImmutable numArray = new RangeSumQueryImmutable(nums);
    assertEquals(5, numArray.sumRange(0, 0));
  }

  @Test
  void testSumRange_AllNegative() {
    int[] nums = {-1, -2, -3};
    RangeSumQueryImmutable numArray = new RangeSumQueryImmutable(nums);
    assertEquals(-6, numArray.sumRange(0, 2));
    assertEquals(-5, numArray.sumRange(1, 2));
  }

  @Test
  void testSumRange_AllPositive() {
    int[] nums = {1, 2, 3};
    RangeSumQueryImmutable numArray = new RangeSumQueryImmutable(nums);
    assertEquals(6, numArray.sumRange(0, 2));
    assertEquals(5, numArray.sumRange(1, 2));
  }

  @Test
  void testSumRange_LeftEqualsRight() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    RangeSumQueryImmutable numArray = new RangeSumQueryImmutable(nums);
    assertEquals(3, numArray.sumRange(2, 2));
  }

  @Test
  void testSumRange_LargeValues() {
    int[] nums = {100000, -100000, 0, 50000, -50000};
    RangeSumQueryImmutable numArray = new RangeSumQueryImmutable(nums);
    assertEquals(0, numArray.sumRange(0, 1));
    assertEquals(0, numArray.sumRange(0, 4));
    assertEquals(0, numArray.sumRange(2, 4));
  }

  @Test
  void testSumRange_EdgeCase_RightAtEnd() {
    assertEquals(-3, numArray.sumRange(0, 5));
  }

  @Test
  void testSumRange_EdgeCase_LeftAtBeginning() {
    assertEquals(1, numArray.sumRange(0, 2));
  }

  @Test
  void testSumRange_MiddleRange() {
    assertEquals(0, numArray.sumRange(1, 4));
  }

  @Test
  void testConstructor_NullInput() {
    assertThrows(NullPointerException.class, () -> new RangeSumQueryImmutable(null));
  }

  @Test
  void testConstructor_EmptyInput() {
    int[] nums = {};
    assertThrows(NullPointerException.class, () -> new RangeSumQueryImmutable(nums));
  }
}
