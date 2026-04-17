/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        double avg=0;
        if(root==null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            double sum=0.0;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                sum+=temp.val;

                if(temp.left!=null){
                    q.add(temp.left);
                }

                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            avg=sum/n;
            list.add(avg);
        }
        return list;
        
    }
}