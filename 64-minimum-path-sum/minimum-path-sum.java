class Solution {
    private int minSum(int i, int j, int ans, int[][] grid, int[][] dp){
        if(i==0 && j==0){
            return grid[0][0];
        }
        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int up=minSum(i-1, j, ans, grid, dp);
        int left=minSum(i, j-1, ans, grid, dp);

        return dp[i][j]=grid[i][j]+Math.min(up, left);

    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        int ans=0;
        return minSum(m-1, n-1, ans, grid, dp);
        
    }
}