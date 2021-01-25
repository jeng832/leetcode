import java.util.Stack;

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 1 && head.next == null) return null;
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        while (current.next != null) {
            stack.push(current);
            current = current.next;
        }
        stack.push(current);

        ListNode next = null;
        ListNode before = null;
        for (int i = 0; i < n + 1; i++) {
            if (stack.isEmpty()) break;
            ListNode node = stack.pop();
            if (i == n - 2) {
                next = node;
            }
            if (i == n) {
                before = node;
            }
        }
        if (before != null) before.next = next;
        if (next != null && before == null) head = next;
        return head;
    }
}