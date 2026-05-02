class Solution {
    private boolean dfs(int row, int col, int parentRow, int parentCol, char[][] grid, int[][] visited, int[] drow, int[] dcol){
        visited[row][col]=1;
        for(int i=0;i<4;i++){
            int nrow=row+drow[i];
            int ncol=col+dcol[i];

            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]==grid[row][col]){
                if(visited[nrow][ncol]==0){
                    if(dfs(nrow, ncol, row, col, grid, visited, drow, dcol )==true){
                        return true;
                    }
                }
                else if(nrow!=parentRow || ncol!=parentCol){
                    return true;
                }
            }
            
        }
        return false;
    }
    public boolean containsCycle(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] visited=new int[n][m];
        int[] drow={-1, 0, 1, 0};
        int[] dcol={0, 1, 0, -1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0){
                    if(dfs(i, j, -1, -1, grid, visited, drow, dcol)==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}