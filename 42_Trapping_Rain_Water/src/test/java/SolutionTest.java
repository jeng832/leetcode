import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample() {
        Solution sol = new Solution();
        int actual = sol.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});

        Assert.assertEquals(6, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int actual = sol.trap(new int[]{4,2,0,3,2,5});

        Assert.assertEquals(9, actual);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        int actual = sol.trap(new int[]{4,2,0});

        Assert.assertEquals(0, actual);
    }
}