from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class CacheListSolution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        cache_list = []
        pointer: ListNode = head
        while pointer:
            cache_list.append(pointer)
            pointer = pointer.next
        length = len(cache_list)
        index_to_be_removed = length - n
        index_before_removed = index_to_be_removed - 1
        index_after_removed = index_to_be_removed + 1
        if n == length:
            # remove the first node
            return head.next
        if n == 1:
            # remove the last node
            pointer_before = cache_list[index_before_removed]
            pointer_before.next = None
            return head
        else:
            pointer_before = cache_list[index_before_removed]
            pointer_before.next = cache_list[index_after_removed]
        return head

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        fast = dummy
        slow = dummy

        # Move fast pointer n steps ahead
        for _ in range(n):
            fast = fast.next

        # Move both pointers until fast reaches the end
        while fast.next:
            fast = fast.next
            slow = slow.next

        # slow.next is the node to be removed
        slow.next = slow.next.next

        return dummy.next


class TwoPointerSolution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy_head = ListNode(-1, head)
        tail_finding_pointer = dummy_head
        remove_node_previous_pointer = dummy_head
        remove_pointer_move_flag = False
        list_length = 0
        while tail_finding_pointer.next:
            tail_finding_pointer = tail_finding_pointer.next
            list_length += 1
            if remove_pointer_move_flag:
                remove_node_previous_pointer = remove_node_previous_pointer.next
            if list_length == n:
                remove_pointer_move_flag = True
        if remove_node_previous_pointer.next:
            remove_node_previous_pointer.next = remove_node_previous_pointer.next.next
        else:
            remove_node_previous_pointer.next = None
        return dummy_head.next



def list_to_list_node(int_list: list[int]) -> ListNode | None:
    if not int_list:
        return None

    head_pointer = ListNode(int_list[0])
    current_pointer = head_pointer

    for num in int_list[1:]:
        current_pointer.next = ListNode(num)
        current_pointer = current_pointer.next

    return head_pointer


if __name__ == "__main__":
    def print_linked_list(node: Optional[ListNode]):
        vals = []
        while node:
            vals.append(str(node.val))
            node = node.next
        print(" -> ".join(vals) if vals else "Empty List")

    # Debugging TwoPointerSolution
    print("Debugging TwoPointerSolution:")
    head = list_to_list_node([1, 2, 3, 4, 5])
    n = 2
    print(f"Input: 1->2->3->4->5, n={n}")

    solution = TwoPointerSolution()
    try:
        result = solution.removeNthFromEnd(head, n)
        print("Result: ", end="")
        print_linked_list(result)
    except Exception as e:
        print(f"Error during execution: {e}")
