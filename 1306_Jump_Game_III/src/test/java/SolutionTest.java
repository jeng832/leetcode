import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        boolean actual = sol.canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 5);
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        boolean actual = sol.canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 0);
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        boolean actual = sol.canReach(new int[]{3,0,2,1,2}, 2);
        Assert.assertEquals(false, actual);
    }

    @Test
    public void testTwoDestinations() {
        Solution sol = new Solution();
        boolean actual = sol.canReach(new int[]{0, 3,0,6,3,3,4}, 6);
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testManyOnes() {
        Solution sol = new Solution();
        boolean actual = sol.canReach(new int[]{1,1,1,1,1,1,1,1,0}, 3);
        Assert.assertEquals(true, actual);
    }
}