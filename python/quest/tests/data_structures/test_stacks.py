import unittest
from data_structures.stacks import ListStack, DequeStack

class TestListStack(unittest.TestCase):
    def test_push_and_pop(self):
        stack = ListStack[int]()
        stack.push(1)
        stack.push(2)
        stack.push(3)
        
        self.assertEqual(stack.pop(), 3)
        self.assertEqual(stack.pop(), 2)
        self.assertEqual(stack.pop(), 1)

    def test_peek(self):
        stack = ListStack[str]()
        stack.push("apple")
        stack.push("banana")
        
        self.assertEqual(stack.peek(), "banana")
        # Ensure peek doesn't remove the item
        self.assertEqual(stack.peek(), "banana")
        
        stack.pop()
        self.assertEqual(stack.peek(), "apple")

    def test_empty_stack_behavior(self):
        stack = ListStack[int]()
        
        # Python's list.pop() raises IndexError on empty list
        with self.assertRaises(IndexError):
            stack.pop()
            
        # Python's list[-1] raises IndexError on empty list
        with self.assertRaises(IndexError):
            stack.peek()

    def test_multiple_operations(self):
        stack = ListStack[int]()
        stack.push(10)
        stack.push(20)
        self.assertEqual(stack.pop(), 20)
        stack.push(30)
        self.assertEqual(stack.peek(), 30)
        self.assertEqual(stack.pop(), 30)
        self.assertEqual(stack.pop(), 10)

    def test_different_data_types(self):
        stack = ListStack[dict]()
        stack.push({"key": "value"})
        stack.push({"a": 1})
        
        self.assertEqual(stack.pop(), {"a": 1})
        self.assertEqual(stack.peek(), {"key": "value"})

class TestDequeStack(unittest.TestCase):
    def test_push_and_pop(self):
        stack = DequeStack[int]()
        stack.push(1)
        stack.push(2)
        stack.push(3)
        
        self.assertEqual(stack.pop(), 3)
        self.assertEqual(stack.pop(), 2)
        self.assertEqual(stack.pop(), 1)

    def test_peek(self):
        stack = DequeStack[str]()
        stack.push("apple")
        stack.push("banana")
        
        self.assertEqual(stack.peek(), "banana")
        # Ensure peek doesn't remove the item
        self.assertEqual(stack.peek(), "banana")
        
        stack.pop()
        self.assertEqual(stack.peek(), "apple")

    def test_empty_stack_behavior(self):
        stack = DequeStack[int]()
        
        # collections.deque.popleft() raises IndexError on empty deque
        with self.assertRaises(IndexError):
            stack.pop()
            
        # collections.deque[0] raises IndexError on empty deque
        with self.assertRaises(IndexError):
            stack.peek()

    def test_multiple_operations(self):
        stack = DequeStack[int]()
        stack.push(10)
        stack.push(20)
        self.assertEqual(stack.pop(), 20)
        stack.push(30)
        self.assertEqual(stack.peek(), 30)
        self.assertEqual(stack.pop(), 30)
        self.assertEqual(stack.pop(), 10)

    def test_different_data_types(self):
        stack = DequeStack[dict]()
        stack.push({"key": "value"})
        stack.push({"a": 1})
        
        self.assertEqual(stack.pop(), {"a": 1})
        self.assertEqual(stack.peek(), {"key": "value"})

if __name__ == "__main__":
    unittest.main()
