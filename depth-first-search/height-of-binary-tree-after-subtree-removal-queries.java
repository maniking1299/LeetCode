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

    // TC->O(N+Q)
    // SC->O(N)

    int[] Node_Level = new int[100001];
    int[] Node_height = new int[100001];
    int[] LevelMax = new int[100001];
    int[] Level2ndMax = new int[100001];

    public int[] treeQueries(TreeNode root, int[] queries) {

        int[] ans = new int[queries.length ];
        // dfs preprocessing
        height(root, 0);

        // Answer Querying

        for (int i = 0; i < queries.length; i++) {

            int node = queries[i];
            int level = Node_Level[node];

            if (Node_height[node] == LevelMax[level]) {
                ans[i] = level + Level2ndMax[level]-1;
            } else {
                ans[i] = level + LevelMax[level]-1;
            }

        }

        return ans;

    }

    public int height(TreeNode root, int level) {
        if (root == null)
            return 0;

        Node_Level[root.val] = level;

        int left = height(root.left, level + 1);
        int right = height(root.right, level + 1);

        int currHeight = 1 + Math.max(left, right);

        Node_height[root.val] = currHeight;

        if (currHeight > LevelMax[level]) {
            Level2ndMax[level] = LevelMax[level];
            LevelMax[level] = currHeight;
        } else if (currHeight > Level2ndMax[level]) {
            Level2ndMax[level] = currHeight;
        }

        return currHeight;
    }

}