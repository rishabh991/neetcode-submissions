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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        List<Integer> result = new ArrayList<>();

        while(!queue.isEmpty()){
            
            TreeNode right = null;
            int qLen = queue.size();
            
            for(int i=0; i<qLen; i++){
                TreeNode node = queue.poll();
                if(node!=null){
                    right = node;
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }

            if(right!=null){
                result.add(right.val);
            }
            
        }

        return result;
    }
}
