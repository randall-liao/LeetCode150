package leetcode75.graphs.dfs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class EvaluateDivisionTest {

  EvaluateDivision solution = new EvaluateDivision();

  @Test
  void testExample1() {
    List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c"));
    double[] values = {2.0, 3.0};
    List<List<String>> queries =
        Arrays.asList(
            Arrays.asList("a", "c"),
            Arrays.asList("b", "a"),
            Arrays.asList("a", "e"),
            Arrays.asList("a", "a"),
            Arrays.asList("x", "x"));
    double[] expected = {6.0, 0.5, -1.0, 1.0, -1.0};
    assertArrayEquals(expected, solution.calcEquation(equations, values, queries));
  }

  @Test
  void testExample2() {
    List<List<String>> equations =
        Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c"), Arrays.asList("bc", "cd"));
    double[] values = {1.5, 2.5, 5.0};
    List<List<String>> queries =
        Arrays.asList(
            Arrays.asList("a", "c"),
            Arrays.asList("c", "b"),
            Arrays.asList("bc", "cd"),
            Arrays.asList("cd", "bc"));
    double[] expected = {3.75, 0.4, 5.0, 0.2};
    assertArrayEquals(expected, solution.calcEquation(equations, values, queries));
  }

  @Test
  void testExample3() {
    List<List<String>> equations = List.of(Arrays.asList("a", "b"));
    double[] values = {0.5};
    List<List<String>> queries =
        Arrays.asList(
            Arrays.asList("a", "b"),
            Arrays.asList("b", "a"),
            Arrays.asList("a", "c"),
            Arrays.asList("x", "y"));
    double[] expected = {0.5, 2.0, -1.0, -1.0};
    assertArrayEquals(expected, solution.calcEquation(equations, values, queries));
  }

  @Test
  void testNoEquations() {
    // Edge case: No equations are provided.  All queries should return -1.0.
    List<List<String>> equations = List.of();
    double[] values = {};
    List<List<String>> queries = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("x", "y"));
    double[] expected = {-1.0, -1.0};
    assertArrayEquals(expected, solution.calcEquation(equations, values, queries));
  }

  @Test
  void testSingleEquationSelfQuery() {
    // Edge case: Querying for a variable divided by itself. Should return 1.0 if the variable
    // exists.
    List<List<String>> equations = List.of(Arrays.asList("a", "b"));
    double[] values = {2.0};
    List<List<String>> queries = Arrays.asList(Arrays.asList("a", "a"), Arrays.asList("b", "b"));
    double[] expected = {1.0, 1.0};
    assertArrayEquals(expected, solution.calcEquation(equations, values, queries));
  }

  @Test
  void testUndefinedVariableInQuery() {
    // Edge case: Query contains a variable not present in any equation. Should return -1.0.
    List<List<String>> equations = List.of(Arrays.asList("a", "b"));
    double[] values = {2.0};
    List<List<String>> queries = Arrays.asList(Arrays.asList("a", "c"), Arrays.asList("c", "b"));
    double[] expected = {-1.0, -1.0};
    assertArrayEquals(expected, solution.calcEquation(equations, values, queries));
  }

  @Test
  void testDisconnectedGraph() {
    // Edge case: Equations define separate, disconnected components in the graph.
    List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
    double[] values = {2.0, 3.0};
    List<List<String>> queries = Arrays.asList(Arrays.asList("a", "d"), Arrays.asList("b", "c"));
    double[] expected = {-1.0, -1.0};
    assertArrayEquals(expected, solution.calcEquation(equations, values, queries));
  }

  @Test
  void testCycleInGraph() {
    // Edge case: Equations create a cycle in the graph.  The DFS should handle this correctly.
    List<List<String>> equations =
        Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c"), Arrays.asList("c", "a"));
    double[] values = {2.0, 3.0, 4.0};
    List<List<String>> queries = Arrays.asList(Arrays.asList("a", "c"), Arrays.asList("c", "b"));
    double[] expected = {
      6.0, 8.0
    }; // a/c = (a/b) * (b/c) = 2 * 3 = 6.0, c/b = (c/a) * (a/b) = 4 * 2 = 8.0
    assertArrayEquals(
        expected,
        solution.calcEquation(equations, values, queries),
        0.0000000001); // Using delta for double comparison
  }

  @Test
  void testComplexChain() {
    // Edge case: A longer chain of equations to test the DFS traversal.
    List<List<String>> equations =
        Arrays.asList(
            Arrays.asList("a", "b"),
            Arrays.asList("b", "c"),
            Arrays.asList("c", "d"),
            Arrays.asList("d", "e"));
    double[] values = {2.0, 3.0, 4.0, 5.0};
    List<List<String>> queries = List.of(Arrays.asList("a", "e"));
    double[] expected = {120.0};
    assertArrayEquals(expected, solution.calcEquation(equations, values, queries));
  }
}
