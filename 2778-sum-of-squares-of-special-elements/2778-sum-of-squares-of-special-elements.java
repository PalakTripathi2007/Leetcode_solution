class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        double square=0;
        double sum=0;
        for(int i=0;i<n;i++)
        {
            if(n % (i+1)==0)
            {
              
              sum=sum+(nums[i]*nums[i]);
            }
        }
        return (int)sum;
    }
}