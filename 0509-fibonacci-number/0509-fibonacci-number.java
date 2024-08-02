class Solution {
    //top down(big to small)
    Map<Integer,Integer> memo=new HashMap<>();
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int element=fib(n-1)+fib(n-2);
        memo.put(n,element);
        return element;
    }
}