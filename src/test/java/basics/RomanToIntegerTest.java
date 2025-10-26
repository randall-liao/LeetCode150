package basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

  RomanToInteger solution = new RomanToInteger();

  @Test
  void romanToInt_example3() {
    String roman = "MCMXCIV";
    int expected = 1994;
    int result = solution.romanToInt(roman);
    assertEquals(expected, result);
  }
}
