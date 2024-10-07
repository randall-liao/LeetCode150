package leetcode75.arrayandstring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCompressionTest {

  @Test
  void compress_nullInput_expectedZero() {
    char[] inputCharArray = null;
    int expectedInt = 0;
    assertEquals(expectedInt, StringCompression.compress(inputCharArray));
  }

  @Test
  void compress_emptyInput_expectedZero() {
    char[] inputCharArray = {};
    int expectedInt = 0;
    assertEquals(expectedInt, StringCompression.compress(inputCharArray));
  }

  @Test
  void compress_example1() {
    char[] inputCharArray = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    int expectedInt = 6;
    assertEquals(expectedInt, StringCompression.compress(inputCharArray));
  }

  @Test
  void compress_example2() {
    char[] inputCharArray = {'a'};
    int expectedInt = 1;
    assertEquals(expectedInt, StringCompression.compress(inputCharArray));
  }

  @Test
  void compress_example3() {
    char[] inputCharArray = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    int expectedInt = 4;
    assertEquals(expectedInt, StringCompression.compress(inputCharArray));
  }

  @Test
  void compress_sameChar_expectedOneCharWithRepeatTimes() {
    char[] inputCharArray = {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    int expectedInt = 3;
    assertEquals(expectedInt, StringCompression.compress(inputCharArray));
  }

  @Test
  void compress_AlternateTwoRepeatChar_expect() {
    char[] inputCharArray = {'a', 'a', 'b', 'b'};
    int expectedInt = 4;
    assertEquals(expectedInt, StringCompression.compress(inputCharArray));
  }

  @Test
  void compress_example4() {
    char[] inputCharArray = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    int expectedInt = 6;
    assertEquals(expectedInt, StringCompression.compress(inputCharArray));
  }
}
