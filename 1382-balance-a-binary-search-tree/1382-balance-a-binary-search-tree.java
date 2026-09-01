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
    public void inorder(TreeNode root,List<Integer>ans)
    {
        if(root==null)
        return ;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
     public TreeNode ConstructBST(List<Integer>ans,int l,int h)
    {
        if(l>h)
        {
            return null;
        }
    
           int mid=l+(h-l)/2;
           TreeNode root=new TreeNode(ans.get(mid));
          root.left= ConstructBST(ans,l,mid-1);
           root.right=ConstructBST(ans,mid+1,h);
            return root;
        
    }
    
      public TreeNode balanceBST(TreeNode root)
    {
        List<Integer>ans=new ArrayList<>();
        inorder(root,ans);
        return ConstructBST(ans,0,ans.size()-1);
              
    }
}