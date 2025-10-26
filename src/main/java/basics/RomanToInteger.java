package basics;

import java.util.Map;

public class RomanToInteger {

  private static final Map<String, Integer> romanToIntMap;

  static {
    romanToIntMap = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000);
  }

  public int romanToInt(String s) {
    char[] chars = s.toCharArray();
    // String to Integer
    int charsLength = chars.length;
    int result = 0;
    for (int i = charsLength - 1; i >= 0; i--) {
      if (i < charsLength - 1
          && romanToIntMap.get(String.valueOf(chars[i]))
              < romanToIntMap.get(String.valueOf(chars[i + 1]))) {
        // handle cases when the current place is smaller than the previous place, e.g. IV (4), IX
        // (9) ...
        result -= romanToIntMap.get(String.valueOf(chars[i]));
      } else {
        result += romanToIntMap.get(String.valueOf(chars[i]));
      }
    }
    return result;
  }
}
