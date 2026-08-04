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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Stack<TreeNode>stk=new Stack<>();
        Stack<Integer>sums=new Stack<>();
        if (root == null) return false;

        stk.push(root);
        sums.push(root.val);
       while(!stk.isEmpty()){
        int sum=sums.pop();
        TreeNode Node=stk.pop();
        if(Node.left==null && Node.right==null&&sum==targetSum)
        { 
            return true;
        }
        if(Node.left!=null)
            {
                stk.push(Node.left);
                sums.push(sum+Node.left.val);
            }
        if(Node.right!=null)
        {
            stk.push(Node.right);
            sums.push(sum+Node.right.val);
        }
        }

        return false;
    }
}