/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        head = swapPair(head, head.next);
        ListNode current = head.next.next;
        ListNode before = head.next;
        while (current != null && current.next != null) {
            before.next = swapPair(current, current.next);
            before = current;
            current = current.next;
        }
        if (current != null) before.next = current;
        return head;
    }
    private ListNode swapPair(ListNode node1, ListNode node2) {
        node1.next = node2.next;
        node2.next = node1;
        return node2;
    }
}