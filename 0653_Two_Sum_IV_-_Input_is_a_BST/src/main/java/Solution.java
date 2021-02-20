import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    Set<Integer> exist = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return treeTravel(root, k);
    }

    private boolean treeTravel(TreeNode root, int k) {
        boolean childCheck = root.left != null && treeTravel(root.left, k);
        childCheck |= root.right != null && treeTravel(root.right, k);
        if (childCheck) return true;
        if (exist.contains(k - root.val)) return true;
        exist.add(root.val);
        return isExist(root, k - root.val, root);
    }

    private boolean isExist(TreeNode root, int value, TreeNode except) {
        if (root == null) return false;
        if (root != except && root.val == value) return true;
        return isExist(root.left, value, except) || isExist(root.right, value, except);
    }



}
