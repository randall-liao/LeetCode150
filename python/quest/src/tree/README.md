# Tree Traversals: BFS & DFS

This directory contains resources for learning Breadth-First Search (BFS) and Depth-First Search (DFS) using binary trees.

## Contents

- `node.py`: Defines a basic `Node` class for building trees.
- `traversal.py`: Implementations of BFS and three variants of DFS (Pre-order, In-order, Post-order).
- `learn_traversal.py`: A script that demonstrates how each traversal visits nodes.

## How to Learn

1. **Understand the Tree Node**: Start by looking at `node.py`. It's a simple container with a value and pointers to left and right children.
2. **Explore BFS**: Open `traversal.py` and read the `bfs` function. Note its use of a **Queue** (FIFO).
3. **Explore DFS**: Look at the different DFS implementations.
    - **Pre-order**: Root -> Left -> Right (Iterative with a Stack).
    - **In-order**: Left -> Root -> Right (Recursive).
    - **Post-order**: Left -> Right -> Root (Recursive).
4. **Run the Demo**: Execute the learning script to see the results on a sample tree.
   ```bash
   python3 src/tree/learn_traversal.py
   ```
5. **Run Tests**: Check out `tests/tree/test_traversal.py` to see how the traversals are verified and run them:
   ```bash
   python3 -m unittest tests/tree/test_traversal.py
   ```

## Key Concepts

- **BFS (Level-Order)**: Good for finding the shortest path in an unweighted graph/tree.
- **DFS**: Uses less memory than BFS on very wide trees. Different orders are useful for different tasks (e.g., In-order on a BST gives sorted output).
