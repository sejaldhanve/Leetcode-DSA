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
    public String tree2str(TreeNode root) {
        if(root==null){
            return "";
        }
        String result=Integer.toString(root.val);
        if(root.left!=null){
            result+="(" + tree2str(root.left) + ")";
        }
        else if(root.left==null && root.right!=null ){
            result+="()";
        }
        
        if(root.right!=null){
            result+="(" + tree2str(root.right) + ")";
        }
        return result;
    }
    // private void check(TreeNode root){
    //     if(root==null){
    //         return;
    //     }
    //     str.append(root.val);
    //     if(root.left!=null){
    //         left.append("(");
    //         left.append(root.left.val);
    //         left.append(")");
    //     }
    //     else{
    //         left.append("()");
    //     }

    //     if(root.right!=null){
    //         right.append("(");
    //         right.append(root.right.val);
    //         right.append(")");
    //     }
    //     str.append(left);
    //     str.append(right);

    //     check(root.left);
    //     check(root.right);
    //     return;

        
    // }
}