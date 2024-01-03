public class BestTimeToBuyAndSellStock {
    public static int maxProfitBruteForce(int[] prices) {
        int lowestBuyingPrice = Integer.MAX_VALUE;
        int potentialProfit = 0;
        for (int sellPrice : prices) {
            if (sellPrice < lowestBuyingPrice) {
                lowestBuyingPrice = sellPrice;
            }
            if (potentialProfit < sellPrice - lowestBuyingPrice) {
                potentialProfit = sellPrice - lowestBuyingPrice;
            }
        }
        return potentialProfit;
    }
}
