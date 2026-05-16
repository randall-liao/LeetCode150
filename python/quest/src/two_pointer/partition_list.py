from typing import Optional


class ListNode:

    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __str__(self):
        pointer = self
        value_list = []
        while pointer:
            value_list.append(str(pointer.val))
            pointer = pointer.next
        return " -> ".join(value_list)



def list_to_list_node(int_list: list[int]) -> ListNode | None:
    if not int_list:
        return None

    head_pointer = ListNode(int_list[0])
    current_pointer = head_pointer

    for num in int_list[1:]:
        current_pointer.next = ListNode(num)
        current_pointer = current_pointer.next

    return head_pointer


class Solution:

    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        if not head:
            return None
        left_dummy_head = ListNode(-1)
        right_dummy_head = ListNode(-1)
        left_pointer = left_dummy_head
        right_pointer = right_dummy_head
        pointer = head
        while pointer:
            if pointer.val < x:
                # append to the left half
                left_pointer.next = ListNode(pointer.val)
                left_pointer = left_pointer.next
            else:
                # append to the right half
                right_pointer.next = ListNode(pointer.val)
                right_pointer = right_pointer.next
            pointer = pointer.next
        left_pointer.next = right_dummy_head.next
        return left_dummy_head.next

if __name__ == "__main__":
    test_list = [1, 4, 3, 2, 5, 2]
    test_x = 3
    test_list_node = list_to_list_node(test_list)
    sol = Solution()
    print(str(sol.partition(test_list_node, test_x)))

