import unittest
from typing import Optional
from two_pointer.remove_i_node_from_list import CacheListSolution, Solution, ListNode, list_to_list_node, TwoPointerSolution

def linked_list_to_list(node: Optional[ListNode]) -> list[int]:
    result = []
    while node:
        result.append(node.val)
        node = node.next
    return result

class BaseTestRemoveNthFromEnd:
    def test_example_1(self):
        head = list_to_list_node([1, 2, 3, 4, 5])
        n = 2
        result = self.solution.removeNthFromEnd(head, n)
        self.assertEqual(linked_list_to_list(result), [1, 2, 3, 5])

    def test_example_2(self):
        head = list_to_list_node([1])
        n = 1
        result = self.solution.removeNthFromEnd(head, n)
        self.assertEqual(linked_list_to_list(result), [])

    def test_example_3(self):
        head = list_to_list_node([1, 2])
        n = 1
        result = self.solution.removeNthFromEnd(head, n)
        self.assertEqual(linked_list_to_list(result), [1])

    def test_remove_head_sz_2(self):
        head = list_to_list_node([1, 2])
        n = 2
        result = self.solution.removeNthFromEnd(head, n)
        self.assertEqual(linked_list_to_list(result), [2])

    def test_remove_head_sz_3(self):
        head = list_to_list_node([1, 2, 3])
        n = 3
        result = self.solution.removeNthFromEnd(head, n)
        self.assertEqual(linked_list_to_list(result), [2, 3])

    def test_remove_tail_sz_3(self):
        head = list_to_list_node([1, 2, 3])
        n = 1
        result = self.solution.removeNthFromEnd(head, n)
        self.assertEqual(linked_list_to_list(result), [1, 2])

    def test_remove_middle_sz_3(self):
        head = list_to_list_node([1, 2, 3])
        n = 2
        result = self.solution.removeNthFromEnd(head, n)
        self.assertEqual(linked_list_to_list(result), [1, 3])

class TestCacheListSolution(unittest.TestCase, BaseTestRemoveNthFromEnd):
    def setUp(self):
        self.solution = CacheListSolution()

class TestSolution(unittest.TestCase, BaseTestRemoveNthFromEnd):
    def setUp(self):
        self.solution = Solution()

class TestTwoPointerSolution(unittest.TestCase, BaseTestRemoveNthFromEnd):
    def setUp(self):
        self.solution = TwoPointerSolution()

if __name__ == "__main__":
    unittest.main()
