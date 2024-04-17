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
    String smallStr = null;
    private void dfs(TreeNode root,StringBuilder sb){
        if(root == null){
            return;
        }
        sb.insert(0, (char)('a' + root.val));
        if(root.left == null && root.right == null){
            if(smallStr == null || smallStr.compareTo(sb.toString())>0)
                smallStr = sb.toString();
        }
        dfs(root.left, sb);
        dfs(root.right, sb);
        sb.deleteCharAt(0);
    }
    public String smallestFromLeaf(TreeNode root) {
         dfs(root, new StringBuilder());
         return smallStr;
    }
}