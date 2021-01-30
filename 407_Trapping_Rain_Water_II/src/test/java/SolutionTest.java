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

    @Test
    public void testSimple3() {
        Solution sol = new Solution();
        int[][] heightMap = {
                {12,13,1,12},
                {13,4,13,12},
                {13,8,10,12},
                {12,13,12,12},
                {13,13,13,13}
        };
        int actual = sol.trapRainWater(heightMap);
        Assert.assertEquals(14, actual);
    }

    @Test
    public void testSimple() {
        Solution sol = new Solution();
        int[][] heightMap = {
                {3, 3, 3, 3},
                {3, 2, 1, 3},
                {3, 3, 3, 3}
        };
        int actual = sol.trapRainWater(heightMap);
        Assert.assertEquals(3, actual);
    }

}