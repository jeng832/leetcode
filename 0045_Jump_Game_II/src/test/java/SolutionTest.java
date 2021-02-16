import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int actual = sol.jump(new int[] {2,3,1,1,4});
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int actual = sol.jump(new int[] {2,3,0,1,4});
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        int actual = sol.jump(new int[] {2,1});
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testBigInput() throws IOException {
        Properties prop = new Properties();
        prop.load(getClass().getResourceAsStream("BigInput.properties"));
        String str = prop.getProperty("value");
        String[] strSplit = str.split(",");
        int[] input = new int[strSplit.length];
        for (int i = 0; i < strSplit.length; i++) {
            input[i] = Integer.parseInt(strSplit[i]);
        }
        Solution sol = new Solution();
        int actual = sol.jump(input);
        Assert.assertEquals(2, actual);
    }
}