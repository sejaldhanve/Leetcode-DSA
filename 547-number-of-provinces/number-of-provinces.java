class Solution {
    private void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int[] visited){
        visited[node]=1;
        for(Integer it:adjLs.get(node)){
            if(visited[it]==0){
                dfs(it, adjLs, visited);
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        ArrayList<ArrayList<Integer>> adjLs=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adjLs.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);

                }
            }
        }
        int[] visited=new int[adjLs.size()];
        for(int i=0;i<visited.length;i++){
            if(visited[i]==0){
                count++;
                dfs(i, adjLs, visited);
            }
        }
    return count;   
    }
}