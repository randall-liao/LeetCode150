import unittest
from data_structures.cycle_array import CycleArray

class TestCycleArray(unittest.TestCase):
    def test_init(self):
        ca = CycleArray(10)
        self.assertEqual(ca.get_count(), 0)
        self.assertTrue(ca.is_empty())
        self.assertFalse(ca.is_full())

    def test_add_last(self):
        ca = CycleArray(2)
        ca.add_last(1)
        self.assertEqual(ca.get_count(), 1)
        self.assertEqual(ca.get_last(), 1)
        ca.add_last(2)
        self.assertEqual(ca.get_count(), 2)
        self.assertEqual(ca.get_last(), 2)
        self.assertTrue(ca.is_full())

    def test_add_first(self):
        ca = CycleArray(2)
        ca.add_first(1)
        self.assertEqual(ca.get_count(), 1)
        self.assertEqual(ca.get_first(), 1)
        ca.add_first(2)
        self.assertEqual(ca.get_count(), 2)
        self.assertEqual(ca.get_first(), 2)
        self.assertTrue(ca.is_full())

    def test_remove_last(self):
        ca = CycleArray(5)
        ca.add_last(1)
        ca.add_last(2)
        self.assertEqual(ca.remove_last(), None) # remove_last doesn't return value in implementation
        self.assertEqual(ca.get_count(), 1)
        self.assertEqual(ca.get_last(), 1)

    def test_remove_first(self):
        ca = CycleArray(5)
        ca.add_last(1)
        ca.add_last(2)
        ca.remove_first()
        self.assertEqual(ca.get_count(), 1)
        self.assertEqual(ca.get_first(), 2)

    def test_resize_up(self):
        ca = CycleArray(2)
        ca.add_last(1)
        ca.add_last(2)
        ca.add_last(3) # Should trigger resize
        self.assertEqual(ca.get_count(), 3)
        self.assertEqual(ca.size, 4)
        self.assertEqual(ca.get_first(), 1)
        self.assertEqual(ca.get_last(), 3)

    def test_resize_down(self):
        ca = CycleArray(8)
        for i in range(4):
            ca.add_last(i)
        self.assertEqual(ca.size, 8)
        ca.remove_first()
        ca.remove_first() # count becomes 2, which is 8 // 4
        self.assertEqual(ca.size, 4)

    def test_empty_error(self):
        ca = CycleArray(5)
        with self.assertRaises(OverflowError):
            ca.remove_first()
        with self.assertRaises(OverflowError):
            ca.remove_last()

    def test_circular_behavior(self):
        ca = CycleArray(3)
        ca.add_last(1)
        ca.add_last(2)
        ca.remove_first()
        ca.add_last(3)
        ca.add_last(4) # Resize triggered
        self.assertEqual(ca.get_count(), 3)
        self.assertEqual(ca.get_first(), 2)
        self.assertEqual(ca.get_last(), 4)

if __name__ == "__main__":
    unittest.main()
