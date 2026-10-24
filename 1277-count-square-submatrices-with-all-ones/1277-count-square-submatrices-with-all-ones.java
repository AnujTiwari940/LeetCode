class Solution {
    public int countSquares(int[][] matrix) {
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i!=0 && j!=0){ //we execute DP formula only when both i and j are non-zero to avoid arrayOutOfBoundException(means no change in 1st row & 1st column)
                    if(matrix[i][j]==1){
                        matrix[i][j]+=Math.min(matrix[i-1][j],Math.min(matrix[i][j-1],matrix[i-1][j-1]));
                    }
                }
                count+=matrix[i][j];
            }
        }return count;
    }
}