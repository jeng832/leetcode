import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class SolutionTest {

    @Test
    public void testReverse() {


        Solution sol = new Solution();
        Assert.assertEquals(-2143847412, sol.reverse(-2147483412));
    }

    @Test
    public void testMulti() {
        Solution sol = new Solution();
        Assert.assertEquals(Optional.of(2), sol.multiply(1,2));
    }

    @Test
    public void test() {
        System.out.println(Integer.MAX_VALUE);
    }
}
