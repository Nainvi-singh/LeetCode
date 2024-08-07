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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack =new Stack<>();
        List<Integer> result =new ArrayList<>();
        if(root==null){
            return result;
        }
        //in this stack push the first node
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node =stack.pop();
            result.add(node.val);  //store the node value in list
            if(node.right!=null){
                stack.push(node.right);
            }
             if(node.left!=null){
                stack.push(node.left);
            }
        }
        return result;
    }
}
/*
maintain a stack
in stack we maintain node
*/