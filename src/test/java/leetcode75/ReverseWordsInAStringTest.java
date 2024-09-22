package leetcode75;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ReverseWordsInAStringTest {

  private final ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();

  @Test
  void reverseWords_nullInput_expectedIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> reverseWordsInAString.reverseWords(null));
  }

  @Test
  void reverseWords_emptyString_expectedEmptyString() {
    assertEquals("", reverseWordsInAString.reverseWords(""));
  }

  @Test
  void reverseWords_blankString_expectedEmptyString() {
    assertEquals("", reverseWordsInAString.reverseWords("    "));
  }

  @Test
  void reverseWords_normalSentence_expectedReversedSentence() {
    assertEquals("blue is sky the", reverseWordsInAString.reverseWords("the sky is blue"));
  }

  @Test
  void reverseWords_multipleBlankSpaceBetweenWords_expectedReversedSentence() {
    assertEquals("example good a", reverseWordsInAString.reverseWords("a good   example"));
  }

  @Test
  void reverseWords_multipleBlankSpaceAtHeadAndTail_expectedReversedSentence() {
    assertEquals("blue is sky the", reverseWordsInAString.reverseWords("   the sky is blue  "));
  }

  @Test
  void reverseWords_oneBlankSpaceAtHeadAndTail_expectedReversedSentence() {
    assertEquals("blue is sky the", reverseWordsInAString.reverseWords(" the sky is blue "));
  }
}
