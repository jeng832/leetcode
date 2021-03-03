/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxDepth;
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        maxDepth = 1;
        dfs(root, 1);

        return maxDepth;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) return;
        maxDepth = Math.max(maxDepth, depth);
        if (root.left != null) {
            dfs(root.left, depth + 1);
        }
        if (root.right != null) {
            dfs(root.right, depth + 1);
        }
    }
}