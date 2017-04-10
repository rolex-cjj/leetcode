/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
*/
public class Solution {
    public int longestPalindrome(String s) {
        int[]arr = new int[52];
        int len = s.length();
        int sum = 0;
        for(int i = 0; i < len; i++){
            int index = s.charAt(i) < 'a' ? s.charAt(i) - 'A'+26 : s.charAt(i) - 'a';
            arr[index]++;
        }
        for(int i : arr){
            if(i%2 == 0)
                sum += i;
            else
                sum += (i-1);
        }
        if(sum != len)
            sum++;
        return sum;
        
    }
}