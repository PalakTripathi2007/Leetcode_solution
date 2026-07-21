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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        
        if(!checkLeft(root.left, root.val)) return false;

        if(!checkRight(root.right, root.val)) return false;

        return isValidBST(root.left) && isValidBST(root.right);
    }

    private boolean checkLeft(TreeNode node, int limit) {
        if(node == null) return true;
        if(node.val >= limit) return false;
        return checkLeft(node.left, limit) && checkLeft(node.right, limit);
    }

    private boolean checkRight(TreeNode node, int limit) {
        if(node == null) return true;
        if(node.val <= limit) return false;
        return checkRight(node.left, limit) && checkRight(node.right, limit);
    }
}
