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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean result = false;
        result = dfs(root, subRoot);
        if(result==true)    return true;

        if(root.left!=null){
            result = isSubtree(root.left, subRoot);
            if(result==true)    return true;
        }else if(root.right!=null){
            result = isSubtree(root.right, subRoot);
            if(result==true)    return true;
        }
        return result;
    }

    public boolean dfs(TreeNode p, TreeNode q){
        if(p==null && q==null)  return true;
        if(p==null || q==null)  return false;
        if(p.val != q.val)  return false;

        return dfs(p.left,q.left) && dfs(p.right,q.right);
    }
}
