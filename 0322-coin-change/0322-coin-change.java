class Solution {
    //bottom up
   
     public int coinChange(int[] coins, int amount) {
         int result[]=new int[amount+1];
         Arrays.fill(result,amount+1);
         //base case
         result[0]=0;
         for(int i=1;i<=amount;i++){
             for(int coin:coins){
                 if(i-coin<0){
                     continue;
                 }
                 result[i]= Math.min(result[i],result[i-coin]+1);
             }
         }
         return result[amount]==amount+1?-1:result[amount];
             
     }
    
}

