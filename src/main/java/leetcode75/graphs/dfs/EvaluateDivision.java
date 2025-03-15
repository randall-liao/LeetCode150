package leetcode75.graphs.dfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class EvaluateDivision {
  /**
   * Evaluates division expressions given a set of equations and their values.
   *
   * @param equations A list of equations, where each equation is a list of two variables [A, B].
   * @param values A list of real numbers representing the values of the equations (A / B).
   * @param queries A list of queries, where each query is a list of two variables [C, D].
   * @return A list of answers to the queries. If an answer cannot be determined, return -1.0.
   */
  public double[] calcEquation(
      List<List<String>> equations, double[] values, List<List<String>> queries) {
    // Create a graph to store the relationships between variables.
    // The graph is represented as a HashMap where keys are variables (strings)
    // and values are another HashMap representing their neighbors and the corresponding division
    // values.
    Map<String, Map<String, Double>> graph = new HashMap<>();

    // Build the graph from the given equations and values.
    for (int i = 0; i < equations.size(); i++) {
      List<String> equation = equations.get(i);
      String A = equation.get(0);
      String B = equation.get(1);
      double value = values[i];

      // If A is not already in the graph, add it.
      if (!graph.containsKey(A)) {
        graph.put(A, new HashMap<>());
      }
      // If B is not already in the graph, add it.
      if (!graph.containsKey(B)) {
        graph.put(B, new HashMap<>());
      }

      // Add the edge A -> B with weight value (A / B = value).
      graph.get(A).put(B, value);
      // Add the edge B -> A with weight 1/value (B / A = 1/value).
      graph.get(B).put(A, 1.0 / value);
    }

    // Create an array to store the results of the queries.
    double[] results = new double[queries.size()];

    // Process each query.
    for (int i = 0; i < queries.size(); i++) {
      List<String> query = queries.get(i);
      String C = query.get(0);
      String D = query.get(1);

      // If either C or D is not in the graph (undefined variable), the result is -1.0.
      if (!graph.containsKey(C) || !graph.containsKey(D)) {
        results[i] = -1.0;
      } else {
        // Otherwise, use DFS to find the value of C / D.
        results[i] = dfs(graph, C, D, new HashSet<>());
      }
    }

    // Return the array of results.
    return results;
  }

  /**
   * Performs a depth-first search to find a path from start to end in the graph.
   *
   * @param graph The graph representing the relationships between variables.
   * @param start The starting variable.
   * @param end The ending variable.
   * @param visited A set to keep track of visited nodes to prevent cycles.
   * @return The value of the path from start to end, or -1.0 if no path exists.
   */
  private double dfs(
      Map<String, Map<String, Double>> graph, String start, String end, HashSet<String> visited) {
    // Base case: If start equals end, we've found the destination, so return 1.0.
    if (start.equals(end)) {
      return 1.0;
    }

    // Mark the current node as visited.
    visited.add(start);

    // Get the neighbors of the current node.
    Map<String, Double> neighbors = graph.get(start);

    // If the current node has neighbors, iterate through them.
    if (neighbors != null) {
      for (Map.Entry<String, Double> entry : neighbors.entrySet()) {
        String neighbor = entry.getKey();
        double value = entry.getValue();

        // If the neighbor has not been visited, recursively call DFS on the neighbor.
        if (!visited.contains(neighbor)) {
          double result = dfs(graph, neighbor, end, visited);
          // If the recursive call returns a valid result (not -1.0),
          // multiply the current edge's weight with the result and return it.
          if (result != -1.0) {
            return value * result;
          }
        }
      }
    }

    // If no path is found from start to end, return -1.0.
    return -1.0;
  }
}
