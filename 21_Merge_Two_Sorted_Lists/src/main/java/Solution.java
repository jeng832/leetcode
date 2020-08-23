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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        ListNode node = new ListNode();
        ListNode current = node;
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        while (currentL1 != null && currentL2 != null) {
            if (currentL1.val < currentL2.val) {
                current.val = currentL1.val;
                currentL1 = currentL1.next;
            } else {
                current.val = currentL2.val;
                currentL2 = currentL2.next;
            }
            current.next = new ListNode();
            current = current.next;
        }
        if (currentL1 != null) {
            while (currentL1 != null) {
                current.val = currentL1.val;
                currentL1 = currentL1.next;
                if (currentL1 != null) {
                    current.next = new ListNode();
                    current = current.next;
                }
            }
        }
        if (currentL2 != null) {
            while (currentL2 != null) {
                current.val = currentL2.val;
                currentL2 = currentL2.next;
                if (currentL2 != null) {
                    current.next = new ListNode();
                    current = current.next;
                }
            }
        }
        return node;
    }
}