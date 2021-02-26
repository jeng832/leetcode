import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int[][] obstacleGrid = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        int actual = sol.uniquePathsWithObstacles(obstacleGrid);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int[][] obstacleGrid = {
                {0,1},
                {0,0}
        };
        int actual = sol.uniquePathsWithObstacles(obstacleGrid);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testSmallest() {
        Solution sol = new Solution();
        int[][] obstacleGrid = {
                {0}
        };
        int actual = sol.uniquePathsWithObstacles(obstacleGrid);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testSmallest2() {
        Solution sol = new Solution();
        int[][] obstacleGrid = {
                {1}
        };
        int actual = sol.uniquePathsWithObstacles(obstacleGrid);
        Assert.assertEquals(0, actual);
    }
}