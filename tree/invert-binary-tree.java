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
    public TreeNode invertTree(TreeNode root) {
        // Iterative sol //////////
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return root;

        queue.offer(root);

    while(!queue.isEmpty()){
        TreeNode x= queue.poll();
    
            TreeNode temp = x.left;
            x.left = x.right;
            x.right = temp;
            temp =null;

        if(x.left!=null){
                queue.offer(x.left);
            }
            if(x.right!=null){
                queue.offer(x.right);
            }
    }    
        return root;

    }
/////////////////////// Recurssion /////////////////////////////////
    public TreeNode recurrSol(TreeNode root){
        if(root == null) return root;
         
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            temp =null;

            recurrSol(root.left);
            recurrSol(root.right);

        return root;    
    }
}
