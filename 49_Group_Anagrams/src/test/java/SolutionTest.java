import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample() {
        Solution sol = new Solution();
        List<List<String>> actual = sol.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        List<List<String>> expected = Arrays.asList(Arrays.asList("bat"), Arrays.asList("nat", "tan"), Arrays.asList("ate", "eat", "tea"));
        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testEmptyString() {
        Solution sol = new Solution();
        List<List<String>> actual = sol.groupAnagrams(new String[]{""});
        List<List<String>> expected = Arrays.asList(Arrays.asList(""));
        Assert.assertTrue(assertEquals(expected, actual));
    }

    @Test
    public void testLengthOne() {
        Solution sol = new Solution();
        List<List<String>> actual = sol.groupAnagrams(new String[]{"a"});
        List<List<String>> expected = Arrays.asList(Arrays.asList("a"));
        Assert.assertTrue(assertEquals(expected, actual));
    }

    public boolean assertEquals(List<List<String>> expected, List<List<String>> actual) {
        if (expected.size() != actual.size()) return false;
        for (List<String> anagrams : expected) {
            anagrams.sort(String::compareTo);
        }
        for (List<String> anagrams : actual) {
            anagrams.sort(String::compareTo);
        }

        for (List<String> anagrams : expected) {
            if (!actual.contains(anagrams)) return false;
        }
        return true;
    }

}