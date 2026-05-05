class Solution {
    private boolean dfs(int node, int[][] graph, int[] vis, int[] pathvis, int[] check){
        vis[node]=1;
        pathvis[node]=1;

        for(int it:graph[node]){
            if(vis[it]==0){
                if(dfs(it, graph, vis, pathvis, check)==true){
                    return true;
                }
            }
            else if(pathvis[it]==1){
                return true;
            }
        }
        check[node]=1;
        pathvis[node]=0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] vis=new int[graph.length];
        int[] pathvis=new int[graph.length];
        int[] check=new int[graph.length];

        for(int i=0;i<vis.length;i++){
            if(vis[i]==0){
                dfs(i, graph, vis, pathvis, check);
            }
        }

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<check.length;i++){
            if(check[i]==1){
                list.add(i);
            }
        }
        return list;   
    }
}