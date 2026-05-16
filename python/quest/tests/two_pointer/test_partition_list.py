import unittest
from two_pointer.partition_list import Solution, ListNode, list_to_list_node

def linked_list_to_list(node: ListNode | None) -> list[int]:
    result = []
    while node:
        result.append(node.val)
        node = node.next
    return result

class TestPartitionList(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_empty_list(self):
        """Test partitioning an empty list."""
        head = list_to_list_node([])
        result = self.solution.partition(head, 3)
        self.assertEqual(linked_list_to_list(result), [])

    def test_single_element_smaller(self):
        """Test partitioning a single element list where the element is smaller than x."""
        head = list_to_list_node([1])
        result = self.solution.partition(head, 2)
        self.assertEqual(linked_list_to_list(result), [1])

    def test_single_element_larger(self):
        """Test partitioning a single element list where the element is larger than x."""
        head = list_to_list_node([2])
        result = self.solution.partition(head, 1)
        self.assertEqual(linked_list_to_list(result), [2])

    def test_all_smaller(self):
        """Test partitioning a list where all elements are smaller than x."""
        head = list_to_list_node([1, 2, 2])
        result = self.solution.partition(head, 3)
        self.assertEqual(linked_list_to_list(result), [1, 2, 2])

    def test_all_larger(self):
        """Test partitioning a list where all elements are larger than or equal to x."""
        head = list_to_list_node([3, 4, 5])
        result = self.solution.partition(head, 3)
        self.assertEqual(linked_list_to_list(result), [3, 4, 5])

    def test_mixed_elements(self):
        """Test partitioning a list with mixed elements (example case)."""
        head = list_to_list_node([1, 4, 3, 2, 5, 2])
        result = self.solution.partition(head, 3)
        self.assertEqual(linked_list_to_list(result), [1, 2, 2, 4, 3, 5])

    def test_x_larger_than_all(self):
        """Test partitioning where x is larger than all elements in the list."""
        head = list_to_list_node([1, 2, 3])
        result = self.solution.partition(head, 10)
        self.assertEqual(linked_list_to_list(result), [1, 2, 3])

    def test_x_smaller_than_all(self):
        """Test partitioning where x is smaller than all elements in the list."""
        head = list_to_list_node([5, 6, 7])
        result = self.solution.partition(head, 2)
        self.assertEqual(linked_list_to_list(result), [5, 6, 7])

    def test_duplicates(self):
        """Test partitioning a list with duplicate elements around x."""
        head = list_to_list_node([2, 1, 2, 1])
        result = self.solution.partition(head, 2)
        self.assertEqual(linked_list_to_list(result), [1, 1, 2, 2])

if __name__ == "__main__":
    unittest.main()
