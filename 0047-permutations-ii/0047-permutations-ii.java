class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> smallList=new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> FinalList=new ArrayList<>();
        helper(nums,smallList,FinalList,new boolean[nums.length]);
        return FinalList;
        
        
    }
    
    void helper(int[] nums, List<Integer> smallList, List<List<Integer>> FinalList,boolean[] used){
        
        //base case
         if(smallList.size()==nums.length){
            FinalList.add(new ArrayList<Integer>(smallList));
             return ;
             
        }
        //iterate the num   
            for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;
            used[i]=true;
            smallList.add(nums[i]);
            helper(nums,smallList,FinalList,used);
            used[i]=false;
            smallList.remove(smallList.size()-1);
                
            }
    }
}