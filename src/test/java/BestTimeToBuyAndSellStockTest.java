import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {

  @Test
  public void maxProfitBruteForceCase1() {
    int[] prices = {7, 1, 5, 3, 6, 4};
    int expected = 5;
    assertEquals(expected, BestTimeToBuyAndSellStock.maxProfitBruteForce(prices));
  }

  @Test
  public void maxProfitBruteForceCase2() {
    int[] prices = {7, 6, 4, 3, 1};
    int expected = 0;
    assertEquals(expected, BestTimeToBuyAndSellStock.maxProfitBruteForce(prices));
  }
}
