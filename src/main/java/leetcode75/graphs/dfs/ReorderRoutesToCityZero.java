package leetcode75.graphs.dfs;

import java.util.*;

public class ReorderRoutesToCityZero {

  public int minReorder(int n, int[][] connections) {
    Graph citiesGraph = new Graph();
    for (int[] edge : connections) {
      citiesGraph.addEdge(edge[0], edge[1], true);
      citiesGraph.addEdge(edge[1], edge[0], false);
    }
    boolean[] isCityVisited = new boolean[n];
    Arrays.fill(isCityVisited, false);
    // BFS starting from city zero
    Stack<Edge> edgesStack = new Stack<>();
    Map<Integer, List<Edge>> adjacencyList = citiesGraph.getAdjacencyList();
    for (Edge edge : adjacencyList.getOrDefault(0, new ArrayList<>())) {
      edgesStack.push(edge);
    }
    isCityVisited[0] = true;
    int edgeNeedChange = 0;
    while (!edgesStack.isEmpty()) {
      Edge currentEdge = edgesStack.pop();
      int nextDestination = currentEdge.destination;
      if (!isCityVisited[nextDestination]) {
        isCityVisited[nextDestination] = true;
        if (currentEdge.isOriginalDirection) {
          edgeNeedChange++;
        }
        for (Edge edge : adjacencyList.getOrDefault(nextDestination, new ArrayList<>())) {
          edgesStack.push(edge);
        }
      }
    }
    return edgeNeedChange;
  }

  class Edge {

    final int source;

    final int destination;

    final boolean isOriginalDirection;

    Edge(int source, int destination, boolean isOriginalDirection) {
      this.source = source;
      this.destination = destination;
      this.isOriginalDirection = isOriginalDirection;
    }
  }

  class Graph {

    final Map<Integer, List<Edge>> adjacencyList = new HashMap<>();

    void addEdge(int source, int destination, boolean isOriginalDirection) {
      this.adjacencyList.putIfAbsent(source, new ArrayList<>());
      this.adjacencyList.get(source).add(new Edge(source, destination, isOriginalDirection));
    }

    Map<Integer, List<Edge>> getAdjacencyList() {
      return this.adjacencyList;
    }
  }

}
