class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<String>();
        helper(0,0,0, "", result , n);
        return result;
    }
    public void helper(int opening,int closing,int index,String output,List<String> result,int n){
        //index is to count the backet consumed
        
        //base case
        if(index==n*2){
            result.add(output);
            return ;
        }
        //rule1-opening<=n  //to place opening
        if(opening<n){  
            helper(opening+1,closing,index+1, output +"(", result, n);
        }
        //rule-2 closing<opening //to place closing
        if(closing<opening){  
            helper(opening,closing+1,index+1, output +")", result, n);
        }
    }
}