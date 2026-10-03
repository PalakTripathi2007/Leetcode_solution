class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original=image[sr][sc];
        if(original==color)
        return image;
        dfs(sr,sc,color,image,original);
        return image;
    }
    public void dfs(int sr,int sc,int color,int[][] image,int original)
    {
        int n =image.length;
        int m=image[0].length;
        if(sr<0||sr>=n||sc<0||sc>=m||image[sr][sc]!=original)
        {
            return;
        }
        image[sr][sc]=color;
        dfs(sr+1,sc,color,image,original);
        dfs(sr-1,sc,color,image,original);
        dfs(sr,sc+1,color,image,original);
        dfs(sr,sc-1,color,image,original);

    }
}