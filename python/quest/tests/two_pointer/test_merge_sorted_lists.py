import unittest
from two_pointer.merge_sorted_lists import Solution, ListNode, list_to_list_node

def linked_list_to_list(node: ListNode | None) -> list[int]:
    result = []
    while node:
        result.append(node.val)
        node = node.next
    return result

class TestMergeSortedLists(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_both_lists_empty(self):
        """Test merging two empty lists."""
        l1 = list_to_list_node([])
        l2 = list_to_list_node([])
        result = self.solution.mergeTwoLists(l1, l2)
        self.assertEqual(linked_list_to_list(result), [])

    def test_first_list_empty(self):
        """Test merging an empty list with a non-empty list."""
        l1 = list_to_list_node([])
        l2 = list_to_list_node([1, 2, 3])
        result = self.solution.mergeTwoLists(l1, l2)
        self.assertEqual(linked_list_to_list(result), [1, 2, 3])

    def test_second_list_empty(self):
        """Test merging a non-empty list with an empty list."""
        l1 = list_to_list_node([1, 2, 3])
        l2 = list_to_list_node([])
        result = self.solution.mergeTwoLists(l1, l2)
        self.assertEqual(linked_list_to_list(result), [1, 2, 3])

    def test_equal_length_lists(self):
        """Test merging two lists of the same length."""
        l1 = list_to_list_node([1, 2, 4])
        l2 = list_to_list_node([1, 3, 4])
        result = self.solution.mergeTwoLists(l1, l2)
        self.assertEqual(linked_list_to_list(result), [1, 1, 2, 3, 4, 4])

    def test_different_length_lists(self):
        """Test merging two lists of different lengths."""
        l1 = list_to_list_node([1])
        l2 = list_to_list_node([2, 3, 4, 5])
        result = self.solution.mergeTwoLists(l1, l2)
        self.assertEqual(linked_list_to_list(result), [1, 2, 3, 4, 5])

    def test_duplicates(self):
        """Test merging lists with many duplicates."""
        l1 = list_to_list_node([1, 1, 1])
        l2 = list_to_list_node([1, 1, 1])
        result = self.solution.mergeTwoLists(l1, l2)
        self.assertEqual(linked_list_to_list(result), [1, 1, 1, 1, 1, 1])

    def test_all_smaller(self):
        """Test merging where all elements in one list are smaller than the other."""
        l1 = list_to_list_node([1, 2, 3])
        l2 = list_to_list_node([4, 5, 6])
        result = self.solution.mergeTwoLists(l1, l2)
        self.assertEqual(linked_list_to_list(result), [1, 2, 3, 4, 5, 6])

    def test_negative_values(self):
        """Test merging lists with negative values."""
        l1 = list_to_list_node([-10, -5, 0])
        l2 = list_to_list_node([-7, -3, 2])
        result = self.solution.mergeTwoLists(l1, l2)
        self.assertEqual(linked_list_to_list(result), [-10, -7, -5, -3, 0, 2])

    def test_large_values(self):
        """Test merging lists with large values."""
        l1 = list_to_list_node([100, 200, 300])
        l2 = list_to_list_node([150, 250, 350])
        result = self.solution.mergeTwoLists(l1, l2)
        self.assertEqual(linked_list_to_list(result), [100, 150, 200, 250, 300, 350])

    def test_single_element_lists(self):
        """Test merging two single-element lists."""
        l1 = list_to_list_node([1])
        l2 = list_to_list_node([2])
        result = self.solution.mergeTwoLists(l1, l2)
        self.assertEqual(linked_list_to_list(result), [1, 2])

    def test_single_element_same_value(self):
        """Test merging two single-element lists with the same value."""
        l1 = list_to_list_node([1])
        l2 = list_to_list_node([1])
        result = self.solution.mergeTwoLists(l1, l2)
        self.assertEqual(linked_list_to_list(result), [1, 1])

class TestHelpers(unittest.TestCase):
    def test_list_to_list_node_empty(self):
        self.assertIsNone(list_to_list_node([]))

    def test_list_to_list_node_single(self):
        head = list_to_list_node([1])
        self.assertIsNotNone(head)
        self.assertEqual(head.val, 1)
        self.assertIsNone(head.next)

    def test_list_to_list_node_multiple(self):
        head = list_to_list_node([1, 2, 3])
        self.assertEqual(linked_list_to_list(head), [1, 2, 3])

if __name__ == "__main__":
    unittest.main()
