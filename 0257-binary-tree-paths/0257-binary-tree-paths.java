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
   List<String> list=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        print(root,"");
        return list;
    }
    
    void print(TreeNode root,String s){
        if(root==null){
            return;
        }
        
        String a=String.valueOf(root.val);
        if(root.left==null && root.right==null){
            s=s+a;
            list.add(s);
        }
        print(root.left,s+a+"->");
        print(root.right,s+a+"->");
        
    }
}