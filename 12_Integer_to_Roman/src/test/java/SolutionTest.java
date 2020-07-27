import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testExample() {
        Solution sol = new Solution();
        checkAssert(3, "III");
        checkAssert(4, "IV");
        checkAssert(9, "IX");
        checkAssert(58, "LVIII");
        checkAssert(1994, "MCMXCIV");
    }

    public void checkAssert(int input, String expected) {
        Solution sol = new Solution();
        String ret = sol.intToRoman(input);
        Assert.assertEquals(expected, ret);
    }
}
