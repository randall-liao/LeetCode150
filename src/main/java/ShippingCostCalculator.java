public class ShippingCostCalculator {

  /**
   * Calculates the total cost of items purchased from an online shop, applying a shipping fee
   * according to free shipping threshold.
   *
   * @param cost An array of integers representing the cost of each individual item.
   * @param N The number of items in the `cost` array (not used in the calculation). * @param
   *     shipping The shipping cost to be added if the total item cost is less than `x`.
   * @param x The threshold value. If the total item cost is strictly less than this value, the
   *     shipping cost is added.
   * @return The total cost of the items, potentially including the shipping cost, based on whether
   *     the item total is less than the threshold `x`.
   */
  public static int solution(int[] cost, int N, int shipping, int x) {
    // calculate total cost of items
    int totalCost = 0;
    for (int itemCost : cost) {
      totalCost += itemCost;
    }

    if (totalCost < x) {
      totalCost += shipping;
    }
    return totalCost;
  }

  public static void main(String[] args) {
    int[] costs = new int[] {10, 20, 30};
    int N = costs.length;
    int shipping = 15;
    int x = 70;
  }
}
