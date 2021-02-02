import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testExample() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.permute(new int[]{1, 2, 3});
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(1,3,2),Arrays.asList(2,1,3),
                Arrays.asList(2,3,1), Arrays.asList(3,1,2), Arrays.asList(3,2,1));
        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.permute(new int[]{0, 1});
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1,0));
        System.out.println(actual);
        Assert.assertTrue(assertEquals(expected, actual));
    }

    private boolean assertEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
        if (expected.size() != actual.size()) return false;

        for (List<Integer> elem : expected) {
            if (!actual.contains(elem)) return false;
        }
        return true;
    }
}