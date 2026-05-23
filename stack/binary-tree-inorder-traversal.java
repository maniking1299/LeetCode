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
    public List<Integer> inorderTraversal(TreeNode root) {

        // Iteration Method///
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
           TreeNode x = stack.pop();
           res.add(x.val);
           current = x.right;
        }
        
      
        return res;
    }






    // Recurssion logic
    // public void inorder(TreeNode root , List<Integer> result){
    //     if(root == null) return;

    //     inorder(root.left , result);
    //     result.add(root.val);
    //     inorder(root.right , result);
    // }
}