class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> FinalList=new ArrayList<>();
        int index=0;
        helper(nums,smallList,FinalList,index);
        return FinalList;
        
        
    }
    
    void helper(int[] nums, List<Integer> smallList, List<List<Integer>> FinalList, int index){
        
        //fake base case
        if(index>nums.length){
            return;
        }
        //in this case we don't need base case
        FinalList.add(new ArrayList<Integer>(smallList));

//         }
        //iterate the num
         for(int i=index;i<nums.length; i++){     
            if(!smallList.contains(nums[i])){
                smallList.add(nums[i]);//modify the value
                helper(nums,smallList,FinalList,i);//recursive call
                    //stack fall
                    smallList.remove(smallList.size()-1);
                
            }
               
        }
    }
}