/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void parent(TreeNode root, Map<TreeNode, TreeNode> parent_track){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    parent_track.put(node.left,node);
                    q.offer(node.left);
                }
                if(node.right!=null){
                    parent_track.put(node.right,node);
                    q.offer(node.right);
                }
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent_track=new HashMap<>();
        parent(root, parent_track);

        Map<TreeNode, Boolean> visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        visited.put(target, true);
        int cur_level=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(cur_level==k) break;
            cur_level++;
            for(int i=0;i<size;i++){
                TreeNode cur_node=q.poll();
                if(cur_node.left!=null && visited.get(cur_node.left)==null){
                    q.offer(cur_node.left);
                    visited.put(cur_node.left, true);
                }
                if(cur_node.right!=null && visited.get(cur_node.right)==null){
                    q.offer(cur_node.right);
                    visited.put(cur_node.right, true);
                }
                if(parent_track.get(cur_node)!=null && visited.get(parent_track.get(cur_node))==null){
                    q.offer(parent_track.get(cur_node));
                    visited.put(parent_track.get(cur_node), true);
                }

            }
        }
        List<Integer> list=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode res=q.poll();
            list.add(res.val);
        }

    return list;   
    }
}