package leetcode75.stacks;

import static leetcode75.stacks.DecodeString.decodeString;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecodeStringTest {

  @Test
  void decodeString_exampleOne() {
    String input = "3[a]2[bc]";
    String expected = "aaabcbc";
    assertEquals(expected, decodeString(input));
  }

  @Test
  void decodeString_exampleTwo() {
    String input = "3[a2[c]]";
    String expected = "accaccacc";
    assertEquals(expected, decodeString(input));
  }

  @Test
  void decodeString_exampleThree() {
    String input = "2[abc]3[cd]ef";
    String expected = "abcabccdcdcdef";
    assertEquals(expected, decodeString(input));
  }
}
