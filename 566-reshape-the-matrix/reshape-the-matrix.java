class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] ans=new int[r][c];
        if(n*m!=r*c){
            return mat;
        }
        for(int k=0;k<n*m;k++){
            int oldRow=k/m;
            int oldCol=k%m;

            int newRow=k/c;
            int newCol=k%c;

            ans[newRow][newCol]=mat[oldRow][oldCol];
        }
        return ans;
        
    }
}