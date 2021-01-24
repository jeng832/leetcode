import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testExample() {
        Solution sol = new Solution();
        int actual = sol.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int actual = sol.threeSumClosest(new int[]{0, 2, 1, -3}, 1);
        Assertions.assertEquals(0, actual);
    }
}