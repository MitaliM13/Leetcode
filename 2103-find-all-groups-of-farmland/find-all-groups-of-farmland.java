class Solution {
    // Function to recursively explore and mark farmland
    void solve(int r, int c, int[] maxCoordinates, int[][] land, boolean[][] vis) {
        // Getting the dimensions of the land
        int m = land.length;
        int n = land[0].length;
        
        // Marking the current cell as visited
        vis[r][c] = true;
        
        // Arrays to represent four possible directions: up, down, left, right
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        // Iterating through each direction
        for (int i = 0; i < 4; i++) {
            int nr = dr[i] + r; // New row
            int nc = dc[i] + c; // New column
            
            // Checking if the new cell is within bounds, is unvisited, and is part of farmland
            if (nr >= 0 && nr < m && nc >= 0 && nc < n && land[nr][nc] == 1 && !vis[nr][nc]) {
                // Updating the maximum row and column encountered so far
                maxCoordinates[0] = Math.max(maxCoordinates[0], nr);
                maxCoordinates[1] = Math.max(maxCoordinates[1], nc);
                
                // Recursively exploring the farmland
                solve(nr, nc, maxCoordinates, land, vis);
            }
        }
    }
    
    // Main function to find all farmland
    public int[][] findFarmland(int[][] land) {
        // Getting the dimensions of the land
        int m = land.length;
        int n = land[0].length;
        
        // Creating a 2D array to mark visited cells
        boolean[][] vis = new boolean[m][n];
        
        // List to store the coordinates of each farmland
        List<int[]> ansList = new ArrayList<>();
        
        // Iterating through each cell in the land
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the cell is unvisited and is part of farmland
                if (!vis[i][j] && land[i][j] == 1) {
                    int[] maxCoordinates = {i, j}; // Initialize maximum row and column
                    
                    // Recursive function to explore and mark the farmland
                    solve(i, j, maxCoordinates, land, vis);
                    
                    // Adding the coordinates of the farmland into the result list
                    ansList.add(new int[]{i, j, maxCoordinates[0], maxCoordinates[1]});
                }
            }
        }
        
        // Converting the list of coordinates into a 2D array and returning
        int[][] ans = new int[ansList.size()][4];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}