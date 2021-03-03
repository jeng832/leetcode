import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1(){
        Solution sol = new Solution();
        TreeNode root = makeTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        int actual = sol.maxDepth(root);
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testExample2(){
        Solution sol = new Solution();
        TreeNode root = makeTree(new Integer[]{1, null, 2});
        int actual = sol.maxDepth(root);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testExample3(){
        Solution sol = new Solution();
        TreeNode root = makeTree(new Integer[]{});
        int actual = sol.maxDepth(root);
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testExample4(){
        Solution sol = new Solution();
        TreeNode root = makeTree(new Integer[]{0});
        int actual = sol.maxDepth(root);
        Assert.assertEquals(1, actual);
    }

    private TreeNode makeTree(Integer[] values) {
        if (values.length == 0) return null;
        return makeSubTree(values, 0);

    }

    private TreeNode makeSubTree(Integer[] values, int index) {
        if (index >= values.length || values[index] == null) return null;
        TreeNode node = new TreeNode(values[index]);
        node.left = makeSubTree(values, index * 2 + 1);
        node.right = makeSubTree(values, index * 2 + 2);
        return node;
    }

}