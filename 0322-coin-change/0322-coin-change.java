class Solution {
    Integer cache[];  // wrapper class by default fill with null
     public int coinChange(int[] coins, int amount) {
         cache=new Integer[amount+1];
         return coinChangeHelper(coins,amount);
     }
    public int coinChangeHelper(int[] coins, int amount) {
        if(amount<0){
            return -1;
        }
        if(amount==0){
            return 0;
        }
        if(cache[amount]!=null){
            return cache[amount];
        }
        int minCount=Integer.MAX_VALUE;
        for(int coin:coins){
            int count=coinChangeHelper(coins,amount-coin);
            if(count==-1){
                continue;
            }
            minCount=Math.min(minCount,count+1);
            
        }
        cache[amount]= (minCount==Integer.MAX_VALUE?-1:minCount);
        return cache[amount];
    }
}

//tc- O(n2)
//sc- o(n)