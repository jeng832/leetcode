
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testExample() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.combinationSum(new int[]{2, 3, 6, 7}, 7);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 3), Arrays.asList(7));

        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.combinationSum(new int[]{2, 3, 5}, 8);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 2, 2), Arrays.asList(2,3,3), Arrays.asList(3, 5));

        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testEarlyReturn() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.combinationSum(new int[]{2}, 1);
        List<List<Integer>> expected = Collections.emptyList();

        Assert.assertTrue(assertEquals(expected, actual));
    }

    private boolean assertEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
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