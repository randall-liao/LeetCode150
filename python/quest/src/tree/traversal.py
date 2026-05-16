from typing import List, Optional, TypeVar, Deque
from collections import deque
from tree.node import Node

T = TypeVar("T")

def bfs(root: Optional[Node[T]]) -> List[T]:
    """
    Breadth-First Search (BFS) or Level-Order Traversal.
    
    BFS explores all the neighbor nodes at the present depth prior to moving on 
    to the nodes at the next depth level.
    Uses a Queue (FIFO) to keep track of nodes to visit.
    """
    # TODO: Implement BFS using a Queue (collections.deque)
    raise NotImplementedError("Implement this yourself!")

def dfs_pre_order(root: Optional[Node[T]]) -> List[T]:
    """
    Depth-First Search (DFS) - Pre-order Traversal (Root, Left, Right).
    
    DFS explores as far as possible along each branch before backtracking.
    Iterative implementation using a Stack (LIFO).
    """
    # TODO: Implement iterative Pre-order DFS using a Stack
    raise NotImplementedError("Implement this yourself!")

def dfs_in_order(root: Optional[Node[T]]) -> List[T]:
    """
    Depth-First Search (DFS) - In-order Traversal (Left, Root, Right).
    
    Commonly used on Binary Search Trees to get values in non-decreasing order.
    Recursive implementation.
    """
    # TODO: Implement recursive In-order DFS
    raise NotImplementedError("Implement this yourself!")

def dfs_post_order(root: Optional[Node[T]]) -> List[T]:
    """
    Depth-First Search (DFS) - Post-order Traversal (Left, Right, Root).
    
    Used to delete the tree or evaluate postfix expressions.
    Recursive implementation.
    """
    # TODO: Implement recursive Post-order DFS
    raise NotImplementedError("Implement this yourself!")
