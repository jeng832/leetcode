import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample() {
        Solution sol = new Solution();
        int actual = sol.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        Assert.assertEquals(6, actual);
    }

    @Test
    public void testBigArray() throws IOException {
        Solution sol = new Solution();
        Properties prop = new Properties();
        prop.load(getClass().getResourceAsStream("bigArray.properties"));
        String str = prop.getProperty("value");
        String[] strSplit = str.split(",");
        int[] input = new int[strSplit.length];
        for (int i = 0; i < strSplit.length; i++) {
            input[i] = Integer.parseInt(strSplit[i]);
        }
        int actual = sol.maxSubArray(input);
        Assert.assertEquals(6, actual);
    }

    @Test
    public void testOne() {
        Solution sol = new Solution();
        int actual = sol.maxSubArray(new int[]{1});
        Assert.assertEquals(1, actual);
    }
    @Test
    public void testAllNegative() {
        Solution sol = new Solution();
        int actual = sol.maxSubArray(new int[]{-1, -2, -3});
        Assert.assertEquals(-1, actual);
    }
}