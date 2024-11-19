package leetcode75.hashmapset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOccurrences {

  public static boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> uniqueKeyCounter = new HashMap<>();
    for (int num : arr) {
      uniqueKeyCounter.put(num, uniqueKeyCounter.getOrDefault(num, 0) + 1);
    }
    Set<Integer> uniqueValue = new HashSet<>();
    // converting
    for (Integer v : uniqueKeyCounter.values()) {
      if (!uniqueValue.add(v)) {
        return false;
      }
    }
    return true;
  }
}
