class Solution {
    private boolean func(int ind, int[] stones, int lastJump, Boolean[][] dp){
        if(ind==stones.length-1){
            return true;
        }
        
        if(dp[ind][lastJump]!=null) return dp[ind][lastJump];
        for(int nextJump=lastJump-1;nextJump<=lastJump+1;nextJump++){
            if(nextJump>0){
                int nextPos=stones[ind]+nextJump;

                //check if exist
                for(int i=ind+1;i<stones.length;i++){
                    if(stones[i]==nextPos){
                        if(func(i, stones, nextJump, dp)){
                            return dp[ind][lastJump]=true;
                        }
                    }
                }
            }
        }
        return dp[ind][lastJump]=false;

    }
    public boolean canCross(int[] stones) {
        int ind=1;
        int lastJump=1;
        Boolean[][] dp=new Boolean[stones.length+1][stones.length+1];
        if(stones.length<2 || stones[1]!=1){
            return false;
        }
        return func(ind, stones, lastJump, dp);
    }
}