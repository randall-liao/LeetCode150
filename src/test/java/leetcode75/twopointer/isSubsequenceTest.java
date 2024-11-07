package leetcode75.twopointer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isSubsequenceTest {

  IsSubsequence testClass = new IsSubsequence();

  @Test
  void isSubsequence_NullInput() {
    String inputStringS = null;
    String inputStringT = "ahbgdc";
    boolean expectedResult = false;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringS, inputStringT));
    String inputStringSS = "abs";
    String inputStringTT = null;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringSS, inputStringTT));
  }

  @Test
  void isSubsequence_ExampleOne() {
    String inputStringS = "abc";
    String inputStringT = "ahbgdc";
    boolean expectedResult = true;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringS, inputStringT));
  }

  @Test
  void isSubsequence_ExampleTwo() {
    String inputStringS = "axc";
    String inputStringT = "ahbgdc";
    boolean expectedResult = false;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringS, inputStringT));
  }

  @Test
  void isSubsequence_twoEmptyInput() {
    String inputStringS = "";
    String inputStringT = "";
    boolean expectedResult = true;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringS, inputStringT));
  }

  @Test
  void isSubsequence_emptySubStringInput() {
    String inputStringS = "";
    String inputStringT = "aaaaa";
    boolean expectedResult = true;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringS, inputStringT));
  }

  @Test
  void isSubsequence_emptySuperStringInput() {
    String inputStringS = "ssss";
    String inputStringT = "";
    boolean expectedResult = false;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringS, inputStringT));
  }

  @Test
  void isSubsequence_identicalString() {
    String inputStringS = "abc";
    String inputStringT = "abc";
    boolean expectedResult = true;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringS, inputStringT));
  }

  @Test
  void isSubsequence_longerSubString() {
    String inputStringS = "abcdef";
    String inputStringT = "abc";
    boolean expectedResult = false;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringS, inputStringT));
  }

  @Test
  void isSubsequence_outOfOrderSubString() {
    String inputStringS = "abc";
    String inputStringT = "acb";
    boolean expectedResult = false;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringS, inputStringT));
  }

  @Test
  void isSubsequence_singleCharRepeatsString() {
    String inputStringS = "a";
    String inputStringT = "aaaaacb";
    boolean expectedResult = true;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringS, inputStringT));
  }

  @Test
  void isSubsequence_repeatingSequenceString() {
    String inputStringS = "abc";
    String inputStringT = "abcabc";
    boolean expectedResult = true;
    assertEquals(expectedResult, testClass.isSubsequence(inputStringS, inputStringT));
  }
}
