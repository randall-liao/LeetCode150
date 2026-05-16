import unittest
from data_structures.circular_deque import MyCircularDeque

class TestMyCircularDeque(unittest.TestCase):
    def test_basic_operations(self):
        # Initialize with size 3
        obj = MyCircularDeque(3)
        
        # Test insertLast
        self.assertTrue(obj.insertLast(1))
        self.assertTrue(obj.insertLast(2))
        
        # Test insertFront
        self.assertTrue(obj.insertFront(3))
        
        # Array should be [3, 1, 2] (logically) or similar depending on implementation
        # But front should be 3, rear should be 2
        
        # Test isFull
        self.assertTrue(obj.isFull())
        
        # Test insert failure when full
        self.assertFalse(obj.insertLast(4))
        
        # Test getFront and getRear
        self.assertEqual(obj.getFront(), 3)
        self.assertEqual(obj.getRear(), 2)
        
        # Test deleteLast
        self.assertTrue(obj.deleteLast())
        
        # Test insertFront again
        self.assertTrue(obj.insertFront(4))
        
        # Test getFront
        self.assertEqual(obj.getFront(), 4)

    def test_empty_deque(self):
        obj = MyCircularDeque(5)
        self.assertTrue(obj.isEmpty())
        self.assertFalse(obj.isFull())
        self.assertEqual(obj.getFront(), -1)
        self.assertEqual(obj.getRear(), -1)
        self.assertFalse(obj.deleteFront())
        self.assertFalse(obj.deleteLast())

    def test_wrap_around(self):
        obj = MyCircularDeque(3)
        self.assertTrue(obj.insertLast(1))
        self.assertTrue(obj.insertLast(2))
        self.assertTrue(obj.deleteFront())
        self.assertTrue(obj.insertLast(3))
        self.assertEqual(obj.getFront(), 2)
        self.assertEqual(obj.getRear(), 3)

    def test_size_constraint(self):
        # Note: The current implementation seems to ignore the 'k' parameter 
        # and hardcodes size to 1000. Testing based on expected behavior for size k.
        k = 3
        obj = MyCircularDeque(k)
        for i in range(k):
            self.assertTrue(obj.insertLast(i))
        self.assertTrue(obj.isFull())
        self.assertFalse(obj.insertLast(100))

if __name__ == "__main__":
    unittest.main()
