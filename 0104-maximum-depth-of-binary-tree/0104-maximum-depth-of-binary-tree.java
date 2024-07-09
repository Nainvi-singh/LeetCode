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
class Pair{
    TreeNode node;
    int depth;
    Pair(TreeNode node,int depth){
        this.node=node;
        this.depth=depth;
    }
}
class Solution {
    public int maxDepth(TreeNode root) {   
        if(root==null){
            return 0;
        }
        //iterative sol
        Stack<Pair> stack=new Stack<>();
        stack.push(new Pair(root,1));
        int maximumDepth=0;
        while(!stack.isEmpty()){
            Pair pair =stack.pop();
            TreeNode node=pair.node;
            int depth=pair.depth;
            maximumDepth=Math.max(maximumDepth,depth);
            if(node.left!=null){
                stack.push(new Pair(node.left,depth+1));
            }
            if(node.right!=null){
                stack.push(new Pair(node.right,depth+1));
            }
        }
        return maximumDepth;
    }
}