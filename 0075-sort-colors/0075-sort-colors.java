class Solution {
    void swap(int firstIndex,int secondIndex,int[] nums){
        int temp=nums[firstIndex];
        nums[firstIndex]=nums[secondIndex];
        nums[secondIndex]=temp;
    }
    public void sortColors(int[] nums) {
        //three pointer
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            int currentValue=nums[mid];
            //low to mid
            if(currentValue==0){
                swap(low,mid,nums);
                low++;
                mid++;
                
            }
            //move mid
            else if(currentValue==1){
                mid++;
            }
            //mid to high
            else if(currentValue==2){
                swap(mid,high,nums);
                high--;
            }
        }
    }
}