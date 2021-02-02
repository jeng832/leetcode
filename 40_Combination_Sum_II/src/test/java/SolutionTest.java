import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1,1,6), Arrays.asList(1,2,5), Arrays.asList(1,7), Arrays.asList(2,6));

        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1,2,2), Arrays.asList(5));

        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testEdge() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.combinationSum2(new int[]{2}, 2);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2));

        Assert.assertTrue(assertEquals(expected, actual));

        actual = sol.combinationSum2(new int[]{1}, 2);
        expected = Collections.emptyList();

        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testShortArray() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.combinationSum2(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 27);
        List<List<Integer>> expected = Collections.emptyList();

        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testShortArray2() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.combinationSum2(new int[]{1,1,1}, 27);
        List<List<Integer>> expected = Collections.emptyList();

        Assert.assertTrue(assertEquals(expected, actual));
    }

    public boolean assertEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
        if (expected.size() != actual.size()) return false;
        for (List<Integer> list : expected) {
            list.sort(Integer::compareTo);
        }
        for (List<Integer> list : actual) {
            list.sort(Integer::compareTo);
        }

        for (List<Integer> list : expected) {
            if (!actual.contains(list)) return false;
        }
        return true;
    }

}