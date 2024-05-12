class Solution {
    public int[][] largestLocal(int[][] grid) {
        int grids  =  grid.length;
        int max[][] = new int[grids -2][grids-2];
        for(int i = 0; i<=grids-3; ++i){
            for(int j = 0; j<=grids-3;++j){
                int maxVal = Integer.MIN_VALUE;
                for(int m = i; m<=i+2; ++m){
                    for(int n = j; n<=j+2;++n){
                        maxVal = Math.max(maxVal, grid[m][n]);
                    }
                }
                max[i][j] = maxVal;
            }
        }
        return max;
    }
}