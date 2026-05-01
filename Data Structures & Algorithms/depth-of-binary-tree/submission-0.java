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
    int max=0;
    int depth=0;
    public int maxDepth(TreeNode root) {
        preOrder(root);
        return max;
    }
    public TreeNode preOrder(TreeNode root){
        if(root==null) return null;
        depth++;
        max=Math.max(max,depth);
        maxDepth(root.left);
        maxDepth(root.right);
        depth--;
        return root;
    }
}
