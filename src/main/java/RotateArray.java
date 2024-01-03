import java.util.ArrayList;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        if (k >= nums.length) {
            k = k % nums.length;
        }
        ArrayList<Integer> afterArrayList = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i + nums.length - k < nums.length) {
                afterArrayList.add(nums[i + nums.length - k]);
            } else {
                afterArrayList.add(nums[i - k]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = afterArrayList.get(i);
        }
        return nums;
    }
}
