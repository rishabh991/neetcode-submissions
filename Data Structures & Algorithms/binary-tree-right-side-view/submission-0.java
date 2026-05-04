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
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return result;
    }
    public void dfs(TreeNode root, int depth){
        if(root==null)  return;

        if(result.size()==depth){
            result.add(root.val);
        }

        depth++;

        dfs(root.right, depth);
        dfs(root.left, depth);
    }
}
