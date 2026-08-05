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
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        int sum=0;
        while(!q.isEmpty())
        {
           TreeNode Node=q.poll();
           int curr=q.size();
       
        if(Node.left!=null){
           if(Node.left.left==null && Node.left.right==null)
           {
            sum=sum+Node.left.val;
           }
           else
           {
            q.offer(Node.left);
           }
        }
        if (Node.right != null) {
                q.offer(Node.right);
            }
        
        }
        return sum;
    }
}