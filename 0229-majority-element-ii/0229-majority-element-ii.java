class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>m=new HashMap<>();
        List<Integer>arr=new ArrayList<>();
        for(int num:nums)
        {
            m.put(num,m.getOrDefault(num, 0) + 1);
        }
        for(int key:m.keySet())
        {
            if(m.get(key)>(n/3))
            {
                arr.add(key);
            }
        }
      return arr;

    }
}