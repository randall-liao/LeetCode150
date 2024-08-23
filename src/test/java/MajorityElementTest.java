import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    @Test
    public void majorityElementNaiveExample1() {
        int[] nums = {3,2,3};
        int expected = 3;
        assertEquals(expected,MajorityElement.majorityElementNaive(nums));
    }

    @Test
    public void majorityElementNaiveExample2() {
        int[] nums = {2,2,1,1,1,2,2};
        int expected = 2;
        assertEquals(expected,MajorityElement.majorityElementNaive(nums));
    }

    @Test
    public void majorityElementNaiveExample3() {
        int[] nums = {3,3,4};
        int expected = 3;
        assertEquals(expected,MajorityElement.majorityElementNaive(nums));
    }
}