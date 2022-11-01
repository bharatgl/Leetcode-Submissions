class Solution {
    public int[] findBall(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] ans = new int[cols];

        for(int c=0; c< cols; c++){
            int cpos = c;
            int npos = -1;
            for(int r=0; r< rows; r++){
                npos = cpos + grid[r][cpos];

                if(npos <0  || npos >= cols || grid[r][cpos] != grid[r][npos]){
                    cpos = -1;
                    break;
                }
                cpos = npos;
            }
            ans[c] = cpos;
        }
        return ans;
    }
}