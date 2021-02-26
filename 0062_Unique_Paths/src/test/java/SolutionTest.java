import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int actual = sol.uniquePaths(3, 2);
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int actual = sol.uniquePaths(7, 3);
        Assert.assertEquals(28, actual);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        int actual = sol.uniquePaths(3, 3);
        Assert.assertEquals(6, actual);
    }

    @Test
    public void testBig() {
        Solution sol = new Solution();
        int actual = sol.uniquePaths(23, 12);
        Assert.assertEquals(193536720, actual);
    }
}