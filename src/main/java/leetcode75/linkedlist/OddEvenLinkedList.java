package leetcode75.linkedlist;

public class OddEvenLinkedList {

  public ListNode oddEvenList(ListNode head) {
    // Edge case, when length of the list is smaller than 2
    if (head == null || head.next == null) {
      return head;
    }
    boolean isOdd = true;
    ListNode currentNode = head;
    // init odd and even list
    ListNode oddList = new ListNode(head.val);
    ListNode evenList = new ListNode(head.next.val);
    ListNode oddListHead = oddList;
    ListNode evenListHead = evenList;
    currentNode = currentNode.next.next;
    while (currentNode != null) {
      if (isOdd) {
        oddList.next = new ListNode(currentNode.val);
        oddList = oddList.next;
        currentNode = currentNode.next;
        isOdd = false;
      } else {
        evenList.next = new ListNode(currentNode.val);
        evenList = evenList.next;
        currentNode = currentNode.next;
        isOdd = true;
      }
    }
    oddList.next = evenListHead;
    return oddListHead;
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
