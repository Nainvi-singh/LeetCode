class Solution {   
    public int climbStairs(int n) {     
        if(n==0){
            return 0;
        }
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        
        for(int i=2;i<=n;i++){
            int thirdTerm=arr[i-1]+arr[i-2];
            arr[i]=thirdTerm;
        }
        return arr[n];
    }
}


    