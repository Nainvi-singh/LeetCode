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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack =new Stack<>();
        Stack<TreeNode> stack2 =new Stack<>();
        List<Integer> result =new ArrayList<>();
        if(root==null){
            return result;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node =stack.pop();//stack pop to process it
            //whem i pop from thr stack, just push it in stack2
            stack2.push(node);
            //process the cureent node
             if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
              
        }
        
        //pop all the element of stack2 and add in result;
        while(!stack2.isEmpty()){
            TreeNode node =stack2.pop();
            result.add(node.val);  //store the node value in list
        }
        return result;
    }
}