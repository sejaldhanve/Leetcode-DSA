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
    int result=0;
    public int findTilt(TreeNode root) {
        calculate(root);
        return result;
        
        
    }
    private int calculate(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=calculate(root.left);
        int rh=calculate(root.right);

        result+=Math.abs(lh-rh);

        return lh+rh+root.val;

    }
}