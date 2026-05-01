class Solution {
    private void dfs(int[][] ans, int[][] image, int row, int col, int iniColor, int newColor, int[] deltaRow, int[] deltaCol){
        ans[row][col]=newColor;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+deltaRow[i];
            int ncol=col+deltaCol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==iniColor && ans[nrow][ncol]!=newColor){
                dfs(ans, image, nrow, ncol, iniColor, newColor, deltaRow, deltaCol);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans=image;
        int iniColor=image[sr][sc];
        int[] deltaRow={-1, 0, 1, 0};
        int[] deltaCol={0, 1, 0, -1};
        dfs(ans, image, sr, sc, iniColor, color, deltaRow, deltaCol);

        return ans;

        
    }
}