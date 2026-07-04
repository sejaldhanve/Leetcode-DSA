class Solution {
    int ans=Integer.MAX_VALUE;
    private void dfs(int node, ArrayList<int[]>[] graph, boolean[] visited){
        visited[node]=true;

        for(int[] nei:graph[node]){
            int next=nei[0];
            int dist=nei[1];

            ans=Math.min(ans, dist);

            if(!visited[next]){
                dfs(next, graph, visited);
            }
        }

    }
    public int minScore(int n, int[][] roads) {
        ArrayList<int[]>[] graph=new ArrayList[n+1];

        for(int i=0;i<=n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] edges:roads){
            graph[edges[0]].add(new int[]{edges[1], edges[2]});
            graph[edges[1]].add(new int[]{edges[0], edges[2]});
        }

        boolean[] visited=new boolean[n+1];

        dfs(1, graph, visited);

        return ans;

        
    }
}