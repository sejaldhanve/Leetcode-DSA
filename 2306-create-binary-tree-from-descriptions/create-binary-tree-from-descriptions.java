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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map=new HashMap<>();
        HashSet<Integer> children=new HashSet<>();

        for(int[] desc:descriptions){
            int parent=desc[0];
            int child=desc[1];
            int isLeft=desc[2];
            map.putIfAbsent(parent, new TreeNode(desc[0]));
            map.putIfAbsent(child, new TreeNode(desc[1]));

            TreeNode pval=map.get(parent);
            TreeNode cval=map.get(child);

            if(isLeft==1){
                pval.left=cval;
            }
            else{
                pval.right=cval;
            }
            children.add(child);
        }

        for(int val:map.keySet()){
            if(!children.contains(val)){
                return map.get(val);
            }
        }
    return null;
        
    }
}