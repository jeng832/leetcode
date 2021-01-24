import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SolutionTest {
    @Test
    public void testExample1() {
        Solution sol = new Solution();
        List<String> actual = sol.letterCombinations("23");
        Assertions.assertEquals(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"), actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        List<String> actual = sol.letterCombinations("");
        Assertions.assertEquals(Collections.emptyList(), actual);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        List<String> actual = sol.letterCombinations("2");
        Assertions.assertEquals(Arrays.asList("a", "b","c"), actual);
    }
}