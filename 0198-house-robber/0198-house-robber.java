class Solution {
    private int[] cache; //memoization
    public int rob(int[] nums) {
        cache=new int[100];
        Arrays.fill(cache,-1);
        return robInHouse(0,nums);
    }
    int robInHouse(int i,int money[]){
        //base case
        if(i>=money.length){
            return 0;
        }
        if(cache[i]>-1){
            return cache[i];
        }
        int result=Math.max(robInHouse(i+1,money),robInHouse(i+2,money)+money[i]);
        cache[i]=result;
        return result;
    }
}