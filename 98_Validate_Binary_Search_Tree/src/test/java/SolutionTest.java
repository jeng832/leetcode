import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        boolean actual = sol.isValidBST(root);
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        boolean actual = sol.isValidBST(root);
        Assert.assertEquals(false, actual);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(1, null, new TreeNode(1));
        boolean actual = sol.isValidBST(root);
        Assert.assertEquals(false, actual);
    }
    @Test
    public void testExample4() {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7)));
        boolean actual = sol.isValidBST(root);
        Assert.assertEquals(false, actual);
    }
}