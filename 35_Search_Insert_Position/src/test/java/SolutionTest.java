import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int output = sol.searchInsert(new int[]{1,3,5,6}, 5);
        Assert.assertEquals(2, output);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int output = sol.searchInsert(new int[]{1,3,5,6}, 2);
        Assert.assertEquals(1, output);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        int output = sol.searchInsert(new int[]{1,3,5,6}, 7);
        Assert.assertEquals(4, output);
    }

    @Test
    public void testExample4() {
        Solution sol = new Solution();
        int output = sol.searchInsert(new int[]{1,3,5,6}, 0);
        Assert.assertEquals(0, output);
    }

    @Test
    public void testExampleOne() {
        Solution sol = new Solution();
        int output = sol.searchInsert(new int[]{1}, 1);
        Assert.assertEquals(0, output);
    }
}
