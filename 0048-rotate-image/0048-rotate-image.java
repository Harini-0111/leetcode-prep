class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length-1;
        int t;
        for(int j=0; j<matrix.length/2; j++){
            for(int i=j; i<n-j; i++){
            t= matrix[j][i];
            matrix[j][i] = matrix[n-i][j]; 
            matrix[n-i][j] = matrix[n-j][n-i];
            matrix[n-j][n-i] =matrix[i][n-j];
            matrix[i][n-j] = t;
            }
        }
        
    }
}