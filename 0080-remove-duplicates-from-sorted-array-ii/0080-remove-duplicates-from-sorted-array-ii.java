class Solution {
    public int removeDuplicates(int[] nums) {
        int writer=0;
        for(int reader=0;reader<nums.length;reader++){
            if(writer<2||nums[reader]>nums[writer-2]){
                nums[writer++]=nums[reader];
            }
        }
        return writer;
    }
}