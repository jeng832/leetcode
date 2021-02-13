import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testSingle() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.subsets(new int[]{1});
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(), Arrays.asList(1));

        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testTwice() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.subsets(new int[]{1, 2});
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(), Arrays.asList(1), Arrays.asList(2), Arrays.asList(1,2));

        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.subsets(new int[]{1, 2, 3});
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(),
                Arrays.asList(1),Arrays.asList(2),Arrays.asList(3),
                Arrays.asList(1, 2),Arrays.asList(1,3),Arrays.asList(2,3), Arrays.asList(1,2,3));

        Assert.assertTrue(assertEquals(expected, actual));
    }

    private boolean assertEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
        System.out.println("expected: " + expected);
        System.out.println("actual: " + actual);
        if (expected.size() != actual.size()) return false;
        for (int i = 0; i < expected.size(); i++) {
            if (!actual.contains(expected.get(i))) return false;
        }
        return true;
    }

}