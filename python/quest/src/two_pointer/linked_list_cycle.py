from typing import Optional


class ListNode:

    def __init__(self, x):
        self.val = x
        self.next = None

class HashSetSolution:

    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        node_set = set()
        pointer = head
        while pointer:
            if pointer in node_set:
                return pointer
            else:
                node_set.add(pointer)
            pointer = pointer.next
        return None




class TwoPointerSolution:

    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        return