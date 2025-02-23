package leetcode75.graphs.dfs;

import java.util.Arrays;

public class NumberOfProvinces {

  public int findCircleNum(int[][] isConnected) {
    Boolean[] isCityVisited = new Boolean[isConnected.length];
    Arrays.fill(isCityVisited, false);
    int provincesCount = 0;
    for (int cityIndex = 0; cityIndex < isConnected.length; cityIndex++) {
      if (!isCityVisited[cityIndex]) {
        provincesCount++;
      }
      depthFirstSearchCity(isCityVisited, isConnected, cityIndex);
    }
    return provincesCount;
  }

  private void depthFirstSearchCity(
      Boolean[] isCityVisited, int[][] isConnected, Integer cityIndex) {
    if (isCityVisited[cityIndex]) {
      return;
    }
    isCityVisited[cityIndex] = true;
    int[] cityConnectedTo = isConnected[cityIndex];
    for (int connectToIndex = 0; connectToIndex < cityConnectedTo.length; connectToIndex++) {
      if (cityConnectedTo[connectToIndex] == 1) {
        depthFirstSearchCity(isCityVisited, isConnected, connectToIndex);
      }
    }
  }
}
