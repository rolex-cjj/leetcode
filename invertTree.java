/*
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode leftNode = null;
        TreeNode rightNode = null;
        if(root.left!=null){
            rightNode = invertTree(root.left);
        }
        if(root.right!=null){
            leftNode = invertTree(root.right);
        }
        root.right = rightNode;
        root.left = leftNode;
        return root;
        
    }
}