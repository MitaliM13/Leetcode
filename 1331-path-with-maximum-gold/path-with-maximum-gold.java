class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;

        class Helper{
            public int dfs(int r, int c){
                if(r<0 || r>=m || c<0 || c>=n || grid[r][c] == 0){
                    return 0;
                } 

                int currG = grid[r][c];
                grid[r][c] = 0;

                int down = dfs(r+1,c);
                int up = dfs(r-1,c);
                int right = dfs(r,c+1);
                int left = dfs(r,c-1);

                grid[r][c] = currG;
                return currG + Math.max(Math.max(down, up),Math.max(left,right));
            }
        }
        Helper helper = new Helper();
        for(int r = 0; r<m ; ++r){
            for(int c = 0; c<n; ++c){
                if(grid[r][c]>0){
                    max = Math.max(max, helper.dfs(r,c));
                }
            }
        }
        return max;
    }
}