class Solution {
    public int numIslands(char[][] grid) {
        int src=0;
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                      dfs(grid,i,j);
                }
            }
        }
       return count;
        
    }
    void dfs(char[][]grid,int i,int j)
    {
      boolean[] visited=new boolean[grid[0].length];
      int n=grid.length;
      if(i<0||i>=n||j<0||j>=grid[0].length||grid[i][j] != '1')
      { 
        return;
      }
      if(grid[i][j]!='1')
      {
        return;
      }
      grid[i][j] = '0';
      dfs(grid,i+1,j);
      dfs(grid,i-1,j);
      dfs(grid,i,j-1);
      dfs(grid,i,j+1);
      
    }
}