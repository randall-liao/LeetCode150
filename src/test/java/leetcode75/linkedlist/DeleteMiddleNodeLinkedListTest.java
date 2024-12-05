package leetcode75.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeleteMiddleNodeLinkedListTest {

  DeleteMiddleNodeLinkedList deleteMiddleNodeLinkedList = new DeleteMiddleNodeLinkedList();

  @Test
  void deleteMiddle_exampleOne() {
    int[] inputArray = {1, 3, 4, 7, 1, 2, 6};

    // Use the static method to create the linked list
    DeleteMiddleNodeLinkedList.ListNode listNode =
        DeleteMiddleNodeLinkedList.createListFromArray(inputArray);

    // Create an instance of the class to call deleteMiddle
    DeleteMiddleNodeLinkedList deleteMiddleNodeLinkedList = new DeleteMiddleNodeLinkedList();
    DeleteMiddleNodeLinkedList.ListNode updatedList =
        deleteMiddleNodeLinkedList.deleteMiddle(listNode);

    // Assertions to verify the result
    assertNotNull(updatedList);
    assertEquals(1, updatedList.val);
    assertEquals(3, updatedList.next.val);
    assertEquals(4, updatedList.next.next.val);
    assertEquals(1, updatedList.next.next.next.val); // Middle node (7) should be deleted
    assertEquals(2, updatedList.next.next.next.next.val);
    assertEquals(6, updatedList.next.next.next.next.next.val);
  }

  @Test
  void deleteMiddle_exampleTwo() {
    int[] inputArray = {1, 2, 3, 4};

    // Use the static method to create the linked list
    DeleteMiddleNodeLinkedList.ListNode listNode =
        DeleteMiddleNodeLinkedList.createListFromArray(inputArray);

    // Create an instance of the class to call deleteMiddle
    DeleteMiddleNodeLinkedList deleteMiddleNodeLinkedList = new DeleteMiddleNodeLinkedList();
    DeleteMiddleNodeLinkedList.ListNode updatedList =
        deleteMiddleNodeLinkedList.deleteMiddle(listNode);

    // Assertions to verify the result
    assertNotNull(updatedList);
    assertEquals(1, updatedList.val);
    assertEquals(2, updatedList.next.val);
    assertEquals(4, updatedList.next.next.val);
  }

  @Test
  void deleteMiddle_exampleThree() {
    int[] inputArray = {2, 1};

    // Use the static method to create the linked list
    DeleteMiddleNodeLinkedList.ListNode listNode =
        DeleteMiddleNodeLinkedList.createListFromArray(inputArray);

    // Create an instance of the class to call deleteMiddle
    DeleteMiddleNodeLinkedList deleteMiddleNodeLinkedList = new DeleteMiddleNodeLinkedList();
    DeleteMiddleNodeLinkedList.ListNode updatedList =
        deleteMiddleNodeLinkedList.deleteMiddle(listNode);

    // Assertions to verify the result
    assertNotNull(updatedList);
    assertEquals(2, updatedList.val);
  }

  @Test
  void deleteMiddle_exampleOneNode() {
    int[] inputArray = {2};

    // Use the static method to create the linked list
    DeleteMiddleNodeLinkedList.ListNode listNode =
        DeleteMiddleNodeLinkedList.createListFromArray(inputArray);

    // Create an instance of the class to call deleteMiddle
    DeleteMiddleNodeLinkedList deleteMiddleNodeLinkedList = new DeleteMiddleNodeLinkedList();
    DeleteMiddleNodeLinkedList.ListNode updatedList =
        deleteMiddleNodeLinkedList.deleteMiddle(listNode);

    // Assertions to verify the result
    assertNull(updatedList);
  }
}
