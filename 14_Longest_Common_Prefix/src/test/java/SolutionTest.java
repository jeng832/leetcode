import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testExample() {
        Solution sol = new Solution();
        String[] strs = new String[]{"flower", "flow", "flight"};
        Assert.assertEquals("fl", sol.longestCommonPrefix(strs));
        strs = new String[]{"dog", "racecar", "car"};
        Assert.assertEquals("", sol.longestCommonPrefix(strs));
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        String[] strs = new String[]{"a"};
        Assert.assertEquals("a", sol.longestCommonPrefix(strs));
    }
}
