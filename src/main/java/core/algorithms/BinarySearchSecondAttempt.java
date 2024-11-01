package core.algorithms;

public class BinarySearchSecondAttempt {

  public static int search(int[] inputArray, int intKey) {
    if (inputArray == null || inputArray.length == 0) {
      return -1;
    }
    int leftIndex = 0;
    int rightIndex = inputArray.length - 1;
    while (leftIndex <= rightIndex) {
      int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
      if (intKey == inputArray[midIndex]) {
        return midIndex;
      }
      if (intKey > inputArray[midIndex]) {
        // search to the right half of the array
        leftIndex = midIndex + 1;
      } else {
        // search to the left half of the array
        rightIndex = midIndex - 1;
      }
    }
    return -1;
  }
}
