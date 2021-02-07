import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample() {
        Solution sol = new Solution();
        int[][] actual = sol.generateMatrix(3);
        int[][] expected = {
                {1,2,3},
                {8,9,4},
                {7,6,5}};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int[][] actual = sol.generateMatrix(1);
        int[][] expected = {{1}};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int[][] actual = sol.generateMatrix(2);
        int[][] expected = {{1,2}, {4,3}};
        Assert.assertArrayEquals(expected, actual);
    }
}