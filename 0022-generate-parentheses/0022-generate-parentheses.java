class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
         backtracking("",0,0,n,result);
        return result;
    }
    public void backtracking(String current,int open ,int close,int n,List<String>result)
    {
        if(open==n && close==n)
        {
            result.add(current);
            return;
        }
        if(open <n)
        {
            backtracking(current+"(",open+1,close,n,result);
        }
        if(close<open)
        {
            backtracking(current+")",open,close+1,n,result);
        }
    }
}