package leetcode75.graphs.dfs;

import java.util.*;

class Edge {
  int source;
  int destination;
  boolean isOriginalDirection;

  public Edge(int source, int destination, boolean isOriginalDirection) {
    this.source = source;
    this.destination = destination;
    this.isOriginalDirection = isOriginalDirection;
  }

  @Override
  public String toString() {
    return "("
        + source
        + " -> "
        + destination
        + ", originalDirection: "
        + isOriginalDirection
        + ")";
  }
}

// Define a class to represent the graph
class Graph {
  private final Map<Integer, List<Edge>> adjacencyList;

  public Graph() {
    this.adjacencyList = new HashMap<>();
  }

  // Add an edge to the graph
  public void addEdge(int source, int destination, boolean isOriginalDirection) {
    this.adjacencyList.putIfAbsent(source, new ArrayList<>());
    this.adjacencyList.get(source).add(new Edge(source, destination, isOriginalDirection));
  }

  // Get the adjacency list of the graph
  public Map<Integer, List<Edge>> getAdjacencyList() {
    return this.adjacencyList;
  }

  // Perform DFS traversal to calculate changes
  public int dfs(int node, boolean[] visited) {
    int changes = 0;
    visited[node] = true;
    for (Edge edge : adjacencyList.getOrDefault(node, new ArrayList<>())) {
      int next = edge.destination;
      if (!visited[next]) {
        if (edge.isOriginalDirection) {
          changes++;
        }
        changes += dfs(next, visited);
      }
    }
    return changes;
  }
}

class ReorderRoutesToCityZero {
  public int minReorder(int n, int[][] connections) {
    Graph graph = new Graph();
    for (int[] connection : connections) {
      graph.addEdge(connection[0], connection[1], true); // Original direction
      graph.addEdge(connection[1], connection[0], false); // Reverse direction
    }
    boolean[] visited = new boolean[n];
    return graph.dfs(0, visited);
  }
}
