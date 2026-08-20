class Solution {
    public int numIslands(char[][] grid) {
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&&!visited[i][j]){
                    count++;
                    dfs(i,j,grid,visited);
                }
            }
        }
        return count;
    }
    public void dfs(int row,int col,char grid[][],boolean visited[][]){
        if(row<0||row>=grid.length||col<0||col>=grid[0].length){
            return;
        }
        if(grid[row][col]=='0'||visited[row][col]){
            return;
        }
        visited[row][col]=true;

        dfs(row+1,col,grid,visited);
        dfs(row-1,col,grid,visited);
        dfs(row,col+1,grid,visited);
        dfs(row,col-1,grid,visited);
    }
}
