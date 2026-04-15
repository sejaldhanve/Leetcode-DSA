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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList();
        solve(root,"",list);
        return list;
            
    }
    private void solve(TreeNode root, String result, List<String> list){
        if(root==null){
            return;
        }
        result+=Integer.toString(root.val);
        if(root.left==null && root.right==null){
            list.add(result);
            return;
        }
        
        if(root.left!=null){
            solve(root.left, result +"->", list);
        }
        if(root.right!=null){
            solve(root.right, result +"->", list);
        }  

    }

}