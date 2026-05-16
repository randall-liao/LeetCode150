

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1: ListNode | None, list2: ListNode | None) -> ListNode | None:
        dummy_head = ListNode(-1)
        current_pointer = dummy_head
        pointer_l1 = list1
        pointer_l2 = list2
        while pointer_l1 and pointer_l2:
            if pointer_l1.val < pointer_l2.val:
                current_pointer.next = pointer_l1
                pointer_l1 = pointer_l1.next
            else:
                current_pointer.next = pointer_l2
                pointer_l2 = pointer_l2.next
            current_pointer = current_pointer.next
        while pointer_l1:
            current_pointer.next = pointer_l1
            current_pointer = current_pointer.next
            pointer_l1 = pointer_l1.next
        while pointer_l2:
            current_pointer.next = pointer_l2
            current_pointer = current_pointer.next
            pointer_l2 = pointer_l2.next
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
    list1 = [1, 2, 3]
    list2 = [2, 3, 4]
    sol = Solution()
    expected = [1, 2, 2, 3, 3, 4]
    result = sol.mergeTwoLists(list_to_list_node(list1), list_to_list_node(list2))
    current = result

    for num in expected:
        assert current is not None
        assert current.val == num
        current = current.next

    assert current is None  # ensure no extra nodes
