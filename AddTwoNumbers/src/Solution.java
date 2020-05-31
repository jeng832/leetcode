import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    private static long power(long num, int e) {
        long ret = 1;
        for (int i = 0; i < e; i++) {
            ret *= num;
        }
        return ret;
    }
    private static long convertToNumber(long num, int pos, ListNode l) {
        if(l.next == null) {
            return num + l.val * power(10, pos);
        }
        num = num + l.val * power(10, pos);
        return convertToNumber(num, pos + 1, l.next);
    }

    private static ListNode convertToListNode(long num) {
        ListNode head = new ListNode((int)(num % 10));
        if (num < 10) return head;
        ListNode before = head;
        long curNum = num;
        do {
            curNum /= 10;
            ListNode current = new ListNode((int)(curNum % 10));
            if (head.next == null) {
                head.next = current;
            } else {
                before.next = current;
            }
            before = current;
        } while (curNum >= 10);
        return head;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long nL1 = convertToNumber(0, 0, l1);
        long nL2 = convertToNumber(0, 0, l2);
        long sum = nL1 + nL2;

        return convertToListNode(sum);
    }
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode curL = l1;
        ListNode curR = l2;
        boolean carriage = false;
        ListNode head = new ListNode((curL.val + curR.val) < 10 ? (curL.val + curR.val):(curL.val + curR.val)%10);
        if ((curL.val + curR.val) >= 10) carriage = true;
        if(curL.next == null && curR.next == null && !carriage) return head;

        ListNode curAns = head;
        ListNode curr = null;
        do {
            curL = (curL == null) ? null : curL.next;
            curR = (curR == null) ? null : curR.next;
            int valL = (curL == null) ? 0 : curL.val;
            int valR = (curR == null) ? 0 : curR.val;
            int val = 0;
            if ((valL + valR) < 10) {
                val = valL + valR;
            } else {
                val = (valL + valR)%10;
            }
            if (carriage) {
                if (val == 9) val = 0;
                else val += 1;
            }
            curr = new ListNode(val);
            if ((valL + valR) >= 10 || (val == 0 && carriage)) {
                carriage = true;
            } else {
                carriage = false;
            }
            curAns.next = curr;
            curAns = curr;
        } while((((curL == null) ? null : curL.next) != null || ((curR == null) ? null : curR.next) != null));

        if (carriage) {
            curr.next = new ListNode(1);
        }
        return head;
    }

    private static ListNode getNode(int[] nums) {
        ListNode node = new ListNode(nums[0]);
        ListNode before = node;
        for (int i = 1; i < nums.length; i++) {
            ListNode cur = new ListNode(nums[i]);
            before.next = cur;
            before = cur;
        }
        return node;
    }
    public static void main(String[] args) {
        ListNode n = getNode(new int[] {1});
        ListNode n2 = getNode(new int[] {9,9});

        ListNode l = addTwoNumbers2(n, n2);
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
