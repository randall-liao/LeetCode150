package leetcode75.twopointer;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

  ContainerWithMostWater mostWater = new ContainerWithMostWater();

  @Test
  void maxArea_exampleOne() {
    int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int expected = 49;
    assertEquals(expected, mostWater.maxArea(input));
  }

  @Test
  void maxArea_exampleTwo() {
    int[] input = {1, 1};
    int expected = 1;
    assertEquals(expected, mostWater.maxArea(input));
  }

  @Test
  void maxArea_largeInputSize() throws IOException {
    int[] input =
        readArrayFromFile("src/test/java/leetcode75/twopointer/LargeIntegerArrayInput.txt");
    int expected = 721777500;
    assertEquals(expected, mostWater.maxArea(input));
  }

  private int[] readArrayFromFile(String filePath) throws IOException {
    List<Integer> numbers = new ArrayList<>();
    Path path = Paths.get(filePath);

    // Read all lines from the file
    List<String> lines = Files.readAllLines(path);

    for (String line : lines) {
      // Remove any whitespace and split the line by commas
      String[] tokens = line.trim().split(",");
      for (String token : tokens) {
        if (!token.isEmpty()) {
          numbers.add(Integer.parseInt(token.trim()));
        }
      }
    }

    // Convert the list to an array
    int[] array = new int[numbers.size()];
    for (int i = 0; i < numbers.size(); i++) {
      array[i] = numbers.get(i);
    }

    return array;
  }
}
