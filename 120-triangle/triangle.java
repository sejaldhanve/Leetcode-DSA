class Solution {
    private int mini(int i, int j, List<List<Integer>> triangle, int[][] dp){
        if(i==triangle.size()-1){
            return triangle.get(i).get(j);
        }

        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }

        int down=triangle.get(i).get(j)+mini(i+1, j, triangle, dp);
        int dg=triangle.get(i).get(j)+mini(i+1, j+1, triangle, dp);

        return dp[i][j]=Math.min(down, dg);

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int i=0;
        int j=0;
        int[][] dp=new int[triangle.size()][triangle.size()];

        for(int[] row:dp){
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        return mini(i, j, triangle, dp);
        
    }
}

