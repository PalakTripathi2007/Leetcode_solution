class Solution {
    int max_area=0;
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    int current_area=dfs(i,j,grid);
                    max_area=Math.max(max_area,current_area);
                }
            }
        }
        return max_area;
    }
    int dfs(int r,int c,int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        if(r<0||r>=n||c<0||c>=m||grid[r][c]!=1)
        {
           return 0;
        }
        grid[r][c] = 0;
        return 1+ dfs(r-1,c,grid)+dfs(r+1,c,grid)+dfs(r,c-1,grid)+dfs(r,c+1,grid);

    }
}