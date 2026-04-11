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

class BstIterator{
    private Stack<TreeNode> stack=new Stack<>();
    boolean reverse=false;

    public BstIterator(TreeNode root, boolean isReverse){
        reverse=isReverse;
        pushAll(root);
    }
    public boolean hasNext(){
        return !stack.isEmpty();
    }
    public int next(){
        TreeNode temp=stack.pop();
        if(reverse==false){
            pushAll(temp.right);
        }
        else{
            pushAll(temp.left);
        }
        return temp.val;
    }

    private void pushAll(TreeNode node){
        while(node!=null){
            stack.push(node);
            if(reverse==true){
                node=node.right;
            }
            else{
                node=node.left;
            }
        }
    }
}
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        BstIterator l=new BstIterator(root, false);
        BstIterator r=new BstIterator(root, true);
        int i=l.next();
        int j=r.next();
        
        while(i<j){
            if(i+j==k) return true;
            else if(i+j>k) j=r.next();
            else i=l.next();
        }
        return false;
    }
}