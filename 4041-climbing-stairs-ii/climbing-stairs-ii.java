class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        dp[n]=0;

        for(int i=n-1;i>=0;i--){
            int ans=Integer.MAX_VALUE;
            for(int jump=1;jump<=3;jump++){
                int next=i+jump;
                if(next<=n){
                    int curCost=costs[next-1]+jump*jump+dp[next];
                    ans=Math.min(ans, curCost);
                }
            }
            dp[i]=ans;
        }
        return dp[0];  

    }
}