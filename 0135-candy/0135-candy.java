class Solution {
    public int candy(int[] ratings) {
        ArrayList<Integer>candies=new ArrayList<>();
        int n=ratings.length;
        for(int i=0;i<n;i++)
        {
            candies.add(1);
        }
        for(int i=1;i<n;i++)
        {
              if(ratings[i-1]<ratings[i])
              {
                 candies.set(i,candies.get(i-1)+1);
              }
        }
        for(int i=n-2;i>=0;i--)
        {
           if(ratings[i]>ratings[i+1] && candies.get(i)<=candies.get(i+1))
           {
             candies.set(i, candies.get(i+1) + 1);

           }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
           sum=sum+candies.get(i); 
        }
        return sum;
    }
}