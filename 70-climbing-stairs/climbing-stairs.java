class Solution {
    private int func(int index, int[] dp){
        if(index==0 || index==1){
            return 1;
        }

        if(dp[index]!=-1){
            return dp[index];
        }

        return dp[index]=func(index-1, dp)+func(index-2, dp);
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        return func(n, dp);    
    }
}