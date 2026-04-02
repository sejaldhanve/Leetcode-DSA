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
    int max=0;
    public int longestZigZag(TreeNode root) {
        check(root, true, 0);
        check(root, false, 0);
        return max;
        
    }
    private int check(TreeNode root, boolean cameFromLeft, int length){
        if(root==null){
            return 0;
        }
        max=Math.max(max,length);
        if(cameFromLeft){
            check(root.right, false, length+1);
            check(root.left, true, length=1);
        }
        else{
            check(root.left, true, length+1);
            check(root.right, false, length=1);
        }
        return max;
    }
}
