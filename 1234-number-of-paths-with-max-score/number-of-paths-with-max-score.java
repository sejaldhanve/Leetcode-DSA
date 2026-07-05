class Solution {
    static final int MOD = 1000000007;
    class Pair{
        int score;
        int ways;

        Pair(int score, int ways){
            this.score=score;
            this.ways=ways;
        }
    }
    Pair[][] dp;
    public int[] pathsWithMaxScore(List<String> board) {
        int n=board.size();
        dp=new Pair[n][n];
        Pair ans=dfs(board, n-1, n-1);

        if(ans.ways==0){
            return new int[]{0,0};
        }

        return new int[]{ans.score, ans.ways};    
    }

    private Pair dfs(List<String> board, int i, int j){
        if(i<0 || j<0){
            return new Pair(Integer.MIN_VALUE, 0);
        }

        char ch=board.get(i).charAt(j);

        if(ch=='X'){
            return new Pair(Integer.MIN_VALUE, 0);
        }

        if(ch=='E'){
            return new Pair(0, 1);
        }

        if(dp[i][j]!=null){
            return dp[i][j];
        }

        Pair up=dfs(board, i-1, j);
        Pair left=dfs(board, i, j-1);
        Pair diag=dfs(board, i-1, j-1);

        int bestScore=Math.max(up.score, Math.max(left.score, diag.score));

        if (bestScore == Integer.MIN_VALUE) {
            dp[i][j]=new Pair(Integer.MIN_VALUE, 0);
            return dp[i][j];
        }

        int ways = 0;

        if (up.score == bestScore) {
            ways = (ways + up.ways) % MOD;
        }

        if (left.score == bestScore) {
            ways = (ways + left.ways) % MOD;
        }

        if (diag.score == bestScore) {
            ways = (ways + diag.ways) % MOD;
        }

        int curValue=0;
        if(ch!='S' && ch!='E'){
            curValue=ch-'0';
        }
        dp[i][j]=new Pair(bestScore+curValue, ways);
        return dp[i][j];
    }
}