package leetcode75.stacks;

import java.util.Stack;

public class DecodeString {

  public static String decodeString(String s) {
    Stack<Integer> repeatTimes = new Stack<>();
    Stack<StringBuilder> contents = new Stack<>();
    StringBuilder repeatTimesBuffer = new StringBuilder();
    StringBuilder resultStringBuilder = new StringBuilder();
    for (char ch : s.toCharArray()) {
      if (Character.isDigit(ch)) {
        repeatTimesBuffer.append(ch);
      } else if (ch == '[') {
        repeatTimes.push(Integer.valueOf(repeatTimesBuffer.toString()));
        repeatTimesBuffer = new StringBuilder();
        contents.push(new StringBuilder());
      } else if (ch == ']') {
        String content = contents.pop().toString();
        Integer repeat = repeatTimes.pop();
        StringBuilder tempBuilder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
          tempBuilder.append(content);
        }
        if (contents.isEmpty()) {
          resultStringBuilder.append(tempBuilder);
        } else {
          contents.peek().append(tempBuilder);
        }
      } else {
        if (contents.isEmpty()) {
          resultStringBuilder.append(ch);
        } else {
          contents.peek().append(ch);
        }
      }
    }
    return resultStringBuilder.toString();
  }
}
