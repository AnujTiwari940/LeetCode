class Solution {
    public int minInsertions(String s) {//for min. insertion steps to make a string palindrome [return s.length-LPS(longest common subsequence)]
        int n = s.length();
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return n-helper(0, n - 1, s, dp);//returned s.length(n)-LPS
    }
    static int helper(int i, int j, String s, int dp[][]) {
        if (i > j) return 0;
        if (i == j) return 1;// Single character is a palindrome
        if (dp[i][j] != -1) return dp[i][j];
        if (s.charAt(i) == s.charAt(j)) {
            return dp[i][j] = 2 + helper(i + 1, j - 1, s, dp);
        } 
        else return dp[i][j]=Math.max(helper(i+1,j,s,dp),helper(i,j-1,s,dp));
    }
}        