/*
11. Container With Most Water 
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
Note: You may not slant the container and n is at least 2.
*/
public class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
		int low = 0, high = len - 1;
		int max_area = 0;
		while(low != high)
		{
			int min = height[low] < height[high] ? low : high;
			int area = (high - low) * height[min];
			if(area > max_area)
				max_area = area;
			if(min == low)
				low++;
			else
				high--;
		}
		return max_area;
    }
}