class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class TwoPointerSolution:


    def middleNode(self, head: ListNode | None) -> ListNode | None:
        if not ListNode:
            return None
        dummy_head = ListNode(-1, head)
        fast_pointer = dummy_head
        slow_pointer = dummy_head
        # fast pointer walks two times faster than the slow pointer, so when the fast pointer reaches the end, the slow find the middle
        fast_pointer_step = 0
        length = -1
        while fast_pointer:
            fast_pointer = fast_pointer.next
            fast_pointer_step += 1
            length += 1
            if fast_pointer_step == 2:
                slow_pointer = slow_pointer.next
                fast_pointer_step = 0
        if length % 2 == 1:
            # even return middle
            return slow_pointer
        if length % 2 == 0:
            # odd return middle.next
            return slow_pointer.next
        return None

class TwoPointerNoDummySolution:

    def middleNode(self, head: ListNode | None) -> ListNode | None:
        fast_pointer = head
        slow_pointer = head
        while fast_pointer and fast_pointer.next:
            fast_pointer = fast_pointer.next.next
            slow_pointer = slow_pointer.next
        return slow_pointer

