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
    
    int result=0;
    int count=0;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return result;
    }
    public void dfs(TreeNode root, int k){
        if(root==null || count>=k)  return; // the k check helps to avoid extra computation during recursive loops as we've anyway computed the result already, so point of computing count afterwards.

        dfs(root.left, k);
        count++;
        if(count==k){
            result = root.val;
            return;
        }
        dfs(root.right, k);
    }
}
