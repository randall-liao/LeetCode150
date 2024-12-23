package leetcode75.linkedlist;

import java.util.ArrayList;

public class MaximumTwinSumLinkedList {

  private static ArrayList<Integer> listNodeToArrayList(ListNode head) {
    ArrayList<Integer> list = new ArrayList<>();
    ListNode currentNode = head;
    while (currentNode != null) {
      list.add(currentNode.val);
      currentNode = currentNode.next;
    }
    return list;
  }

  private static Integer getTwinIndex(Integer i, Integer nSize) {
    return nSize - 1 - i;
  }

  /**
   * @param head
   * @return
   */
  public int pairSum(ListNode head) {
    ArrayList<Integer> intList = listNodeToArrayList(head);
    Integer listSize = intList.size();
    Integer maxTwinSum = Integer.MIN_VALUE;
    for (int i = 0; i < listSize / 2; i++) {
      Integer twinSum = intList.get(i) + intList.get(getTwinIndex(i, listSize));
      if (twinSum > maxTwinSum) {
        maxTwinSum = twinSum;
      }
    }
    return maxTwinSum;
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
