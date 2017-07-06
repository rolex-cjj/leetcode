/*
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.
Example 2:
Input: "aba"

Output: False
Example 3:
Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
*/
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return s.matches("^([a-z]+)\\1+$");
    }
}

/*
输入字符串的第一个字符串是重复子字符串的第一个字符
输入字符串的最后一个字符串是重复子字符串的最后一个字符
令S1 = S + S（其中输入字符串中的S）
删除S1的第一个和最后一个字符，生成字符串S2。
如果S存在于S2中，则返回true否则为false
*/
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder s1 = new StringBuilder(s+s);
        s1 = s1.delete(0,1);
        s1 = s1.delete(s.length()*2-2,s.length()*2-1);
        if(s1.indexOf(s) != -1){
            return true;
        }
        return false;
    }
}