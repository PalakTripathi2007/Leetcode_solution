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
    public List<List<Integer>>levelOrder(TreeNode root)
    {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Queue<TreeNode>q=new LinkedList<>(); 
           q.offer(root);
        while(!q.isEmpty())
        {
            int curr_length=q.size();
            List<Integer> row= new ArrayList<>();
            for(int i=1;i<=curr_length;i++)
            {
              TreeNode node=q.poll();
              row.add(node.val);
              if(node.left!=null)
              {
                 q.offer(node.left);
              }
              if(node.right!=null)
              {
                q.offer(node.right);
              }
            }
            ans.add(row);
        }
        
  return ans;
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result= levelOrder(root);
         Collections.reverse(result);
         return result;
        
    }
}