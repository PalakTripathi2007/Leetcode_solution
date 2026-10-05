class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>st= new Stack<>();
        int score=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(score);
                score=0;
            }
            else
            {
                if(score==0)
                score=1;
                else
                {
                score=2*score;
                }
                  score=score+st.pop();
            }
        }
        return score;
    }
}