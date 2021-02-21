import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        ListNode input = makeList(new int[]{1, 2, 3, 4, 5});
        ListNode actual = sol.reverseList(input);
        ListNode expected = makeList(new int[] {5,4,3,2,1});
        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        ListNode input = makeList(new int[]{1, 2});
        ListNode actual = sol.reverseList(input);
        ListNode expected = makeList(new int[] {2,1});
        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        ListNode input = makeList(new int[]{});
        ListNode actual = sol.reverseList(input);
        ListNode expected = makeList(new int[] {});
        Assert.assertEquals(expected.toString(), actual.toString());
    }

    private ListNode makeList(int[] nums) {
        if (nums.length == 0) return new ListNode();
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }

}