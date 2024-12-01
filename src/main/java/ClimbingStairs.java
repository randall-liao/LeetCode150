public class ClimbingStairs {

  public static int climbingStairs(int numbersOfStair) {
    int[] numbersOfWaysReachI = new int[numbersOfStair];
    // Base case
    if (numbersOfStair <= 2) {
      return numbersOfStair;
    }
    numbersOfWaysReachI[0] = 1;
    numbersOfWaysReachI[1] = 2;
    for (int i = 2; i < numbersOfWaysReachI.length; i++) {
      numbersOfWaysReachI[i] = numbersOfWaysReachI[i - 1] + numbersOfWaysReachI[i - 2];
    }
    return numbersOfWaysReachI[numbersOfStair - 1];
  }
}
