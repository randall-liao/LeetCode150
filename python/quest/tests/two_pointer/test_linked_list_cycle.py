import unittest
from typing import List, Tuple, Optional
from two_pointer.linked_list_cycle import HashSetSolution, TwoPointerSolution, ListNode

def create_list_with_cycle(values: List[int], pos: int) -> Tuple[Optional[ListNode], Optional[ListNode]]:
    """
    Creates a linked list with a cycle.
    :param values: List of values for the nodes.
    :param pos: Index of the node to which the last node connects. -1 means no cycle.
    :return: A tuple (head, cycle_entry_node).
    """
    if not values:
        return None, None
    
    nodes = [ListNode(v) for v in values]
    for i in range(len(nodes) - 1):
        nodes[i].next = nodes[i+1]
    
    cycle_entry = None
    if pos != -1 and 0 <= pos < len(nodes):
        nodes[-1].next = nodes[pos]
        cycle_entry = nodes[pos]
    
    return nodes[0], cycle_entry

class LinkedListCycleTestBase:
    solution = None # To be defined in subclasses

    def test_empty_list(self):
        head, expected = create_list_with_cycle([], -1)
        result = self.solution.detectCycle(head)
        self.assertIsNone(result)

    def test_single_node_no_cycle(self):
        head, expected = create_list_with_cycle([1], -1)
        result = self.solution.detectCycle(head)
        self.assertIsNone(result)

    def test_single_node_with_cycle(self):
        head, expected = create_list_with_cycle([1], 0)
        result = self.solution.detectCycle(head)
        self.assertEqual(result, expected, "Should detect cycle to itself in single node list")

    def test_two_nodes_no_cycle(self):
        head, expected = create_list_with_cycle([1, 2], -1)
        result = self.solution.detectCycle(head)
        self.assertIsNone(result)

    def test_two_nodes_cycle_to_head(self):
        head, expected = create_list_with_cycle([1, 2], 0)
        result = self.solution.detectCycle(head)
        self.assertEqual(result, expected, "Should detect cycle to head node")

    def test_multiple_nodes_cycle_to_middle(self):
        # Example 1 from LeetCode 142: head = [3,2,0,-4], pos = 1
        head, expected = create_list_with_cycle([3, 2, 0, -4], 1)
        result = self.solution.detectCycle(head)
        self.assertEqual(result, expected, "Should detect cycle starting at node with value 2")

    def test_multiple_nodes_no_cycle(self):
        head, expected = create_list_with_cycle([1, 2, 3, 4, 5], -1)
        result = self.solution.detectCycle(head)
        self.assertIsNone(result)

    def test_multiple_nodes_cycle_to_head(self):
        # head = [1, 2, 3, 4], pos = 0
        head, expected = create_list_with_cycle([1, 2, 3, 4], 0)
        result = self.solution.detectCycle(head)
        self.assertEqual(result, expected, "Should detect cycle starting at node with value 1 (index 0)")


class TestHashSetSolution(LinkedListCycleTestBase, unittest.TestCase):
    def setUp(self):
        self.solution = HashSetSolution()

class TestTwoPointerSolution(LinkedListCycleTestBase, unittest.TestCase):
    def setUp(self):
        self.solution = TwoPointerSolution()

if __name__ == "__main__":
    unittest.main()
