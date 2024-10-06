package core.algorithms;

public class BinarySearchSecondAttempt {

  public static int search(int[] inputArray, int intKey) {
    if (inputArray == null || inputArray.length == 0) {
      return -1;
    }
    int leftPointer = 0;
    int rightPointer = inputArray.length - 1;
    while (leftPointer <= rightPointer) {
      int midPointer = leftPointer + (rightPointer - leftPointer) / 2;
      if (inputArray[midPointer] == intKey) {
        return midPointer;
      }
      if (inputArray[midPointer] > intKey) {
        // Search to the left
        rightPointer = midPointer - 1;
      } else {
        // Search to the right
        leftPointer = midPointer + 1;
      }
    }
    return -1;
  }
}
