class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color=new int[graph.length];
        for(int i=0;i<color.length;i++){
            color[i]=-1;
        }
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<color.length;i++){
            if(color[i]==-1){
                color[i]=0;
                q.add(i);
            }
        
        while(!q.isEmpty()){
            int temp=q.poll();
            for(Integer it: graph[temp]){
                if(color[it]==-1){
                    color[it]=1-color[temp];
                    q.add(it);
                }
                else if(color[it]==color[temp]){
                    return false;
                }

            }
        }
        }
    return true;   
    }
}