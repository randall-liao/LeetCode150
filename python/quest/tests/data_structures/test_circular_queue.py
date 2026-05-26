import unittest
from data_structures.circular_queue import ListCircularQueue

class TestListCircularQueue(unittest.TestCase):

    def test_full_queue(self):
        obj = ListCircularQueue(1)
        obj.enQueue(3)
        self.assertTrue(obj.isFull())

    def test_isEmpty(self):
        obj = ListCircularQueue(1)
        self.assertTrue(obj.isEmpty())
        obj.enQueue(3)
        self.assertTrue(obj.isFull())
        obj.deQueue()
        self.assertTrue(obj.isEmpty())
        self.assertFalse(obj.isFull())

    def test_front(self):
        obj = ListCircularQueue(1)
        obj.enQueue(2)
        self.assertEqual(2, obj.Front())



    def test_basic_operations(self):
        # Initialize with size 3
        obj = ListCircularQueue(3)
        
        # Test empty queue state
        self.assertTrue(obj.isEmpty())
        self.assertFalse(obj.isFull())
        self.assertEqual(obj.Front(), -1)
        self.assertEqual(obj.Rear(), -1)
        
        # Test enQueue
        self.assertTrue(obj.enQueue(1))
        self.assertEqual(obj.Front(), 1)
        self.assertEqual(obj.Rear(), 1)
        
        self.assertTrue(obj.enQueue(2))
        self.assertEqual(obj.Front(), 1)
        self.assertEqual(obj.Rear(), 2)
        
        self.assertTrue(obj.enQueue(3))
        self.assertEqual(obj.Front(), 1)
        self.assertEqual(obj.Rear(), 3)
        
        # Test isFull when capacity is reached
        self.assertTrue(obj.isFull())
        self.assertFalse(obj.isEmpty())
        
        # Test enQueue failure when full
        self.assertFalse(obj.enQueue(4))
        
        # Test deQueue (FIFO: should remove 1, front becomes 2)
        self.assertTrue(obj.deQueue())
        self.assertEqual(obj.Front(), 2)
        self.assertEqual(obj.Rear(), 3)
        self.assertFalse(obj.isFull())
        
        # Test enQueue after deQueue
        self.assertTrue(obj.enQueue(4))
        self.assertEqual(obj.Front(), 2)
        self.assertEqual(obj.Rear(), 4)
        self.assertTrue(obj.isFull())

    def test_empty_queue(self):
        obj = ListCircularQueue(5)
        self.assertTrue(obj.isEmpty())
        self.assertFalse(obj.isFull())
        self.assertEqual(obj.Front(), -1)
        self.assertEqual(obj.Rear(), -1)
        self.assertFalse(obj.deQueue())

    def test_single_element(self):
        obj = ListCircularQueue(1)
        self.assertTrue(obj.isEmpty())
        
        self.assertTrue(obj.enQueue(10))
        self.assertTrue(obj.isFull())
        self.assertEqual(obj.Front(), 10)
        self.assertEqual(obj.Rear(), 10)
        
        self.assertFalse(obj.enQueue(20))
        
        self.assertTrue(obj.deQueue())
        self.assertTrue(obj.isEmpty())
        self.assertEqual(obj.Front(), -1)
        self.assertEqual(obj.Rear(), -1)

    def test_multiple_wrap_around(self):
        # Queue of size 3
        obj = ListCircularQueue(3)
        
        # Fill queue: [10, 20, 30]
        obj.enQueue(10)
        obj.enQueue(20)
        obj.enQueue(30)
        
        # Dequeue 2 elements: [30] (FIFO means 10 and 20 are removed)
        self.assertTrue(obj.deQueue()) # removes 10
        self.assertTrue(obj.deQueue()) # removes 20
        self.assertEqual(obj.Front(), 30)
        self.assertEqual(obj.Rear(), 30)
        
        # Enqueue 2 new elements: [30, 40, 50]
        self.assertTrue(obj.enQueue(40))
        self.assertTrue(obj.enQueue(50))
        self.assertTrue(obj.isFull())
        self.assertEqual(obj.Front(), 30)
        self.assertEqual(obj.Rear(), 50)
        
        # Dequeue 1 element: [40, 50]
        self.assertTrue(obj.deQueue()) # removes 30
        self.assertEqual(obj.Front(), 40)
        self.assertEqual(obj.Rear(), 50)

    def test_filled_then_emptied(self):
        obj = ListCircularQueue(3)
        obj.enQueue(1)
        obj.enQueue(2)
        obj.enQueue(3)
        
        # Empty completely
        self.assertTrue(obj.deQueue())
        self.assertTrue(obj.deQueue())
        self.assertTrue(obj.deQueue())
        
        self.assertTrue(obj.isEmpty())
        self.assertFalse(obj.isFull())
        self.assertEqual(obj.Front(), -1)
        self.assertEqual(obj.Rear(), -1)

if __name__ == "__main__":
    unittest.main()
