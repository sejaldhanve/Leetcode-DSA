class Solution {
    class Node{
        int first;
        int second;
        int third;
        Node(int _first, int _second, int _third){
            this.first=_first;
            this.second=_second;
            this.third=_third;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int cntFresh=0;
        Queue<Node> q=new LinkedList();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Node(i, j, 0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }
                
                if(grid[i][j]==1){
                    cntFresh++;
                }
            }
        }

        int tm=0;
        int[] deltaRow={-1, 0, 1, 0};
        int[] deltaCol={0, 1, 0, -1};
        int cnt=0;
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            int t=q.peek().third;
            tm=Math.max(t, tm);

            q.remove();
            for(int i=0;i<4;i++){
                int nrow=row+deltaRow[i];
                int ncol=col+deltaCol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && vis[nrow][ncol]==0){
                    q.add(new Node(nrow, ncol, t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }

            }
            
        }
        if(cntFresh!=cnt){
            return -1;
        }

        return tm;   
    }
}