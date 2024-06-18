class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage= Double.MIN_VALUE;
        //sum of first k size window
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAverage=(double)sum/k;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            maxAverage=Math.max(maxAverage,(double)sum/k);
        }
        return maxAverage;   
    }
}