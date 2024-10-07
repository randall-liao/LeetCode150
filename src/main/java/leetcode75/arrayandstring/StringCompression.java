package leetcode75.arrayandstring;

public class StringCompression {

  public static int compress(char[] chars) {
    if (chars == null || chars.length == 0) {
      return 0;
    }
    StringBuilder resultStringBuilder = new StringBuilder();
    char previousChar = chars[0];
    int repeatCharCounterInt = 0;
    for (char ch : chars) {
      // iterate through char array
      if (previousChar == ch) {
        // repeating Char
        repeatCharCounterInt++;
      } else {
        // find a different char, write result into the StringBuilder and reset
        add(previousChar, repeatCharCounterInt, resultStringBuilder);
        previousChar = ch;
        repeatCharCounterInt = 1;
      }
    }
    add(chars[chars.length - 1], repeatCharCounterInt, resultStringBuilder);
    for (int i = 0; i < resultStringBuilder.length(); i++) {
      // Write the result back into chars array as the prompt required.
      chars[i] = resultStringBuilder.charAt(i);
    }
    return resultStringBuilder.length();
  }

  private static void add(char ch, int repeatCharCounterInt, StringBuilder resultStringBuilder) {
    resultStringBuilder.append(ch);
    if (repeatCharCounterInt > 1) {
      resultStringBuilder.append(repeatCharCounterInt);
    }
  }
}
