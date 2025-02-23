import unittest
from typing import List


class NumberOfProvinces:

    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        province_count: int = 0
        is_city_visited: List = [False] * len(isConnected)
        for city_index in range(len(isConnected)):
            if not is_city_visited[city_index]:
                province_count += 1
            self._recursive_dfs_city(isConnected, is_city_visited, city_index)
        return province_count

    def _recursive_dfs_city(self, is_connected: List[List[int]], is_city_visited: List[bool], city_index: int):
        if is_city_visited[city_index]:
            return
        is_city_visited[city_index] = True
        city_connected_to: List[int] = is_connected[city_index]
        for connected_to_index in range(len(city_connected_to)):
            if city_connected_to[connected_to_index] == 1:
                self._recursive_dfs_city(is_connected, is_city_visited, connected_to_index)


class TestNumberOfProvinces(unittest.TestCase):

    def setUp(self):
        self.solution = NumberOfProvinces()

    def test_example1(self):
        is_connected = [
            [1, 1, 0],
            [1, 1, 0],
            [0, 0, 1]
        ]
        expected = 2
        actual = self.solution.findCircleNum(is_connected)
        self.assertEqual(expected, actual)


if __name__ == 'main':
    unittest.main()
