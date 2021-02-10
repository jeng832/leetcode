import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int[][] actual = sol.spiralMatrixIII(1, 4, 0, 0);
        int[][] expected = {{0, 0},{0, 1},{0, 2},{0, 3}};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int[][] actual = sol.spiralMatrixIII(5, 6, 1, 4);
        int[][] expected = {{1,4},{1,5},{2,5},{2,4},{2,3},{1,3},{0,3},{0,4},{0,5},{3,5},{3,4},{3,3},{3,2},{2,2},{1,2},{0,2},{4,5},{4,4},{4,3},{4,2},{4,1},{3,1},{2,1},{1,1},{0,1},{4,0},{3,0},{2,0},{1,0},{0,0}};
        Assert.assertArrayEquals(expected, actual);
    }
}