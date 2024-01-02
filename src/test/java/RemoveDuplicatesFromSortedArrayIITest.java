import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayIITest {

    @Test
    public void removeDuplicatesExample1() {
        int[] nums = {1,1,1,2,2,3};
        int expected = 5;
        assertEquals(expected,RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums));
    }

    @Test
    public void removeDuplicatesExample2() {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int expected = 7;
        assertEquals(expected,RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums));
    }

    @Test
    public void removeDuplicatesEmptyCase() {
        int[] nums = {};
        int expected = 0;
        assertEquals(expected,RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums));
    }

    @Test
    public void removeDuplicatesShortArray() {
        int[] nums = {1};
        int expected = 1;
        assertEquals(expected,RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums));
    }
}