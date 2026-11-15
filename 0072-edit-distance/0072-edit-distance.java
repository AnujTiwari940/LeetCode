class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return edit(m-1,n-1,word1,word2,dp);
    }
    static int edit(int i,int j,String word1,String word2,int dp[][]){
        if(i<0)return j+1;
        if(j<0)return i+1;
        if(dp[i][j]!=-1)return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j))return dp[i][j]=edit(i-1,j-1,word1,word2,dp);
        int replace=1+edit(i-1,j-1,word1,word2,dp);
        int remove=1+edit(i-1,j,word1,word2,dp);
        int insert=1+edit(i,j-1,word1,word2,dp);
        return dp[i][j]=Math.min(replace,Math.min(remove,insert));

    }
}