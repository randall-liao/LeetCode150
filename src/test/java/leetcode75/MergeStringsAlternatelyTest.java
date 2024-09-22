package leetcode75;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MergeStringsAlternatelyTest {

  private final MergeStringsAlternately mergeStringsAlternatelyDefault;

  MergeStringsAlternatelyTest() {
    mergeStringsAlternatelyDefault = new MergeStringsAlternately();
  }

  @Test
  void mergeAlternately_nullInput_throwException() {
    assertThrows(
        NullPointerException.class,
        () -> {
          mergeStringsAlternatelyDefault.mergeAlternately(null, null);
        });

    assertThrows(
        NullPointerException.class,
        () -> {
          mergeStringsAlternatelyDefault.mergeAlternately(null, "1");
        });

    assertThrows(
        NullPointerException.class,
        () -> {
          mergeStringsAlternatelyDefault.mergeAlternately("2", null);
        });
  }

  @Test
  void mergeAlternately_equalLengthInput() {
    assertEquals("apbqcr", mergeStringsAlternatelyDefault.mergeAlternately("abc", "pqr"));
  }

  @Test
  void mergeAlternately_emptyInput() {
    assertEquals("", mergeStringsAlternatelyDefault.mergeAlternately("", ""));
  }

  @Test
  void mergeAlternately_leftShortInput() {
    assertEquals("apbqrs", mergeStringsAlternatelyDefault.mergeAlternately("ab", "pqrs"));
  }

  @Test
  void mergeAlternately_rightShortInput() {
    assertEquals("apbqcd", mergeStringsAlternatelyDefault.mergeAlternately("abcd", "pq"));
  }
}
