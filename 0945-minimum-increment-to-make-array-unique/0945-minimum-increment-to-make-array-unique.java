class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int ans=0;
        for (var n : nums) {
          i = Math.max(i, n);
          ans += i++ - n;
        }
        return ans;
    }
}