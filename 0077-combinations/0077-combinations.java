class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> FinalList=new ArrayList<>();
        int start=1;
        helper(start,n,k,smallList,FinalList);
        return FinalList;
        
        
    }
    
    void helper(int start,int n,int k, List<Integer> smallList, List<List<Integer>> FinalList){
        
        //base case
         if(smallList.size()==k){
            FinalList.add(new ArrayList<Integer>(smallList));
             return ;
             
        }
        
        //iterate the num
         for(int i=start;i<=n; i++){     
            if(!smallList.contains(i)){
                smallList.add(i);//modify the value
                helper(i,n,k,smallList,FinalList);//recursive call
                    //stack fall
                    smallList.remove(smallList.size()-1);
                    
            }
               
        }
        
    }
}