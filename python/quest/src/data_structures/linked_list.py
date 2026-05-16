from typing import List


class ListNode[T]:
    def __init__(self, x: T):
        self.val = x
        self.next = None


def createLinkedList[T](arr: List[T]) -> ListNode[T] | None:
    if not arr:
        return None
    head = ListNode(arr[0])
    cur = head
    for index in range(1, len(arr)):
        cur.next = ListNode(arr[index])
        cur = cur.next
    return head


def print_linked_list(list_node: ListNode) -> None:
    if list_node is None:
        return
    while list_node is not None:
        print(list_node.val)
        list_node = list_node.next


def insert_to_end_linked_list[T](list_node: ListNode[T], val: T) -> ListNode[T] | None:
    if list_node is None:
        return
    while list_node.next is not None:
        list_node = list_node.next
    list_node.next = ListNode(val)
    return list_node.next
