package leetcode75;

public class MergeStringsAlternately {

  public String mergeAlternately(String word1, String word2) {
    if (word1 == null || word2 == null) {
      throw new NullPointerException();
    }
    int word1Length = word1.length();
    int word2Length = word2.length();
    StringBuilder stringBuilder = new StringBuilder(word1Length + word2Length);
    int index = 0;
    int indexWord1 = 0;
    int indexWord2 = 0;
    while (index < word1Length + word2Length) {
      if (indexWord1 < word1Length) {
        stringBuilder.append(word1.charAt(indexWord1));
        indexWord1++;
        index++;
      }
      if (indexWord2 < word2Length) {
        stringBuilder.append(word2.charAt(indexWord2));
        indexWord2++;
        index++;
      }
    }
    return stringBuilder.toString();
  }
}
