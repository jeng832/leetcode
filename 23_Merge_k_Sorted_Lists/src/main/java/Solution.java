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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1 && lists[0] == null) return null;
        ListNode merged = lists[0];
        for (int i = 1; i < lists.length; i++) {
            merged = merge(merged, lists[i]);
        }

        return merged;
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode head = null;
        ListNode current1 = null;
        ListNode current2 = null;
        ListNode currentMerge = head;
        if (list1.val < list2.val) {
            head = new ListNode(list1.val);
            current1 = list1.next;
            current2 = list2;
            currentMerge = head;
        } else if (list1.val > list2.val) {
            head = new ListNode(list2.val);
            current1 = list1;
            current2 = list2.next;
            currentMerge = head;
        } else {
            head = new ListNode(list1.val, new ListNode(list2.val));
            current1 = list1.next;
            current2 = list2.next;
            currentMerge = head.next;
        }

        while (current1 != null || current2 != null) {
            if (current1 == null) {
                currentMerge.next = new ListNode(current2.val);
                current2 = current2.next;
                currentMerge = currentMerge.next;
                continue;
            }
            if (current2 == null) {
                currentMerge.next = new ListNode(current1.val);
                current1 = current1.next;
                currentMerge = currentMerge.next;
                continue;
            }
            if (current1.val == current2.val) {
                ListNode nextNext = new ListNode(current2.val);
                currentMerge.next = new ListNode(current1.val, nextNext);
                current1 = current1.next;
                current2 = current2.next;
                currentMerge = nextNext;
            } else if (current1.val < current2.val) {
                currentMerge.next = new ListNode(current1.val);
                current1 = current1.next;
                currentMerge = currentMerge.next;
            } else {
                currentMerge.next = new ListNode(current2.val);
                current2 = current2.next;
                currentMerge = currentMerge.next;
            }
        }
        return head;
    }
}