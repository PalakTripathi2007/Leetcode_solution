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
    public boolean isCousins(TreeNode root, int x, int y) {
     if(root==null)
     return false;
       Queue<TreeNode>q=new LinkedList<>();
       q.offer(root);
       boolean ans;
       while(!q.isEmpty())
       {
        int level_size=q.size();
        boolean cousins=false;
        boolean sibling=false;
        for(int i=1;i<=level_size;i++)
        {  
            TreeNode curr_node=q.peek();
            q.poll();
            if(curr_node==null)
            {
                sibling=false;
                continue;
            }
            if(curr_node.val==x || curr_node.val==y)
            {
                if(cousins==false)
                {
                    cousins=true;
                    sibling=true;
                }
                else
                {
                   if(sibling==true)
                   {
                    return false;
                   }
                   else
                   {
                    return true;
                   }
                }
            }
           if(curr_node.left!=null)
           {
            q.offer(curr_node.left);
           }
           if(curr_node.right!=null)
           {
            q.offer(curr_node.right);
           }
           q.offer(null);
            
        }
       }
           return false;
    }
}