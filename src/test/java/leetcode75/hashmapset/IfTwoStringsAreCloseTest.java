package leetcode75.hashmapset;

import static leetcode75.hashmapset.IfTwoStringsAreClose.closeStrings;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IfTwoStringsAreCloseTest {

  @Test
  void closeStrings_exampleOne() {
    String inputWord1 = "abc";
    String inputWord2 = "bca";
    boolean expected = true;
    assertEquals(expected, closeStrings(inputWord1, inputWord2));
  }

  @Test
  void closeStrings_exampleTwo() {
    String inputWord1 = "a";
    String inputWord2 = "aa";
    boolean expected = false;
    assertEquals(expected, closeStrings(inputWord1, inputWord2));
  }

  @Test
  void closeStrings_exampleThree() {
    String inputWord1 = "cabbba";
    String inputWord2 = "abbccc";
    boolean expected = true;
    assertEquals(expected, closeStrings(inputWord1, inputWord2));
  }

  @Test
  void closeStrings_exampleFour() {
    String inputWord1 = "aaabbbbccddeeeeefffff";
    // 342255
    // 523344
    String inputWord2 = "aaaaabbcccdddeeeeffff";
    boolean expected = false;
    assertEquals(expected, closeStrings(inputWord1, inputWord2));
  }

  @Test
  void closeStrings_twoWorldContainDifferentCharacter() {
    String inputWord1 = "qwe";
    String inputWord2 = "asd";
    boolean expected = false;
    assertEquals(expected, closeStrings(inputWord1, inputWord2));
  }
}
