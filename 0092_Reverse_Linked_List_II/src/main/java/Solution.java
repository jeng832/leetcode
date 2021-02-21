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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null) return head;
        ListNode current = head;
        ListNode headEnd = null;
        for (int i = 0; i < left - 1; i++) {
            headEnd = current;
            current = current.next;
        }

        Stack<ListNode> stack = new Stack<>();
        for (int i = 0; i < right - left + 1; i++) {
            stack.push(current);
            current = current.next;
        }
        ListNode tail = current;
        current = (headEnd == null) ? head : headEnd;
        ListNode start = (headEnd == null) ? stack.peek() : head;

        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }
        current.next = tail;

        return start;
    }
}