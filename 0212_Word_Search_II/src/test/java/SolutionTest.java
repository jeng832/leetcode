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
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> actual = sol.findWords(board, words);
        Assert.assertTrue(assertEquals(Arrays.asList("eat", "oath"), actual));
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        char[][] board = {
                {'a', 'b'},
                {'c', 'd'}
        };
        String[] words = {"abcd"};
        List<String> actual = sol.findWords(board, words);
        Assert.assertTrue(assertEquals(Collections.emptyList(), actual));
    }

    private boolean assertEquals(List<String> expected, List<String> actual) {
        if (expected.size() != actual.size()) return false;
        for (String elem : expected) {
            if (!actual.contains(elem)) return false;
        }
        return true;
    }
}