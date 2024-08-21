class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        return lcs(text1,text2,text1.length(),text2.length());
    }
    public int lcs(String text1, String text2,int n,int m){
        int dp[][]=new int[n+1][m+1];
       
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }return dp[n][m];
    }
}
