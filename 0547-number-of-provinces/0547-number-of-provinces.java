class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited= new boolean[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                dfs(i,isConnected,visited);
                count++;
            }
        }
        return count;
    }
    public void dfs(int src,int[][] isConnected,boolean[] visited)
    {
        visited[src]=true;
        int n=isConnected.length;
        for(int i=0;i<n;i++)
        {
            if(isConnected[src][i]==1 && !visited[i])
            dfs(i,isConnected,visited);
        }
    }
}