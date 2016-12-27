/*
3. Longest Substring Without Repeating Characters 
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0;
		String max_string = "";
		int string_size = s.length();
		for(int i = 0; i < string_size; i++)
		{
			int len = 0;
			String sub = "";
			for(int j = i; j < string_size; j++)
			{
				char character = s.charAt(j);
				if(sub.indexOf(character) == -1)
				{
					len++;
					sub += character;
				}
				else
					break;
			}
			if(max_len < len)
			{
				max_len = len;
				max_string = sub;
			}
			if(len == (string_size - i))//后面的不会超过这个长度，最多相等
				break;
		}
		return max_len;
    }
}