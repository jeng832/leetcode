import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample3x3() {
        Solution sol = new Solution();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        sol.rotate(matrix);
        int[][] expected = {
                {7,4,1},
                {8,5,2},
                {9,6,3}};
        Assert.assertArrayEquals(expected, matrix);
    }

    @Test
    public void testExample4x4() {
        Solution sol = new Solution();
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        sol.rotate(matrix);
        int[][] expected = {
                {13,9,5,1},
                {14,10,6,2},
                {15,11,7,3},
                {16,12,8,4}};
        Assert.assertArrayEquals(expected, matrix);
    }

}