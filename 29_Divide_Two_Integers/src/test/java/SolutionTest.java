import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int actual = sol.divide(10, 3);
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int actual = sol.divide(7, -3);
        Assert.assertEquals(-2, actual);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        int actual = sol.divide(0, 1);
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testExample4() {
        Solution sol = new Solution();
        int actual = sol.divide(1, 1);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testExample5() {
        Solution sol = new Solution();
        int actual = sol.divide(-2147483648, -1);
        Assert.assertEquals(2147483647, actual);
    }

    @Test
    public void testExample6() {
        Solution sol = new Solution();
        int actual = sol.divide(2147483647, 2);
        Assert.assertEquals(1073741823, actual);
    }

    @Test
    public void testExample7() {
        Solution sol = new Solution();
        int actual = sol.divide(-2147483648, 2);
        Assert.assertEquals(-1073741824, actual);
    }
}