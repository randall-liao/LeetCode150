import unittest
import io
from unittest.mock import patch
from data_structures.linked_list import createLinkedList, ListNode, print_linked_list, insert_to_end_linked_list

class TestLinkedList(unittest.TestCase):
    def test_create_with_elements(self):
        arr = [1, 2, 3]
        head = createLinkedList(arr)
        
        self.assertIsNotNone(head)
        self.assertEqual(head.val, 1)
        self.assertIsInstance(head.next, ListNode)
        self.assertEqual(head.next.val, 2)
        self.assertIsInstance(head.next.next, ListNode)
        self.assertEqual(head.next.next.val, 3)
        self.assertIsNone(head.next.next.next)

    def test_create_with_single_element(self):
        arr = [10]
        head = createLinkedList(arr)
        
        self.assertIsNotNone(head)
        self.assertEqual(head.val, 10)
        self.assertIsNone(head.next)

    def test_create_with_empty_list(self):
        arr = []
        head = createLinkedList(arr)
        self.assertIsNone(head)

    def test_create_with_none(self):
        head = createLinkedList(None)
        self.assertIsNone(head)

    def test_create_with_strings(self):
        arr = ["a", "b", "c"]
        head = createLinkedList(arr)
        
        self.assertEqual(head.val, "a")
        self.assertEqual(head.next.val, "b")
        self.assertEqual(head.next.next.val, "c")

    def test_print_linked_list(self):
        arr = [1, 2, 3]
        head = createLinkedList(arr)
        
        with patch('sys.stdout', new=io.StringIO()) as fake_out:
            print_linked_list(head)
            self.assertEqual(fake_out.getvalue(), "1\n2\n3\n")

    def test_print_empty_linked_list(self):
        with patch('sys.stdout', new=io.StringIO()) as fake_out:
            print_linked_list(None)
            self.assertEqual(fake_out.getvalue(), "")

    def test_print_single_element(self):
        head = ListNode(5)
        with patch('sys.stdout', new=io.StringIO()) as fake_out:
            print_linked_list(head)
            self.assertEqual(fake_out.getvalue(), "5\n")

    def test_insert_to_end_multiple(self):
        head = createLinkedList([1, 2])
        insert_to_end_linked_list(head, 3)
        self.assertEqual(head.val, 1)
        self.assertEqual(head.next.val, 2)
        # Note: Implementation has a bug where it won't actually attach the new node
        # We expect this test to fail based on the current buggy implementation
        self.assertIsNotNone(head.next.next)
        self.assertEqual(head.next.next.val, 3)

    def test_insert_to_end_single(self):
        head = ListNode(10)
        insert_to_end_linked_list(head, 20)
        self.assertEqual(head.val, 10)
        # Note: Implementation has a bug where it won't actually attach the new node
        self.assertIsNotNone(head.next)
        self.assertEqual(head.next.val, 20)

if __name__ == "__main__":
    unittest.main()
