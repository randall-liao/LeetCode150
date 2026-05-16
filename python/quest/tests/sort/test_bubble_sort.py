import unittest

from sort.bubble_sort import bubble_sort_desc, bubble_sort_asc


class TestBubbleSort(unittest.TestCase):
    def test_bubble_sort_desc_empty(self):
        self.assertEqual(bubble_sort_desc([]), [])

    def test_bubble_sort_desc_single(self):
        self.assertEqual(bubble_sort_desc([1]), [1])

    def test_bubble_sort_desc_already_sorted(self):
        self.assertEqual(bubble_sort_desc([15, 8, 4]), [15, 8, 4])

    def test_bubble_sort_desc_reverse_sorted(self):
        self.assertEqual(bubble_sort_desc([4, 8, 15]), [15, 8, 4])

    def test_bubble_sort_desc_duplicates(self):
        self.assertEqual(bubble_sort_desc([5, 2, 5, 1]), [5, 5, 2, 1])

    def test_bubble_sort_desc_negative(self):
        self.assertEqual(bubble_sort_desc([-1, -5, 0, 2]), [2, 0, -1, -5])

    def test_bubble_sort_asc_empty(self):
        self.assertEqual(bubble_sort_asc([]), [])

    def test_bubble_sort_asc_single(self):
        self.assertEqual(bubble_sort_asc([1]), [1])

    def test_bubble_sort_asc_already_sorted(self):
        self.assertEqual(bubble_sort_asc([3, 4, 6, 9]), [3, 4, 6, 9])

    def test_bubble_sort_asc_reverse_sorted(self):
        self.assertEqual(bubble_sort_asc([9, 6, 4, 3]), [3, 4, 6, 9])

    def test_bubble_sort_asc_duplicates(self):
        self.assertEqual(bubble_sort_asc([5, 2, 5, 1]), [1, 2, 5, 5])

    def test_bubble_sort_asc_negative(self):
        self.assertEqual(bubble_sort_asc([-1, -5, 0, 2]), [-5, -1, 0, 2])


if __name__ == "__main__":
    unittest.main()
