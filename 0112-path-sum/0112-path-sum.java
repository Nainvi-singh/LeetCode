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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //3rd apporach
        //if tree is empty
        if(root==null){
            return false;
        }
        //on each node i minus the node value from the  targetsum
        targetSum=targetSum - root.val;
        //leaf node
        if(root.left==null && root.right ==null){
            return targetSum==0;
        }
        //move to the left
        boolean left=hasPathSum(root.left,targetSum);
        //move to the right
        boolean right=hasPathSum(root.right,targetSum);
        
        return left||right;
    }
}