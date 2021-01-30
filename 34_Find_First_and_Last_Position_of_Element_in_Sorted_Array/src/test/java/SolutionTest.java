import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample() {
        Solution sol = new Solution();
        int[] actual = sol.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        Assert.assertArrayEquals(new int[] {3, 4}, actual);
    }

    @Test
    public void testNotFound() {
        Solution sol = new Solution();
        int[] actual = sol.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        Assert.assertArrayEquals(new int[] {-1, -1}, actual);
    }

    @Test
    public void testEmpty() {
        Solution sol = new Solution();
        int[] actual = sol.searchRange(new int[]{}, 0);
        Assert.assertArrayEquals(new int[] {-1, -1}, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int[] actual = sol.searchRange(new int[]{1, 3}, 1);
        Assert.assertArrayEquals(new int[] {0,0}, actual);
    }
}