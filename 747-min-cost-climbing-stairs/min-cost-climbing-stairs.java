class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;

        int prev2=cost[0];
        int prev1=cost[1];

        for(int i=2;i<cost.length;i++){
            int take=prev1;
            int nottake=prev2;

            int cur=cost[i]+Math.min(take, nottake);
            prev2=prev1;
            prev1=cur;
        }

        return Math.min(prev1, prev2);

        
    }
}