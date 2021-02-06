import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample() {
        Solution sol = new Solution();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        List<Integer> actual = sol.spiralOrder(matrix);
        Assert.assertEquals(Arrays.asList(1,2,3,6,9,8,7,4,5), actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        List<Integer> actual = sol.spiralOrder(matrix);
        Assert.assertEquals(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7), actual);
    }

    @Test
    public void testSmall() {
        Solution sol = new Solution();
        int[][] matrix = {{1}};
        List<Integer> actual = sol.spiralOrder(matrix);
        Assert.assertEquals(Arrays.asList(1), actual);
    }
    @Test
    public void test2x2() {
        Solution sol = new Solution();
        int[][] matrix = {
                {1,2},
                {3,4}};
        List<Integer> actual = sol.spiralOrder(matrix);
        Assert.assertEquals(Arrays.asList(1, 2, 4, 3), actual);
    }

}