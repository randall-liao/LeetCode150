package leetcode75.stacks;

import static leetcode75.stacks.RemovingStarsFromString.removeStars;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemovingStarsFromStringTest {

  @Test
  void removeStars_exampleOne() {
    String inputString = "leet**cod*e";
    String expected = "lecoe";
    assertEquals(expected, removeStars(inputString));
  }

  @Test
  void removeStars_exampleTwo() {
    String inputString = "erase*****";
    String expected = "";
    assertEquals(expected, removeStars(inputString));
  }

  @Test
  void removeStars_noStarInString() {
    String inputString = "erase";
    String expected = "erase";
    assertEquals(expected, removeStars(inputString));
  }

  @Test
  void removeStars_onlyStarInString() {
    String inputString = "*****";
    String expected = "";
    assertEquals(expected, removeStars(inputString));
  }

  @Test
  void removeStars_starMoreThanCharacter() {
    String inputString = "a*****";
    String expected = "";
    assertEquals(expected, removeStars(inputString));
  }
}
