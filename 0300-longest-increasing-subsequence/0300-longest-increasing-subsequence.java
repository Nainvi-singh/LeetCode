class Solution {
    //bottom up
    Map<Integer,Integer> cache=new HashMap<>();
    
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        int dp[]=new int [len];
        Arrays.fill(dp,1);
        int result=1;
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){        
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    result=Math.max(result,dp[i]);
                }
                //result=Math.max(result, helper(nums,j)+1);  //this is reccurence relation
                
            }
        }
        return result;
    }
}