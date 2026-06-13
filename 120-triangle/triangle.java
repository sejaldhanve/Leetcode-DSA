class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp=new int[triangle.size()][triangle.size()];

        int down=0;
        int dg=0;

        for(int j=0;j<triangle.size();j++){
            dp[n-1][j]=triangle.get(n-1).get(j);
        }

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                down=triangle.get(i).get(j)+dp[i+1][j];
                dg=triangle.get(i).get(j)+dp[i+1][j+1];

                dp[i][j]=Math.min(down, dg);
            }
        }
        return dp[0][0];

        
    }
}

