class Solution {
    public boolean isPalindrome(int x) {
        int flag=x;
        int reverse = 0;  
        if(x<0){
            return false;
        }
        while(x != 0)   
        {  
            int remainder = x % 10;  
            reverse = reverse * 10 + remainder;  
            x = x/10;  
        }  
        if(reverse==flag){
            return true;
        }
        else{
            return false;
        }
    }
}