package core.algorithms;

public class BinarySearchMaxAllowedIntArraySizeInJvm {

  public static int search() {
    int leftPointer = Integer.MAX_VALUE / 2;
    int rightPointer = Integer.MAX_VALUE;
    while (leftPointer <= rightPointer) {
      int midPointer = leftPointer + (rightPointer - leftPointer) / 2;
      try {
        int[] trialArray = new int[midPointer];
        trialArray = null;
        System.gc();
        try {
          // testing if the trialArray is at the boundary of max allowed array size
          int[] trialArrayOneLarger = new int[midPointer + 1];
          trialArrayOneLarger = null;
          System.gc();
        } catch (OutOfMemoryError e) {
          // if it is, return the boundary value
          return midPointer;
        }
        // if array creation succeed, search to the space larger than the midpoint.
        leftPointer = midPointer + 1;
      } catch (OutOfMemoryError e) {
        // if array creation failed, search to the left of the solution space
        rightPointer = midPointer - 1;
      }
    }
    return -1;
  }
}
