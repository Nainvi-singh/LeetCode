class Solution {
    
    /*
        //recurance 
        int result=Math.max(robInHouse(i+1,money),robInHouse(i+2,money)+money[i]);
        dp[i]=max(dp[i-1],dp[i-2]+nums[i])
        dp[0]=nums[0];
        dp[1]=max(nums[0],nums[1]);
    */
        
    
    //memoization
    /*
    private int[] cache; 
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
    */
    
    //Bottom up
    public int rob(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        
        //int dp[]=new int[nums.length];
        //dp[0]=nums[0];
        //dp[1]=Math.max(nums[0],nums[1]);
        
        //space optimize
        int first=nums[0];
        int second=Math.max(nums[0],nums[1]);
        
        for(int i=2;i<nums.length;i++){
            //dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            int temp=second;
            second=Math.max(second,first+nums[i]);
            first=temp;
            
        }
        // return dp[nums.length-1];//last has the max
        return second;
    }
}