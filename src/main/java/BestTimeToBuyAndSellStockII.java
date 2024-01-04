
public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        // Need some discussion.
        // It is impossible to sell stock on first day, set -infinity as initial value for cur_hold
        int hold = Integer.MIN_VALUE, notHold = 0;
        for( int currentPrice : prices ){
            int prevHold = hold, prevNotHold = notHold;
            // either keep hold, or buy in stock today at stock price
            hold = Math.max(prevHold, prevNotHold - currentPrice);
            // either keep not-hold, or sell out stock today at stock price
            notHold = Math.max(prevNotHold, prevHold + currentPrice);
        }
        // maximum profit must be in not-hold state
        return notHold;
    }
}
