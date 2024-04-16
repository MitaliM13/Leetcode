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
    public TreeNode helper(TreeNode root, int val, int depth, int curr){
        if(depth == 1){
            TreeNode tree = new TreeNode(val);
            tree.left = root;
            return tree;
        }
        if(root == null){
            return root;
        }
        if(curr == depth - 1){
            TreeNode leftN = root.left;
            TreeNode rightN = root.right;

            root.left = new TreeNode(val);
            root.right = new TreeNode(val);

            root.left.left = leftN;
            root.right.right = rightN;
            return root;
        }
        helper(root.left, val,depth,curr+1);
        helper(root.right, val, depth, curr+1);

        return root;
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return helper(root,val,depth,1);   
    }
}