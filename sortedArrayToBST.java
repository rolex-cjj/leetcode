/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
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
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        TreeNode root = binarySortedArrayToBST(nums, 0, len-1);
        return root;
    }
    public TreeNode binarySortedArrayToBST(int[] nums, int left, int right){
        if(left > right)
            return null;
        int mid = (right + left)/2;
        TreeNode root =  new TreeNode(nums[mid]);
        root.left = binarySortedArrayToBST(nums, left, mid-1);
        root.right = binarySortedArrayToBST(nums, mid+1, right);
        return root;
    }
}