package leetcode75.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

  private static ReverseLinkedList.ListNode createListFromArray(
      int[] inputArray, ReverseLinkedList reverseLinkedList) {
    if (inputArray == null || inputArray.length == 0) {
      return null;
    }

    ReverseLinkedList.ListNode head = reverseLinkedList.new ListNode(inputArray[0]);
    ReverseLinkedList.ListNode currentNode = head;

    for (int i = 1; i < inputArray.length; i++) {
      currentNode.next = reverseLinkedList.new ListNode(inputArray[i]);
      currentNode = currentNode.next;
    }

    return head;
  }

  private static int[] listToArray(ReverseLinkedList.ListNode head) {
    if (head == null) return new int[0];
    java.util.List<Integer> result = new java.util.ArrayList<>();
    while (head != null) {
      result.add(head.val);
      head = head.next;
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  @Test
  void testReverseList_singleNode() {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ReverseLinkedList.ListNode head = reverseLinkedList.new ListNode(1);

    ReverseLinkedList.ListNode result = reverseLinkedList.reverseList(head);

    assertArrayEquals(
        new int[] {1}, listToArray(result), "A single-node list should remain unchanged");
  }

  @Test
  void testReverseList_multipleNodes() {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    int[] input = {1, 2, 3, 4, 5};
    ReverseLinkedList.ListNode head = createListFromArray(input, reverseLinkedList);

    ReverseLinkedList.ListNode result = reverseLinkedList.reverseList(head);

    // Expected list after reversing: [5, 4, 3, 2, 1]
    int[] expected = {5, 4, 3, 2, 1};
    assertArrayEquals(expected, listToArray(result), "The list should be reversed correctly");
  }

  @Test
  void testReverseList_emptyList() {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    ReverseLinkedList.ListNode result = reverseLinkedList.reverseList(null);

    assertNull(result, "An empty list should return null");
  }
}
