
// TODO redo
public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        /*prices for holding stock, It has two options, buy stock at spot price
        (1. selling at last trading date and by today; or 2. holding cash on hand and buying today),
        or cash out the stock (1. selling stock at spot price, or 2. keeping cash)  */
        int lastHoldProfit = Integer.MIN_VALUE;
        int lastNotHoldProfit = 0; // price for not holding stock
        for (int price : prices) {
            lastHoldProfit = Math.max(lastHoldProfit, lastNotHoldProfit - price);
            lastNotHoldProfit = Math.max(lastNotHoldProfit, price + lastHoldProfit);
        }
        return lastNotHoldProfit;
    }
}
