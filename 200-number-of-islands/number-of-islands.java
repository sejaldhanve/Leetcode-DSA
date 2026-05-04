class Solution {
    private void dfs(int row, int col, char[][] grid, int[][] vis, int[] delRow, int[] delCol, int count){
        int n=grid.length;
        int m=grid[0].length;
        vis[row][col]=1;
        for(int i=0;i<4;i++){
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                dfs(nrow, ncol, grid, vis, delRow, delCol, count);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int[] delRow={-1, 0, 1, 0};
        int[] delCol={0, 1, 0, -1};
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    dfs(i, j, grid, vis, delRow, delCol, count++);
                }
            }
        }
    return count;   
    }
}