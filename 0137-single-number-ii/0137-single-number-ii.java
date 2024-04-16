class Solution {
    public int singleNumber(int[] nums) {
        
        int n=nums.length;
        int seenOnce=0,seenTwice=0;
        for(int i=0;i<n;i++)
        {
            seenOnce = ~seenTwice & (seenOnce ^ nums[i]);
            seenTwice = ~seenOnce & (seenTwice ^ nums[i]);
        }
        return seenOnce;
    }
}