/*
1.Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for(int i = 0; i < len; i++)
		{
			for(int j = i + 1; j < len; j++)
			{
			    if(nums[i] + nums[j] == target)
			    {
			        int twosum[] = {i, j};
			        return twosum;
			    }
			}
		}
		return null;
    }
}