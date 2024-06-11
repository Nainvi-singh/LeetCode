class Solution {
    public int waysToSplitArray(int[] nums) {
        //apporach 2
        long entireSum=0;
        int count=0;
        for(int i:nums){
            entireSum=entireSum+i;
        }
        long leftSum=0;
        for(int i=0;i<nums.length-1;i++){
            leftSum=leftSum+nums[i];
            entireSum=entireSum-nums[i];
            if(leftSum>=entireSum){
                count++;
            }
        }
        return count;
    }
}