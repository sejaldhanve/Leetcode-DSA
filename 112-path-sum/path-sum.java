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
    private boolean path(TreeNode root, int targetSum, int ans){
        if(root==null){
            return false;
        }

        ans+=root.val;
        if(root.left==null && root.right==null){
            return ans==targetSum;
        }

        return path(root.left, targetSum, ans) || path(root.right, targetSum, ans);
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int ans=0;
        return path(root, targetSum, ans);
    }
}