class Solution {
    private void dfs(int node, int[][] isConnected, ArrayList<ArrayList<Integer>> adjList, int[] vis ){
        vis[node]=1;
        for(int it:adjList.get(node)){
            if(vis[it]==0){
                dfs(it, isConnected, adjList, vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<=isConnected.length;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjList.get(i).add(j);
                }
            }
        }

        int[] vis=new int[adjList.size()];
        for(int i=0;i<vis.length;i++){
            if(vis[i]==0){
                count++;
                dfs(i, isConnected, adjList, vis);
            }
        }
        return count-1;
    }
}