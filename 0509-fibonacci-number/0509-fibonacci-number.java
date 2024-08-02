class Solution {
    //buttom up(small to big)
    Map<Integer,Integer> memo=new HashMap<>();
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        int arr[]=new int[n+1];
        arr[1]=1;
        for(int i=2;i<=n;i++){
            int firstTerm=arr[i-1];
            int secondTerm=arr[i-2];
            int thirdTerm=firstTerm+secondTerm;
            arr[i]=thirdTerm;
        }
        return arr[n];
    }
}