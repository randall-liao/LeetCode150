package leetcode75.twopointer;

public class IsSubsequence {

  public boolean isSubsequence(String s, String t) {
    // base case
    if (s == null || t == null) {
      return false;
    }
    if (s.isEmpty()) {
      return true;
    }
    int sPointer = 0;
    int tPointer = 0;
    while (sPointer < s.length() && tPointer < t.length()) {
      if (s.charAt(sPointer) == t.charAt(tPointer)) {
        sPointer++;
      }
      tPointer++;
    }
    // if all char in the substring was match once with exact order
    return sPointer >= s.length();
  }
}
