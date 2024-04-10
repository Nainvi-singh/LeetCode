class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> FinalList=new ArrayList<>();
        helper(nums,smallList,FinalList);
        return FinalList;
        
        
    }
    
    void helper(int[] nums, List<Integer> smallList, List<List<Integer>> FinalList){
        
        //base case
         if(smallList.size()==nums.length){
            FinalList.add(new ArrayList<Integer>(smallList));
             return ;
             
        }
        //iterate the num
         for(int i=0;i<nums.length; i++){     
            if(!smallList.contains(nums[i])){
                smallList.add(nums[i]);//modify the value
                helper(nums,smallList,FinalList);//recursive call
                    //stack fall
                    smallList.remove(smallList.size()-1);
                
            }
               
        }
    }
}