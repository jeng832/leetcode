import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int actual = sol.countVowelStrings(1);
        Assert.assertEquals(5, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int actual = sol.countVowelStrings(2);
        Assert.assertEquals(15, actual);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        int actual = sol.countVowelStrings(33);
        Assert.assertEquals(66045, actual);
    }

    @Test
    public void testExample4() {
        Solution sol = new Solution();
        int actual = sol.countVowelStrings(50);
        Assert.assertEquals(316251, actual);
    }
}