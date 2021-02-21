import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample() {
        Solution sol = new Solution();
        ListNode actual = sol.reverseBetween(new ListNode(5), 1, 1);
        ListNode expected = new ListNode(5);
        Assert.assertEquals(expected.toString(), actual.toString());
        Assert.assertTrue(isEquals(new ListNode(5), actual));

    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        ListNode actual = sol.reverseBetween(new ListNode(3, new ListNode(5)), 1, 1);
        ListNode expected = new ListNode(3, new ListNode(5));
        Assert.assertEquals(expected.toString(), actual.toString());
        Assert.assertTrue(isEquals(expected, actual));
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        ListNode actual = sol.reverseBetween(new ListNode(3, new ListNode(5)), 1, 2);
        ListNode expected = new ListNode(5, new ListNode(3));
        Assert.assertEquals(expected.toString(), actual.toString());
        Assert.assertTrue(isEquals(expected, actual));
    }

    private boolean isEquals(ListNode expected, ListNode actual) {
        while (expected.val == actual.val) {
            expected = expected.next;
            actual = actual.next;
            if (expected == null & actual == null) return true;
        }
        return false;
    }

}