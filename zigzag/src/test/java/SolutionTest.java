import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testConvert() {
        String s = "PAYPALISHIRING";
        Solution sol = new Solution();
        String ret = sol.convert(s, 3);
        Assert.assertEquals("PAHNAPLSIIGYIR", ret);
        ret = sol.convert(s, 4);
        Assert.assertEquals("PINALSIGYAHRPI", ret);
        ret = sol.convert("AB", 1);
        Assert.assertEquals("AB", ret);
    }
}
