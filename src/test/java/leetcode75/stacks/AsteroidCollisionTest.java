package leetcode75.stacks;

import static leetcode75.stacks.AsteroidCollision.asteroidCollision;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsteroidCollisionTest {

  @Test
  void asteroidCollision_exampleOne() {
    int[] inputInts = {5, 10, -5};
    int[] expected = {5, 10};
    assertArrayEquals(expected, asteroidCollision(inputInts));
  }

  @Test
  void asteroidCollision_exampleTwo() {
    int[] inputInts = {8, -8};
    int[] expected = {};
    assertArrayEquals(expected, asteroidCollision(inputInts));
  }

  @Test
  void asteroidCollision_exampleThree() {
    int[] inputInts = {10, 2, -5};
    int[] expected = {10};
    assertArrayEquals(expected, asteroidCollision(inputInts));
  }
}
