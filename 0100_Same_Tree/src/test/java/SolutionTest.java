import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        boolean actual = sol.isSameTree(p, q);
        Assert.assertEquals(true, actual);
    }
}