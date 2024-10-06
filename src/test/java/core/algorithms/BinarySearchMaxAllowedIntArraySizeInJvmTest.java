package core.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchMaxAllowedIntArraySizeInJvmTest {

  @Test
  void search() {
    // Max allow size array should be created
    int maxArraySize = BinarySearchMaxAllowedIntArraySizeInJvm.search();
    assertDoesNotThrow(
        // JVM is able to create array at the max size
        () -> {
          int[] maxIntArray = new int[maxArraySize];
        });
    System.gc();
    assertThrows(
        // increase size by one will result OOM
        OutOfMemoryError.class,
        () -> {
          int[] maxIntArrayFailed = new int[maxArraySize + 1];
        });
    System.gc();
  }
}
