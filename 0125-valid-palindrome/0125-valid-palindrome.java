class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()||s.length()==1){
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char st=s.charAt(start);
            char ed=s.charAt(end);
            if (!Character.isLetterOrDigit(st )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(ed)) {
        		end--;
        	}
            else{
                if (Character.toLowerCase(st) != Character.toLowerCase(ed)) 
                {
        			return false;
        		}
                else{
                    start++;
                    end--;
                }
            }
        }
        return true;
    }
}