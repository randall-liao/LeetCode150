from typing import Optional


class ListNode:

    def __init__(self, x):
        self.val = x
        self.next = None

    def __str__(self):
        return str(self.val)

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
        fast_pointer = head
        slow_pointer = head
        while fast_pointer and fast_pointer.next:
            fast_pointer = fast_pointer.next.next
            slow_pointer = slow_pointer.next
            if slow_pointer == fast_pointer:
                break

        if not fast_pointer or not fast_pointer.next:
            return None
        slow_pointer = head
        while fast_pointer != slow_pointer:
            fast_pointer = fast_pointer.next
            slow_pointer = slow_pointer.next
        return slow_pointer