package leetcode75.linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return head;
    }
    LinkedList<ListNode> nodes = new LinkedList<>();
    ListNode currentNode = head;
    while (currentNode != null) {
      nodes.add(currentNode);
      currentNode = currentNode.next;
    }
    ListNode reversedHead = new ListNode(nodes.removeLast().val);
    ListNode reverseCurrentNode = reversedHead;
    while (!nodes.isEmpty()) {
      reverseCurrentNode.next = new ListNode(nodes.removeLast().val);
      reverseCurrentNode = reverseCurrentNode.next;
    }
    return reversedHead;
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
