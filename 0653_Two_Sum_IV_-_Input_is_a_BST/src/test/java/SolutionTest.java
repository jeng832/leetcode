import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7)));
        boolean actual = sol.findTarget(root, 9);
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(1);
        boolean actual = sol.findTarget(root, 2);
        Assert.assertEquals(false, actual);
    }
}