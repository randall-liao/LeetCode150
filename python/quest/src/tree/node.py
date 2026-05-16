from typing import Generic, Optional, TypeVar

T = TypeVar("T")

class Node(Generic[T]):
    """
    A basic node for a binary tree.
    """
    def __init__(self, value: T):
        self.value = value
        self.left: Optional[Node[T]] = None
        self.right: Optional[Node[T]] = None

    def __repr__(self) -> str:
        return f"Node({self.value})"
