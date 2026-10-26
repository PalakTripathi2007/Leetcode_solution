class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        List<Integer>arr2=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                count++;
                continue;
                
            }
            arr2.add(nums[i]);
        }
        int m=arr2.size();
        for(int j=0;j<count;j++)
        {
         
            arr2.add(0);
        }
        for(int k=0;k<n;k++)
        {
            nums[k]=arr2.get(k);
        }
        
    }
}