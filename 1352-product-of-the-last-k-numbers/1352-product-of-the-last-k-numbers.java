class ProductOfNumbers {
    ArrayList<Integer>nums=new ArrayList<>();
    int size=0;
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
     nums.add(num);
        size++;
    }
    
    public int getProduct(int k) {
        int prod=1;
        for(int i=size-k;i<size;i++)
        {
            prod=prod*nums.get(i);
        }
        return prod;
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */