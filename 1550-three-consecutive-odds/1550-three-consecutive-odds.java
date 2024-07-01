class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int window=0;
        for(int i=0;i<arr.length && window < 3;i++){
            if(arr[i]%2!=0){
                window++;
            }
            else{
                window=0;
            }
        }
        return window==3;
    }    
}
