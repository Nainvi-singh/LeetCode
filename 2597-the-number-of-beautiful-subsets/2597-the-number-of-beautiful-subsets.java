class Solution {
    public int dfs(int[] nums, int i, int k, HashMap<Integer, Integer> mp) {
        if (i == nums.length) return 1;

        int taken = 0;
        if (!mp.containsKey(nums[i] - k) && !mp.containsKey(nums[i] + k)) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            taken = dfs(nums, i + 1, k, mp);
            mp.put(nums[i], mp.get(nums[i]) - 1);
            if (mp.get(nums[i]) == 0) {
                mp.remove(nums[i]);
            }
        }
        
        int notTaken = dfs(nums, i + 1, k, mp);
        
        return taken + notTaken;
    }

    public int beautifulSubsets(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans = dfs(nums, 0, k, mp);
        return ans - 1;
    }
}