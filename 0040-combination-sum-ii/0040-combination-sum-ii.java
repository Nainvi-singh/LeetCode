class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> FinalList=new ArrayList<>();
        helper(0,candidates,target,smallList,FinalList);
        return FinalList;
    }
    
  
     void helper(int index,int cand[], int target, List<Integer> smallList, List<List<Integer>> FinalList){
        
        //base case
         if(target==0){
            FinalList.add(new ArrayList<Integer>(smallList));
             return ;
             
        }
         if(target<0){
             return;
        }
        
         
        //iterate the num
         Arrays.sort(cand);
         for(int i=index;i<cand.length; i++){
             if(i > index && cand[i] == cand[i-1]) continue; // skip duplicates 
                smallList.add(cand[i]);//modify the value
                helper(i+1,cand,target-cand[i],smallList,FinalList);//recursive call
                //stack fall
                //undo
                smallList.remove(smallList.size()-1);   
             }
               
        }
    }
