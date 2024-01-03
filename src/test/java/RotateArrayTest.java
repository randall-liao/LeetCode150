import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {

    @Test
    public void rotateCase0() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(expected, RotateArray.rotate(nums, k));
    }

    @Test
    public void rotateCase1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 1;
        int[] expected = {7, 1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, RotateArray.rotate(nums, k));
    }

    @Test
    public void rotateCase2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        int[] expected = {6, 7, 1, 2, 3, 4, 5};
        assertArrayEquals(expected, RotateArray.rotate(nums, k));
    }

    @Test
    public void rotateCase3() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        int[] expected = {3, 99, -1, -100};
        assertArrayEquals(expected, RotateArray.rotate(nums, k));
    }

    @Test
    public void zeroRotate() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 0;
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected, RotateArray.rotate(nums, k));
    }

    @Test
    public void rotateCase4() {
        int[] nums = {1, 2};
        int k = 3;
        int[] expected = {2, 1};
        assertArrayEquals(expected, RotateArray.rotate(nums, k));
    }

    @Test
    public void rotateCase5() {
        int[] nums = {1, 2, 3};
        int k = 4;
        int[] expected = {3,1,2};
        assertArrayEquals(expected, RotateArray.rotate(nums, k));
    }

    @Test
    public void rotateCase6() {
        int[] nums = {1, 2};
        int k = 5;
        int[] expected = {2, 1};
        assertArrayEquals(expected, RotateArray.rotate(nums, k));
    }
}