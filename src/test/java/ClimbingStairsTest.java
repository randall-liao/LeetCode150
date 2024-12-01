import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

  @Test
  void climbingStairs_exampleOne() {
    int input = 1;
    int expected = 1;
    assertEquals(expected, ClimbingStairs.climbingStairs(input));
  }

  @Test
  void climbingStairs_exampleTwo() {
    int input = 2;
    int expected = 2;
    assertEquals(expected, ClimbingStairs.climbingStairs(input));
  }

  @Test
  void climbingStairs_exampleThree() {
    int input = 3;
    int expected = 3;
    assertEquals(expected, ClimbingStairs.climbingStairs(input));
  }

  @Test
  void climbingStairs_exampleFour() {
    int input = 4;
    int expected = 5;
    assertEquals(expected, ClimbingStairs.climbingStairs(input));
  }
}
