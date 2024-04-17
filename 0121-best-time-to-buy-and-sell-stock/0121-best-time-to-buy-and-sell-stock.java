class Solution {
    public int maxProfit(int[] prices) {
        int buyValue = prices[0];
		int currentProfit = 0;
		int maxProfit = 0;
		
		for(int i=1; i<prices.length; i++)
		{
		    if(prices[i] > buyValue) // price has increased 
		    {
		        currentProfit = prices[i] - buyValue;
		        maxProfit = Math.max(maxProfit, currentProfit);
		    }
		    else 
		    {
		        // If you sell at this case then there will be loss 
		        buyValue = prices[i]; 
		    }
		}
		
		return maxProfit;
    }
}