class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int balance=0;
        int addition=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                balance++;
            }
            else
            {
                if(balance>0)
                {
                    balance--;
                }
                else
                {
                    addition++;
                }
            }
        }
        
        return balance+addition;

    }
}