class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        List<Integer>r=new ArrayList<>();
        r.add(0);
        int sum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            r.add(r.get(i)+arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if((j-i+1)%2==1)
                {
                    sum=sum+r.get(j+1)-r.get(i);
                }
            }
        }
        return sum;
    }
}