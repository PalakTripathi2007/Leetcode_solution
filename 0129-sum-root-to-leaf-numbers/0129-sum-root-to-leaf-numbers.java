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
    public void dfs(TreeNode root ,int curr_num,int[] sum)
    {
        if(root==null)
        {
            return ;
        }
        curr_num=curr_num*10+root.val;
        if(root.left==null && root.right==null)
        {
            sum[0]+=curr_num;
        }
        dfs(root.left,curr_num,sum);
        dfs(root.right,curr_num,sum);
    }
    public int sumNumbers(TreeNode root)
    {
        int curr_num=root.val;
        int[] sum=new int[1];
        dfs(root,0,sum);
        return sum[0];
        
    }
}