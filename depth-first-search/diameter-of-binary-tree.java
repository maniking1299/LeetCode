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
    int maxDaimeter = -1;
    public int diameterOfBinaryTree(TreeNode root) {
    
        helper(root);

        return maxDaimeter;

    }
    public int helper(TreeNode root){
        
        if(root == null){
            return 0;
        }

       int leftHeight = helper(root.left);
       int rightHeight = helper(root.right);
       
       maxDaimeter = Math.max(maxDaimeter,leftHeight+rightHeight);

       return 1+Math.max(leftHeight,rightHeight);

    }
    
}