import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockIITest {

  @Test
  public void maxProfitCase0() {
    int[] prices = {20, 1, 100, 20, 1, 1000};
    int expected = 1098;
    assertEquals(expected, BestTimeToBuyAndSellStockII.maxProfit(prices));
  }

  @Test
  public void maxProfitCase1() {
    int[] prices = {7, 1, 5, 3, 6, 4};
    int expected = 7;
    assertEquals(expected, BestTimeToBuyAndSellStockII.maxProfit(prices));
  }

  @Test
  public void maxProfitCase2() {
    int[] prices = {1, 2, 3, 4, 5};
    int expected = 4;
    assertEquals(expected, BestTimeToBuyAndSellStockII.maxProfit(prices));
  }

  @Test
  public void maxProfitCase3() {
    int[] prices = {7, 6, 4, 3, 1};
    int expected = 0;
    assertEquals(expected, BestTimeToBuyAndSellStockII.maxProfit(prices));
  }

  @Test
  public void maxProfitCaseEmpty0() {
    int[] prices = {};
    int expected = 0;
    assertEquals(expected, BestTimeToBuyAndSellStockII.maxProfit(prices));
  }

  @Test
  public void maxProfitCaseEmpty1() {
    int[] prices = {1};
    int expected = 0;
    assertEquals(expected, BestTimeToBuyAndSellStockII.maxProfit(prices));
  }
}
