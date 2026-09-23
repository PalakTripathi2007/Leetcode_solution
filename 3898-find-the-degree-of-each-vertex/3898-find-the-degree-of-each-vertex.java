class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int r= matrix[0].length;
        int[] res=new int[r];
        for(int i=0;i<n;i++)
        {
            int count=0;
        for(int neighbour:matrix[i])
        {
            if(neighbour==1)
            count++;
            res[i]=count;
        }
        }
        return res;
    }
}