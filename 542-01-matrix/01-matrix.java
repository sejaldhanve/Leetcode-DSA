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
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] visited=new int[n][m];
        int[][] dist=new int[n][m];

        Queue<Node> q=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Node(i, j, 0));
                    visited[i][j]=1;
                }
                else{
                    visited[i][j]=0;
                }
            }
        }
        int[] deltaRow={-1, 0, 1, 0};
        int[] deltaCol={0, 1, 0, -1};
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            int steps=q.peek().third;
            q.remove();
            dist[row][col]=steps;
            for(int i=0;i<4;i++){
                int nrow=row+deltaRow[i];
                int ncol=col+deltaCol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==0){
                    q.add(new Node(nrow, ncol, steps+1));
                    visited[nrow][ncol]=1;
                }
            }
        }
    return dist;   
        
    }
}