import unittest
from sort.selection_sort import selection_sort_desc, selection_sort_asc

class TestSelectionSort(unittest.TestCase):
    def test_selection_sort_desc_empty(self):
        self.assertEqual(selection_sort_desc([]), [])

    def test_selection_sort_desc_single(self):
        self.assertEqual(selection_sort_desc([1]), [1])

    def test_selection_sort_desc_already_sorted(self):
        self.assertEqual(selection_sort_desc([15, 8, 4]), [15, 8, 4])

    def test_selection_sort_desc_reverse_sorted(self):
        self.assertEqual(selection_sort_desc([4, 8, 15]), [15, 8, 4])

    def test_selection_sort_desc_duplicates(self):
        self.assertEqual(selection_sort_desc([5, 2, 5, 1]), [5, 5, 2, 1])

    def test_selection_sort_desc_negative(self):
        self.assertEqual(selection_sort_desc([-1, -5, 0, 2]), [2, 0, -1, -5])

    def test_selection_sort_asc_empty(self):
        self.assertEqual(selection_sort_asc([]), [])

    def test_selection_sort_asc_single(self):
        self.assertEqual(selection_sort_asc([1]), [1])

    def test_selection_sort_asc_already_sorted(self):
        self.assertEqual(selection_sort_asc([4, 8, 15]), [4, 8, 15])

    def test_selection_sort_asc_reverse_sorted(self):
        self.assertEqual(selection_sort_asc([15, 8, 4]), [4, 8, 15])

    def test_selection_sort_asc_duplicates(self):
        self.assertEqual(selection_sort_asc([5, 2, 5, 1]), [1, 2, 5, 5])

    def test_selection_sort_asc_negative(self):
        self.assertEqual(selection_sort_asc([-1, -5, 0, 2]), [-5, -1, 0, 2])

if __name__ == '__main__':
    unittest.main()
