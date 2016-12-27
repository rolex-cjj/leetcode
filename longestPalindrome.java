/*
5. Longest Palindromic Substring
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
Example:

Input: "cbbd"

Output: "bb"
*/

//暴力破解，复杂度为O(n^3),超时
public class Solution {
    public String longestPalindrome(String s) {
        int max_len = 0;
		String max_string = "";
		int string_size = s.length();
		for(int i = 0; i < string_size; i++)
		{
			String sub = "";
			String max_sub = "";
			int len = 0;
			for(int j = i; j < string_size; j++)
			{
				sub += s.charAt(j);
				boolean bool = isPalindrome(sub);
				if(bool)
				{
					len = j - i + 1;
					max_sub = sub;
				}
			}
			if(max_len < len)
			{
				max_len = len;
				max_string = max_sub;
			}
			if(len == string_size - i)
				break;
		}
		return max_string;
    }
	public boolean isPalindrome(String s)
	{
		int len = s.length();
		int low = len / 2 - 1;
		int high = (len + 1) / 2;
		while(low >= 0 && high < len)
		{
			if(s.charAt(low) == s.charAt(high))
			{
				low--;
				high++;
			}
			else
				return false;
		}
		return true;
	}
}


//动态规划，时间复杂度O（n^2）,空间O（n^2）
public class Solution {
    public String longestPalindrome(String s) {
		int len = s.length();
		boolean dp[][] = new boolean [len][len];
		int start = 0, end = 1;
		int max_len = 0;
		for(int k = 1; k < len; k++)
		{
			for(int i = 0 ; i < len - 1; i++)
			{
				int j = i + k;
				if(j > len - 1)
					break;
					
				if(s.charAt(i) ==  s.charAt(j))
				{
					if(i + 1 >= j - 1)
						dp[i][j] = true;
					else
						dp[i][j] = dp[i+1][j-1];
					if(dp[i][j])
					{
						if(k + 1 > max_len)
						{
							max_len = k + 1;
							start = i;
							end = j + 1;
						}
						
					}
				}
				else 
					dp[i][j] = false;
			}
		}
		return s.substring(start, end);
	}
}