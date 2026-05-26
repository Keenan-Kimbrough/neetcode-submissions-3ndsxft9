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
    public int kthSmallest(TreeNode root, int k) {
        // smallest value is the deepest in tree, so if we recursive get
        //the smallest value then just get the k + 1 indexed

        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res.get(k -1);
    }
    public void dfs(TreeNode node, List<Integer> res){
        if( node == null){
            return;
        }
        //we want it in order so we do in order traversal
        dfs(node.left, res);
        res.add(node.val);
        dfs(node.right,res);
        
    }
}
