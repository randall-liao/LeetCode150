import java.util.Arrays;

public class MergeSortedArray {


    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            return nums2;
        } else if (n == 0) {
            return nums1;
        }
        int[] ret_int_array = new int[m + n];
        int nums1_pointer = 0;
        int nums2_pointer = 0;
        while (nums1_pointer < m || nums2_pointer < n) {
            int num1 = nums1[nums1_pointer];
            int num2 = nums2[nums2_pointer];
            if (nums1_pointer == m) {
                ret_int_array[nums1_pointer + nums2_pointer] = num2;
                nums2_pointer++;
            } else if (nums2_pointer == n) {
                ret_int_array[nums1_pointer + nums2_pointer] = num1;
                nums1_pointer++;
            } else if (num1 == num2) {
                ret_int_array[nums1_pointer + nums2_pointer] = num1;
                nums1_pointer++;
            } else if (num1 < num2) {
                ret_int_array[nums1_pointer + nums2_pointer] = num1;
                nums1_pointer++;
            } else if (num2 < num1) {
                ret_int_array[nums1_pointer + nums2_pointer] = num2;
                nums2_pointer++;
            }
        }
        return ret_int_array;

    }

    public static int[] naive_merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }

    // Two pointer reference solution
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;

            while (j >= 0) {
                if (i >= 0 && nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }
        }
    }
}
