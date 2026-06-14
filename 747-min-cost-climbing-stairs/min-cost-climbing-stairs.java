class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        int n=cost.length;

        dp[0]=cost[0];
        dp[1]=cost[1];

        for(int i=2;i<cost.length;i++){
            int take=dp[i-1];
            int nottake=dp[i-2];

            dp[i]=cost[i]+Math.min(take, nottake);
        }

        return Math.min(dp[n-1], dp[n-2]);

        
    }
}