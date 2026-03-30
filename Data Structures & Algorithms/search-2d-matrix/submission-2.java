class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int l = 0;
        int r = ROWS * COLS - 1;

        while( l <= r){

            int m = l + (r - l);

            int row = m / COLS; // divison round down
            int col = m % COLS; // the remainder which is the element in that row

            if ( target > matrix[row][col]){
                l = m + 1;
            }
            else if ( target < matrix[row][col]){
                r = m - 1;
            }
            else {
                return true;
            }

        }
        return false;

    }
}
