class Solution {
    public int[] productExceptSelf(int[] nums) {
        //pre computation approach
        //compute prefix productfor left to right product
        //compute sufix productfor right to left product
        //final ans left ana right product
        int left[]=new int [nums.length];
        int right[]=new int [nums.length];
        int finalAns[]=new int [nums.length];
        
        left[0]=1;
        for(int i=1;i<left.length;i++){
            left[i]=left[i-1]*nums[i-1];  
        }
        right[nums.length-1]=1;
        for(int i=right.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
            
        }
        for(int i=0;i<finalAns.length;i++){
            finalAns[i]=left[i]*right[i];
        }
        return finalAns;
    }
}