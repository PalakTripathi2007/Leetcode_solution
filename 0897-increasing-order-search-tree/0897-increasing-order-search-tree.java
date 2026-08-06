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
    public List<Integer>in_dfs(TreeNode root)
    {
        List<Integer>ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        ans.addAll(in_dfs(root.left));
        ans.add(root.val);
        ans.addAll(in_dfs(root.right));
       return ans;
    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        ans=in_dfs(root);
        TreeNode dummy=new TreeNode(0);
        TreeNode curr=dummy;
        for(int val:ans)
        {
            curr.right=new TreeNode(val);
            curr=curr.right;  
        }
        return dummy.right;
    }
}