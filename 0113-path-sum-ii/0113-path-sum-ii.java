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
    List<Integer> smallList=new ArrayList<>();
    List<List<Integer>> FinalList=new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root,targetSum);
        return FinalList;
    }
    void helper(TreeNode root,int targetSum){
        //base case
        if(root==null){
            return;
        }
        smallList.add(root.val);
        //leaf Node
        if(root.left==null&&root.right==null && targetSum==root.val){
            FinalList.add(new ArrayList<Integer>(smallList));
        }
        //move to the left
        helper(root.left,targetSum-root.val);
        //move to the right
        helper(root.right,targetSum-root.val);
        smallList.remove(smallList.size()-1);
    }
}