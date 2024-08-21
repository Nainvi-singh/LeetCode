class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int reader=1;reader<prices.length;reader++){
            if(prices[reader]>prices[reader-1]){
                profit=profit+prices[reader]-prices[reader-1];
            }
        }
       return profit; 
    }
}