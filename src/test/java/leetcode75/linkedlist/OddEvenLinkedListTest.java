package leetcode75.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class OddEvenLinkedListTest {

    private static OddEvenLinkedList.ListNode createListFromArray(int[] inputArray, OddEvenLinkedList oddEvenLinkedList) {
        if (inputArray == null || inputArray.length == 0) {
            return null;
        }

        OddEvenLinkedList.ListNode head = oddEvenLinkedList.new ListNode(inputArray[0]);
        OddEvenLinkedList.ListNode currentNode = head;

        for (int i = 1; i < inputArray.length; i++) {
            currentNode.next = oddEvenLinkedList.new ListNode(inputArray[i]);
            currentNode = currentNode.next;
        }

        return head;
    }

    private static int[] listToArray(OddEvenLinkedList.ListNode head) {
        if (head == null) return new int[0];
        java.util.List<Integer> result = new java.util.ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    void testOddEvenList_singleNode() {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        OddEvenLinkedList.ListNode head = oddEvenLinkedList.new ListNode(1);

        OddEvenLinkedList.ListNode result = oddEvenLinkedList.oddEvenList(head);

        assertArrayEquals(new int[]{1}, listToArray(result), "A single-node list should remain unchanged");
    }

    @Test
    void testOddEvenList_doubleNode() {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        int[] input = {1,2};
        OddEvenLinkedList.ListNode head = createListFromArray(input, oddEvenLinkedList);
        OddEvenLinkedList.ListNode result = oddEvenLinkedList.oddEvenList(head);
        int[] expected = {1,2};
        System.out.println(Arrays.toString( listToArray(result)));
        assertArrayEquals(expected, listToArray(result), "The odd and even indexed nodes should be grouped as expected");
    }

    @Test
    void testOddEvenList_multipleNodes() {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        int[] input = {1, 2, 3, 4, 5};
        OddEvenLinkedList.ListNode head = createListFromArray(input, oddEvenLinkedList);

        OddEvenLinkedList.ListNode result = oddEvenLinkedList.oddEvenList(head);

        // Expected list: odd nodes [1, 3, 5] followed by even nodes [2, 4]
        int[] expected = {1, 3, 5, 2, 4};
        System.out.println(Arrays.toString( listToArray(result)));
        assertArrayEquals(expected, listToArray(result), "The odd and even indexed nodes should be grouped as expected");
    }

    @Test
    void testOddEvenList_emptyList() {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

        OddEvenLinkedList.ListNode result = oddEvenLinkedList.oddEvenList(null);

        assertNull(result, "An empty list should return null");
    }

    @Test
    void testOddEvenList_exampleTwo(){
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        int[] input = {2,1,3,5,6,4,7};
        OddEvenLinkedList.ListNode head = createListFromArray(input, oddEvenLinkedList);
        OddEvenLinkedList.ListNode result = oddEvenLinkedList.oddEvenList(head);
        int[] expected = {2,3,6,7,1,5,4};
        System.out.println(Arrays.toString( listToArray(result)));
        assertArrayEquals(expected, listToArray(result), "The odd and even indexed nodes should be grouped as expected");
    }
}
