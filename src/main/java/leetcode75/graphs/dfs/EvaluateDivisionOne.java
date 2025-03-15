package leetcode75.graphs.dfs;

import java.util.*;

public class EvaluateDivisionOne {

  private static final int NUMERATOR_INDEX = 0;

  private static final int DENOMINATOR_INDEX = 1;

  private static final int NOT_FOUND_RESULT = -1;

  private Map<String, Map<String, Double>> graph;

  private static Map<String, Map<String, Double>> parseGraph(
      List<List<String>> equations, double[] values) {
    Map<String, Map<String, Double>> adjacencyList = new HashMap<>();
    for (int i = 0; i < equations.size(); i++) {
      List<String> equation = equations.get(i);
      String nodeA = equation.get(NUMERATOR_INDEX);
      String nodeB = equation.get(DENOMINATOR_INDEX);
      adjacencyList
          .computeIfAbsent(nodeA, func -> new HashMap<String, Double>())
          .put(nodeB, values[i]);
      adjacencyList
          .computeIfAbsent(nodeB, func -> new HashMap<String, Double>())
          .put(nodeA, 1 / values[i]);
    }
    return adjacencyList;
  }

  public double[] calcEquation(
      List<List<String>> equations, double[] values, List<List<String>> queries) {
    this.graph = parseGraph(equations, values);
    double[] result = new double[queries.size()];
    for (int i = 0; i < queries.size(); i++) {
      List<String> query = queries.get(i);
      result[i] = runQuery(query.get(NUMERATOR_INDEX), query.get(DENOMINATOR_INDEX));
    }
    return result;
  }

  private double runQuery(String numerator, String denominator) {
    if (this.graph.get(numerator) == null || this.graph.get(denominator) == null) {
      return NOT_FOUND_RESULT;
    } else {
      return dfs(numerator, denominator, new HashSet<>());
    }
  }

  private double dfs(String numerator, String denominator, Set<String> visited) {
    if (numerator.equals(denominator)) {
      return 1.0;
    }
    visited.add(numerator);
    Map<String, Double> neighbors = this.graph.get(numerator);
    if (neighbors != null) {
      for (Map.Entry<String, Double> neighbor : neighbors.entrySet()) {
        String node = neighbor.getKey();
        Double value = neighbor.getValue();
        if (!visited.contains(node)) {
          double result = dfs(node, denominator, visited);
          if (result != NOT_FOUND_RESULT) {
            return value * result;
          }
        }
      }
    }
    return NOT_FOUND_RESULT;
  }
}
