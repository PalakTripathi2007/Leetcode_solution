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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
    if(root==null)
    {
        return ans;
    }
    Queue<TreeNode>q=new LinkedList<>();
    q.offer(root);
    boolean flag=true;
    while(!q.isEmpty())
    {
     List<Integer>row=new ArrayList<>();
     int curr_length=q.size();
     for(int i=0;i<curr_length;i++)
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
     if(flag){
     ans.add(row);
     }
     else
     {
        Collections.reverse(row);
        ans.add(row);
     }
      flag=!flag;
    }
    return ans;
        
    }
}