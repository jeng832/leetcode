import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testBase() {
        Solution sol = new Solution();
        String actual = sol.countAndSay(1);
        Assert.assertEquals("1", actual);
    }

    @Test
    public void testExample() {
        Solution sol = new Solution();
        String actual = sol.countAndSay(4);
        Assert.assertEquals("1211", actual);
    }
}