package core.algorithms;

public class BinarySearchThirdAttempt {

  public static int search(int[] inputIntArray, int key) {
    if (inputIntArray == null || inputIntArray.length == 0) {
      return -1;
    }
    int leftPointer = 0;
    int rightPointer = inputIntArray.length - 1;
    while (leftPointer <= rightPointer) {
      int midPointer = leftPointer + (rightPointer - leftPointer) / 2;
      if (key == inputIntArray[midPointer]) {
        return midPointer;
      }
      if (key > inputIntArray[midPointer]) {
        // Search to the right half of the array
        leftPointer = midPointer + 1;
      } else {
        // Search to the left half of the array
        rightPointer = midPointer - 1;
      }
    }
    return -1;
  }
}
