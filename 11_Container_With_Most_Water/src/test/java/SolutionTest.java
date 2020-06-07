import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testMaxArea() {
        int[] input = {1,8,6,2,5,4,8,3,7};
        Solution sol = new Solution();
        Assert.assertEquals(49, sol.maxArea(input));

    }
}
