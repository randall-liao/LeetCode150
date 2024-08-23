import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JumpGameIITest {

    @Test
    public void jumpCase0() {
        int[] inputIntArray = {0};
        int expectedInt = 0;
        assertEquals(expectedInt, JumpGameII.jump(inputIntArray));
    }

    @Test
    public void jumpCase1() {
        int[] inputIntArray = {2,3,1,1,4};
        int expectedInt = 2;
        assertEquals(expectedInt, JumpGameII.jump(inputIntArray));
    }

    @Test
    public void jumpCase2() {
        int[] inputIntArray = {2,3,0,1,4};
        int expectedInt = 2;
        assertEquals(expectedInt, JumpGameII.jump(inputIntArray));
    }

    @Test
    public void jumpCase3() {
        int[] inputIntArray = {100,3,0,1,4};
        int expectedInt = 1;
        assertEquals(expectedInt, JumpGameII.jump(inputIntArray));
    }

    @Test
    public void jumpCase4() {
        int[] inputIntArray = {1,1,1,1,1};
        int expectedInt = 4;
        assertEquals(expectedInt, JumpGameII.jump(inputIntArray));
    }
}