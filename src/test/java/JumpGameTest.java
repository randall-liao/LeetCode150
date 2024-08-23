import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpGameTest {

    @Test
    public void canJumpEmptyCase() {
        int[] example = {};
        boolean expected = false;
        assertEquals(expected, JumpGame.canJump(example));
    }

    @Test
    public void canJumpCase1() {
        int[] example = {2,3,1,1,4};
        boolean expected = true;
        assertEquals(expected, JumpGame.canJump(example));
    }

    @Test
    public void canJumpCase2() {
        int[] example = {3,2,1,0,4};
        boolean expected = false;
        assertEquals(expected, JumpGame.canJump(example));
    }

    @Test
    public void canJumpCase3() {
        int[] example = {3};
        boolean expected = true;
        assertEquals(expected, JumpGame.canJump(example));
    }

    @Test
    public void canJumpCase4() {
        int[] example = {3,2};
        boolean expected = true;
        assertEquals(expected, JumpGame.canJump(example));
    }

    @Test
    public void canJumpCase5() {
        int[] example = {3,2,1};
        boolean expected = true;
        assertEquals(expected, JumpGame.canJump(example));
    }

    @Test
    public void canJumpCase6() {
        int[] example = {3,2,1,0};
        boolean expected = true;
        assertEquals(expected, JumpGame.canJump(example));
    }

    @Test
    public void canJumpCase7() {
        int[] example = {0};
        boolean expected = true;
        assertEquals(expected, JumpGame.canJump(example));
    }

    @Test
    public void canJumpCase8() {
        int[] example = {2,5,0,0};
        boolean expected = true;
        assertEquals(expected, JumpGame.canJump(example));
    }

    @Test
    public void canJumpCase9() {
        int[] example = {2,5,0,0,0,0,0,0,0,0,0,0,0};
        boolean expected = false;
        assertEquals(expected, JumpGame.canJump(example));
    }

}