/*
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
*/
public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if(len > 0){
            int i = 0, j = len-1;
            while(i < j){
                if(nums[i] == val){
                    len--;
                    while(j > i && nums[j] == val){
                        j--;
                        len--;
                    }
                    nums[i] = nums[j];
                    nums[j] = val;
                    j--;
                }
                i++;
            }
            if(i==j && nums[i] == val)
                len--;
        }
        return len;
    }
}

//
int removeElement(int A[], int n, int elem) {
    int begin=0;
    for(int i=0;i<n;i++) if(A[i]!=elem) A[begin++]=A[i];
    return begin;
}