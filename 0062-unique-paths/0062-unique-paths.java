class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0)dp[i][j]=1;//each element of dp 1st row and 1st column marked as 1
                else dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }return dp[m-1][n-1];//started from 0 so return m-1
    }
}