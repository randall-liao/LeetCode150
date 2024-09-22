import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArrayII {
  public static int removeDuplicates(int[] nums) {
    if (nums.length < 2) {
      return nums.length;
    }
    ArrayList<Integer> removedArrayList = new ArrayList<>(nums.length);
    removedArrayList.add(nums[0]);
    removedArrayList.add(nums[1]);
    for (int i = 2; i < nums.length; i++) {
      if (nums[i] == nums[i - 2] && nums[i] == nums[i - 1]) {
        continue;
      } else {
        removedArrayList.add(nums[i]);
      }
    }
    for (int i = 0; i < removedArrayList.size(); i++) {
      nums[i] = removedArrayList.get(i);
    }
    return removedArrayList.size();
  }
}
