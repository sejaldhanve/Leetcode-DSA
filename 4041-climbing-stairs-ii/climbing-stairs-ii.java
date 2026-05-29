class Solution {
    private int func(int index, int n, int[] costs, int[] dp){
        if(index==n){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int ans=Integer.MAX_VALUE;
        for(int jump=1;jump<=3;jump++){
            int next=index+jump;
            if(next<=n){
                int curCost=costs[next-1]+jump*jump+func(next, n, costs, dp);
                ans=Math.min(ans, curCost);
            }
        }
        return dp[index]=ans;
    }
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        int index=0;
        Arrays.fill(dp, -1);
        return func(index, n, costs, dp);
        
    }
}