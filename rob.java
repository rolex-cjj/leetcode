/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*/
public class Solution {
    public int rob(int[] nums) {
        int rob = 0, unrob = 0;
        for(int i:nums){
            int tmp = rob;
            rob = i + unrob;
            unrob = Math.max(tmp, unrob);
        }
        return Math.max(rob, unrob);
    }
}
//DP 动态规划