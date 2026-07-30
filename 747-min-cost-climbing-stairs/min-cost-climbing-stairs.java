class Solution {
    private int func(int i, int[] cost, int[] dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=cost[i]+Math.min(func(i+1, cost, dp), func(i+2, cost, dp));

    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(func(0, cost, dp), func(1, cost, dp));
        
    }
}