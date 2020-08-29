import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        Assert.assertEquals(2, sol.strStr("hello", "ll"));
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        Assert.assertEquals(-1, sol.strStr("aaaaa", "bba"));
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        Assert.assertEquals(-1, sol.strStr("aaa", "aaaa"));
    }

    @Test
    public void testExample4() {
        Solution sol = new Solution();
        Assert.assertEquals(4, sol.strStr("mississippi", "issip"));
    }
    @Test
    public void testEmpty() {
        Solution sol = new Solution();
        String haystack = "anyone";
        Assert.assertEquals(0, sol.strStr(haystack, ""));
        Assert.assertEquals(0, sol.strStr(haystack, null));
    }
}
