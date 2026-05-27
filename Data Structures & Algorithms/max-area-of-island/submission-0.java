class Solution {
    private static final int[][]  directions = {{0,1},{0,-1},{1,0},{-1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        // create a global maxarea variable
        // iterate through each element in the graph
        //with a for loop
        // if grid[r][c] == 1; then call 
        // call Math.max(globalmax, dfs(grid[r][c]))

        //dfs would check to make sure not out of bounds, return 0;
        //then check turn the 1 to 0;
        // intiailize a result then add it to that
        // then dor a for loop and call dfs on the direction
        // then add those elements to the global max
        int ROWS = grid.length, COLS = grid[0].length;

        int area = 0;

        for ( int r = 0; r < ROWS; r++){
            for( int c = 0; c < COLS; c++){
                if(grid[r][c] == 1){
                    area = Math.max(area, dfs(grid,r,c));
                }
            }
        }
        return area;
    }
    private int dfs(int[][] grid, int r, int c){
        if(r < 0 || c < 0 || c >=grid[0].length || r >= grid.length || grid[r][c] == 0 
        ) {
            return 0;
        }
        grid[r][c] = 0;
        int res = 1;

        for ( int[] dir : directions){
            res += dfs(grid, r + dir[0], c + dir[1]);
        }
        return res;
    }
}
