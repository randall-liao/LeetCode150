package leetcode75.slidingwindow;

public class MaximumVowelsSubstring {

  private static boolean isVowels(char c) {
    return switch (c) {
      case 'a', 'o', 'i', 'e', 'u' -> true;
      default -> false;
    };
  }

  public int maxVowels(String s, int k) {
    char[] charArray = s.toCharArray();
    int maxVowelsCount = Integer.MIN_VALUE;
    int currentVowelsCount = 0;
    for (int endOfWindow = 0; endOfWindow < charArray.length; endOfWindow++) {
      if (currentVowelsCount < k && isVowels(charArray[endOfWindow])) {
        // when a vowel enters the array increment counter
        currentVowelsCount++;
      }
      if (endOfWindow >= k) {
        if (isVowels(charArray[endOfWindow - k]) && currentVowelsCount > 0) {
          // when a vowel exit the array decrement the counter
          currentVowelsCount--;
        }
      }
      if (currentVowelsCount > maxVowelsCount) {
        maxVowelsCount = currentVowelsCount;
      }
    }
    return maxVowelsCount;
  }
}
