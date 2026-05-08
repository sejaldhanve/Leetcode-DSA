class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        //inorder
        int[] inorder=new int[numCourses];
        for(int i=0;i<inorder.length;i++){
            for(int it:adj.get(i)){
                inorder[it]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==0){
                q.add(i);
            }
        }
        List<Integer> list=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            list.add(node);
            for(int it:adj.get(node)){
                inorder[it]--;
                if(inorder[it]==0){
                    q.add(it);
                }
            }

        }

        int[] ans=new int[list.size()];
        if(list.size()==numCourses){
            for(int i=0;i<ans.length;i++){
                ans[i]=list.get(i);
            }
        }
        else{
            return new int[0];
        }

    return ans;
        
    }
}