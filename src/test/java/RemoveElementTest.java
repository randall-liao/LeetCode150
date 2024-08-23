import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {

    @Test
    public void removeElementExample1() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int expected = 2;
        assertEquals(expected,RemoveElement.removeElement(nums,val));
    }

    @Test
    public void removeElementExample2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int expected = 5;
        assertEquals(expected,RemoveElement.removeElement(nums,val));
    }
}