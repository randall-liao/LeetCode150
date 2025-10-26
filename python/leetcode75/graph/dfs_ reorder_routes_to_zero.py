from typing import List


class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        for connected_index in range(len(isConnected)):
            print(isConnected[connected_index])


class Edge:

    def __init__(self, source: int, destination: int, is_original_direction: bool):
        self.source = source
        self.destination = destination
        self.is_original_direction = is_original_direction


class Graph:
    adjacencyDictionary: dict[int, List[Edge]]

    def __init__(self):
        self.adjacencyDictionary = {}

    def add_edge(self, source: int, destination: int, is_original_direction: bool):
        new_edge = Edge(source, destination, is_original_direction)
        if source in self.adjacencyDictionary:
            self.adjacencyDictionary[source].append(new_edge)
        else:
            self.adjacencyDictionary[source] = [new_edge]
