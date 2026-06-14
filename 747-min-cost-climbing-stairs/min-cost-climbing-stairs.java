class Solution {
    private int mini(int i, int[] cost, int[] dp){
        if(i==0 || i==1){
            return cost[i];
        }
        
        if(dp[i]!=-1){
            return dp[i];
        }

        int take=mini(i-1, cost, dp);
        int nottake=mini(i-2, cost, dp);

        return dp[i]=cost[i]+(Math.min(take, nottake));
    }
    public int minCostClimbingStairs(int[] cost) {
        int i=cost.length;
        int[] dp=new int[cost.length+1];
        Arrays.fill(dp, -1);
        return Math.min(mini(i-1, cost, dp), mini(i-2, cost, dp));

        
    }
}