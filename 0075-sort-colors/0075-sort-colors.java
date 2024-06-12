class Solution {
    public void sortColors(int[] nums) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    
                    // Swap arr[j] and arr[j+1]
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false){
                 break;
            }
        }
               
    }
}