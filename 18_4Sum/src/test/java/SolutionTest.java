import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        Assertions.assertEquals(
                Arrays.asList(Arrays.asList(-2,-1,1,2),Arrays.asList(-2,0,0,2), Arrays.asList(-1,0,0,1))
                , actual);
    }
    @Test
    public void testEmpty() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.fourSum(new int[]{}, 0);
        Assertions.assertEquals(Collections.emptyList(), actual);
    }
}