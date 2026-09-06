class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int n=numbers.length;
     int[] arr=new int[2];
      HashMap<Integer,Integer>mp=new HashMap<>();
      for(int i=0;i<n;i++)
      {
        int com=target-numbers[i];
        if(mp.containsKey(com))
        {
            
            arr[0]=mp.get(com)+1;
            arr[1]=i+1;

        }
        mp.put(numbers[i],i);
      }  
      return arr;
    }
}