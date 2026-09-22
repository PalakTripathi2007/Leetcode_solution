class Solution {
    public int findCircleNum(int[][] isConnected) {
      int n=isConnected.length;
      Queue<Integer>q=new LinkedList<>();
      boolean[] visited=new boolean[n];
      int count=0;
      for(int j=0;j<n;j++)
      {
        if(visited[j])
        {
            continue;
        }
        count++;
        q.offer(j);
        visited[j]=true;
      
      while(!q.isEmpty())
      {
        int curr=q.poll();
        for(int i=0;i<n;i++)
        {
            if(isConnected[curr][i]==1&&!visited[i])
            {
                
                visited[i]=true;
                q.offer(i);
            }
        }
      }
      }
      return count;

    }
}