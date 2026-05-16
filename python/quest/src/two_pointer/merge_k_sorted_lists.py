import heapq
from typing import List, Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __lt__(self, other):
        return  self.val < other.val

def list_to_list_node(int_list: list[int]) -> ListNode | None:
    if not int_list:
        return None

    head_pointer = ListNode(int_list[0])
    current_pointer = head_pointer

    for num in int_list[1:]:
        current_pointer.next = ListNode(num)
        current_pointer = current_pointer.next

    return head_pointer

def list_node_to_list(list_node: ListNode | None) -> List:
    if not list_node:
        return []
    result_list = []
    while list_node:
        result_list.append(list_node.val)
        list_node = list_node.next
    return result_list

class Solution:

    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if not lists:
            return None
        result_list = []
        for head_node in lists:
            list_item = list_node_to_list(head_node)
            for item in list_item:
                result_list.append(item)
        result_list.sort()
        return list_to_list_node(result_list)

class LinkedListSolution:

    def mergeKLists(self, lists: list[ListNode] | None) -> ListNode | None:
        if not lists:
            return None
        heap_queue = []
        dummy_head = ListNode(-1)
        pointer = dummy_head
        for i, head in enumerate(lists):
            if head is not None:
                heapq.heappush(heap_queue, (head.val,i,head))
        while heap_queue:
            val, i, node = heapq.heappop(heap_queue)
            pointer.next = node
            if node.next is not None:
                heapq.heappush(heap_queue,(node.next.val, i, node.next))
            pointer = pointer.next
        return dummy_head.next

class HeapQueueSolution:

    def mergeKLists(self, lists: list[ListNode] | None) -> ListNode | None:
        result_dummy_head: ListNode = ListNode(-1)
        result_list_pointer = result_dummy_head
        priority_queue: list = []
        for i, head in enumerate(lists):
            heapq.heappush(priority_queue,(head.val, head))
        while priority_queue:
            val, pointer = heapq.heappop(priority_queue)
            result_list_pointer.next = ListNode(val)
            result_list_pointer = result_list_pointer.next
            if pointer.next:
                heapq.heappush(priority_queue, (pointer.next.val, pointer.next))
        return result_dummy_head.next



if __name__ == '__main__':
    hqs = HeapQueueSolution()
    test1 = list_to_list_node([2, 2, 3])
    test2 = list_to_list_node([2, 3, 4])
    test3 = list_to_list_node([3, 4, 5])
    test_lists = [test1, test2, test3]
    print(str(list_node_to_list(hqs.mergeKLists(test_lists))))


