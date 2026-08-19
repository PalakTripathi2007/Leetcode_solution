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
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode>st=new Stack<>();
        ListNode curr=head;
        ListNode p1=head;
        while(curr!=null)
        {
            st.push(curr);
            curr=curr.next;

        }
        while(!st.isEmpty())
        {
                if(p1.val != st.pop().val)
                {
                    return false;
                }
                 p1=p1.next;
        }
    return true;
    }
}