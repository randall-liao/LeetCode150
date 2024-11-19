package leetcode75.hashmapset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class FindDifferenceTwoArray {

  public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    HashSet<Integer> numsNotInOne = new HashSet<>();
    HashSet<Integer> numsNotInTwo = new HashSet<>();
    HashSet<Integer> numsOneHashSet = new HashSet<>();
    HashSet<Integer> numsTwoHashSet = new HashSet<>();
    // converting int array to hashset
    for (int num : nums1) {
      numsOneHashSet.add(num);
    }
    for (int num : nums2) {
      numsTwoHashSet.add(num);
    }
    // identifying which number is not in the other array
    for (int num : nums1) {
      if (!numsTwoHashSet.contains(num)) {
        numsNotInOne.add(num);
      }
    }
    for (int num : nums2) {
      if (!numsOneHashSet.contains(num)) {
        numsNotInTwo.add(num);
      }
    }
    List<Integer> numsNotInOneList = new ArrayList<>(numsNotInOne);
    List<Integer> numsNotInTwoList = new ArrayList<>(numsNotInTwo);
    List<List<Integer>> resultList = new LinkedList<>();
    resultList.add(numsNotInOneList);
    resultList.add(numsNotInTwoList);
    return resultList;
  }
}
