import unittest
from typing import List, Optional
from two_pointer.merge_k_sorted_lists import Solution, ListNode, list_to_list_node, list_node_to_list

class TestMergeKSortedLists(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_empty_lists_input(self):
        """Test with an empty list of lists."""
        lists = []
        result = self.solution.mergeKLists(lists)
        self.assertIsNone(result)

    def test_list_with_empty_elements(self):
        """Test with a list containing only None elements."""
        lists = [None, None]
        result = self.solution.mergeKLists(lists)
        self.assertIsNone(result)

    def test_multiple_sorted_lists(self):
        """Test merging multiple sorted lists of varying lengths."""
        l1 = list_to_list_node([1, 4, 5])
        l2 = list_to_list_node([1, 3, 4])
        l3 = list_to_list_node([2, 6])
        lists = [l1, l2, l3]
        result = self.solution.mergeKLists(lists)
        self.assertEqual(list_node_to_list(result), [1, 1, 2, 3, 4, 4, 5, 6])

    def test_single_list(self):
        """Test merging a single list."""
        l1 = list_to_list_node([1, 2, 3])
        lists = [l1]
        result = self.solution.mergeKLists(lists)
        self.assertEqual(list_node_to_list(result), [1, 2, 3])

    def test_negative_values(self):
        """Test merging lists with negative values."""
        l1 = list_to_list_node([-10, -5, 0])
        l2 = list_to_list_node([-7, -3, 2])
        l3 = list_to_list_node([-1, 1])
        lists = [l1, l2, l3]
        result = self.solution.mergeKLists(lists)
        self.assertEqual(list_node_to_list(result), [-10, -7, -5, -3, -1, 0, 1, 2])

    def test_duplicates(self):
        """Test merging lists with many duplicates."""
        l1 = list_to_list_node([1, 1, 1])
        l2 = list_to_list_node([1, 1, 1])
        lists = [l1, l2]
        result = self.solution.mergeKLists(lists)
        self.assertEqual(list_node_to_list(result), [1, 1, 1, 1, 1, 1])

    def test_empty_and_non_empty_mix(self):
        """Test merging a mix of empty and non-empty lists."""
        l1 = list_to_list_node([])
        l2 = list_to_list_node([1, 3, 5])
        l3 = None
        l4 = list_to_list_node([2, 4, 6])
        lists = [l1, l2, l3, l4]
        result = self.solution.mergeKLists(lists)
        self.assertEqual(list_node_to_list(result), [1, 2, 3, 4, 5, 6])

if __name__ == "__main__":
    unittest.main()
