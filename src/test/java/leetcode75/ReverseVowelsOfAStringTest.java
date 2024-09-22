package leetcode75;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ReverseVowelsOfAStringTest {

  private final ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();

  @Test
  void reverseVowels_nullInput_expectedIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> reverseVowelsOfAString.reverseVowels(null));
  }

  @Test
  void reverseVowels_nonAsciiInput_expectedIllegalArgumentException() {
    String inputString = "测试";
    assertThrows(
        IllegalArgumentException.class, () -> reverseVowelsOfAString.reverseVowels(inputString));
  }

  @Test
  void reverseVowels_emptyStringInput_expectedEmptyStringReturn() {
    String inputString = "";
    String expectedOutputString = "";
    assertEquals(reverseVowelsOfAString.reverseVowels(inputString), expectedOutputString);
  }

  @Test
  void reverseVowels_mixedUpperAndLowerCaseIceCreAmInput_expectedAceCreImStringReturn() {
    String inputString = "IceCreAm";
    String expectedOutputString = "AceCreIm";
    assertEquals(reverseVowelsOfAString.reverseVowels(inputString), expectedOutputString);
  }

  @Test
  void reverseVowels_allLowerCaseLeetcodeInput_expectedLeotcedeStringReturn() {
    String inputString = "leetcode";
    String expectedOutputString = "leotcede";
    assertEquals(reverseVowelsOfAString.reverseVowels(inputString), expectedOutputString);
  }

  @Test
  void reverseVowels_allUpperCaseLeetcodeInput_expectedLeotcedeStringReturn() {
    String inputString = "LEETCODE";
    String expectedOutputString = "LEOTCEDE";
    assertEquals(reverseVowelsOfAString.reverseVowels(inputString), expectedOutputString);
  }
}
