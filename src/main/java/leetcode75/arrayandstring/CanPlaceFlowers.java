package leetcode75.arrayandstring;

public class CanPlaceFlowers {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if (flowerbed == null) throw new IllegalArgumentException("input array is null");
    int numberOfPlots = flowerbed.length;
    if (numberOfPlots == 0) {
      // check if the case when plots
      return false;
    }
    // Check if required number is greater than max capacity assume all plots are empty
    int maxCapacityOfFlower = numberOfPlots % 2 == 0 ? numberOfPlots / 2 : numberOfPlots / 2 + 1;
    if (maxCapacityOfFlower < n) return false;
    if (numberOfPlots == 1 && flowerbed[0] == 0) return true;
    // Find empty spots for planting
    int numberOfPotentialPlots = 0;
    if (flowerbed[0] == 0 && flowerbed[1] == 0) {
      numberOfPotentialPlots++; // check left edge
      flowerbed[0] = 1;
    }
    for (int i = 1; i < numberOfPlots - 2; i++) {
      // Iterator through the array and check if 3 consecutive empty plots exists;
      if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
        flowerbed[i] = 1;
        numberOfPotentialPlots++;
      }
    }
    if (flowerbed[numberOfPlots - 1] == 0 && flowerbed[numberOfPlots - 2] == 0) {
      numberOfPotentialPlots++; // check right edge
      flowerbed[numberOfPlots - 1] = 1;
    }
    return numberOfPotentialPlots >= n;
  }
}
