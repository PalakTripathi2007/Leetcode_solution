/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode construct(List<Integer>ans,int l,int h)
    {
        
        if(l>h)
        return null;
        int mid=l+(h-l)/2;
        TreeNode root= new TreeNode(ans.get(mid));
        root.left=construct(ans,l,mid-1);
        root.right=construct(ans,mid+1,h);
        return root;

    }
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp=head;
        List<Integer>ans=new ArrayList<>();
        while(temp!=null)
        { 
            ans.add(temp.val);
             temp=temp.next;
            
        }
        return construct(ans,0,ans.size()-1);
    }
}