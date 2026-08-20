class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int maxSize=0;
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int size=dfs(i,j,grid);
                    maxSize=Math.max(maxSize,size);
                }
            }
        }
        return maxSize;
    }
    public int dfs(int i,int j,int grid[][]){
        int size=1;
        if(i<0||i>=grid.length||j<0||j>=grid[0].length){
            return 0;
        }
        if(grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        size+=dfs(i+1,j,grid);
        size+=dfs(i-1,j,grid);
        size+=dfs(i,j+1,grid);
        size+=dfs(i,j-1,grid);
        return size;
    }
}
