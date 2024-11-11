package leetcode75.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumVowelsSubstringTest {

  MaximumVowelsSubstring maxV = new MaximumVowelsSubstring();

  @Test
  void maxVowels_exampleOne() {
    String inputString = "abciiidef";
    int k = 3;
    int expected = 3;
    assertEquals(expected, maxV.maxVowels(inputString, k));
  }

  @Test
  void maxVowels_allVowels() {
    String inputString = "aaaaaa";
    int k = 3;
    int expected = 3;
    assertEquals(expected, maxV.maxVowels(inputString, k));
  }

  @Test
  void maxVowels_alternatingVowels() {
    String inputString = "awawawawawawa";
    int k = 3;
    int expected = 2;
    assertEquals(expected, maxV.maxVowels(inputString, k));
  }

  @Test
  void maxVowels_noVowels() {
    String inputString = "wwwwwww";
    int k = 3;
    int expected = 0;
    assertEquals(expected, maxV.maxVowels(inputString, k));
  }

  @Test
  void maxVowels_noVowelsWindowSizeEqualsInputStringLength() {
    String inputString = "www";
    int k = 3;
    int expected = 0;
    assertEquals(expected, maxV.maxVowels(inputString, k));
  }

  @Test
  void maxVowels_alternatingVowelsWindowSizeEqualsInputStringLength() {
    String inputString = "awa";
    int k = 3;
    int expected = 2;
    assertEquals(expected, maxV.maxVowels(inputString, k));
  }

  @Test
  void maxVowels_allVowelsWindowSizeEqualsInputStringLength() {
    String inputString = "aaa";
    int k = 3;
    int expected = 3;
    assertEquals(expected, maxV.maxVowels(inputString, k));
  }

  @Test
  void maxVowels_allVowelsInTail() {
    String inputString = "wwwwwwwwaaa";
    int k = 3;
    int expected = 3;
    assertEquals(expected, maxV.maxVowels(inputString, k));
  }

  @Test
  void maxVowels_allVowelsInHead() {
    String inputString = "aaawwwwwwwwwww";
    int k = 3;
    int expected = 3;
    assertEquals(expected, maxV.maxVowels(inputString, k));
  }

  @Test
  void maxVowels_exampleThree() {
    String inputString = "tnfazcwrryitgacaabwm";
    int k = 4;
    int expected = 3;
    assertEquals(expected, maxV.maxVowels(inputString, k));
  }
}
