package leetcode75.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumTwinSumLinkedListTest {

  private static MaximumTwinSumLinkedList.ListNode createListFromArray(
      int[] inputArray, MaximumTwinSumLinkedList MaximumTwinSumLinkedList) {
    if (inputArray == null || inputArray.length == 0) {
      return null;
    }

    MaximumTwinSumLinkedList.ListNode head = MaximumTwinSumLinkedList.new ListNode(inputArray[0]);
    MaximumTwinSumLinkedList.ListNode currentNode = head;

    for (int i = 1; i < inputArray.length; i++) {
      currentNode.next = MaximumTwinSumLinkedList.new ListNode(inputArray[i]);
      currentNode = currentNode.next;
    }

    return head;
  }

  @Test
  void pairSum_exampleOne() {
    int[] inputArray = {5, 4, 2, 1};
    MaximumTwinSumLinkedList maxTwinSum = new MaximumTwinSumLinkedList();
    MaximumTwinSumLinkedList.ListNode head = createListFromArray(inputArray, maxTwinSum);
    int expected = 6;
    assertEquals(expected, maxTwinSum.pairSum(head));
  }

  @Test
  void pairSum_exampleTwo() {
    int[] inputArray = {4, 2, 2, 3};
    MaximumTwinSumLinkedList maxTwinSum = new MaximumTwinSumLinkedList();
    MaximumTwinSumLinkedList.ListNode head = createListFromArray(inputArray, maxTwinSum);
    int expected = 7;
    assertEquals(expected, maxTwinSum.pairSum(head));
  }

  @Test
  void pairSum_exampleThree() {
    int[] inputArray = new int[10000];
    for (int i = 1; i < inputArray.length; i++) {
      inputArray[i] = i + 1;
    }
    MaximumTwinSumLinkedList maxTwinSum = new MaximumTwinSumLinkedList();
    MaximumTwinSumLinkedList.ListNode head = createListFromArray(inputArray, maxTwinSum);
    int expected = 10001;
    assertEquals(expected, maxTwinSum.pairSum(head));
  }
}
