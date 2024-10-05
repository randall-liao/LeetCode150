package core.algorithms;

public class BinarySearch {

  public static int search(int[] intArray, int intKey) {
    if (intArray == null || intArray.length == 0) {
      return -1;
    }
    int leftPointer = 0;
    int rightPointer = intArray.length - 1;
    while (leftPointer <= rightPointer) {
      int midPointer = leftPointer + (rightPointer - leftPointer) / 2;
      if (intArray[midPointer] == intKey) {
        return midPointer;
      }
      if (intArray[midPointer] < intKey) {
        // search to the right
        leftPointer = midPointer + 1;
      } else {
        // search to the left
        rightPointer = midPointer - 1;
      }
    }
    return -1;
  }
}
