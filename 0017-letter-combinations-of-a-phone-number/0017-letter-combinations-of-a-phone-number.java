class Solution {
    public List<String> letterCombinations(String digits) {
        String smallList="";
        List<String> FinalList=new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return new ArrayList();
        }
        int index=0;
        String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper(index,digits,smallList,FinalList,map);
        return FinalList;
    }
    
    void helper(int index,String digits,String smallList, List<String> FinalList,String map[]){
        
        
        //base case
         if(index>=digits.length()){
            FinalList.add(smallList);
             return ;
             
        }
        
        
        int number=digits.charAt(index)-  '0'; //to convert character to numeric 
        // by doing this we will get index number 
        String value=map[number];
         
        //iterate the num
         for(int i=0;i<value.length(); i++){           
                smallList=smallList+(value.charAt(i));//modify the value
                helper(index+1,digits,smallList,FinalList,map);//recursive call
                    //stack fall
                 smallList=smallList.substring(0, smallList.length() - 1);  
                
               
        }
    }
}