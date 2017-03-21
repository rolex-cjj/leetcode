/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
*/
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i = 0, j = 0; j < nums2.length && i < nums1.length;){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
                i++;
            else    j++;
        }
        int index = 0;
        int [] arr = new int[set.size()];
        for(Integer i : set)
            arr[index++] = i;
        return arr;
    }
}