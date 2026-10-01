class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited= new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        int count=0;
        q.offer(0);
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                bfs(i,isConnected,visited);
                count++;
            }
        }
        return count;
    }
    public void bfs(int src,int[][] isConnected,boolean[] visited)
    {
        Queue<Integer>q=new LinkedList<>();
        q.offer(src);
        while(!q.isEmpty())
        {
            int curr=q.poll();
            for(int i=0;i<isConnected.length;i++)
            {
                if(isConnected[curr][i]==1 && !visited[i])
                {
                    visited[i]=true;
                    q.offer(i);
                }
            }
        }
    }
}