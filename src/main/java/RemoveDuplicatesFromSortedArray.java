import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
  public static int removeDuplicates(int[] nums) {
    ArrayList<Integer> removedArrayList = new ArrayList<>();
    Integer refInt = nums[0];
    removedArrayList.add(refInt);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != refInt) {
        removedArrayList.add(nums[i]);
        refInt = nums[i];
      }
    }
    for (int i = 0; i < removedArrayList.size(); i++) {
      nums[i] = removedArrayList.get(i);
    }
    return removedArrayList.size();
  }

  // reference
  public int referenceRemoveElement(int[] nums, int val) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index] = nums[i];
        index++;
      }
    }
    return index;
  }
}
