class Solution {
    public int waysToSplitArray(int[] nums) {
        //creating prefix array
        long prefix[]=new long[nums.length];
        prefix[0]=nums[0];
        //fill rhe prefix element
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int countValidSplit=0;
        for(int i=0;i<nums.length-1;i++){
            long leftpart=prefix[i];
            long rightpart=prefix[prefix.length-1]-prefix[i];
                if(leftpart>=rightpart){
                    countValidSplit++;
                }       
        }
        return countValidSplit;
    }
}