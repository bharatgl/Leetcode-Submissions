class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count =0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    count += 1;
                }
                
            }
        }
        return count;
    }
}