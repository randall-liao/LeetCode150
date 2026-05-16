from tree.node import Node
from tree.traversal import bfs, dfs_pre_order, dfs_in_order, dfs_post_order

def print_tree_structure():
    """
    Shows the tree structure used in this demonstration.
    """
    print("\nTarget Binary Tree:")
    print("      1")
    print("     / \\")
    print("    2   3")
    print("   / \\   \\")
    print("  4   5   6")

def main():
    # Setup the same tree as in tests
    root = Node(1)
    root.left = Node(2)
    root.right = Node(3)
    root.left.left = Node(4)
    root.left.right = Node(5)
    root.right.right = Node(6)

    print_tree_structure()

    print("\n--- Breadth-First Search (BFS) ---")
    print("BFS visits nodes level-by-level using a Queue (FIFO).")
    print(f"Result (Level-order): {bfs(root)}")

    print("\n--- Depth-First Search (DFS) ---")
    print("DFS explores as deep as possible before backtracking using a Stack (LIFO or Recursion).")
    
    print("\n1. Pre-order (Root, Left, Right):")
    print("   Good for creating a copy of a tree.")
    print(f"   Result: {dfs_pre_order(root)}")

    print("\n2. In-order (Left, Root, Right):")
    print("   In a Binary Search Tree (BST), this visits nodes in ascending order.")
    print(f"   Result: {dfs_in_order(root)}")

    print("\n3. Post-order (Left, Right, Root):")
    print("   Useful for deleting a tree or calculating its size (bottom-up approach).")
    print(f"   Result: {dfs_post_order(root)}")

if __name__ == "__main__":
    main()
