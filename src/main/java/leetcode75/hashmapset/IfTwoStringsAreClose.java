package leetcode75.hashmapset;

import java.util.*;

public class IfTwoStringsAreClose {

  public static boolean closeStrings(String word1, String word2) {
    Map<Character, Integer> charFrequencyMapWord1 = new HashMap<>();
    Map<Character, Integer> charFrequencyMapWord2 = new HashMap<>();
    for (Character ch : word1.toCharArray()) {
      charFrequencyMapWord1.put(ch, charFrequencyMapWord1.getOrDefault(ch, 0) + 1);
    }
    for (Character ch : word2.toCharArray()) {
      charFrequencyMapWord2.put(ch, charFrequencyMapWord2.getOrDefault(ch, 0) + 1);
    }
    boolean isCloseString = true;
    Set<Character> Word1CharacterSet = charFrequencyMapWord1.keySet();
    Set<Character> Word2CharacterSet = charFrequencyMapWord2.keySet();
    if (!Word1CharacterSet.equals(Word2CharacterSet)) {
      // Check if two words have same set of character
      isCloseString = false;
    }
    List<Integer> Word1CharacterFrequencyList = new ArrayList<>(charFrequencyMapWord1.values());
    List<Integer> Word2CharacterFrequencyList = new ArrayList<>(charFrequencyMapWord2.values());
    Collections.sort(Word1CharacterFrequencyList);
    Collections.sort(Word2CharacterFrequencyList);
    if (!Word1CharacterFrequencyList.equals(Word2CharacterFrequencyList)) {
      // Check if two words have same frequency for character
      isCloseString = false;
    }
    return isCloseString;
  }
}
