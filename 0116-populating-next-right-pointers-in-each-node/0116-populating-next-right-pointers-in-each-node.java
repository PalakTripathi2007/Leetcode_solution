/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {  
        if(root==null)
        return root;
         Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        { 
        int levelsize=q.size();
          for(int i=1;i<=levelsize;i++)
          {
            Node current_Node=q.peek();
            q.poll();
            if(i<levelsize)
            {
                current_Node.next=q.peek();
            }
            else
            {
                current_Node.next=null;
            }
    
            if(current_Node.left!=null)
            {
                q.offer(current_Node.left);
            }
            if(current_Node.right!=null)
            {
                q.offer(current_Node.right);
                
            }
            
          }
        }
        
            return root;
        }
}