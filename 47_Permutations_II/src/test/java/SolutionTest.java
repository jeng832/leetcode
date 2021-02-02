import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.permuteUnique(new int[]{1, 1, 2});
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 1), Arrays.asList(2, 1, 1));

        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.permuteUnique(new int[]{1, 2, 3});
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2), Arrays.asList(2, 1, 3), Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2), Arrays.asList(3, 2, 1));

        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testSizeOne() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.permuteUnique(new int[]{1});
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1));

        Assert.assertTrue(assertEquals(expected, actual));
    }

    private boolean assertEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
        if (expected.size() != actual.size()) return false;
        System.out.println(actual);
        for (List<Integer> elem : expected) {
            if (!actual.contains(elem)) return false;
        }
        return true;
    }
}