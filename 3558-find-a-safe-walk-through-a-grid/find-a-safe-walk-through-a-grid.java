class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();

        int[][] bestHealth = new int[m][n];
        for(int[] row : bestHealth){
            Arrays.fill(row, -1);
        }

        health -= grid.get(0).get(0);
        if(health < 1) return false;

        Queue<int[]> q=new LinkedList<>();
        int[][] dir=new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}};

        q.offer(new int[]{0, 0, health});
        bestHealth[0][0]=health;

        while(!q.isEmpty()){
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];
            int h=cur[2];

            if(r==m-1 && c==n-1){
                return true;

            }

            for(int[] d:dir){
                int nrow=r+d[0];
                int ncol=c+d[1];

                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n){
                    int newHealth=h-grid.get(nrow).get(ncol);
                    if(newHealth>=1 && newHealth>bestHealth[nrow][ncol]){
                        bestHealth[nrow][ncol]=newHealth;
                        q.offer(new int[]{nrow, ncol, newHealth});
                    }
                }

            }

        }
        return false;

        
    }
}