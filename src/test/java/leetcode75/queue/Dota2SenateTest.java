package leetcode75.queue;

import static leetcode75.queue.Dota2Senate.predictPartyVictory;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Dota2SenateTest {

  @Test
  void predictPartyVictory_exampleOne() {
    String input = "RD";
    String expected = "Radiant";
    assertEquals(expected, predictPartyVictory(input));
  }

  @Test
  void predictPartyVictory_exampleTwo() {
    String input = "RDD";
    String expected = "Dire";
    assertEquals(expected, predictPartyVictory(input));
  }

  @Test
  void predictPartyVictory_exampleThree() {
    String input = "DRRDRDRDRDDRDRDR";
    String expected = "Radiant";
    assertEquals(expected, predictPartyVictory(input));
  }
}
