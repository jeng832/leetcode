import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void testExample() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(new Integer[]{-1, 0, 1}));
        expected.add(Arrays.asList(new Integer[]{-1, -1, 2}));
        runTest(new int[]{-1, 0, 1, 2, -1, -4}, expected);
    }

    private void runTest(int[] input, List<List<Integer>> expected) {
        Solution sol = new Solution();
        List<List<Integer>> output = sol.threeSum(input);
        Assert.assertEquals(expected, output);
    }
}
