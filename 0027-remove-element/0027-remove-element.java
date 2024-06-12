class Solution {
    public int removeElement(int[] nums, int val) {
        //2 pointer apporach
        int reader=0;
        int writer=0;
        //reader always move
        //writer moves when it is not equal to val
        while(reader<nums.length){
            if(nums[reader]==val){
                reader++;
            }
            else{
                nums[writer]=nums[reader];
                reader++;
                writer++;
            }
        }
        return writer;
    }
}

//TC-O(n)
//SC-O(1)