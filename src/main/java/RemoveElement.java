import java.util.ArrayList;
import java.util.Collections;

public class RemoveElement {
  public static int removeElement(int[] nums, int val) {
    ArrayList<Integer> removedArrayList = new ArrayList<>();
    for (int num : nums) {
      if (num != val) {
        removedArrayList.add(num);
      }
    }
    Collections.sort(removedArrayList);
    for (int i = 0; i < removedArrayList.size(); i++) {
      nums[i] = removedArrayList.get(i);
    }
    return removedArrayList.size();
  }

  // reference

  public int removeElementRef(int[] nums, int val) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index] = nums[i]; // ?
        index++;
      }
    }
    return index;
  }
}
