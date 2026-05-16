import unittest
from tree.node import Node
from tree.traversal import bfs, dfs_pre_order, dfs_in_order, dfs_post_order

class TestTraversal(unittest.TestCase):
    def setUp(self):
        r"""
        Create a simple binary tree for testing:
              1
             / \
            2   3
           / \   \
          4   5   6
        """
        self.root = Node(1)
        self.root.left = Node(2)
        self.root.right = Node(3)
        self.root.left.left = Node(4)
        self.root.left.right = Node(5)
        self.root.right.right = Node(6)

    def test_bfs(self):
        # BFS (Level-order): 1, 2, 3, 4, 5, 6
        expected = [1, 2, 3, 4, 5, 6]
        self.assertEqual(bfs(self.root), expected)

    def test_dfs_pre_order(self):
        # DFS Pre-order: 1, 2, 4, 5, 3, 6
        expected = [1, 2, 4, 5, 3, 6]
        self.assertEqual(dfs_pre_order(self.root), expected)

    def test_dfs_in_order(self):
        # DFS In-order: 4, 2, 5, 1, 3, 6
        expected = [4, 2, 5, 1, 3, 6]
        self.assertEqual(dfs_in_order(self.root), expected)

    def test_dfs_post_order(self):
        # DFS Post-order: 4, 5, 2, 6, 3, 1
        expected = [4, 5, 2, 6, 3, 1]
        self.assertEqual(dfs_post_order(self.root), expected)

    def test_empty_tree(self):
        self.assertEqual(bfs(None), [])
        self.assertEqual(dfs_pre_order(None), [])
        self.assertEqual(dfs_in_order(None), [])
        self.assertEqual(dfs_post_order(None), [])

if __name__ == '__main__':
    unittest.main()
