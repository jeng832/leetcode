import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        int actual = sol.minPathSum(grid);
        Assert.assertEquals(7, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int[][] grid = {
                {1,2,3},
                {4,5,6}
        };
        int actual = sol.minPathSum(grid);
        Assert.assertEquals(12, actual);
    }

    @Test
    public void testMinimal() {
        Solution sol = new Solution();
        int[][] grid = {
                {1}
        };
        int actual = sol.minPathSum(grid);
        Assert.assertEquals(1, actual);
    }
}