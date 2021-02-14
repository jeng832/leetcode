import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        boolean actual = sol.canJump(new int[] {2,3,1,1,4});
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        boolean actual = sol.canJump(new int[] {3,2,1,0,4});
        Assert.assertEquals(false, actual);
    }
}