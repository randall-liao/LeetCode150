package leetcode75.arrayandstring;

public class ReverseWordsInAString {

  public static final char WORD_SEPARATOR = ' ';

  public String reverseWords(String s) {
    if (s == null) throw new IllegalArgumentException("Null input");
    if (s.isBlank()) return "";
    StringBuilder resultStringBuilder = new StringBuilder(s.length());
    int lastSeparatorIndex = s.length();
    for (int i = s.length() - 1; i >= 0; i--) {
      // iterate backward to find space in the string
      if (WORD_SEPARATOR == s.charAt(i)) {
        if (lastSeparatorIndex - i > 1) {
          // When there is no consecutive space, append all char between this and last space
          resultStringBuilder.append(s, i + 1, lastSeparatorIndex);
          resultStringBuilder.append(" ");
        }
        lastSeparatorIndex = i;
      }
    }
    if (WORD_SEPARATOR != s.charAt(0)) {
      // processing the first word of the string
      resultStringBuilder.append(s, 0, lastSeparatorIndex);
    }
    if (WORD_SEPARATOR == resultStringBuilder.charAt(resultStringBuilder.length() - 1)) {
      // trim the last space
      resultStringBuilder.deleteCharAt(resultStringBuilder.length() - 1);
    }
    return resultStringBuilder.toString();
  }
}
