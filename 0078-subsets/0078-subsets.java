class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> FinalList=new ArrayList<>();
        int index=0;
        helper(nums,smallList,FinalList,index);
        return FinalList;
        
        
    }
    
    void helper(int[] nums, List<Integer> smallList, List<List<Integer>> FinalList, int index){
        
        FinalList.add(new ArrayList<Integer>(smallList));
        //base case
//          if(smallList.size()==nums.length){
//             FinalList.add(new ArrayList<Integer>(smallList));
//              return ;
             
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