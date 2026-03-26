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
    int maxi=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        calculate(root);
        return maxi;
    }
    private int calculate(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=Math.max(calculate(root.left),0);
        int rh=Math.max(calculate(root.right),0);

        maxi=Math.max(maxi,lh+rh+root.val);

        return Math.max(lh,rh)+root.val;
    }
}