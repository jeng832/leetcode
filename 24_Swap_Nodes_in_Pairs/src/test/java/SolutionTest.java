import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode actual = sol.swapPairs(list);
        ListNode expected = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEmpty() {
        Solution sol = new Solution();
        ListNode actual = sol.swapPairs(null);
        Assertions.assertEquals(null, actual);
    }

    @Test
    public void testOne() {
        Solution sol = new Solution();
        ListNode actual = sol.swapPairs(new ListNode(1));
        Assertions.assertEquals(new ListNode(1), actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        ListNode list = new ListNode(2, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(6, new ListNode(2, new ListNode(2)))))));
        ListNode actual = sol.swapPairs(list);
        ListNode expected = new ListNode(5, new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(6, new ListNode(2)))))));
        Assertions.assertEquals(expected.toString(), actual.toString());
    }

}