import unittest
from two_pointer.middle_linked_list import TwoPointerSolution, ListNode

def list_to_linked_list(arr):
    if not arr:
        return None
    head = ListNode(arr[0])
    curr = head
    for i in range(1, len(arr)):
        curr.next = ListNode(arr[i])
        curr = curr.next
    return head

def linked_list_to_list(node):
    result = []
    while node:
        result.append(node.val)
        node = node.next
    return result

class TestMiddleLinkedList(unittest.TestCase):
    def setUp(self):
        self.solution = TwoPointerSolution()

    def test_empty_list(self):
        head = list_to_linked_list([])
        result = self.solution.middleNode(head)
        self.assertIsNone(result)

    def test_single_node(self):
        head = list_to_linked_list([1])
        result = self.solution.middleNode(head)
        self.assertEqual(linked_list_to_list(result), [1])

    def test_two_nodes(self):
        # LeetCode 876: [1,2] -> [2]
        head = list_to_linked_list([1, 2])
        result = self.solution.middleNode(head)
        self.assertEqual(linked_list_to_list(result), [2])

    def test_odd_nodes(self):
        # [1, 2, 3, 4, 5] -> [3, 4, 5]
        head = list_to_linked_list([1, 2, 3, 4, 5])
        result = self.solution.middleNode(head)
        self.assertEqual(linked_list_to_list(result), [3, 4, 5])

    def test_even_nodes(self):
        # [1, 2, 3, 4, 5, 6] -> [4, 5, 6]
        head = list_to_linked_list([1, 2, 3, 4, 5, 6])
        result = self.solution.middleNode(head)
        self.assertEqual(linked_list_to_list(result), [4, 5, 6])

if __name__ == "__main__":
    unittest.main()
