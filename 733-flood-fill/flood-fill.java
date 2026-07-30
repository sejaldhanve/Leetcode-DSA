class Solution {
    private void dfs(int[][] image, int sr, int sc, int color, int[][] ans, int iniColor, int[] delRow, int[] delCol){
        ans[sr][sc]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow=sr+delRow[i];
            int ncol=sc+delCol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==iniColor && ans[nrow][ncol]!=color){
                dfs(image, nrow, ncol, color, ans, iniColor, delRow, delCol);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans=image;
        int iniColor=image[sr][sc];
        int[] delRow={-1, 0, 1, 0};
        int[] delCol={0, 1, 0, -1};
        dfs(image, sr, sc, color, ans, iniColor, delRow, delCol);
        return ans;
   
    }
}