package leetcode75.linkedlist;

public class DeleteMiddleNodeLinkedList {

  private static int countNodes(ListNode head) {
    if (head == null) {
      return 0;
    }
    ListNode currentNode = head.next;
    int nodeCounter = 1;
    while (currentNode != null) {
      currentNode = currentNode.next;
      nodeCounter++;
    }
    return nodeCounter;
  }

  public static ListNode createListFromArray(int[] inputArray) {
    if (inputArray == null || inputArray.length == 0) {
      return null;
    }

    ListNode head = new DeleteMiddleNodeLinkedList().new ListNode(inputArray[0]);
    ListNode currentNode = head;

    for (int i = 1; i < inputArray.length; i++) {
      currentNode.next = new DeleteMiddleNodeLinkedList().new ListNode(inputArray[i]);
      currentNode = currentNode.next;
    }

    return head;
  }

  public ListNode deleteMiddle(ListNode head) {
    if (head.next == null) {
      return null;
    }
    int listSize = countNodes(head);
    int mid = listSize / 2;
    ListNode nodeBeforeMid = null;
    ListNode nodeAfterMid = null;
    int nodeCounter = 0;
    ListNode currentNode = head;
    while (nodeCounter < listSize) {
      if (nodeCounter == mid - 1) {
        nodeBeforeMid = currentNode;
      } else if (nodeCounter == mid + 1) {
        nodeAfterMid = currentNode;
      }
      currentNode = currentNode.next;
      nodeCounter++;
    }
    nodeBeforeMid.next = nodeAfterMid;
    return head;
  }

  public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
