class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int rot[][] = new int [n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                rot[j][n-i-1] = matrix[i][j];
            }
        }
        for(int i = 0; i<n ;i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = rot[i][j];
            }
        }
    }
}