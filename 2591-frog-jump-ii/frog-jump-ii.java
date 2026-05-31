class Solution {
    private int func(int[] stones, int index, int[] dp){
        if(index>=stones.length){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int curJump=stones[index]-stones[index-2];
        return dp[index]=Math.max(curJump, func(stones, index+1, dp));
    }
    public int maxJump(int[] stones) {
        int[] dp =new int[stones.length+1];
        Arrays.fill(dp, -1);
        if(stones.length==2){
            return stones[1]-stones[0];
        }

        return Math.max(stones[1]-stones[0], func(stones, 2, dp));
        
    }
}