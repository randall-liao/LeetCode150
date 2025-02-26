from typing import List


class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        for connected_index in range(len(isConnected)):
            print(isConnected[connected_index])


class CityNode:

    def __init__(self, city_name: int):
        self.next_city: CityNode = None
        self.previous_city: CityNode = None
        self.city_name: int = city_name

