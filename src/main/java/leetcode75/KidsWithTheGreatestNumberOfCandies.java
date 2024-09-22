package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

  public List<Boolean> kidWithCandies(int[] candies, int extraCandies) {
    if (candies == null || candies.length == 0 || extraCandies < 0) {
      throw new IllegalArgumentException();
    }
    List<Boolean> resultList = new ArrayList<>(candies.length);
    int currentMaxInt = Integer.MIN_VALUE;
    for (int candy : candies) {
      // find the max value in the candies array
      if (candy > currentMaxInt) {
        currentMaxInt = candy;
      }
    }
    for (int candy : candies) {
      // comparing if candy + extraCandy is greater or equals to the max number
      // constructing the result array
      if ((candy + extraCandies) >= currentMaxInt) {
        resultList.add(Boolean.TRUE);
      } else {
        resultList.add(Boolean.FALSE);
      }
    }
    return resultList;
  }
}
