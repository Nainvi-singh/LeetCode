class Solution {
    Map<Integer,Integer> cache=new HashMap<>();
    public int lengthOfLIS(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=Math.max(result, helper(nums,i));
        }
        return result;
    }
    int helper(int[] nums,int i){
        if(cache.containsKey(i)){
            return cache.get(i);
        }
        int result=1;
        for(int j=0;j<i;j++){
            if(nums[i]>nums[j]){
                result=Math.max(result, helper(nums,j)+1);
            }
        }
        cache.put(i,result);
        return result;
    }
}