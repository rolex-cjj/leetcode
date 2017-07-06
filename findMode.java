/*
Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
For example:
Given BST [1,null,2,2],
   1
    \
     2
    /
   2
return [2].

Note: If a tree has more than one mode, you can return them in any order.

Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
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
    int maxfre = 0, curfre = 0, preval = 0;
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        List<Integer> arr = new ArrayList<Integer>();
        inorder(root, arr);
        int result[] = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++)
            result[i] = arr.get(i);
        return result;
    }
    public void inorder(TreeNode root, List<Integer> list){
        if(root != null){
            inorder(root.left, list);
            if(root.val == preval)
                curfre++;
            else{
                curfre = 1;
                preval = root.val;
            }
            if(curfre > maxfre){
                maxfre = curfre;
                list.clear();
                list.add(root.val);
            }
            else if(curfre == maxfre){
                list.add(root.val);
            }
            inorder(root.right, list);
        }
    }
}