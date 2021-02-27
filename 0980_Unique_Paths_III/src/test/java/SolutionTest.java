import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int[][] grid = {
                {1,0,0,0},
                {0,0,0,0},
                {0,0,2,-1}
        };
        int actual = sol.uniquePathsIII(grid);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int[][] grid = {
                {1,0,0,0},
                {0,0,0,0},
                {0,0,0,2}
        };
        int actual = sol.uniquePathsIII(grid);
        Assert.assertEquals(4, actual);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        int[][] grid = {
                {0,1},
                {2,0}
        };
        int actual = sol.uniquePathsIII(grid);
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testSmallest() {
        Solution sol = new Solution();
        int[][] grid = {
                {1, 2}
        };
        int actual = sol.uniquePathsIII(grid);
        Assert.assertEquals(1, actual);
    }
}