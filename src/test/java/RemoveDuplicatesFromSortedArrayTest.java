import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicatesExample1() {
        int[] nums = {1,1,2};
        int expected = 2;
        assertEquals(expected,RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
    }

    @Test
    public void removeDuplicatesExample2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int expected = 5;
        assertEquals(expected,RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
    }
}