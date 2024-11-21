package leetcode75.stacks;

import java.util.Stack;

public class RemovingStarsFromString {

  public static String removeStars(String s) {
    Stack<Character> removeStack = new Stack<>();
    for (Character ch : s.toCharArray()) {
      if (ch.equals('*')) {
        if (!removeStack.isEmpty()) {
          removeStack.pop();
        }
      } else {
        removeStack.push(ch);
      }
    }
    StringBuilder retStrBuilder = new StringBuilder(removeStack.size());
    while (!removeStack.isEmpty()) {
      retStrBuilder.append(removeStack.pop());
    }
    String str = "";
    return retStrBuilder.reverse().toString();
  }
}
