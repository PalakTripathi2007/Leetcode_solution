class Solution {
    public int findCenter(int[][] edges) {
     int n=edges.length +1;
     int[] degree=new int[n+1];
     
     for(int[] t:edges)
     {
        int a=t[0];
        int b=t[1];
        degree[a]++;
        degree[b]++;
     }
     for(int i=1;i<=n;i++)
     {
        if(degree[i]==n-1)
          return i;
     }
     return -1;
    }
}