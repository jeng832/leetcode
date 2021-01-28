import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testExample() {
        Solution sol = new Solution();
        int[][] heightMap = {
            {1, 4, 3, 1, 3, 2},
            {3, 2, 1, 3, 2, 4},
            {2, 3, 3, 2, 3, 1}
        };
        int actual = sol.trapRainWater(heightMap);
        Assert.assertEquals(4, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int[][] heightMap = {
                {1, 4, 1, 1, 1, 2},
                {3, 2, 1, 3, 2, 4},
                {2, 3, 3, 2, 3, 1}
        };
        int actual = sol.trapRainWater(heightMap);
        Assert.assertEquals(0, actual);
    }

}