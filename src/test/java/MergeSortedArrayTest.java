
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {

    @Test
    public void naiveMergeExample1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        final int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, MergeSortedArray.naive_merge(nums1, m, nums2, n));
    }

    @Test
    public void naiveMergeExample2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};
        assertArrayEquals(expected, MergeSortedArray.naive_merge(nums1, m, nums2, n));
    }

    @Test
    public void naiveMergeExample3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        assertArrayEquals(expected, MergeSortedArray.naive_merge(nums1, m, nums2, n));
    }

    @Test
    public void mergeExample1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        final int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, MergeSortedArray.merge(nums1, m, nums2, n));
    }

    @Test
    public void mergeExample2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};
        assertArrayEquals(expected, MergeSortedArray.merge(nums1, m, nums2, n));
    }

    @Test
    public void mergeExample3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        assertArrayEquals(expected, MergeSortedArray.merge(nums1, m, nums2, n));
    }
}