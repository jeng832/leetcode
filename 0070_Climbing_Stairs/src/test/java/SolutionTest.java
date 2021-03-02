import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int actual = sol.climbStairs(2);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int actual = sol.climbStairs(3);
        Assert.assertEquals(3, actual);
    }
}