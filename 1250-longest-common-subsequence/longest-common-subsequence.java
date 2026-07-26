class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][]dp=new int[n+1][m+1];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        return solve(text1,text2,n,m,dp);
        
    }
    public int solve(String text1, String text2,int i,int j,int[][]dp ){
        if(i==0||j==0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i-1)==text2.charAt(j-1)){
            dp[i][j]=1+solve(text1,text2,i-1,j-1,dp);
        }else{
            dp[i][j]=Math.max(solve(text1,text2,i-1,j,dp),solve(text1,text2,i,j-1,dp));
        }
        return dp[i][j];
    }
}